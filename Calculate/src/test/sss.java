package test;

import java.io.IOException;
import java.util.Properties;

import service.CalculateService;
import entity.Calculate;

public class sss {
	public static Calculate judge(char operator) {
		Properties p = new Properties();
		try {
			p.load(CalculateService.class
					.getResourceAsStream("/Operator.properties"));
			int i = 1;
			while (true) {
				String s = (p.getProperty("name" + i)).substring(1);
				char operator1 = p.getProperty("name" + i).charAt(0);
				if (Class.forName(s) != null && operator1 == operator) {
					String str = p.getProperty("name" + i);
					Class cls = Class.forName(s);
					Calculate cl = (Calculate) cls.newInstance();
					return cl;
				} else if (Class.forName("name" + i) == null) {
					System.out.println("û�д�����");
					return null;
				}else{
					i++;
				}
				

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			 e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// switch (operator) {
		// case '+':
		// return new AddCalculate();
		// case '-':
		// return new CutCalculate();
		// case '*':
		// return new MultiplyCalculate();
		// case '/':
		// return new ChuCalculate();
		//
		// }
		// return null;
		return null;
	}

	public static void main(String[] args) {
		judge('-');
	}
}
