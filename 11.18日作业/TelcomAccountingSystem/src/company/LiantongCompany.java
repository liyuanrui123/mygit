package company;
import rate.*;
public class LiantongCompany implements Company{

	@Override
	public Rate producerate() {
		// TODO Auto-generated method stub
		return new LiantongRate();
	}
    
}
