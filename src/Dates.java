public class Dates {
    CustomerAppointment customerAppointment = new CustomerAppointment("Ready to book", "");
    private int date;
    private int month;
    private int timeSlot;
    //private CustomerAppointment customerAppointment;
    private String phoneNumber;
    private boolean hasPaid = true;

    public Dates(int date, int month, int timeSlot) {
        setDate(date);
        setMonth(month);
        setTimeSlot(timeSlot);
        new CustomerAppointment("", "");
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public CustomerAppointment getCustomerAppointment() {
        return customerAppointment;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setCustomerAppointment(String firstName, String phoneNumber) {
        this.customerAppointment = new CustomerAppointment(firstName, phoneNumber);
    }

    public String toString() {
        return getDate() + "/" + getMonth() + " Appointment at: " + getTimeSlot() + " for customer "
                + getCustomerAppointment();
    }
}
