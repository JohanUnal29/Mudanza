package HackerRank30days.Day22;

public interface Tree <D extends Comparable>{
    public boolean isEmpty();
    public int cardinality();//lo grande que es
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt); //crear arbol de busqueda arból no vavío
}
