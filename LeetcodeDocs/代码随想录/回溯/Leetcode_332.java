package 代码随想录.回溯;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import sun.font.TrueTypeFont;

import java.util.*;
import java.util.stream.Collector;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/05/16:40
 * @since: 1.8
 */
public class Leetcode_332 {
    List<String> res;
    LinkedList<String> path = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        tickets.sort(Comparator.comparing(a -> a.get(1)));
        path.add("JFK");
        boolean[] used = new boolean[tickets.size()];
        dfs(tickets, used);
        return res;
    }

    private boolean dfs(List<List<String>> tickets, boolean[] used) {
        if (path.size() == tickets.size() + 1) {
            res = new LinkedList<>(path);
            return true;
        }
        for (int i = 0; i < tickets.size(); i++) {
            if (!used[i] && tickets.get(i).get(0).equals(path.getLast())) {
                path.add(tickets.get(i).get(1));
                used[i] = true;

                if (dfs(tickets, used)) {
                    return true;
                }
                used[i] = false;
                path.removeLast();
            }
        }
        return false;
    }
}
