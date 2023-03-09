
import java.util.Scanner;

/*
Các lớp ký tự Regex
Regex	Mô tả
[...]	trả về một ký tự phù hợp
[abc]	a, b, hoặc c
[^abc]	Bất kỳ ký tự nào ngoại trừ a, b, hoặc c
[a-zA-Z]	a tới z hoặc A tới Z
[a-d[m-p]]	a tới d, hoặc m tới p: [a-dm-p]
[a-z&&]]	a tới z, ngoại trừ b và c: [ad-z]
[a-z&&[^m-p]]	a tới z, ngoại trừ m tới p: [a-lq-z]
[0-9]	0 tới 9[def]]	d, e, hoặc f
[a-z&&[^bc]]	a tới z, ngoại trừ b và c: [ad-z]
[a-z&&[^m-p]]	a tới z, ngoại trừ m tới p: [a-lq-z]
[0-9]	0 tới 9
 */

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int data_task_num = 0;

        while (true)
        try {
            System.out.print("Enter the number of tasks: ");
            data_task_num = Integer.parseInt(sc.nextLine());
            break;
        } catch (Exception e) {
            System.out.println("your number is invalid, try again");
        }

        //enter task
        TaskList taskList = new TaskList();
        for (int i = 0; i < data_task_num; i++) {
            taskList.enterTask();
        }
        
        //enter place
        System.out.print("Enter the place: ");
        String data_place = sc.nextLine().trim();

        System.out.print("Total working hours: ");
        System.out.println(taskList.getWorkHours(data_place));
        
        //get name task
        System.out.print("Task name: ");
        taskList.getTaskNames(data_place);
    }
}
