package pac;

public class Mainn {
    int id;
    String name;
    double marks;
    public Mainn(int id,String name,double marks)
    {
    	this.id=id;
    	this.name=name;
    	this.marks=marks;
    }
    public String toString()
    {
    	return name+" with id "+id+" and marks "+marks;
    }
    public int hashCode()
    {
    	return id;
    }
    public boolean equals(Mainn n)
    {
    	if(this.hashCode()==n.hashCode())
    	{
    		return true;
    	}
    	else
    		return false;
    }
}
