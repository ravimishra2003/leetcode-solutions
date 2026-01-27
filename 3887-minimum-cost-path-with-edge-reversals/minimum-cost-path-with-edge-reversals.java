class Solution {
    public int minCost(int n, int[][] edges) {
         List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];

            graph.get(u).add(new int[]{v, w});       // normal edge
            graph.get(v).add(new int[]{u, 2 * w});   // reversed edge
        }

        // Dijkstra
        PriorityQueue<int[]> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[0] = 0;
        pq.offer(new int[]{0, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int cost = cur[1];

            if (node == n - 1) return cost;

            if (cost > dist[node]) continue;

            for (int[] nei : graph.get(node)) {
                int next = nei[0];
                int w = nei[1];

                if (dist[node] + w < dist[next]) {
                    dist[next] = dist[node] + w;
                    pq.offer(new int[]{next, dist[next]});
                }
            }
        }

        return -1;
    }
}