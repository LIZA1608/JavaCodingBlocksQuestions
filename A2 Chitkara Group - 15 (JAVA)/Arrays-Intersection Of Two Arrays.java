

import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int []arr=new int [n];
int []a=new int [n];

for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
Arrays.sort(arr);
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
Arrays.sort(a);
ArrayList<Integer> ans=new ArrayList<>();
int i=0,j=0;
while(i<n &&j<n){
    if(arr[i]<a[j]){
        i++;
    }
    else if(arr[i]>a[j]){
        j++;
    }
    else{
        ans.add(a[j++]);
        i++;
    }
}   
    System.out.print(ans);
}
}
