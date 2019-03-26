public class UseEmployee {

    public static void main(String[] args)
    {
        Employee employee = new Employee();
        employee.setHours(50);
        System.out.println("With tariff of " + employee.getTariffPerHour() + " for " + employee.getHours() + " the sallary is: " + employee.getSalary());

        Manager manager = new Manager();
        manager.setHours(60);
        System.out.println("With tariff of " + manager.getTariffPerHour() + " for " + manager.getHours() + " the sallary is: " + manager.getSalary());

    }
}
