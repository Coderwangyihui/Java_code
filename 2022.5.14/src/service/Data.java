package service;


public class Data {
    public static final int EMPLOYEE = 10;
    public static final int PROGRAMMER = 11;
    public static final int DESIGNER = 12;
    public static final int ARCHITECT = 13;

    public static final int PC = 21;
    public static final int NOTEBOOK = 22;
    public static final int PRINTER = 23;

    //Employee  :  10, id, name, age, salary
    //Programmer:  11, id, name, age, salary
    //Designer  :  12, id, name, age, salary, bonus
    //Architect :  13, id, name, age, salary, bonus, stock
    public static final String[][] EMPLOYEES = {
        {"10", "1", "马云", "22", "3000"},
        {"13", "2", "王波", "32", "18000", "15000", "2000"},
        {"11", "3", "王辉", "23", "7000"},
        {"11", "4", "漳州东", "24", "7300"},
        {"12", "5", "珊瑚玉", "28", "10000", "5000"},
        {"11", "6", "王江玲", "22", "6800"},
        {"12", "7", "李江", "29", "10800","5200"},
        {"13", "8", "吴玉芳", "30", "19800", "15000", "2500"},
        {"12", "9", "刘兆林", "26", "9800", "5500"},
        {"11", "10", "匡玲", "21", "6600"},
        {"11", "11", "金凯", "25", "7100"},
        {"12", "12", "阿莫斯", "27", "9600", "4800"}
    };
    
 
    //PC      :21, model, display
    //NoteBook:22, model, price
    //Printer :23, type, name
    public static final String[][] EQIPMENTS = {
        {},
        {"22", "先行者T4", "6000"},
        {"21", "冲锋者", "NEC17"},
        {"21", "冒险家", "17型号"},
        {"23", "先驱", "晓龙2900"},
        {"21", "顶点", "17型号"},
        {"21", "唯我独尊", "17x型号"},
        {"23", "水南桥", "显屏20K"},
        {"22", "猎豹m6", "5800"},
        {"21", "实践者", "NEC 17型"},
        {"21", "庞龙","17型号"},
        {"22", "猎豹m6", "5800"}
    };
}
