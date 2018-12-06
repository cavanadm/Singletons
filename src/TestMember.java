import java.util.Arrays;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class TestMember{

	public static void main(String[] args) throws InvalidValue {
		
		
		Member[] mem = new Member[10];

		 
		mem[0] = Leader.getInstance();
		mem[1] = new Member(2, "Dylan", "Cavanaugh", "writer", 3);
		mem[2] = new Member(3, "Aidan", "Cavanaugh", "carpenter", 50);
		mem[3] = new Member(4, "Mckenna", "Cavanaugh", "painter", 8);
		mem[4] = new Member(5, "Sean", "Cavanaugh", "teacher", 12);
		mem[5] = new Member(2, "Thad", "Cavanaugh", "barista", 16);
		mem[6] = new Member(3, "Tim", "Cavanaugh", "wrestler", 4);
		mem[7] = new Member(5, "Tony", "Cavanaugh", "ranger", 60);
		mem[8] = new Member(4, "Jerry", "Cavanaugh", "assassin", 25);
		mem[9] = new Member(4, "Lynda", "Cavanaugh", "accountant", 39);
		
		mem[1].setRank(7);
		
		
		

		Arrays.sort(mem);
		for(Member member : mem) {
			
			System.out.println(member.toString());
			
		}



	}



	
}
