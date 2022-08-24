package com.practise;

public class AngleBetweenHands {


    public static void main(String[] args) {
        String input ="1:15";
        String[] time = input.split(":");
        if(time.length<2){
            System.out.println("Invalid time input");
        }
        String hour = time[0];
        String min = time[1];

       int angle =  angle(Integer.parseInt(hour), Integer.parseInt(min));
        System.out.println("Angle between the hr and min hands are= " + angle);

    }

    public static int angle(int hour, int minute){
        //Hour hand in  12 hour = 360 degree => 1 hour = 30 degree
        // Minute hand in 60min = 360 degree => 1 minute = 6 degree
        //Hour hand in 1 minute = 30/60 i.e 0.5 degree
       // ( 30*Hour+ 1/2 * min - 6*min)
        // 30 degree Hour -11/2 minute



        System.out.println("Hour= "+hour+" & min= "+ minute);
        int formula = (30*hour - (11/2 * minute)) ;
        return formula;

    }
}
