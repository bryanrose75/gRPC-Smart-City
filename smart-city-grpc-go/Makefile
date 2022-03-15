clean:
	rm pb
	rm swagger

gen:
	protoc --proto_path=proto proto/*.proto  --go_out=:pb --go-grpc_out=:pb --grpc-gateway_out=:pb --openapiv2_out=:swagger

# gen:
# 	protoc --proto_path=proto proto/*.proto --go_out=plugins=grpc:pb

client:
	go run ../cmd/client/main.go

server:
	go run ../cmd/server/main.go
