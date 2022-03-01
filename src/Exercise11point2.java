public class Exercise11point2 {
    public static void main(String[] args) {
      Person person = new Person("Monica");
      Student student = new Student("Chandler");
      Employee employee = new Employee("Joey");
      Faculty faculty = new Faculty("Phoebe");
      Staff staff = new Staff("Rachel");
      
      System.out.println(person);
      System.out.println(student);
      System.out.println(employee);
      System.out.println(faculty);
      System.out.println(staff);
    }
  }
  
  class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;
  
    Person(String name) {
      this.name = name;
    }
    
    public String getName() {
      return name;
    }
    
    @Override
    public String toString() {
      return "Person: " + name;
    }
  }
  
  class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
  
    protected int status;
  
    Student(String name) {
      super(name);
    }
    
    @Override
    public String toString() {
      return "Student: " + getName();
    }
  }
  
  class Employee extends Person {
    protected String office;
    protected int salary;
    protected java.util.Calendar dateHired;
  
    Employee(String name) {
      super(name);
    }
    
    @Override
    public String toString() {
      return "Employee: " + getName();
    }
  }
  
  class Faculty extends Employee {
    public static int LECTURER = 1;
    public static int ASSISTANT_PROFESSOR = 2;
    public static int ASSOCIATE_PROFESSOR = 3;
    public static int PROFESSOR = 4;
  
    protected String officeHours;
    protected int rank;
  
    Faculty(String name) {
      super(name);
    }
    
    @Override
    public String toString() {
      return "Faculty: " + name;
    }
  }
  
  class Staff extends Employee {
    protected String title;
  
    Staff(String name) {
      super(name);
    }
    
    @Override
    public String toString() {
      return "Staff: " + getName();
    }
  }
  
