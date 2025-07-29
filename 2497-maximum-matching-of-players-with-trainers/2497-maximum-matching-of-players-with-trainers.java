class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int p=players.length;
        int t=trainers.length;
        int i=0,j=0;
        while(i<p && j<t){
            if(players[i]<=trainers[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}