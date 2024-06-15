package Leetcode.Easy;

import java.util.Arrays;
//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
public class Minimum_Number_of_Moves_to_Seat_Everyone_2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;
        for(int i=0;i<students.length;i++){
            ans += Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}
