package domain;
/** This class calculates number of lucky tickets up till given number */
public class Exercise {
    public static String Calculate(String input){
        /** Because we need integer to calculate number of lucky tickets, we convert string to int "con" */
        int con;
        try { /** String to int conversion happens here */
            con = Integer.parseInt(input.trim());
            if(con > 999999 || con < 0) /** Ticket format exception */
                return "\nWrong input format -> input cannot be less than 0 or greater than 999999!";
        }
        catch (NumberFormatException nfe) { /** Not an integer exception  */
            return "\nUnnacceptable input -> only digits!"; 
        }
        /** "count" - integer, to count number of lucky tickets */
        int count = 0;
        for(int i = con;i>=1001;i--) /** Counting cycle */
            if(i/100000+i/10000-(i/100000)*10+i/1000-(i/10000)*10 == i/100-(i/1000)*10+i/10-(i/100)*10+i/1-(i/10)*10)
                count++;
        /** Returning count of lucky tickets. Additional code is to display ticket number properly */
        return "\nNumber of lucky tickets up untill " + 
        (con/100000)+(con/10000-(con/100000)*10)+(con/1000-(con/10000)*10)+(con/100-(con/1000)*10)+(con/10-(con/100)*10)+(con/1-(con/10)*10)+ 
        " : " + Integer.toString(count) + " lucky tickets!";
    }
}
