// Count Days Without Meetings 3169

import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] i : meetings) {
            if (list.isEmpty() || list.getLast()[1] < i[0]) {
                list.add(i);
            } else {
                list.getLast()[1] = Math.max(list.getLast()[1], i[1]);
            }
        }

        int day = 0;
        for (int[] interval : list) {
            day += interval[1] - interval[0] + 1;
        }

        return days - day;
    }
}
