public class TextExample03{
	public static void main(String[] args){
	    Teacher th=new Teacher();
        new Thread(th,"李老师").start();
        new Thread(th,"贾老师").start(); 		 
	}
}
class Teacher implements Runnable{
	private int zuoye=80;
	public void run(){
		for(int i=1;i<=80;i++){
			if(zuoye>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在发第"+zuoye--+"份作业");
			}
		}
	}
}