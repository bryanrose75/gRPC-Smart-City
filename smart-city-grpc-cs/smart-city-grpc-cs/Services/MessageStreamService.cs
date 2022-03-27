using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Grpc.Core;
using Microsoft.Extensions.Logging;
using smartcitygrpccs.Protos;
using Microsoft.AspNetCore.Http;


namespace smartcitygrpccs.Services
{
    public class MessageStreamService:StreamService.StreamServiceBase
    {
        private ILogger<MessageStreamService> _logger;

        public MessageStreamService(ILogger<MessageStreamService> logger)
        {
            _logger = logger;
        }

        public override async Task StartStreaming(IAsyncStreamReader<StreamMessage> requestStream, IServerStreamWriter<StreamMessage> responseStream, ServerCallContext context)
        {
            //Start Checking if the request stream is not null
            if (requestStream != null)
            {
                if (!await requestStream.MoveNext())
                    return;
            }
            try //Check if the request stream is empty 
            {
                if (!string.IsNullOrEmpty(requestStream.Current.Message))
                {
                    if (string.Equals(requestStream.Current.Message, "qw!", StringComparison.OrdinalIgnoreCase))
                        return;
                }
                //Initialise the message '
                var message = requestStream.Current.Message;
                Console.WriteLine($"Message from Client: {requestStream.Current.Username} Message: {requestStream.Current.Message}");

                //Wait for the response from the client
                await responseStream.WriteAsync(new StreamMessage
                {
                    Username = requestStream.Current.Username,
                    Message= $"Thank you for Usage updated @ : {DateTime.UtcNow:f} for {requestStream.Current.Username}, Update amount: {requestStream.Current.Message}"
                });

            }
            catch (Exception e)
            {
                _logger.LogInformation(e.Message);
            }
            
        }
    }
}
