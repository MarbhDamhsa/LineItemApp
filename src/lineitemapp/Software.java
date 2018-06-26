package lineitemapp;

public class Software extends Product{
    
    private String version;
    
    public Software()
    {
        super();
        version = "";
        count++;
    }
    
    @Override
    public void print()
    {
        super.print();
        System.out.println("Version:     " + version);
    }
    
    
    public void setVersion(String version)
    {
        this.version = version;
    }
    
    public String getVersion()
    {
        return version;
    }
    
}
