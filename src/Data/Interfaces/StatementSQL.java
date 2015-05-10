package Data.Interfaces;

/**
 * An interface that tell how to implement the SQL data statements
 * @author BrunoBorges
 * @version 1.0.0
 */
public interface StatementSQL {
    
    
    /*
        Set of methods that fill the variables
    
    public String R_E_C_N_O_;
    public String Endereço;
    */
    
    public void setRecno(String r_e_c_n_o);
    public void setAddress(String address);
    
    
    /*
        Set of methods that return the value of the variables
    */
    
    public String getRecno();
    public String getAddress();
}
