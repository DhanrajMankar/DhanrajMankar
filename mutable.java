package Dhanarjanudip01;
public class mutable {
private String a;
	public mutable(String a) {
		this.a=a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public static void main(String[] args) {
		mutable b=new mutable("Utkarsha");
		System.out.println(b.getA());
		b.setA("kanthiwar");
		System.out.println(b.getA());
		
	}

}
