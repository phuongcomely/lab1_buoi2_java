import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày tháng năm sinh: ");
        String date = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

        System.out.println("Mời bạn nhập thời gian nhập hàng: ");
        String datetime = scanner.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(datetime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

        System.out.println("Mời bạn nhập thời gian: ");
        String time = scanner.nextLine();
        LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println("Tên hàng nhập kho của bạn là: " + name);
        System.out.println("Ngày tháng năm sinh là : " + localDate);
        System.out.println("Thời gian nhập hàng: " + localDateTime);
        System.out.println("Thời gian: " + localTime);
    }
}
