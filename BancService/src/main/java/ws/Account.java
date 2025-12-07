package ws;

import java.util.Date;

public class Account {
    private int code ;
    private double balance;
    private Date cratedAt;

    public  Account(){
    }
    public Account(int code , double balance,Date cratedAt){
        this.code = code;
        this.balance = balance;
        this.cratedAt = cratedAt;
    }

  public int getCode(int code){return code;}
  public void setCode(int code){
      this.code=code;
  }
  public double getBalance(){
      return balance;
  }
  public void setBalance(double balance){
      this.balance=balance;
  }
  public Date getCratedAt(){
      return cratedAt;
  }
  public void setCratedAt(Date cratedAt){
      this.cratedAt=cratedAt;
  }

    public int getCode() {
        return code;
    }
}
