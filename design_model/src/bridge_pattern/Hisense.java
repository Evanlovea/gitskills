package bridge_pattern;

public class Hisense extends Factory {

	@Override
	public void produce(String productName) {
		// TODO Auto-generated method stub
         String factoryName="����";
         this.product.produce(factoryName, productName);
	}
	
}
