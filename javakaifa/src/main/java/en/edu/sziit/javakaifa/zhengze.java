package en.edu.sziit.javakaifa;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class zhengze {

	public static void main(String[] args) {
		

//		Pattern pattern=Pattern.compile("[a-z]{3}");
//		Matcher matcher=pattern.matcher("abc");
//		System.out.println(matcher.matches());
//	
//		}
	 Pattern p = null;
     Matcher m = null;
     boolean flg = true;
    // Scanner sc = new Scanner(System.in);

     System.out.println("用户注册");
     Scanner sc = new Scanner(System.in);
     //匹配用户名
     System.out.println("用户名：   ---（由字母数字下划线组成且开头必须是字母，不能超过16位）");
     String name = sc.nextLine();
     p = Pattern.compile("[a-zA-Z]{1}[a-zA-Z0-9_]{1,15}");
     m = p.matcher(name);
     flg = m.matches();

     //匹配密码
     System.out.println("密码：---（字母和数字构成，不能超过16位）");
     String pass = sc.nextLine();
     p = Pattern.compile("[a-zA-Z0-9]{1,16}");
     m = p.matcher(pass);
     flg = m.matches();

     //匹配昵称
     System.out.println("昵称：   ---（字母和数字构成长度大于6小于10） ");
     String nicheng = sc.nextLine();
     p = Pattern.compile("[a-zA-Z0-9]{7,9}");
     m = p.matcher(nicheng);
     flg = m.matches();

     //匹配手机号
     System.out.println("手机号：   ---（全数字，长度为11位）");
     String phone = sc.nextLine();
     p = Pattern.compile("[0-9]{11}");
     m = p.matcher(phone);
     flg = m.matches();

    // 匹配邮箱
   System.out.println("邮箱：   ---（必须包含@符号；必须包含点；点和@之间必须有字符）");
    String email = sc.nextLine();
     p = Pattern.compile("[@]{1}[a-zA-Z0-9]+[.]+[a-z]+");
     m = p.matcher(email);
     flg = m.matches();

     if(flg) {
         System.out.println("注册成功");
     } else {
         System.out.println("信息填写不正确！");
     }


     sc.close();

 }
		


}
