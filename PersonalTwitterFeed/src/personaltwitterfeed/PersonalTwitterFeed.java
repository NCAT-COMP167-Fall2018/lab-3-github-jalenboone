/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltwitterfeed;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author CCannon
 */
public class PersonalTwitterFeed {

    private static int MAX_NUMBER_TWEETS = 200;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tweets = new String[MAX_NUMBER_TWEETS];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your personal Twitter!");
        System.out.println("What's your name, tweeter?");
        
        String tweeterName = keyboard.nextLine();
        
        System.out.println("Nice to meet you " + tweeterName + "!");
        System.out.println("Enter your tweets and I will add them to your timeline!");
        
        int numTweets = 0;
        while(numTweets<(MAX_NUMBER_TWEETS-1)){
        newTweet(tweets);
        }
      
        
        System.out.println("Your twitter feed is full");
    }
    private static String getCurrentTimeStamp(){
    DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
    dateFormatSymbols.setWeekdays(new String[]{
        "Unused",
        "Sad Sunday",
        "Manic Monday",
        "Thriving Tuesday",
        "Wet Wednesday",
        "Total Thursday",
        "Fat Friday",
        "Super Saturday",
});
    String timeStamp = "HH:mm:ss.SS";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timeStamp, dateFormatSymbols);
    String date = simpleDateFormat.format(new Date());
    return date;
    }
    private static void newTweet(String[] tweets){
        int numTweets=0;
        Scanner keyboard = new Scanner(System.in);
        String tweeterName = keyboard.nextLine();
          while(numTweets < (MAX_NUMBER_TWEETS - 1)) {
            tweets[numTweets] = keyboard.nextLine();
            numTweets++;
            
            System.out.println(tweeterName + "'s Personal Twitter Feed:");
            for(int i = 0; i < numTweets; i++) {
                System.out.println("- " + tweets[i] + getCurrentTimeStamp());
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            
            if(numTweets < (MAX_NUMBER_TWEETS - 1))
                System.out.println("Enter your next tweet:");
        }
    }
}
