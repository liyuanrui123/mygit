public class TextExample04{
	public static void main(String[] args){
		TaxiDrive td=new TaxiDrive();
		new Thread(td,"���⳵˾��1").start();
		new Thread(td,"���⳵˾��2").start();
		new Thread(td,"���⳵˾��3").start();
		new Thread(td,"���⳵˾��4").start();
		new Thread(td,"���⳵˾��5").start();
	}
}
class TaxiDrive implements Runnable{
	private int passenger=100;
	public void run(){
		while(true){
			if(passenger>0){
				Thread td=Thread.currentThread();
				String td_name=td.getName();
				System.out.println(td_name+"���ڽ��͵�"+passenger--+"λ���ˣ�");
			}
		}
	}
}