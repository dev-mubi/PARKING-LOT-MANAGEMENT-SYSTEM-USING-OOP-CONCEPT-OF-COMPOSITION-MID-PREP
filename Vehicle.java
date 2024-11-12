public class Vehicle
{
    private String liscenceplate;
    private String owner;
    private String type;
    private boolean isparked;

    Vehicle(String liscenceplate, String owner, String type, boolean isparked)
    {
        this.isparked = isparked;
        this.liscenceplate = liscenceplate;
        this.type = type;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLiscenceplate() {
        return liscenceplate;
    }

    public void setLiscenceplate(String liscenceplate) {
        this.liscenceplate = liscenceplate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsparked() {
        return isparked;
    }

    public void setIsparked(boolean isparked) {
        this.isparked = isparked;
    }

    void parkvehicle()
    {
        isparked = true;
    }

    void removevehiclev()
    {
        isparked = false;
    }
}
