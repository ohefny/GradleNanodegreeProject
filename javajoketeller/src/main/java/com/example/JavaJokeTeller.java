package com.example;

import java.util.Random;



/**
 * Created by BeTheChange on 6/5/2017.
 */

public class JavaJokeTeller {
    private String[]jokes={"Q: What did the DNA say to the other DNA?\n" +
            "A: Do these genes make my butt look fat.","Did you hear about the two antennas that got married?\n" +
            "The ceremony was long and boring, but the reception was great!","Q: Why couldn't the blonde add 10 and seven on a calculator?\n" +
            "\n" +
            "A: She couldn't find the 10 key.","Q: What's it called when a blonde blows in another blonde's ear?\n" +
            "\n" +
            "A: Data transfer.","Q: What is black and blue and brown, and lies in a ditch?\n" +
            "\n" +
            "A: A brunette who has told too many blonde jokes."
    };
    public String tellMeJoke(){
        int idx=((new Random()).nextInt(jokes.length));
        System.out.println("fuck idx:: "+idx);
       // if(idx>-1&&idx<jokes.length)
            return jokes[idx];
       // else
         //   return jokes[0];
    }
}
