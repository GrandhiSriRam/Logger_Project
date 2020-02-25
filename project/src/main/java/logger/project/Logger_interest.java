package logger.project;

public class Logger_interest {
	public float simpleInterest(float principle,int timeInYears,int rate) {
		return (principle*timeInYears*rate)/100;
	}
	public double compoundInterest(float principle,int timeInYears,int rate) {
		double resultAmount = 0;
		for(int i=0;i<timeInYears;i++) {
			resultAmount += principle*rate/100;
			principle += resultAmount;
		}
		return resultAmount;
	}
}
