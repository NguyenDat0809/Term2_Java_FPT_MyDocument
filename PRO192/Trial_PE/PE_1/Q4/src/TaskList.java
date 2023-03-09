
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TaskList extends ArrayList<String> implements ITask {

    public TaskList() {

    }

    public void addTask(String task) {
        this.add(task);
    }

    @Override
    public double getWorkHours(String place) {

        if (place.equalsIgnoreCase("hcm")) {
            return 10.0;
        }
        return 2.0;

    }

    @Override
    public String getTaskNames(String place) {
        for (String x : this) {
            String substring[] = x.split("@"); //".split" xong phải dc gán cho mảng nào đó
                                               //mới lấy ra sử dụng dc
            
            if (substring[1].toLowerCase().contains(place.toLowerCase())){
                System.out.print(substring[0] + ";");
            }
        }
        return "";
    }

    public void enterTask() {
        System.out.print("Enter task(taskname@place):");
        Scanner sc = new Scanner(System.in);

        String task_name = sc.nextLine().trim();
        this.addTask(task_name);
    }

}
