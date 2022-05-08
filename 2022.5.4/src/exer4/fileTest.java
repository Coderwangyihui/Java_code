package exer4;
import java.io.File;
public class fileTest {
	public void test1() {
		File file=new File("Hello.txt");
	}
	public void newFolder(String folderPath) {
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
		//删除文件夹
	public void delFolder(String folderPath){
		try{
			String filePath = folderPath;
			File delPath = new File(filePath);
			delPath.delete();
			}
		catch (Exception e) {
			System.out.println("删除文件夹操作出错");
			e.printStackTrace();
			}
		}
}
