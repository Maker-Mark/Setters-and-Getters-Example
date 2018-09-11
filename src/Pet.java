
/**
 * 
 * @author Mark
 *
 */

/** ():
 * Input:
 * Process:
 * Output:
 */
public class Pet {
	private String name;
	private String animal;
	private int age;
	
	/** setName():
	 * Input: petname string
	 * Process:Takes petname string and assigns it
	 * to class member field "name".
	 * Output:
	 * @param petName, the pet's name.
	 */
	
	public void setName(String petName)
	{
		name = petName;
	}
	
	/** setAnimal():
	 * Input:String for animal type
	 * Process:Takes in name and assigned it to 
	 * member field "animal"
	 * Output:
	 */
	public void setAnimal(String petAnim)
	{
		animal = petAnim;
	}
	/** setAge():
	 * Input: Age of pet
	 * Process:Assignes name 
	 * Output:
	 */
	
	public void setAge(int petAge) 
	{
		age = petAge; 
	}
	
	
	/** getName():
	 * Process: Gets name
	 */
	public String getName()
	{
		return name;
	}
	/** getAnimal():
	 * Process: Gets animal
	 */
	public String getAnimal()
	{
		return animal;
	}
	/** getAge():
	 * Process: Gets age
	 */
	public int getAge() 
	{
		return age;
	}
}
