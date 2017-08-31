package com.company;

public class BabySitter {

    public int calculatePay(int startTime, int endTime, int bedTime){

        int startTimeToBedTime;
        int bedTimeToMidnight;
        int midnightToEndTime;

        startTimeToBedTime = bedTime - startTime;
        bedTimeToMidnight = 24 - bedTime;

        if (startTime < 17){
            throw new IndexOutOfBoundsException("Can not start before 5pm");
        }

        if (endTime > 4 && endTime != 24){
            throw new IndexOutOfBoundsException("End time can not be after 4am");
        }

        if (endTime > 1 && endTime <= 4) {
            midnightToEndTime = endTime;
        }
        else {
            midnightToEndTime = 0;
        }

        return ((startTimeToBedTime * 12) + (bedTimeToMidnight * 8) + (midnightToEndTime * 16));

    }
}
