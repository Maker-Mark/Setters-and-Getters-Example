
import javax.swing.JOptionPane;

public class PetTest {
	
	public static void main(String[] args)
	{
		String input;
		//input = JOptionPane.showInputDialog("What's the pets name");
		Pet testPet = new Pet();
		testPet.setName("Gibby");
		System.out.println("Pet name is "+ testPet.getName());
		
	}

}
