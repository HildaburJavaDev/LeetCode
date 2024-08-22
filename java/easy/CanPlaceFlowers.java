// task № 605

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) {
            if ((n == 1 && flowerbed[0] == 0) || n == 0) {
                return true;
            } else {
                return false;
            }
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                } else if (i == flowerbed.length - 1 && flowerbed[i - 1] != 1) {
                    n--;
                    flowerbed[i] = 1;
                } else if (i != 0 && i != flowerbed.length - 1 && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }
        return n <= 0;
    }
}
