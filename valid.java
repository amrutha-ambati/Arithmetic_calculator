import java.util.regex.*;    
import java.util.*;    
public class valid{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("18124521@student.hindustanuniv.ac.in");  
        emails.add("altruist-365@gmail.com");  
        emails.add("ammulu2001-yahoocom");  
        emails.add("18113221@student.hindustanuniv.ac.in");  
        emails.add("ambati21@gmail.com");  
        emails.add("amruthaambati@gmail.com");  
        //Add invalid emails in list  
        emails.add("ammulu2001@yahoo.com");  
        emails.add("javaTpoint#domain.com");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  
