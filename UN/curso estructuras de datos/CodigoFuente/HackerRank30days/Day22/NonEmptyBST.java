package HackerRank30days.Day22;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {
    D data;
    Tree left;
    Tree right;

    public NonEmptyBST(D elt){
        data = elt;
        left = new EmptyBST<>();
        right = new EmptyBST<>(); 
    }

    public NonEmptyBST(D elt, Tree<D> lefTree, Tree<D> rightTree){
        data = elt;
        left = lefTree;
        right = rightTree;
    }

    public boolean isEmpty(){
        return false;
    }

    public int cardinality(){
        return 1 + left.cardinality() + right.cardinality();
    }//lleva a cabo la operación

    public boolean member(D elt){
        if(data == elt){
            return true;
        }else{
            if(elt.compareTo(data) < 0){
                return left.member(elt);
            }else{
                return right.member(elt);
            }
        }
    }

    public NonEmptyBST<D> add(D elt){
        if(data == elt){
            return this;
        }else{
            if(elt.compareTo(data)<0){
                return new NonEmptyBST(data, left.add(elt), right);
            }else{
                return new NonEmptyBST(data, left, right.add(elt));
            }
        }
    }
}
