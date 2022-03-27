using System;
using System.Threading.Tasks;
using Grpc.Core;
using Grpc.Net.Client;
using smartcitygrpccs.Protos;

namespace GrpcClient
{
    class Program
    {
        static async Task Main(string[] args)
        {
            Console.WriteLine("Press enter to continue!");
            Console.ReadLine();

            using var channel = GrpcChannel.ForAddress("http://localhost:5000");

            var client = new StreamService.StreamServiceClient(channel);
            string username = "Bryan Rose";
            using var stream = client.StartStreaming();
            var response = Task.Run(async () =>
            {
                await foreach (var rm in stream.ResponseStream.ReadAllAsync())
                    Console.WriteLine(rm.Message);
            });
            Console.WriteLine(username + " Enter energy usage for the last month");
            while (true)
            {
                var text = Console.ReadLine();
                if (string.IsNullOrEmpty(text))
                    break;
                await stream.RequestStream.WriteAsync(new StreamMessage
                {
                    Username = username,
                    Message = text

                });
            }
            //Dis
            Console.WriteLine("Disconnecting from server....");
            await stream.RequestStream.CompleteAsync();
            await response;


        }
    }
}
