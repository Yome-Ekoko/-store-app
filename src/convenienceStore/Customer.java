package convenienceStore;

public class Customer extends Person {
    private String order;
    private String orderNumber;
    private Integer phoneNumber;
    private String dispatchAddress;


    public Customer() {
    }

    public Customer(String order, String orderNumber, Integer phoneNumber, String dispatchAddress) {
        this.order = order;
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.dispatchAddress = dispatchAddress;
    }

    public Customer(String name, String gender, String email, String order, String orderNumber, Integer phoneNumber, String dispatchAddress) {
        super(name, gender, email);
        this.order = order;
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.dispatchAddress = dispatchAddress;
    }


    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDispatchAddress() {
        return dispatchAddress;
    }

    public void setDispatchAddress(String dispatchAddress) {
        this.dispatchAddress = dispatchAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "order='" + order + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dispatchAddress='" + dispatchAddress + '\'' +
                '}';
    }
}
