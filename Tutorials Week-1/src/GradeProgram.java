public class GradeProgram {
    public static void main(String[] args) {
        int mark = Integer.parseInt(args[0]);
        if (mark > 84)
            System.out.println("High Distinction");
        else if (mark > 74)
            System.out.println("Distinction");
        else if (mark > 64)
            System.out.println("Credit");
        else if (mark > 49)
            System.out.println("Pass");
        else if (mark >=0)
            System.out.println("Fail");
    }
}
