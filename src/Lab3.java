import java.util.Scanner;
public class Lab3 {
    
    public static void main(String[] args) {


        String data_type = "";
        String identifier = "";
        String assignment_operator = "";
        String value = "";
        char delimiter = ' ';

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Source Language: ");
        String[] input = sc.nextLine().split(" ");
        int x=input.length;



        if(x==2) {
            data_type = input[0];
            identifier = input[1].substring(0,input[1].length()-1);
            delimiter = input[1].charAt(input[1].length()-1);

            if(data_type.equals("int") ||data_type.equals("string") || data_type.equals("char")||data_type.equals("double") ) {
                System.out.print("<data type>");
                identifier  = "<Indentifier>";
                System.out.print(identifier);
            }if(delimiter == ';' ) {
                System.out.print("<delimiter>");

            }
        }

        if(x==4 ){
            data_type = input[0];
            identifier = input[1];
            assignment_operator = input[2];
            value = input[3].equalsIgnoreCase("string") ? input[3].substring(1,input[3].length()-2)
                    : input[3].substring(0,input[3].length()-1);
            delimiter = input[3].charAt(input[3].length()-1);

            if(data_type.equals("int") ||data_type.equals("string") || data_type.equals("char")|| data_type.equals("double")) {
                System.out.print("<data type>");
                identifier  = "<Indentifier>";
                System.out.print(identifier);
            }if(assignment_operator.equals("=") ) {
                System.out.print("<operator>");
                value="<value>";
                System.out.print(value);

            }if(delimiter == ';' ) {
                System.out.print("<delimiter>");

            }

        }

         }
    }
