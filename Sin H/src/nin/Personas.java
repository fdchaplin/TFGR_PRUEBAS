package nin;

public class Personas {
	private String name;
	public Personas() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+name;
	}
}
