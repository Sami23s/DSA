public class Uzol {
    public int data;
    public Uzol left;
    public Uzol right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Uzol getLeft() {
        return left;
    }

    public void setLeft(Uzol left) {
        this.left = left;
    }

    public Uzol getRight() {
        return right;
    }

    public void setRight(Uzol right) {
        this.right = right;
    }


    public Uzol(int data){
        this.data=data;
    }
}
