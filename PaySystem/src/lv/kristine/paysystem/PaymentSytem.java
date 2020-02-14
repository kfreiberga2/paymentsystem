package lv.kristine.paysystem;

import java.util.ArrayList;
import java.util.List;




public class PaymentSytem {
	private List<Payee> payees ;
	
	
	public PaymentSytem(){
		payees =new ArrayList <>();
	}
	
	public void addPayee(Payee payee){
		if(! payees.contains(payee)){
			payees.add(payee);
		}
	}
	
	public void processpayments(){
		for(Payee payee : payees){
			Double grosspayment  = payee.grossPayment();
			
			System.out.println("Paying to "+ payee.name());
			System.out.println("Grosst "+grosspayment);
			System.out.println("Transferred to Account: "+payee.bankAccount());
		}
	}
	
	
}
