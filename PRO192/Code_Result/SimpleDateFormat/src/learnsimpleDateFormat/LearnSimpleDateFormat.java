
package learnsimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 84859
 */
public class LearnSimpleDateFormat {
    public static void main(String[] args) {
       /*
Letter|                 Explaination                      | Presentation    Examples
G	  |   Era designator	                              |   Text    |	    AD
y	  |   Year	                                          |   Year    |   1996; 96
Y	  |   Week year	                                      |   Year	  |   2009; 09

M     |   Month in year	                                  |   Month	  |   July; Jul; 07

w	  |   Week in year	                                  |   Number  |   27
W     |   Week in month	                                  |   Number  |   2

D	  |   Day in year	                                  |   Numbe   |   189
d	  |   Day in month	                                  |   Number  |   10

F	  |   Day of week in month                            |	 Number	  |   2
E	  |   Day name in week	                              |   Text	  |   Tuesday; Tue
u	  |   Day number of week                              |  Number	  |     1
             (1 = Monday, ..., 7 = Sunday)
a	  |   Am/pm marker	                                  | Text	  |     PM

H	  |   Hour in day (0-23)	                          | Number	  |     0
K	  |   Hour in am/pm (0-11)	                          |Number	  |     0

k	  |   Hour in day (1-24)	                          | Number	  |     24
h	  |   Hour in am/pm (1-12)	                          |Number	  |     12
m	  |   Minute in hour	                              |Number	  |     30
s	  |   Second in minute	                              |Number	  |     55
S	  |   Millisecond	                                  |Number	  |     978
        */
        Scanner sc = new Scanner(System.in);

        Date time = new Date(); //trả về 1 String ghi thời gian hôm nay, theo mặc định
        System.out.println(time);   //in String thông báo thời gian

        //IN SYSTEMTIME THEO FORMAT TỰ CHỈNH
        DateFormat formatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
                                //điều chỉnh format thời gian theo thứ ngày/tháng/năm
        /*
        đối tượng formatter trong Class DateFormat, được gán format thành "dd/MM/yyyy"
        "formatter.format(time)": method của formatter là format sẽ nhận vào 1 String
                sau đó thay đổi thành format đã được set
         */
        System.out.println(formatter.format(time));

        //SET INPUTTIME THEO FORMAT ngày/tháng/năm
        String inputTime = sc.nextLine();   //nhập String ngày/tháng/năm
                                            //nếu nhập sai thì dùng Try-Catch bắt nhập lại
                                            //ko Java giết app
        //Có thể chấp nhận nhiều format không ???

        System.out.println(formatter.format(inputTime));
            //đưa String inputTime vào formatter.format() để thay đổi định dạng và in
    }
    
}
