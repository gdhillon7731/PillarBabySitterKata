package com.company;

public class BabySitter {

    public int calculatePay(int startTime, int endTime, int bedTime){

        int startTimeToBedTime;
        int bedTimeToMidnight;
        int midnightToEndTime;

        startTimeToBedTime = bedTime - startTime;
        bedTimeToMidnight = 24 - bedTime;

        //when endTime is
        if (endTime > 1 && endTime <= 4) {
            midnightToEndTime = endTime;
        }
        else {
            midnightToEndTime = 0;
        }

        return ((startTimeToBedTime * 12) + (bedTimeToMidnight * 8) + (midnightToEndTime * 16));

    }
}
