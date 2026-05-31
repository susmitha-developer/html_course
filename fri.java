class Payment {

   
    
    void pay() {
        System.out.println("Processing payment");
    }
}




class CreditCard extends Payment {
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}



class UPI extends Payment {
    void pay4() {
        System.out.println("Payment done using UPI");
    }
}



class Cash extends Payment {
    void pay() {
        System.out.println("Payment done using Cash");
    }
}



public class fri {
    public static void main(String[] args) {
     //reference
        Payment p;

        p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();

        p = new Cash();
        p.pay();
    }
}