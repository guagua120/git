package hello;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class xml {
	
	
	public static void main(String[] args) throws Exception {
	// 1. 注册数据库的驱动
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	// 2.通过DriverManager获取数据库连接
	String url = "jdbc:mysql://localhost:3306/test";
	String username = "root";
	String password = "123456";
	Connection conn = DriverManager.getConnection (url, username, 
     			password);
	// 3.通过Connection对象获取Statement对象
	//Statement stmt = conn.createStatement();
	//Connection conn = null;
	PreparedStatement stmt = null;
	
	 String sql = "insert into apple (studentid,studentname,tel,address,sex) values (?,?,?,?,?)";
     
      stmt= conn.prepareStatement(sql);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();////得到 DOM 解析器的工厂实例 
		
		DocumentBuilder db = dbf.newDocumentBuilder();//获得一个DocumentBuilder对象
		//然后从 
		//DOM 工厂获得 DOM 解析器 
		Document document = db.parse(new File("student.xml"));//加载xml文件
		NodeList list = document.getElementsByTagName("Student");//获得所有Student的节点集合
		System.out.println(list);
		String stuID = "", stuName = "",tel = "",address = "",sex = "";
		
		int size =list.getLength();//获得节点集合的长度
		System.out.println(size);
		System.out.println(size);
		for (int i = 0; i < list.getLength(); i++) {
			Element element = (Element) list.item(i);//获得第i个节点，并把它转成Element型
			String content = element.getElementsByTagName("stuID").item(0).getFirstChild().getNodeValue();
			//获取stuID节点集合的第一个节点的第一个子节点的值
			stuID =content;
			//System.out.println(stuID);
			content = element.getElementsByTagName("stuName").item(0).getFirstChild().getNodeValue();
			stuName =content;
			//System.out.println(stuName);
			content = element.getElementsByTagName("tel").item(0).getFirstChild().getNodeValue();
			tel =content;
			content = element.getElementsByTagName("address").item(0).getFirstChild().getNodeValue();
			address =content;
			content = element.getElementsByTagName("sex").item(0).getFirstChild().getNodeValue();
			sex =content;
		}
	
			stmt.setString(1,stuID);//设置第一列的值
			stmt.setString(2,stuName);//设置第二列的值
			stmt.setString(3,tel);
			stmt.setString(4,address);
			stmt.setString(5,sex);
			stmt.executeUpdate();
			System.out.println("插入成功");
			stmt.close();
			conn.close();
			Statement statement = null;
//			ResultSet rSet = statement.executeQuery("SELECT studentid ,studentname FROM student");
//			JSONArray array = new JSONArray(); 
//			while (rSet.next()) {
//				JSONObject jsonObj = new JSONObject();
//				System.out.println(rSet.getString("studentid") + "," + rSet.getString("studentname"));
//				String ID=rSet.getString("studentid");
//				String Name=rSet.getString("studentname");
//				jsonObj.put(ID,Name);
//				array.put(jsonObj);  
//				
//			}
//			System.out.println(array);
	}
	
	
}