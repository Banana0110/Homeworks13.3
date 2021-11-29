package Salary;

public class Senior extends Junior {
    int salary = 5000;

    void Hi() {
        display();
        super.display();
    }

    void display() {
        System.out.println("Im Senior, Dungeon Master! My salary: " + salary);
    }
}
