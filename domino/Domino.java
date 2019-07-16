package domino;

public class Domino implements Comparable {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Object o) {
        Domino otherDomino = (Domino) o;
//         if (this.left > otherDomino.left) {
//             return 1;
//         }

        if (this.left - otherDomino.left != 0) {
            return this.left - otherDomino.left;
        } else {
            return otherDomino.left - this.left;
        }

    }
}