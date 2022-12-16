package Tipay;

import java.util.regex.Pattern;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class semantic {

    public static void main(String [] Args){

        String dot = ".";
        while(true){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter line of Code: ");
        String input = sc.nextLine();
        String[] inputarr = input.split(" "); // splits the input by space

        //create group of numbers
        Pattern num = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        Matcher nummatch = num.matcher(inputarr[3]);
        boolean numfind = nummatch.find();

        String[] datatypes = {
            "int","char","double","String"
        };

        String datanum = datatypes[0];
        String datachar  = datatypes[1];
        String datadouble = datatypes[2];
        String datastring = datatypes[3];

        //data type checker

        if(Arrays.asList(datatypes).contains(inputarr[0])){

            String typedata = inputarr[0];
            String dataval = inputarr[3].replaceAll(";","");
            String stinput = input.replaceAll("\\s+","");

            //String Checker
            if(datastring.equals(typedata)){
               

                if(dataval.charAt(0) == 34 && stinput.charAt(stinput.length()-2)== 34){
                    System.out.println("Correct Semantic");
                }
                else{
                    System.out.println("Mali Semantic");
                }
            }
            

            //double checker
             if(datadouble.equals(typedata)){
                if(numfind && dataval.charAt(0) != 34 && dataval.charAt(dataval.length()-1) != 34 && dataval.charAt(0) != 39 && dataval.charAt(dataval.length()-1) != 39){
                    if(dataval.contains(dot)){
                        System.out.println("Correct Semantic");
                    }
                    else{
                        System.out.println("Semantic is Wrong");
                    }
                }
                else{
                    System.out.println("Semantic is Wrong");
                }
            }
            //interger checker
            if(datanum.equals(typedata)){
               if(numfind && dataval.charAt(0) != 34 && dataval.charAt(dataval.length()-1) != 34 && dataval.charAt(0) != 39 && dataval.charAt(dataval.length()-1) != 39){
                if(!dataval.contains(dot)){
                    
                   System.out.println("Correct Semantic");
               }
               else{
                System.out.println("Incorrect Semantic!");
            }
            }
               else{
                   System.out.println("Incorrect Semantic!");
               }
           }

            //char checker
            if(datachar.equals(typedata)){
                if(dataval.charAt(0) == 39 && dataval.charAt(dataval.length()-1) == 39){
                    if(dataval.length() == 3){
                    System.out.println("Correct Semantic!");
                }
                else{
                    System.out.println("semantic Error");
                }
            }
                else{
                    System.out.println("Semantic Error");
                }

            }
            
        }

        }
    }
    
}