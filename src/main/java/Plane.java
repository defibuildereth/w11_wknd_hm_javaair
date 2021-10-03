public enum Plane {


    BOEING747(400, 1000),
    AIRBUS420(600, 2000),
    SPITEFIRE(5, 200),
    LUFFTWAFFE(6, 100);

    private final int capacity;
    private final int weight;

    Plane(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
