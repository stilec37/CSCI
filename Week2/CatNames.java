package Week2;


public class CatNames {
    static String catName = "Momo";
    //String catName = "Appa";

    public static void main(String[] args) {
        String catName = "Appa";

        System.out.println(catName);
        CatNames cat = new CatNames();
        System.out.println(CatNames.catName);

        //System.out.println(catName);
        //CatNames cat = new CatNames();
        //System.out.println(CatNames.catName);

    // what is this?? an object!!!
    Access gregHouse = new Access();
    //System.out.println(gregHouse.cat1);
    System.out.println(gregHouse.getCat1());
    System.out.println(gregHouse.getCat2());


    }
}
