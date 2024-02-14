package quiz;

import java.util.Arrays;


public class Examtimetable {

    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] timeSlots = {"9:00 AM", "11:00 AM", "2:00 PM", "4:00 PM"};
        String[][] timetable = new String[days.length][timeSlots.length];

        // Fill the timetable with exam details (replace with actual data)
        timetable[0][2] = "Java";
        timetable[1][0] = "Statistic";
        timetable[2][1] = ".NET PROGRAM";
        timetable[2][3] = "English";
        //timetable[3][3] = "ISAD";
        timetable[4][3]="ISAD";

        // Print the timetable in a clear format
        System.out.println("Exam Timetable:");
        System.out.println("----------------");
        System.out.println("==================John's schedule for the exam================ ");
        System.out.printf("%-15s", ""); // Align headers
        for (String timeSlot : timeSlots) {
            System.out.printf("%-15s", timeSlot);
        }
        System.out.println();

        for (int i = 0; i < days.length; i++) {
            System.out.printf("%-15s", days[i]);
            for (String exam : timetable[i]) {
                System.out.printf("%-15s", exam == null ? "(no exam)" : exam);
            }
            System.out.println();
        }
    }
    
}




