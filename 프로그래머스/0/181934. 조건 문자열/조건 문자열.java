class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String join = ineq + eq;
        if(join.equals(">="))
        {
            if(n>=m)
                answer = 1;
            else answer = 0;
        }
        else if(join.equals(">!"))
        {
            if(n>m)
                answer = 1;
            else answer = 0;
        }
        else if(join.equals("<="))
        {
            if(n<=m)
                answer = 1;
            else answer = 0;
        }
        else if(join.equals("<!"))
        {
            if(n<m)
                answer = 1;
            else answer = 0;
        }
        
        return answer;
    }
}