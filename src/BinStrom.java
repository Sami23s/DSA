public class BinStrom {

    public Uzol root;

    public void createBinarStrom(){
       /* Uzol first=new Uzol(7);
        Uzol second=new Uzol(5);
        Uzol third=new Uzol(14);
        Uzol fourth =new Uzol(1);
        Uzol fifth=new Uzol(6);
        Uzol sixth=new Uzol(10);
        Uzol seventh=new Uzol(16); */

        /*root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;*/

    }




    public void preOrder (Uzol root){
        if (root==null){
            return;

        }
        System.out.print(root.data+" ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    public void RpreOrder (Uzol root){
        if (root==null){
            return;

        }

        RpreOrder(root.getRight());
        RpreOrder(root.getLeft());
        System.out.println(root.data+" ");
    }
    public void inOrder(Uzol root){
        if (root==null){
            return;
        }
        inOrder(root.getLeft());
        System.out.println(root.data+" ");
        inOrder(root.getRight());
    }
    public void RinOrder(Uzol root){
        if (root==null){
            return;
        }
        RinOrder(root.getRight());
        System.out.println(root.data+" ");
        RinOrder(root.getLeft());
    }

    public void findAllLeafs(Uzol root) {
        if (root != null) {
            findAllLeafs(root.left);
            if (root.left == null && root.right == null)
                System.out.println(root.data + " ");

            findAllLeafs(root.right);


        }
    }




    public void postOrder(Uzol root){
        if (root==null){
            return;}


        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.data+" ");
}
    public void RpostOrder(Uzol root){
        if (root==null){
            return;}

        System.out.println(root.data+" ");
        postOrder(root.getRight());
        postOrder(root.getLeft());

    }
    public Uzol invert(Uzol root){
        if (root==null){
            return null;
        }
        Uzol temp=root.getLeft();
        root.left=invert(root.getRight());
        //root.right=invert(root.getLeft());
        root.right=invert(temp);
        System.out.println(root.data+" ");
        return root;


    }
    public boolean contains(int data) {
        if (root == null) {
            return false;
        } else {
            Uzol pomocna = root;
            while (true) {
                if (data == pomocna.getData()) {
                    return true;
                } else {
                    if (data < pomocna.getData()) {
                        if (pomocna.getLeft() == null) {
                            return false;
                        } else {
                            pomocna = pomocna.getLeft();
                            continue;
                        }
                    } else {
                        if (pomocna.getRight() == null) {
                            return false;
                        } else {
                            pomocna = pomocna.getRight();
                            continue;

                        }
                    }
                }
            }
        }
    }

    public void insert(int data) {

        Uzol u = new Uzol(data);
        u.setData(data);

        if (root == null) {
            root = u;
            return;
        } else {
            Uzol pomocna = root;
            while (true) {
                if (data == pomocna.getData()) { //nemozu byt dva listy rovnake
                    return; //koniec
                } else {
                    if (data < pomocna.getData()) {
                        if (pomocna.getLeft() == null) {
                            pomocna.setLeft(u);
                            return;
                        } else {
                            pomocna = pomocna.getLeft();
                        }
                    } else {
                        if (pomocna.getRight() == null) {
                            pomocna.setRight(u);
                            return;
                        } else {
                            pomocna = pomocna.getRight(); // pomocna se přenastaví na další prvek a jede while od znova

                        }
                    }
                }
            }
        }
    }


}


