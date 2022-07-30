package phase1.java;

import java.util.ArrayList;

public class ValidateEmail {

    public static void main(String[] args) {
        
        ArrayList<String> email = new ArrayList<String>();
        
        email.add("abhijith@gmail.com");
        email.add("vishwanath.mb@gmail.com");
        email.add("veeresh.ssn@gmail.com");
        email.add("maruti@gmail.com");
        email.add("zakirkhan@gmail.com");
        email.add("kennysebastian@gmail.com");
        email.add("rohan.joshi@gmail.com");
        email.add("aashish.solanki@gmail.com");
        email.add("kushakapila@gmail.com");
        email.add("gurleen.pannu@gmail.com");
        email.add("neetipalta@gmail.com");
        
   
        String searchEmail = "vishwanath.mb@gmail.com";
        
        System.out.println("The number of Email ID's are: \n" +email.size());
        System.out.println("\nList of all the Employee's email ID: ");
                for(int i = 0; i < email.size(); i++) {
                    
                    if(searchEmail == email.get(i)) {
                        for(String str : email) {
                        	System.out.println(str);
                        }
                        System.out.println("\n\nThe email ID to be searched is: " + searchEmail + " it is in the arraylist");
                        break;
                     }
                }
    }
}