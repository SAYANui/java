class College{
    String name;
    int dep;

    void show(){
        System.out.println("College Name:"+name);
        System.out.println("College Dep:"+dep);
    }


}
public class Cain {
    public static void main(String[] args ){
    College clg=new College();
    clg.name="George";
    clg.dep=45;


    clg.show();


    }

}
