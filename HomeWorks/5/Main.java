public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Валерий", "Директор", "work_mail_V@mailbox.com", "83424243343", 256000, 56),
            new Employee("Даниил", "Курьер", "work_mail_D@mailbox.com", "82342346545", 18000, 33),
            new Employee("Илья", "Кассир", "work_mail_I@mailbox.com", "84342342342", 50000, 29),
            new Employee("Антон", "Зам. директора", "working_mail_A@mailbox.com", "84534534543", 645000,38),
            new Employee("Евгения", "Секретарь", "working_mail_E@mailbox.com", "83534543345", 492000, 44),
        };

        for (Employee employee : employees) {
            if (employee.getAge() > 40) employee.printEmployeeInfo();
        }
    }
}

class Employee {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printEmployeeInfo(){
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee post: " + this.post);
        System.out.println("Employee email: " + this.email);
        System.out.println("Employee phone: " + this.phone);
        System.out.println("Employee salary: " + this.salary);
        System.out.println("Employee age: " + this.age);
        System.out.println();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
