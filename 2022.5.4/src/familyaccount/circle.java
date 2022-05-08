package familyaccount;
public class circle {
	public static void main(String[] args){
		boolean isflag=true;
		String details="收支\t账户金额\t收支金额\t说明\n";
		int initMoney=10000;
		while(isflag) {
			System.out.println("--------家庭收支记账软件-------");
			System.out.println("         1 收支明细");
			System.out.println("         2 登记收入");
			System.out.println("         3 登记支出");
			System.out.println("         4 退   出\n");
			System.out.print("        请输入（1~4）");
			char selection=Utility.readMenuSelection();
			switch(selection) {
			case '1':
				//System.out.println("         1 收支明细");
				System.out.println("--------当前收支明细记录-------");
				System.out.println(details);
				System.out.println("--------------------------");
				break;
			case '2':
				//System.out.println("         2 登记收入");
				System.out.print("本次收入金额：");
				int money= Utility.readNumber();
				System.out.print("本次收入说明：");
				String info =Utility.readString();
				initMoney+=money;
				details+="收入\t"+initMoney+"\t"+money+"\t"+info+"\n";
				System.out.println("----------登记完成---------\n");
				break;
			case '3':
				//System.out.println("         3 登记支出");
				System.out.print("本次支出金额：");
				int pay= Utility.readNumber();
				System.out.print("本次支出说明：");
				String information =Utility.readString();
				if(pay<=initMoney){
					initMoney-=pay;
					details+="支出\t"+initMoney+"\t"+pay+"\t"+information+"\n";
				}
				else {
					System.out.println("支出额度不足！\n");
				}
				System.out.println("----------登记完成---------\n");
				break;
			case '4':
				System.out.println("确认是否退出（Y/N）");
				char isExit =Utility.readConfirmSelection();
				if(isExit=='Y') {
					isflag=false;
				}
				break;
			}	
		}
	}
}