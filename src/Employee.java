public class Employee implements Comparable {
    private int id;
    private String name;
    private int age;

    public Employee(){}

    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Employee emp=(Employee) o;
        if(age < emp.getAge()) return -1;
        if(age < emp.getAge()) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee empObj = (Employee) obj;
        return this.age==empObj.age
                && this.name.equalsIgnoreCase(empObj.name);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + this.name.hashCode();
        hash = hash * 31 + this.age;
        return hash;
    }
}
