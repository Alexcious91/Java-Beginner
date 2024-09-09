
package exercise_10_3.exercise_10_2;

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
        switch (customerType) {
            case NONPROFIT:
                discount = (total > 900) ? 10.00 : 8.00;
                break;
            case PRIVATE:
                discount = (total > 900) ? 7.00 : 0;
                break;
            case CORP:
                discount = (total > 500) ? 8.00 : 5;
        }
    }
}
