class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int component=0;
        boolean[] vis = new boolean[n];
        for(int node=0;node<n;node++){
            if(!vis[node]){
                dfs(adj,vis,node);
                component++;
            }
        }

        return component;

    }

    private void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int node){
        vis[node] = true;
        for(int neighbors : adj.get(node)){
            if(!vis[neighbors]){
                dfs(adj,vis,neighbors);
            }
        }
    }
}
