package geekbrains.homework.lesson4;


//Написать функцию, вычисляющую площадь треугольника по трем сторонам (int a, int b, int c).
//Разместить класс с функцией в src/main/java
//Разместить тесты на эту функцию в классе src/test/java/.../TriangleTest.java
//Настроить генерацию отчета


public class Triangle {

    public int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() { } //пустой


    public int calculate(int a, int b, int c) {

        double s = (double)(a + b + c)/2; // Perimeter/2
        return (int) Math.sqrt(s*(s - a)*(s - b)*(s - c));
    }
    public int calculate() {

        double s = (double)(a + b + c)/2; // Perimeter/2
        return (int) Math.sqrt(s*(s - a)*(s - b)*(s - c));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.calculate(6,7,4));
    }
//
}
