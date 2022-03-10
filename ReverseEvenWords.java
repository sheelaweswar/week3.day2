package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		System.out.println("Input:"+test);
		String[] splitstr = test.split(" ");
		String finalResult = "";
		for(int i = 0; i<splitstr.length;i++){
			//System.out.println("mod for "+i+":"+(i%2));
			//System.out.println("splitstr["+i+"]:"+splitstr[i]);
			if(i % 2 != 0) {
				String val = "";
				char[] evenAry = splitstr[i].toCharArray();
				for(int j = evenAry.length-1;j>=0;j--) {
					val += evenAry[j];
				}
				finalResult += " "+ val;
			}
			else {
				finalResult += " "+ splitstr[i];
			}
		}
		System.out.println("Output:"+finalResult);

	}
}
