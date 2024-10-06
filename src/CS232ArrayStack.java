import hw03.CS232Stack;

public class CS232ArrayStack implements CS232Stack <E>
{
    private CS232ArrayList arrVals = new CS232ArrayList();

    public void push(E obj)
    {
        arrVals.add(obj);
    }

    public E pop()
    {
        arrVals.remove(arrVals.size() - 1);
    }

    public E peek()
    {
        arrVals.get(arrVals.size() - 1);
    }

    public int size()
    {
        arrVals.size();
    }
}