package Exception;

public class Bank {
   // public static void main(String[] args) {
        private String currency;
        private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName){
        if(!bankName.currency.equalsIgnoreCase("INR")){
            try {
                throw new Exception("Currency Doesn't Match");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }
}

