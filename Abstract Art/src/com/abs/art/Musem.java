package com.abs.art;

import java.util.ArrayList;

public class Musem {
	   public static void main(String[] args) {
	        // TODO: create paintings and sculptures here
		   
		   Painting painting1=new Painting("hello","Dania","hi hello ","Oil");
		   Painting painting2=new Painting("hello1","Samia","hi hello1 ","Oil");
		   Painting painting3=new Painting("hello2","Bisan","hi hello2 ","Oil");
			painting1.viewArt();
			painting2.viewArt();
			painting3.viewArt();
			
			Sculpture sculpture1 = new Sculpture("The angel ", "Mathew", "the angel", "oil");
			Sculpture sculpture2 = new Sculpture(" Angel world", "Saint ", "Gracefull", "oil" );
			sculpture1.viewArt();
			sculpture2.viewArt();
			

	   
	   }
}
