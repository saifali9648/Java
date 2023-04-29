public class Car{
    private int price,capacity;
    private String fueltype, color, engin;
    public void setPrice(int p)
    {
        price=p;
    }
    public void getPrice()
    {
        System.out.println("price="+price);
    }
    public void setCapacity(int c)
    {
        capacity=c;
    }
    public void getCapacity()
    {
        System.out.println("capacity="+capacity+"cc");
    }
    public void setFuelType(String f)
    {
        fueltype=f;
    }
    public void getFuelType()
    {
        System.out.println("Fueltype="+fueltype);
    }
    public void setColor(String cl)
    {
        color=cl;
    }
    public void getColor()
    {
        System.out.println("color"+color);
    }
    public void setEngin(String e)
    {
        engin=e;
    }
    public void getEngin()
    {
        System.out.println("Engin"+engin);
    }
}
