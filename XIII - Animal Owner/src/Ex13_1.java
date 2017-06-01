public class Ex13_1 
{
	
	//
	public static void main(String[] args) 
	{
		Pet p0 = new Dog("Morrison", 7, "Terrier", Pet.IsFemale.NO, "Tawny", Dog.IsMicroChipped.YES);
		Pet p1 = new Cat("Sanchez", 4, "Bengal", Pet.IsFemale.YES, "Dark Brown", 7);
		Pet p2 = new Snake("Jormungandr", 560_000, "Midgard Serpent", Pet.IsFemale.NO, "Noisome Green");
		Pet p3 = new Hamster("Guido", 15, "Roborovski", Pet.IsFemale.YES, "Dusky Yellow");
		
		Pet[] petsOwner1 = {p0, p1};
		Pet[] petsOwner2 = {p2};
		Pet[] petsOwner3 = {p3};
		
		Owner owner0 = new Owner("Jim Simpson", "The Mojave Desert", "+35387-099-8475", petsOwner1);
		Owner owner1 = new Owner("Michael Gira", "The Plateau of Leng", "+35385-560-3455", petsOwner2 );
		Owner owner2 = new Owner("Garry Kasparov", "Moscow", "+35386-452-5634", petsOwner3);
		
		Owner[] ownerBoys = {owner0, owner1, owner2};
		
		Pet[][] petArrays = {petsOwner1, petsOwner2, petsOwner3};
		
		for(int i = 0; i < petArrays.length; i++) 
		{
			System.out.println(ownerBoys[i].toString() + "\n");
			for(int j = 0; j < petArrays[i].length; j++) 
			{
				System.out.println(petArrays[i][j].toString() + "\n");
			}
			System.out.println();
		}
	}
}
