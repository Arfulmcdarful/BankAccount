import java.time.LocalDateTime;

//Provided Transaction class//

public class Transaction {

	private LocalDateTime transactionTime;
	private double amount;
	private String description;
	
	public Transaction(LocalDateTime transactionTime, double amount, String description){
		
		this.transactionTime = transactionTime;
		this.amount = amount;
		this.description = description;
		
	}
	
	public Transaction(double amount, String description){
		
		this.amount = amount;
		this.description = description;
		
	}
	
	public LocalDateTime getTransactionTime() {
		
		return transactionTime;
		
	}
	public double getAmount() {
		
		return amount;
		
	}
	public String getDescription() {
		
		return description;
		
	}
	
}
