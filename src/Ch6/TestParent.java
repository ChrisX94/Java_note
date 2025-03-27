package Ch6;

import Ch6_1.GetAttr;

public class TestParent {
	public static void main(String[] args) {
	Sun sun = new Sun();
	Doughter dougther = new Doughter();
	GetAttr getAttr = new GetAttr();
	
	System.out.println(sun.attr1);
	System.out.println(dougther.attr2);
	System.out.println(getAttr.attr);
	
	}

}
