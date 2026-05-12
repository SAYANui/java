public class RevNum {


    public static void main(String[] args) {


int num=4568;
int ans=0;

for(;num>0;num/=10){
    int rem=num%10;

    ans= ans*10+rem;


}
        System.out.println("the reveres number is: "+ans);


    }
}
