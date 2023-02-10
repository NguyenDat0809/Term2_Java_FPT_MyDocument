package data;

import java.util.Scanner;

public class OS {
    private String name;
    private String version;
    public OS(){

    }
    public OS(String name, String version){
        this.name = name;
        this.version = version;
    }
    //input OS
    public void inputOS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter OS name: ");
        name = sc.nextLine().trim();
        System.out.print("Enter OS version: ");
        version = sc.nextLine().trim();
    }
    public void showOS(){
        System.out.print("name of OS: " + name);
        System.out.println("version of OS" + version);
    }

    @Override
    public String toString() {
        return name + "-" + version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
