import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		int ctr = 0;
		String InputNumber;
		String state = "q0";
		
		
		System.out.println("Enter InputNumberber : ");
		InputNumber = input.nextLine();
		
		
		while(ctr < InputNumber.length()) {
			
			if( state.equals("q0") &&  InputNumber.charAt(ctr) == '1') {
				state = "q0";
			}else if(state.equals("q0") &&  InputNumber.charAt(ctr) == '0') {
				state = "q1";
			}else if(state.equals("q1") &&  InputNumber.charAt(ctr) == '0') {
				state = "q1";
			}else if(state.equals("q1") &&  InputNumber.charAt(ctr) == '1') {
				state = "q2";
			}else if(state.equals("q2") &&  InputNumber.charAt(ctr) == '0') {
				state = "q1";
			}else if(state.equals("q2") &&  InputNumber.charAt(ctr) == '1') {
				state = "q0";
			}	
				
			ctr++;
		} 
		
		if(state.equals("q2")){
            System.out.println("String accepted");
        }else{
            System.out.println("String not accepted");
        }
    }

}
