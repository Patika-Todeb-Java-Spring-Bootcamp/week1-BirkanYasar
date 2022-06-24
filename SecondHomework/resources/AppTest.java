import package ProducerConsumer;

public class AppTest{

	public static void main(String[] args) {
		
		Producer p1 = new Producer();
		Consumer c1 = new Consumer();
		
		p1.producerRun();
		c1.consumerRun();
		
	}

}
