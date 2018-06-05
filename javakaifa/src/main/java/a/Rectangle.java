package a;


/** 
 @author Zhang* 三角形的面积的类*/
public abstract class Rectangle  implements Area{
	/**
	 * 程序的入口
	 * 打印三角形的面积
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(Rectangle.area(3,8));
		
		/**
		 * 
		 * 三角形的面积公式
		 * @prama di是底
		 * @param gao是高
		 */
	}
	public static int area(int di,int gao){
		return  di*gao*1/2;
	

}
}