import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int maxEvents(int[][] events) {
        int n = events.length;
        
        // Sort events by start day
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // stores end days
        int day = events[0][0];  // start from the earliest event start day
        int i = 0; // index for events
        int cnt = 0; // count of attended events

        while (!pq.isEmpty() || i < n) {
            // If no events available today, jump to the next start day
            if (pq.isEmpty()) {
                day = events[i][0];
            }

            // Add all events that start today
            while (i < n && events[i][0] == day) {
                pq.add(events[i][1]); // add end day to the heap
                i++;
            }

            // Attend the event that ends the earliest
            if (!pq.isEmpty()) {
                pq.poll(); // attend one event
                cnt++;
            }

            day++; // move to the next day

            // Remove all events that have already expired
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
        }

        return cnt;
    }
}
