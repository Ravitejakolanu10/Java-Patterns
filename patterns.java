import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        int n=5;
    while(choice!=10)
    {
        System.out.println("\n1.Half Pyramid\n2.Solid Rectangle\n3.Inverted Pyramid\n4.Zero One Rectangle\n5.Hollow Rectangle\n6.floyd Rectangle\n7.Inverted Half Pyramid\n8.Inverted Number Pyramid\n9.Number pyramid\n10.Exit");
        System.out.print("Enter Your Choice :");
        choice=sc.nextInt();
        switch(choice)
        {
            
            case 1 :System.out.println("Half Pyramid");
            for(int i=1;i<=n;i++)
            {
                for(int j= 1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }break;

            case 2 :System.out.println("Solid Pyramid");
            for(int i=1 ;i<=n ;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            break;

            case 3 :System.out.println("Inverted Pyramid");
            for(int i =1;i<=n;i++)
            {
                for(int j=1;j<n-i+1;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }break;

            case 4 :System.out.println("Zero One Pyramid");
            for(int i=1;i<=n;i++)
            {
                for(int j = 1;j<=i;j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
            break;
            
            case 5 :System.out.println("Hollow Rectangle");
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i==1 || j==1 || i==5 || j==5)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }break;

            case 6 : System.out.println("Floyd Rectangle");
            int num=1;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(num+ " ");
                    num++;
                }
                System.out.println();
            }break;
            
            case 7 :System.out.println("Inverted Half Pyramid");
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<n-i;j++)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }break;

            case 8 : System.out.println("Inverted Number Pyramid");
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j+ " ");
                }
                System.out.println();
            }
            break;

            case 9 :System.out.println("Number Pyramid");
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n-i+1;j++)
                {
                    System.out.print(j+ " ");
                }
                System.out.println();
            }break;

            default:System.out.println("Invalid Input");
        }
    }
    }
}
