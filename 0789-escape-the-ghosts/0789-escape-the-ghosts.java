class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int[] user={0,0};
        int d = 0;
        for(int i = 0; i < target.length; i++) {
            d = d + Math.abs(0 - target[i]);
        }
        for (int i = 0; i < ghosts.length; i++) {
               int gd=0;
            for (int j = 0; j < ghosts[i].length; j++) {
                gd=gd+Math.abs(ghosts[i][j]-target[j]);
            }
                if(gd<=d){
                    return false;
                }
        
            }
            return true;
                
    }
}