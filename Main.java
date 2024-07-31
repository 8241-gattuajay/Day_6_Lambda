import InterfaceP.Functioninterface;

class Main{
    public static void main(String[] args) {
        Functioninterface sumcalc=(a,b)->a+b;
        int sumof=sumcalc.sum(5,6);
        System.out.println(sumof);

    }
}