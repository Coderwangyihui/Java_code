/*package exer4;
import java.io.File;
public class file {
	public void newFolder(String folderPath) {
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
		//ɾ���ļ���
	public void delFolder(String folderPath){
		try{
			String filePath = folderPath;
			File delPath = new File(filePath);
			delPath.delete();
			}
		catch (Exception e) {
			System.out.println("ɾ���ļ��в�������");
			e.printStackTrace();
			}
		}
		//�½��ļ�
	public void createFile(String fileName){
			try{
				String myFileName = fileName;
				}catch (Exception e) {
					System.out.println("�½��ļ���������");
					e.printStackTrace();
					}
			}
		//ɾ���ļ�
	public void delFile(String fileName){
			try{
				String myFileName = fileName;
				myFileName.delete();
				}catch (Exception e) {
					System.out.println("ɾ���ļ���������");
					e.printStackTrace();
					}
			}
}*/
