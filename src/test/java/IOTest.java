import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.wanghuadi.utils.IOUtil;

public class IOTest {
	public static void main(String[] args) throws IOException {
		
		List<Object[]> readFile = IOUtil.readFile("file.text", "==");
		
//		List<Goods> list = new ArrayList<Goods>();
		for (Object[] split : readFile) {
			System.out.println(split[0]+" "+split[1]+" "+split[2]+" "+split[3]);
//			Goods goods = new Goods(split[0]+" "+split[1]+" "+split[2]+" "+split[3]);
//			list.add(goods);
		}
		
		
		/*
		 * 1. 创建数据表
		 * 2. 读取文件数据
		 * 3.创建实体类
		 * 4.将读取的文件数据放入到实体类中
		 */
		
		
		
		
		
		
		/*BufferedReader br = new BufferedReader(new FileReader("file.text"));
		
		String str = null;
		//按行读取
		while((str = br.readLine())!= null){
			
			//拆分字符串
			String[] split = str.split("==");
			//System.out.println(Arrays.toString(split));
					
			System.out.println(split[0]+" "+split[1]+" "+split[2]+" "+split[3]);
		}
		
		br.close();*/
	}
}
