package factory;
import tv.TV;
import tv.HaisenTV;
public class HaisenTVFactory implements TVFactory{
	public TV produceTV(){
		return new HaisenTV();
	}
}