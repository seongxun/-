class Solution {
    public long solution(long n) {
        long answer = 0;
        // int cnt = 0;
        for(long i = 1;i <= n;i++){
            if(n/i == i && n%i == 0){
                answer = (i+1)*(i+1);
                break;
                }
            else answer = -1;
        }
        return answer;
    }
}