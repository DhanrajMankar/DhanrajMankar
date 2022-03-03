package JDBCmaven.dhanraj;

public class TestCustomException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(17);
		}
		catch(InvalidException e) {
			System.out.println(e);
		}
	}
	static void validate(int age) throws InvalidException{
		
		if(age <=18) {
			throw new InvalidException("you cannot be enrolled into Anudip Training");
		}
		else {
			System.out.println("Welcome to Anudip Training center");
		}
	}

	
	}
class InvalidException extends Exception{
	
	public InvalidException(String str) {
		
		super(str);
	}
}





