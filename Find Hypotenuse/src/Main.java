import java.util.Scanner;
public class Main {
    public static void main(String[] args){

      double u,area,perimeter,edge1,edge2,edge3;
      Scanner scanner = new Scanner(System.in);

        System.out.print("Edge1: ");
      edge1 = scanner.nextDouble();
        System.out.print("Edge2: ");
      edge2 =  scanner.nextDouble();
        System.out.print("Edge3: ");
      edge3 =  scanner.nextDouble();

      perimeter = (edge1+edge2+edge3);
      u = (perimeter)/2;
      area = Math.sqrt((u*(u-edge1)*(u-edge2)*(u-edge3)));
      System.out.print("Triangle area: "+area);
    }
}
