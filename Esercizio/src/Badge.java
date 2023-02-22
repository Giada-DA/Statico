import lombok.Data;

@Data
public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        System.out.println("Lavoratore: " + (totalNumberOfEmployees += 1));

    }

    private String generateBadgeIdCode(){
        return "ZXY" + employee.name + employee.surname + "YXZ";
    }

    public void showBadgeDetails(){
        System.out.println(totalNumberOfEmployees);
        System.out.println(employee.getEmployeeDetails());
        System.out.println(badgeIdCode);
    }
    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
