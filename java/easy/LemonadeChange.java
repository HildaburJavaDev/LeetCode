class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int bill: bills) {
            if( bill == 5)
                five++;
            else if( bill == 10) {
                if( five >= 1) {
                    five--;
                    ten++;
                }else
                    return false;
            }else {
                if(five >= 1 && ten >= 1) {
                    ten--;
                    five--;
                }else if( five >= 3)
                    five -= 3;
                else
                    return false;
            }
        }
        return true;
        
    }
}
