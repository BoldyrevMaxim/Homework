public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Антощенкова Валерия Николаевна", "Директор чего-то там", "working_mail@mailbox.com", "83424243343", 151000, 37),
            new Employee("Иванов Иван Николаевич", "Уборщик", "working_mail_2@mailbox.com", "82342346545", 135000, 32),
            new Employee("Смирнов Денис Иванович", "Доставщик", "working_mail_3@mailbox.com", "84342342342", 100000, 55),
            new Employee("Павлов Евгений Денисович", "Зам. директора чего-то там", "working_mail_4@mailbox.com", "84534534543", 250000, 42),
            new Employee("Павлов Анатолий Денисович", "SEO", "working_mail_5@mailbox.com", "83534543345", 55000, 23),
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
