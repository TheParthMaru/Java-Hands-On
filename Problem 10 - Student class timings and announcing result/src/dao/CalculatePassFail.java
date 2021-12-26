package dao;

public interface CalculatePassFail {
	public double ugPassPercentage = 60;
	public double pgPassPercentage = 70;

	public void classTimings();

	public String calculation();
}
