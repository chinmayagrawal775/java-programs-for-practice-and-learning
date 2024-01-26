class Test {
    public static void main(String args[]) {
        Student s = new Student();
        s.setName("GFG");
        System.out.println(s.getName());
    }
}

class Student implements java.io.Serializable {
    private int id;
    private String name;
 
    Student() {} //no argument constructor
 
 //setter methods
    void setId(int id) {
        this.id = id;
    }
    int getId() {
        return id;
    }
 
 //getter methods
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}