package createCustomer;

public class CustomerFinance{
    
    public static void main(String[] args){
        
        Customer customer = new Customer();
        
        customer.setCustomerName();
        customer.setContactNumber();
        customer.setProductPrise();
        customer.setNumberOfMonths();
        customer.calculateMonthlyRepaymentAmount();
        
        FinancePeriod customerWithIntrest = new FinancePeriod();
        
        customerWithIntrest.setCustomerName();
        customerWithIntrest.setContactNumber();
        customerWithIntrest.setProductPrise();
        customerWithIntrest.setNumberOfMonths();
        customerWithIntrest.calculateMonthlyRepaymentAmount();

    }
}
