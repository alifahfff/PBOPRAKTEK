/**
 * @author ALIFAH
 *
 */

import java.util.*;

class MainClass
{
	public static void main (String[] args)
	{
		Idol i1 = new Idol("Bangchan", "SKZ");
		Idol i2 = new Idol("Lee Know", "SKZ");
		Idol i3 = new Idol("Changbin", "Hyung");
		Idol i4 = new Idol("Hyunjin", "Hyung");
		
		List <Idol> Hyung_idol = new ArrayList<Idol>();
		Hyung_idol.add(i1);
		Hyung_idol.add(i2);
		List <Idol> SKZ_idol = new ArrayList<Idol>();
		SKZ_idol.add(i3);
		SKZ_idol.add(i4);
		
		Group Hyung = new Group ("Hyung", Hyung_idol);
		Group SKZ = new Group("SKZ", SKZ_idol);
		
		List <Group> group = new ArrayList<Group>();
		group.add(SKZ);
		group.add(Hyung);
		
	// creating an instance of Institute.
		JYP jyp = new JYP("BITS", group);
		System.out.print("Total Divisi StrayKids: ");
		System.out.print(jyp.getTotalIdolInJYP());
		
		List<Group> Gr = jyp.getTotal();
		System.out.println();
		for (Group idl : Gr) {
			System.out.println("- " + idl.getName());
		}
	}
	
}

//	JYP jyp = new JYP("Stray Kids");
//	Idol idl = new Idol("Changbin", "DivisiOne");
//	System.out.println(idl.getIdolName() + " member " + jyp.getJYPName());