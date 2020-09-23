package createCustomer;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class Customer{
    
    private String customerName;
    private long contactNumber;
    private double productPrise;
    private int numberOfMonths;
    private double monthlyRepaymentAmount;


    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    // setting the customer name
    public void setCustomerName() {

        this.customerName = showInputDialog("Please enter the customer name", "");
    }

    /**
     * @return the contactNumber
     */
    public long getContactNumber() {
        return contactNumber;
    }

    // setting the contact number name
    public void setContactNumber() {
        this.contactNumber = Integer.parseInt(showInputDialog("Please enter the customer contact number", ""));
    }

    /**
     * @return the productPrise
     */
    public double getProductPrise() {
        return productPrise;
    }

    // setting the price of the product
    public void setProductPrise() {
        this.productPrise = Double.parseDouble(showInputDialog("Please enter the price of the product", ""));
    }

    /**
     * @return the numberOfMonths
     */
    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    // setting the number of months
    public void setNumberOfMonths() {
        this.numberOfMonths = Integer.parseInt(showInputDialog("Please enter the number of repayment months", ""));
    }
    
    public void calculateMonthlyRepaymentAmount(){
        
        monthlyRepaymentAmount = getProductPrise() / getNumberOfMonths();
        
        JOptionPane.showMessageDialog(null, "Customer Name: " + getCustomerName() 
                                        + "\nCustomer Contact: 0" + getContactNumber() 
                                        + "\nProduct Amount: R" + getProductPrise()
                                        + "\nRepayement Months: " + getNumberOfMonths() 
                                        + "\nMonthly Repayment: R" + monthlyRepaymentAmount 
                                        + "\nTotal Due: R" + getProductPrise());
    }
    
}
