package java_pratice.array_examples.oops_pratice;

public class AccountEncapsulation {
    private String name=" STRING";
    private String email="boaghakjja@gmail.com";
    private long account_number=2948595033l;
    private  float amount=894093.03f;
public String getName(){
    return name;
}

    public float getAmount() {
        return amount;
    }

    public long getAccount_number() {
        return account_number;
    }

    public String getEmail() {
        return email;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
       AccountEncapsulation S1=new AccountEncapsulation();
      S1.setAccount_number(679392902);
       S1.setName("scale");
      S1.setAmount(29399293);
S1.setEmail("anithapolireddy@gmail.com");


        System.out.println(S1.getEmail()+  " " + S1.getName()+ " " +S1.getAmount()+" " + S1.getAccount_number());


    }
}


