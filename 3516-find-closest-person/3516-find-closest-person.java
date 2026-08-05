class Solution {
    public int findClosest(int x, int y, int z) {
        int c1 = Math.abs(z - x);
        int c2 = Math.abs(z - y);

        if (c1 < c2) {
            return 1;
        } else if (c2 < c1) {
            return 2;
        } else {
            return 0;
        }
    }
}