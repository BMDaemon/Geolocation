package Data;

/**
 * An interface that tell how to implement the information Coordinates_Interface class
 * @author BrunoBorges
 * @version 1.0.0
 */
public interface Coordinates_Interface {
    
    /*
        Set of public methods that fill the variables
    */
    
    public void setRecno(String r_e_c_n_o);
    public void setLatitude(String latitude);
    public void setLongitude(String longitude);
    public void setAddress(String address);
    public void setFormattedAddress(String formatted);
    
    
    
    /*
        Set of public methods that returns the private variables
    */
    
    public String getRecno();
    public String getLatitude();
    public String getLongitude();
    public String getAddress();
    public String getFormmattedAddress();
}
