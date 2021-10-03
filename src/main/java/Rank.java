public enum Rank {

    CAPTAIN(50000),
    FIRSTOFFICER(40000),
    PURSER(30000),
    FLIGHTATTENDANT(20000);

    private final int salary;

    Rank(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
