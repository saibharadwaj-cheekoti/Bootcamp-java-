package encapsulation;

import java.util.ArrayList;

public class RoseGarden {
	
	public static ArrayList<Rose> roses;
	
	{
		roses= new ArrayList<>();
		roses.add(new Rose ("Red","Friend Rose"));
	}
	
	public RoseGarden() {
		
	}
	
	public RoseGarden(String name, String colour, int nor) {
		for(int x=0;x<nor;x++) {
			roses.add(new Rose(colour,name));
			
		}
	}
	
	public void addRose(String name,String colour) {
		roses.add(new Rose(colour,name));
	}
	
	public void getRoses() {
		
		new Object(){
			public void validate(String name) {
				if ("Red".equalsIgnoreCase(name)) {
					System.out.println("valid");
				}
					else {
						System.out.println("invalid");
					}
				}
		}.validate("Red");;
		
		for(Rose rose:roses) {
			System.out.println(rose.toString());
		}
		
		//new RoseValidator().validate("Red");;
	}
	
	 class Rose {

		String colour;
		String name;
		
		public Rose(String colour, String name) {
			super();
			this.colour = colour;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "name:"+name+" colour:"+ colour;
		}
	}
}
