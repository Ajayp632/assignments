////////Sixth Question////////

abstract class Presistence{
	abstract void presist();
}
class FilePresistenece extends Presistence{

	@Override
	void presist() {
		// TODO Auto-generated method stub
		System.out.println("Data Saved in File");
	}
	
}
class DatabasePresistenece extends Presistence{

	@Override
	void presist() {
		// TODO Auto-generated method stub
		System.out.println("Data saved in Database");
	}
	
}
public class sixth extends Presistence{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Presistence obj=new sixth();
		obj.presist();
	}

	@Override
	void presist() {
		// TODO Auto-generated method stub
		System.out.println("Presistence method from sixth(class)");
		
	}
}