package task_1_2_2;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1, 1, 1978); 
        DateTask date2 = new DateTask(9, 21, 1984); 

        // Display the two dates
        System.out.println("Date 1: " + date1); 
        System.out.println("Date 2: " + date2); 

        // Display leap years from 1980 to the year of date2 (1984)
        System.out.println("Leap Years from 1980 to " + date2.getYear() + ": ");
        DateTask.leapYears(); 
    }
}