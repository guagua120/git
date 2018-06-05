package a;


/**
 * 
 * 
 * 三角形的面积的类
 */
public abstract class Triangle implements Area{
	/**
	 * 打印矩形的面积
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(Triangle.area(8, 7));
	}
		// TODO Auto-generated method stub
	/**
	 * 这是矩形的面积的方法
	 * 
	 *  @param chang是长
	 *  @param kuang是宽
	 */
	
	public static int area(int chang,int kuang){
		return  chang*kuang;

}
}