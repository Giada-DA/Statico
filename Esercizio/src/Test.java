public class Test {
    public static void main(String[] args) {

        Employee e1 = new Employee("Sherlock", "Holmes", "Baker Street, 221b");
        Employee e2 = new Employee("Jhon", "Watson", "Baker Street, 221b");

        e1.getEmployeeDetails();   //Name and surname: Sherlock Holmes and address: Baker Street, 221b
        e2.getEmployeeDetails();   //Name and surname: Jhon Watson and address: Baker Street, 221b

        Badge b1 = new Badge(e1);
        b1.showBadgeDetails();
        Badge b2 = new Badge(e2);
        b2.showBadgeDetails();







    }
}
