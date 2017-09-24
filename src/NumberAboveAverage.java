/*
   @author Siam-Al-mer Chowdhury
   CSC 201-004N
   Professor Tanes Kanchanawanchai
 A program in a class NumberAboveAverage that counts the number of
days that the temperature is above average. Read ten temperatures from the
keyboard and place them in an array
   */
import java.util.Scanner;
public class NumberAboveAverage {

    public static void main (String args[]){

        //variable declarations
    double sum,avg,CounterAbvAvgs;//sum,average and CounteraboveAVerage temperature

    //array of ten temperature values
    double [] temperature =new double[10];

    Scanner keyboard=new Scanner(System.in);

    sum=0.0;
    CounterAbvAvgs=0;

System.out.println("Hello, please enter the temperatures for 10 days: ");

for (int i=0;i<10;i++){
    temperature[i]=keyboard.nextDouble();
    sum=sum+temperature[i];
}
        //average of ten temperautures
        avg=sum/10;

        //the number of days that the temperature is above avg
        for (int i=0;i<temperature.length;i++)
        {
            if (temperature[i]>avg)
                CounterAbvAvgs++;
        }
    System.out.println("The average temperature is: "+ avg);
        System.out.println("The number of days the temperature is above average: "+ CounterAbvAvgs);

    }
}
