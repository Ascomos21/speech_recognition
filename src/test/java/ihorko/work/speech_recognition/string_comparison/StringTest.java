package ihorko.work.speech_recognition.string_comparison;

import ihorko.work.speech_recognition.common.RabinaKarpa;
import ihorko.work.speech_recognition.common.RecognitionResult;
import ihorko.work.speech_recognition.service.StringService;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    public void testCheckAlgorithmForFindingSubTextInText(){
        RecognitionResult result = new StringService()
                .findCorrectAndWrongPartInExpectedText("this is first text example", "this is next text example");
        System.out.println(result);
    }
    @Test
    public void testFindDifferentWordsInString(){
         /*String str1 = "Lorem ipsum dolor sit amet consectetur adipiscing elit. Integer vel.";
        String str2 = "Lorem ipsum dolor sit amet quis sodales arcu accumsan ut. Aenean.";*/
        String one = "this is first text example";
        String two = "this is next text example";
        String[] oneVals = one.split("\\ ");
        String[] twoVals = two.split("\\ ");
        int i = oneVals.length;
        if(oneVals.length != twoVals.length)
        {
            // determine what to do
        }
        String wordsNotMatching = "";
        for(int j=0; j<i; j++)
        {
            if((!oneVals[j].equals(twoVals[j])))
                wordsNotMatching += oneVals[j] + " ";
        }
        System.out.println(wordsNotMatching);
    }
}
