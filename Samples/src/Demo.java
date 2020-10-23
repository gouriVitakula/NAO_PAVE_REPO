
public class Demo {

	
	public int minSum(int[] inputarray, int k) {
		
		int[] output = inputarray;
		int sum = 0;
		
		for (int i =0 ; i < k ; i++) {
			
			output[i] = (int) Math.ceil(inputarray[i]/2);
		}
		
		for(int i=0; i < output.length ; i++) {
			sum += output[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[] array = {10, 20, 7};
		Demo demo = new Demo();
		System.out.println(demo.minSum(array, 3));
	}
}
