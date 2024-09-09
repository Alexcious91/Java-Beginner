
package exercise_10_2;

public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char customerType;

    public Order(String name, double total, String state, char customerType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.customerType = customerType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
        if (customerType == NONPROFIT) {
            if (total > 900) {
                discount = 10.00;
            } else {
                discount = 8.00;
            }
        } else if (customerType == PRIVATE) {
            if (total > 900) {
                discount = 7.00;
            } else {
                discount = 0;
            }
        } else if (customerType == CORP) {
            if (total > 500) {
                discount = 8.00;
            } else {
                discount = 5.00;
            }
        }
    }
}
