public class TextExample02{
	public static void main(String[] args){
		MyThread myThread=new MyThread();
		Thread th=new Thread(myThread);
		th.start();
		for(int i=1;i<=100;i++){
			System.out.println("Main");
		}
	}
}
class MyThread implements Runnable{
	public void run(){
		for(int i=1;i<=50;i++){
			System.out.println("New");
		}
	}
}