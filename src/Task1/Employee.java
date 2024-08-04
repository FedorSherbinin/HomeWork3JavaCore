package Task1;

public class Employee {
    private String name;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public Employee(String name, int birthYear, int birthMonth, int birthDay) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public static int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        // Преобразуем даты в числа в формате YYYYMMDD
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;

        // Разница между двумя датами
        int difference = date1 - date2;

        // Возвращаем результат
        return Integer.compare(date1, date2);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1980, 5, 15);

        // Сравнение двух дат
        int result = Employee.compareDates(2020, 8, 5, 2019, 12, 31);

        // Вывод результата
        if (result > 0) {
            System.out.println("Первая дата больше второй");
        } else if (result < 0) {
            System.out.println("Первая дата меньше второй");
        } else {
            System.out.println("Даты равны");
        }
    }
}
