package Line_Comparison_Computation;

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        
        int x1; int y1; int x2; int y2;

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the respective coordinates");
        System.out.println("Enter x1");
        x1 = sc.nextInt();
        System.out.println("Enter y1");
        y1 = sc.nextInt();
        System.out.println("Enter x2");
        x2 = sc.nextInt();
        System.out.println("Enter y2");
        y2 = sc.nextInt();
        System.out.println("Length of line " + (Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2)));
    }
}
