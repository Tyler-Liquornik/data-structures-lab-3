package LA3Q1;

// Generic Pair Class
public class Pair <Y, N>
{
    // Fields
    private Y key;
    private N value;

    // Default constructor
    public Pair(){}

    // Custom constructor
    public Pair (Y key, N value)
    {
        this.key = key;
        this.value = value;
    }

    // Accessors
    public void setKey(Y key)
    {
        this.key = key;
    }

    public void setValue(N value)
    {
        this.value = value;
    }

    // Mutators
    public Y getKey()
    {
        return key;
    }

    public N getValue()
    {
        return value;
    }

    // Get the pair as a string
    @Override
    public String toString()
    {
        return String.format("[YR: %d, NM: %s]", key, value);
    }
}