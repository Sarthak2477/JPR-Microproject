package Microproject;

public class Customer{
    private String name, address, connectionType;
    private long contact;
    int meterNum;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getConnectionType() {
        return connectionType;
    }
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }
    public long getContact() {
        return contact;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }
    public int getMeterNum() {
        return meterNum;
    }
    public void setMeterNum(int meterNum) {
        this.meterNum = meterNum;
    }
    public Customer(String name, String address, String connectionType, long contact, int meterNum) {
        this.name = name;
        this.address = address;
        this.connectionType = connectionType;
        this.contact = contact;
        this.meterNum = meterNum;
    }

    

    
}