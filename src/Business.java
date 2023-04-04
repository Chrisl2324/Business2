import java.util.Scanner;
public class Business {
    static Scanner scan = new Scanner(System.in);
    static double total = 0;
    static double max;
    static double low;
    static double it_total = 0;
    static double acc_total = 0;

    public static void main(String[] args){
        System.out.print("How many employees would you like to add? ");
        int size = scan.nextInt();
        int[] id = new int[size];
        String[] name = new String[size];
        String[] dept = new String[size];
        double[] salary = new double[size];
        double[] annual_salary = new double[size];
        setEmployee(size, id, name, dept, salary, annual_salary);
        displayEmployee(size, id, name, dept, salary, annual_salary);
        System.out.println();
        highestEmployee(size, annual_salary, name, id);
        System.out.println();
        lowestEmployee(size, annual_salary, name, id);
        System.out.println();
        displayIT(size, id, name, dept, salary, annual_salary);
        System.out.println();
        displayACC(size, id, name, dept, salary, annual_salary);
    }
    public static void setEmployee(int size, int[] id, String[] name, String[] dept, double[] salary, double[] annual_salary){
        for(int i = 0; i < size; i++){
            System.out.print("Enter employee ID: ");
            id[i] = scan.nextInt();
            System.out.print("Enter employee name: ");
            name[i] = scan.next();
            System.out.print("Enter department: ");
            dept[i] = scan.next();
            System.out.print("Enter salary: ");
            salary[i] = scan.nextDouble();
            annual_salary[i] = salary[i] *12;
            total += annual_salary[i];
        }
    }
    public static void highestEmployee(int size, double[] annual_salary, String[] name, int[] id){
        max = annual_salary[0];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (annual_salary[i] > max) {
                max = annual_salary[i];
                index = i;
            }
            } System.out.println("HIGHEST EMPLOYEE");
        System.out.println("**************************************");
        System.out.println("ID \t\t NAME \t\t ANNUAL SALARY");
        System.out.println("**************************************");
        System.out.println(id[index] + "\t\t" + name[index] + "\t\t$" + max);
        }
    public static void lowestEmployee(int size, double[] annual_salary, String[] name, int[] id){
        low = annual_salary[0];
        int index = 0;
        for(int i = 0; i < size; i++){
            if(annual_salary[i] < low){
                low = annual_salary[i];
                index = i;
            }

        } System.out.println("LOWEST EMPLOYEE");
        System.out.println("*************************************");
        System.out.println("ID \t\t NAME \t\t ANNUAL SALARY");
        System.out.println("*************************************");
        System.out.println(id[index] + "\t\t" + name[index] + "\t\t$" + low);
    }
    public static void displayEmployee(int size, int[] id, String[] name, String[] dept, double[] salary, double[] annual_salary){
        System.out.println("INDEX \t\t ID \t\t NAME \t\t DEPARTMENT \t\t SALARY \t\t ANNUAL SALARY");
        System.out.println("***************************************************************************************");
        for(int i = 0; i < size; i++){
            System.out.println(i + "\t\t\t" + id[i] + "\t\t\t" + name[i] + "\t\t\t" + dept[i] + "\t\t\t\t$" + salary[i] + "\t\t\t$" + annual_salary[i]);
        }
        System.out.println();
        System.out.printf("Total salary from IT and ACC department: $%.2f ", total);
        System.out.println();
    }
    public static void displayIT(int size, int[] id, String[] name, String[] dept, double[] salary, double[] annual_salary){
        System.out.println("IT DEPARTMENT");
        System.out.println("*****************************************************************************");
        System.out.println("INDEX \t\t ID \t\t NAME \t\t DEPT \t\t SALARY \t\t ANNUAL SALARY");
        System.out.println("*****************************************************************************");
        for(int i = 0; i < size; i++){
            if(dept[i].equals("IT")){
                it_total += annual_salary[i];
                System.out.println(i + "\t\t\t" + id[i] + "\t\t\t" + name[i] + "\t\t  " + dept[i] + "\t\t$" + salary[i] + "\t\t\t$" + annual_salary[i]);
            }

        }System.out.println();
        System.out.printf("IT salary total: $%.2f", it_total);
    }
    public static void displayACC(int size, int[] id, String[] name, String[] dept, double[] salary, double[] annual_salary){
        System.out.println("ACC DEPARTMENT");
        System.out.println("*****************************************************************************");
        System.out.println("INDEX \t\t ID \t\t NAME \t\t DEPT \t\t SALARY \t\t ANNUAL SALARY");
        System.out.println("*****************************************************************************");
        for(int i = 0; i < size; i++){
            if(dept[i].equals("ACC")){
                acc_total+= annual_salary[i];
                System.out.println(i + "\t\t\t" + id[i] + "\t\t\t" + name[i] + "\t\t  " + dept[i] + "\t\t$" + salary[i] + "\t\t\t$" + annual_salary[i]);
            }

        }System.out.println();
        System.out.printf("ACC salary total: $%.2f", acc_total);
    }
}

