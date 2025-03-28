package Ch06;

import Ch06_1.GetAttr;

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
