public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private final int DAYS_IN_MONTH;
    Months(int id) {
        this.DAYS_IN_MONTH = id;}
    public int getDAYS_IN_MONTH(){
        return DAYS_IN_MONTH;
    }
}
