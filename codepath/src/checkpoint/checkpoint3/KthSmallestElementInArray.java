package checkpoint.checkpoint3;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestElementInArray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : A) {
            queue.offer(num);
            if (queue.size() > B) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
