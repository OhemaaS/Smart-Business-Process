package DSCA.Internet;


	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Random;

	import DSCA.Internet.InternetGrpc.InternetBlockingStub;
	import DSCA.Internet.InternetGrpc.InternetStub;
import  DSCA.Internet.SensorRequest;
import  DSCA.Internet.SensorResponse;
import io.grpc.ManagedChannel;
	import io.grpc.ManagedChannelBuilder;
	import io.grpc.StatusRuntimeException;
	import io.grpc.stub.StreamObserver;


	public class internetClient {

		private static InternetBlockingStub blockingStub;
		private static InternetStub asyncStub;


		public static void main(String[] args) {

			ManagedChannel channel = ManagedChannelBuilder
					.forAddress("localhost", 50051)
					.usePlaintext()
					.build();

			//stubs -- generate from proto
			blockingStub = InternetGrpc.newBlockingStub(channel);

			asyncStub = InternetGrpc.newStub(channel);


			//Unary RPC calling
			Sensor();
			
			
			
		}
		//unary rpc
		public static void Sensor() {
			String num1 = "Active";
		try {

			SensorRequest req = SensorRequest.newBuilder().setInputVal(num1).build();

			SensorResponse response = blockingStub.sensor(req);

			System.out.println("Sernor status: " + response.getOutputVal() );
			
		
		
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		}


		
}//class
