public class TextExample05{
	public static void main(String[] args){
		DownLoad dl=new DownLoad();
		new Thread(dl,"�ֶ�1").start();
		new Thread(dl,"�ֶ�2").start();
		new Thread(dl,"�ֶ�3").start();
		new Thread(dl,"�ֶ�4").start();
	}
}
class DownLoad implements Runnable{
	private int b=0;
	public void run(){
		int[] a=new int[100];
	    /*for(int i=0;i<a.length;i++){
			a[i]=i;
	    }
		for(int j=0;j<a.length;j++){
			Thread dl=Thread.currentThread();
			String dl_name=dl.getName();
			System.out.println(dl_name+"��������"+j+"%");
		}*/
		//private int b=0;
		while(true){
			if(b<=a.length){
			Thread dl=Thread.currentThread();
			String dl_name=dl.getName();
			System.out.println(dl_name+"��������"+b+++"%");	
			}
		}
	}
}