package info.mastera;

/**
 * Simple object for example
 */
public class Customer {

    private Integer id;
    private String customerName;
    private String telephone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String toString() {
        return "id=" + getId() + "; "
                + "name=" + getCustomerName() + "; "
                + "phone=" + getTelephone() + "; ";
    }
}