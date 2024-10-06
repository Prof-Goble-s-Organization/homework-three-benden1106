public class Pair <T, E>
{
    private T first;
    private E second;
    public static void main(String[] args)
    {
        int val1 = 13;
        int val2 = 6;
        double val3 = 2.3;
        String val4 = "Hawks";
        Pair intPair = new Pair(val1, val2);
        Pair mixPair = new Pair(val3, val4);
        Pair pairPair = new Pair(intPair, mixPair);
        System.out.println(intPair.getSecond());
        System.out.println(mixPair.getFirst());
    }
    
    public Pair(T numberOne, E numberTwo)
    {
        this.first = numberOne;
        this.second = numberTwo;
    }

    public T getFirst()
    {
        return this.first;
    }
    public E getSecond()
    {
        return this.second;
    }
    public <T> void setFirst(T userInput)
    {
        this.first = userInput;
    }
    public <E> void setSecond(E userInput)
    {
        this.second = userInput;
    }
}
