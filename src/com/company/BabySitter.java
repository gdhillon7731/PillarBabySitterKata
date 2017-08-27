package com.company;

public class BabySitter {

    public int calculatePay(int startTime, int endTime, int bedTime){

        int startTimeToBedTime = bedTime - startTime;
        int bedTimeToMidnight = 24 - bedTime;
        int midnightToEndTime = endTime;

        return ((startTimeToBedTime * 12) + (bedTimeToMidnight * 8) + (midnightToEndTime * 16));

    }
}
