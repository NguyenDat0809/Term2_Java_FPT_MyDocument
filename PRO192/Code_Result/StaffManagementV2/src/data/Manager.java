
package data;

public class Manager extends Staff {
    private int bonusSalary;
    //CONSTRCUTOR
    public Manager(){
        super();
    }
    public Manager( int id, String name, String gender, int basicSalary, int bonusSalary) {
        super(id, name, gender, basicSalary);
        this.bonusSalary = bonusSalary;
    }
//GETTER AND SETTER
    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }
    public void inputManager(){
        //trong 1 số trường hợp đặc biệt khi override
        //muốn gọi cha thid super.<tên method>
        inputStaff();
        System.out.println("Enter bonus salary: ");
        bonusSalary = sc.nextInt();
    }
    public void outputManager(){
        System.out.println(id+","+name+","+gender+","+ basicSalary + ", " + bonusSalary);
    }
}
