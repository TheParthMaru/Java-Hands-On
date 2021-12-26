package main;

public class Numbers {
	public void evenOdd(int start, int end) {
		System.out.println("\nEven numbers");
		for(int i = start; i <= end; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("\nOdd numbers");
		for(int i = start; i <= end; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
