public class TextExample03{
	public static void main(String[] args){
	    Teacher th=new Teacher();
        new Thread(th,"����ʦ").start();
        new Thread(th,"����ʦ").start(); 		 
	}
}
class Teacher implements Runnable{
	private int zuoye=80;
	public void run(){
		for(int i=1;i<=80;i++){
			if(zuoye>0){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڷ���"+zuoye--+"����ҵ");
			}
		}
	}
}