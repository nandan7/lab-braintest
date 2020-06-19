package service;

public class PersonalityCalculator{
	 public String findYourBrainType(String options) {
		 int[] q=findAnswers(options);
		 int a=q[1]+q[2]+q[3]+q[5]+q[8]+q[10]+q[11]+q[12]+q[14]+q[18]+q[20];
		 int b=q[4]+q[6]+q[7]+q[9]+q[13]+q[15]+q[16]+q[17]+q[19];
		 int x=66-a+b;
		 System.out.println("Your total score is " + x + ".");
			if ((x >= 20) && (x <= 55))
				return "left-brained";
			else if ((x >= 56) && (x <= 64))
				return "No clear preference ";
			else if ((x >= 65) && (x <= 100))
				return "right-brained";
			else
				return "false";
	 }
	 public int[] findAnswers(String options) {

		    int count = 0;
			String c[] = options.split(",");
			int q = c.length;
			int a[] = new int[q];
			for (int i = 0; i < q; i++) {
				a[i] = Integer.parseInt(c[i]);
				count = count + 1;
				System.out.println("The answer for question - " + count + " is " + a[i] + ".");
	 }
			return a;
   } 
}
