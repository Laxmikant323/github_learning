import java.util.*;

public class Simple {

    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        String str=scan.nextLine();
        String s= str.substring(0,num);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        char st[]=new char[n];
        for(int i=0;i<n;i++){
            st[i]=s.charAt(arr[i]-1);
        }
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=0;j<(arr[i]-1);j++){
                if(st[i]==s.charAt(j)){
                k++;
                }
            }
            System.out.println(k);
        
        }
        
    }
}
