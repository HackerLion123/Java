import java.util.*;

class Fibonacii extends Thread{
	int n;
	ArrayList<Integer> array;
	public Fibonacii(int a){ n = a; }
	public void run(){
		
	}
}

class PrimeNumber extends Thread{
	int n;
	ArrayList<Integer> array;
	public PrimeNumber(int a){ n = a; }
	public void run(){
		for(int i = 1; i < n; i++){
			if(isPrime(n,i))
				System.out.print(i+"\t");
		}
	}
	public boolean isPrime(int n,int i){
		int count = 0;
		for(int j = 1; j < n; j++){
			if(i%j == 0)
				count++;
		}
		if(count > 2)
			return false;
		else
    		return true;
	}
}

public class Thread{
		public static void main(String[] args){
			Fibonacii fb = new Fibonacii();
			PrimeNumber pn = new PrimeNumber();
		}
}
