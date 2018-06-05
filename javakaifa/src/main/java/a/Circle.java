package a;



/**
 * 这是圆形的面积的类
 * @author 张杰康
 * 
 */
public abstract class Circle implements Area{
	
	/**
	 * 打印圆形的面积
	 */

	public static void main(String[] args) {
		
		 System.out.println(Circle.area(3.14,8));
		
		}
	/**
	 * 圆形的面积的方法
	 * @param p是3.14
	 * @param r是半径
	 */
	public static double area(double p,int r){
		return  p*r*r;
	}
		

	}