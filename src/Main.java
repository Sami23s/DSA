public class Main {
    public static void main(String[] args) {
        BinStrom bs=new BinStrom();
        bs.insert(7);
        bs.insert(5);
        bs.insert(14);
        bs.insert(1);
        bs.insert(6);
        bs.insert(16);
        bs.insert(10);
        bs.createBinarStrom();

        System.out.println("Klasicky vypis");
        bs.findAllLeafs(bs.root);
        System.out.println("funkcia ne/obsahuje cislo");
        System.out.println(bs.contains(3));
        System.out.println(bs.contains(14));
        System.out.println("////////////////////////////////////////////////////////////////////////////");
        System.out.println("Pre order");
        bs.preOrder(bs.root);
        System.out.println("////////////////////////////////////////////////////////////////////////////");
        bs.RpreOrder(bs.root);
        System.out.println("////////////////////////////////////////////////////////////////////////////");
        System.out.println("In order");
        bs.RinOrder(bs.root);
        System.out.println("////////////////////////////////////////////////////////////////////////////");

        bs.inOrder(bs.root);
        System.out.println("////////////////////////////////////////////////////////////////////////////");
        System.out.println("Post order");
        bs.RpostOrder(bs.root);
        System.out.println("////////////////////////////////////////////////////////////////////////////");
        bs.postOrder(bs.root);
        System.out.println("////////////////////////////////////////////////////////////////////////////");
        System.out.println("Invertovany stromcek");
        bs.invert(bs.root);
        System.out.println("////////////////////////////////////////////////////////////////////////////");

    }

}