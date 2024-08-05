package com.jap;

import static java.lang.Integer.parseInt;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;
        double sum =0;

        try{
            //Write the logic
            for (String ageRawDatum : ageRawData) {
                sum += parseInt(ageRawDatum);
            }
            avg=sum/ ageRawData.length;
            //Handle specific exception
        }catch (NumberFormatException exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }



}
