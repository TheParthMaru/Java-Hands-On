package main;

public class ThreadClass extends Thread{
	
	Numbers num;
	Integer start;
	Integer end;
	
	public ThreadClass(Numbers num, Integer start, Integer end) {
		this.num = num;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		synchronized (num) {
			num.evenOdd(start, end);
		}
	}
}
