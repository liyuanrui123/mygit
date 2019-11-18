package company;
import rate.*;
public class DianximCompany implements Company{

	@Override
	public Rate producerate() {
		// TODO Auto-generated method stub
		return new DianxinRate();
	}
   
}
