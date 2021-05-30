public class Bug
{
    private String name;
    private int health;

    public Bug(String name, int health)
    {
        this.name = name;
        this.health = health;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHealth ()
    {
        return this.health;
    }

    public void setHealth (int health)
    {
        this.health = health;
    }

    public String toString()
    {
        return this.name + "-" +this.health;
    }

    public void attack()
    {
        if(getHealth() > 0)
        {
            System.out.println("The bug has taken 5 of damage.");
            this.setHealth(this.getHealth() - 5);
        }
    }
}
