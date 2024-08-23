// task №1603

class ParkingSystem {

    int bigPlaceCount, mediumPlaceCount, smallPlaceCount;
    public ParkingSystem(int big, int medium, int small) {
        bigPlaceCount = big;
        mediumPlaceCount = medium;
        smallPlaceCount = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) return --bigPlaceCount >= 0;
        else if (carType == 2) return --mediumPlaceCount >= 0;
        else return --smallPlaceCount >= 0;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
