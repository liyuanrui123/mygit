public class TextExample01{
	public static void main(String[] args){
		MyThread myThread=new MyThread();
		myThread.start();
		for(int i=1;i<=10;i++){
			System.out.println("Main��������������"+i);
		}
	}
}
class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("MyThread��������������"+i);
		}
	}
}