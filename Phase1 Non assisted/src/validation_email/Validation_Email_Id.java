package validation_email;
import java.util.*;
import java.util.regex.*;  

public class Validation_Email_Id {
	 public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("yourname@domain.com");  
	        emails.add("my.domain@domain.co.in");  
	        emails.add("sanjana.patil@gmail.com");
	        emails.add("test123prepare@co.edu.com");
	        emails.add("java.concepts@domain.co.in");
	        
	        
	        
	        //Regular Expression   
	        String regex = "^(.+)@(.+)com"; 
	       String regex1 = "//d[10]";
	      
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);
	        Pattern pattern1 = Pattern.compile(regex1);
	        //Iterate emails array list  
	        for(String email : emails){  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	           
	            System.out.println("Email Id : " + email +" is valid = "+ matcher.matches()+"\n" );  
	        } 
	       
	    }  
	 }


