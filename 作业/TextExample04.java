public class TextExample04{
	public static void main(String[] args){
		TaxiDrive td=new TaxiDrive();
		new Thread(td,"出租车司机1").start();
		new Thread(td,"出租车司机2").start();
		new Thread(td,"出租车司机3").start();
		new Thread(td,"出租车司机4").start();
		new Thread(td,"出租车司机5").start();
	}
}
class TaxiDrive implements Runnable{
	private int passenger=100;
	public void run(){
		while(true){
			if(passenger>0){
				Thread td=Thread.currentThread();
				String td_name=td.getName();
				System.out.println(td_name+"正在接送第"+passenger--+"位客人！");
			}
		}
	}
}