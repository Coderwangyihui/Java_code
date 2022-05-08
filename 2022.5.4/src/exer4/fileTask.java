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
		System.out.print("�����ļ��У�1 �����ļ���2 д���ļ���3 ��ȡ�ļ���4 �����ļ���5 �г��ļ������ļ���6 ������7");
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
		System.out.println("�������ļ��е�ַ��");
		String folderPath=scan.next();
		try {
			String filePath = folderPath;
			File myFilePath = new File(filePath);
			if (!myFilePath.exists()) {
				myFilePath.mkdir();
				}
			} 
		catch (Exception e) {
			System.out.println("�½��ļ��в�������");
			e.printStackTrace();
			}
		}
	static void creatFile() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�������ļ���ַ��");
		String fileName1 = scan.next();
		System.out.println("�������ļ����ƣ�");
		String fileName2 = scan.next();
		String fileName=fileName1+fileName2;
		  File file = new File(fileName);
		  try {
			if (file.createNewFile()) {
			   System.out.println("�����ļ��ɹ���");
			  } else {
			   System.out.println("�ļ��Ѿ����ڲ���Ҫ�ظ�����");
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  // ʹ��FileWriterд�ļ�
	}

	 static void fileWriter() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("������Ҫд���ļ��ĵ�ַ��");
		 String fileName = scan.next();
		  try (FileWriter writer = new FileWriter(fileName)) {
			   writer.write("Hello World -�����ļ�!!");
			  } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 static void fileRead() {
		 int i;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("������Ҫ��ȡ�ļ��ĵ�ַ��");
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
		 System.out.println("������Ҫ�����ļ��ľɵ�ַ��");
		 String src = scan.next();
		 System.out.println("������Ҫ�����ļ���Ŀ�ĵ�ַ��");
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
		 //�ļ�����u��-- ѭ��+��ȡ+д��
		 byte[] b = new byte[10];//�����С
		 int len = 0;//���ճ���
		 //��ȡ�ļ�
		 try {
			while (-1!=(len = is.read(b))) {
			  //������٣�д�����٣�ֱ������Ϊֹ��
			  os.write(b,0,len);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //ǿ��ˢ������
		 try {
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //�ر������ȿ����
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
		 System.out.println("������Ҫչʾ�ļ��еĵ�ַ��");
		 String src = scan.next();
		 File dir = new File(src);
	        List<File> allFileList = new ArrayList<>();
	        // �ж��ļ����Ƿ����
	        if (!dir.exists()) {
	            System.out.println("Ŀ¼������");
	            return;
	        }
	        getAllFile(dir, allFileList);
	        for (File file : allFileList) {
	            System.out.println(file.getName());
	        }
	        System.out.println("���ļ����¹���" + allFileList.size() + "���ļ�");
	    }
	    public static void getAllFile(File fileInput, List<File> allFileList) {
	        // ��ȡ�ļ��б�
	        File[] fileList = fileInput.listFiles();
	        assert fileList != null;
	        for (File file : fileList) {
	            if (file.isDirectory()) {
	                // �ݹ鴦���ļ���
	                // �������ͳ�����ļ�������Խ���һ��ע�͵�
	                getAllFile(file, allFileList);
	            } else {
	                // ������ļ�������뵽�ļ�������
	                allFileList.add(file);
	            }
	        }
	    }
	    }
	    
