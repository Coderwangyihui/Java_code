package exer4;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("创建文件夹：1 创建文件：2 写入文件：3 读取文件：4 复制文件：5 列出文件夹下文件：6 结束：7");
		int ch=scan.nextInt();
		do {
			switch(ch) {
			case 1:
				creatDir();
				break;
			case 2:
				creatFile();
				break;
			case 3:
				fileWriter();
				break;
			case 4:
				fileRead();
				break;
			case 5:
				copy();
				break;
			case 6:
				listFile();
				break;
			case 7:
				break;
			}	
			ch=scan.nextInt();
		}while(ch==7);
	}
	static void creatDir(){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入文件夹地址：");
		String folderPath=scan.next();
		try {
			String filePath = folderPath;
			File myFilePath = new File(filePath);
			if (!myFilePath.exists()) {
				myFilePath.mkdir();
				}
			} 
		catch (Exception e) {
			System.out.println("新建文件夹操作出错");
			e.printStackTrace();
			}
		}
	static void creatFile() {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入文件地址：");
		String fileName1 = scan.next();
		System.out.println("请输入文件名称：");
		String fileName2 = scan.next();
		String fileName=fileName1+fileName2;
		  File file = new File(fileName);
		  try {
			if (file.createNewFile()) {
			   System.out.println("创建文件成功！");
			  } else {
			   System.out.println("文件已经存在不需要重复创建");
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  // 使用FileWriter写文件
	}

	 static void fileWriter() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("请输入要写入文件的地址：");
		 String fileName = scan.next();
		  try (FileWriter writer = new FileWriter(fileName)) {
			   writer.write("Hello World -创建文件!!");
			  } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 static void fileRead() {
		 int i;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("请输入要读取文件的地址：");
		 String fileName = scan.next();
		 FileReader fr = null;
		try {
			fr = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			while ((i = fr.read()) != -1)
				 System.out.print((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 static void copy() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("请输入要复制文件的旧地址：");
		 String src = scan.next();
		 System.out.println("请输入要复制文件的目的地址：");
		 String dest = scan.next();
		 InputStream is = null;
		try {
			is = new BufferedInputStream(new FileInputStream(src));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 OutputStream os = null;
		try {
			os = new BufferedOutputStream(new FileOutputStream(dest));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //文件拷贝u，-- 循环+读取+写出
		 byte[] b = new byte[10];//缓冲大小
		 int len = 0;//接收长度
		 //读取文件
		 try {
			while (-1!=(len = is.read(b))) {
			  //读入多少，写出多少，直到读完为止。
			  os.write(b,0,len);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //强制刷出数据
		 try {
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //关闭流，先开后关
		 try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		 
 	static void listFile() {
 		 Scanner scan=new Scanner(System.in);
		 System.out.println("请输入要展示文件夹的地址：");
		 String src = scan.next();
		 File dir = new File(src);
	        List<File> allFileList = new ArrayList<>();
	        // 判断文件夹是否存在
	        if (!dir.exists()) {
	            System.out.println("目录不存在");
	            return;
	        }
	        getAllFile(dir, allFileList);
	        for (File file : allFileList) {
	            System.out.println(file.getName());
	        }
	        System.out.println("该文件夹下共有" + allFileList.size() + "个文件");
	    }
	    public static void getAllFile(File fileInput, List<File> allFileList) {
	        // 获取文件列表
	        File[] fileList = fileInput.listFiles();
	        assert fileList != null;
	        for (File file : fileList) {
	            if (file.isDirectory()) {
	                // 递归处理文件夹
	                // 如果不想统计子文件夹则可以将下一行注释掉
	                getAllFile(file, allFileList);
	            } else {
	                // 如果是文件则将其加入到文件数组中
	                allFileList.add(file);
	            }
	        }
	    }
	    }
	    
