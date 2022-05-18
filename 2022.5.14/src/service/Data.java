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
        {"10", "1", "����", "22", "3000"},
        {"13", "2", "����", "32", "18000", "15000", "2000"},
        {"11", "3", "����", "23", "7000"},
        {"11", "4", "���ݶ�", "24", "7300"},
        {"12", "5", "ɺ����", "28", "10000", "5000"},
        {"11", "6", "������", "22", "6800"},
        {"12", "7", "�", "29", "10800","5200"},
        {"13", "8", "����", "30", "19800", "15000", "2500"},
        {"12", "9", "������", "26", "9800", "5500"},
        {"11", "10", "����", "21", "6600"},
        {"11", "11", "��", "25", "7100"},
        {"12", "12", "��Ī˹", "27", "9600", "4800"}
    };
    
 
    //PC      :21, model, display
    //NoteBook:22, model, price
    //Printer :23, type, name
    public static final String[][] EQIPMENTS = {
        {},
        {"22", "������T4", "6000"},
        {"21", "�����", "NEC17"},
        {"21", "ð�ռ�", "17�ͺ�"},
        {"23", "����", "����2900"},
        {"21", "���㡕", "17�ͺ�"},
        {"21", "Ψ�Ҷ���", "17x�ͺ�"},
        {"23", "ˮ����", "����20K"},
        {"22", "�Ա�m6", "5800"},
        {"21", "ʵ����", "NEC 17��"},
        {"21", "������","17�ͺ�"},
        {"22", "�Ա�m6", "5800"}
    };
}
