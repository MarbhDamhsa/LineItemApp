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
    public String toString()
    {
        return super.toString() +
            "Version:     " + version + "\n";
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
