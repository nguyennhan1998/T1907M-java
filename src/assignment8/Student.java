package assignment8;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer mark;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, Integer mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", mark=" + mark +
                '}';
    }
}
