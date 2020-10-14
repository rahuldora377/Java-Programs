import java.util.Scanner;
class throws{
	public static void main(String[] args) {
		enterAge obj = new enterAge();
		try{
			obj.getAge();
		}
		catch(validOrNot e){
			System.out.println(e);
		}
		System.out.println("last statement");
	}
}	

class validOrNot extends RuntimeException{

	validOrNot(String msg){
		super(msg);
	}

}

class enterAge
{
	int age;
	void getAge()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age=input.nextInt();
		if(age<18)
		{
			throw new validOrNot("not eldigible");
		}
		else
		{
			System.out.println("you are elidigible");
		}
	}
}
