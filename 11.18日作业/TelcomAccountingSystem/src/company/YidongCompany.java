package company;
import rate.*;
public class YidongCompany implements Company{

	@Override
	public Rate producerate() {
		// TODO Auto-generated method stub
		return new YidongRate();
	}
     
}
