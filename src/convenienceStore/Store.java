package convenienceStore;

import java.util.List;

public class Store {
    private Integer id;
    private String storeName;
    private List<Staff> staff;
   private List<Product> allProducts;

    public Store() {
    }

    public Store(Integer id, String storeName, List<Staff> staff, List<Product> allProducts) {
        this.id = id;
        this.storeName = storeName;
        this.staff = staff;
        this.allProducts = allProducts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(List<Product> allProducts) {
        this.allProducts = allProducts;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", staff=" + staff +
                ", allProducts=" + allProducts +
                '}';
    }
}
