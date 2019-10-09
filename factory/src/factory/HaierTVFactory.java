package factory;
import tv.TV;
import tv.HaierTV;
public class HaierTVFactory implements TVFactory{
	public TV produceTV(){
		return new HaierTV();
	}
}