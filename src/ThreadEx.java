
public class ThreadEx {

	public static void main(String[] args) {
		
		
		RunnableThread ob = new RunnableThread();
	
		Thread thread_runnable = new Thread(ob);
		
		thread_runnable.start();
		

	}

}
