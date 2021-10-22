
import java.util.*;

public class JYP {

		private String Gname;
		private List<Group> group;
		JYP(String Gname,List<Group> group)
		{
			this.Gname = Gname;
			this.group = group;
		}
		
		// count total students of all departments
		// in a given institute
		
		public int getTotalIdolInJYP()
		{
			int noOfIdol = 0;
			List<Idol> idol;
			for(Group divisi : group)
			{
				idol = divisi.getIdol();
				for(Idol i : idol)
					{
						noOfIdol++;
					}
			}
			return noOfIdol;
		}
		
		public List<Group> getTotal(){
			return group;
		}
		
		public String getGName()
		{
			return Gname;
		}

}

