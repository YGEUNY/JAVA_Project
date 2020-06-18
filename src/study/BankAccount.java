package study;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
	private String mAccount, mHolder;
	private int mAmount;
	
	
	public BankAccount(String account, String holder, int amount) {
		mAccount = account;
		mHolder = holder;
		mAmount = amount;
	}
	
	public boolean deposit(int amount) {
		if(!isPositiveAmount(amount)) return false;
		
		mAmount += amount;
		System.out.printf(CommonMessage.MSG_BANK_DEPOSIT,convertToDecimalFormat(amount));
				
		printAmount();		
		return true;
	}
	
	private void printAmount() {
		System.out.printf(CommonMessage.MSG_BANK_AMOUNT, convertToDecimalFormat(amount));
	}
	
	public void printStatus() {
		System.out.printf(CommonMessage.MSG_BANK_STATUS);
	}
	
	private boolean isPositiveAmount(int amount) {
		if(mAmount - amount < 0) {
			System.out.println(CommonMessage.MSG_BANK_ERROR_NOT_ENOUGH);
			return false;
		}
		return true;
	}
	
	private String convertToDecimalFormat(int amount) {
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.KOREA);
		nf.setMaximumFractionDigits(3);
		return nf.format(amount);
	}

}
