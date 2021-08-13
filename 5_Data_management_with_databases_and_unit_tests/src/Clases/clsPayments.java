package Clases;

public class clsPayments {
    
    private int idPayment;
    private String paymentMethod;
    private int fees;
    private String idPaymentMethod;
    private String date;
    
    //--------------------------------------------------------------------------

    public clsPayments(int idPayment, String paymentMethod, int fees, String idPaymentMethod, String date) {
        this.idPayment = idPayment;
        this.paymentMethod = paymentMethod;
        this.fees = fees;
        this.idPaymentMethod = idPaymentMethod;
        this.date = date;
    }
    
    //--------------------------------------------------------------------------

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getIdPaymentMethod() {
        return idPaymentMethod;
    }

    public void setIdPaymentMethod(String idPaymentMethod) {
        this.idPaymentMethod = idPaymentMethod;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    //--------------------------------------------------------------------------
}
