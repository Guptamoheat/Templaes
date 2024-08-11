import java.util.*;

public class MultiSet<A> {
        private TreeMap<A, Integer> map;
        private int size;

        public MultiSet() {
            map = new TreeMap<>();
        }

        public boolean contains(A value) {
            return map.containsKey(value);
        }

        public void add(A value) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        public boolean remove(A value) {
            if(map.containsKey(value)) {
                map.put(value, map.get(value) - 1);
                if(map.get(value) == 0) map.remove(value);
                return true;
            }

            return false;
        }

        public int size() {
            return size();
        }
    }
