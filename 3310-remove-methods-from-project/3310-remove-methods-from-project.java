class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        // Step 1: Build adjacency list
        List<List<Integer>> adjL = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adjL.add(new ArrayList<>());

        for (int[] edge : invocations)
            adjL.get(edge[0]).add(edge[1]);

        // Step 2: Mark suspicious methods
        boolean[] isSuspicious = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(k);
        isSuspicious[k] = true;

        while (!stack.isEmpty()) {
            int currentMethod = stack.pop();

            for (int calledMethod : adjL.get(currentMethod)) {
                if (!isSuspicious[calledMethod]) {
                    isSuspicious[calledMethod] = true;
                    stack.push(calledMethod);
                }
            }
        }

        // Step 3: Check if a safe method invokes a suspicious one
        for (int[] edge : invocations) {
            int caller = edge[0];
            int called = edge[1];

            if (!isSuspicious[caller] && isSuspicious[called]) {
                List<Integer> all = new ArrayList<>();
                for (int i = 0; i < n; i++)
                    all.add(i);
                return all;
            }
        }

        // Step 4: Return remaining safe methods
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!isSuspicious[i])
                result.add(i);
        }

        return result;
    }
}