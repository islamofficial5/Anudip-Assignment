package oopsprograms;

class Bank
{
	public void loanInterest()
	{
		System.out.println("9% interest rate");
	}
}

class Sbi extends Bank
{
	public void pensionSceme()
	{
		System.out.println("minimum 5 years sceme you need to take");
	}
}

class Axis extends Bank
{
	public void fixedDeposite()
	{
		System.out.println("tenor year is 5");
	}
}

public class Hierarchical_Inheritance
{
	public static void main(String[] args) 
	{
		Sbi sbi = new Sbi();
		sbi.loanInterest();
		sbi.pensionSceme();
		
		Axis axis = new Axis();
		
		axis.loanInterest();
		axis.fixedDeposite();
	}
}
