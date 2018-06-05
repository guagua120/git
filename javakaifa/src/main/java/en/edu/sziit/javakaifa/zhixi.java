package en.edu.sziit.javakaifa;

import area.Area;
/*
 @author zhangjiekang*/
public class zhixi {
	int a,b;
	int area;

	public static void main(String[] args) {
		
		
		abstract class Circale implements Area{
			public int area(int r) {
				int area=(int) (r*r*3.14);
				return area;
			}
			
		}
		

	}
 
}
