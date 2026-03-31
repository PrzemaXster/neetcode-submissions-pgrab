class Solution {
    List<String> result = new LinkedList<>();

    public List<String> generateParenthesis(int n) {
        dfs("", 0, 0, n);
        return result;
    }

    public void dfs(String parenthesis, int open, int closed, int n){
        if(open < n){
            dfs(parenthesis + "(", open+1, closed, n);
        }
        if(closed < open){

            dfs(parenthesis + ")", open, closed+1, n);
        }
        if(open == closed && open == n){
            result.add(parenthesis);
        }
    }
}
