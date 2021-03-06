/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Company;
import Entity.User;

/**
 *
 * @author Ismail Cam
 */
public interface Company_Interface
{
    
    boolean createDellCompany();
    
    /******************************************************/
    
    boolean createCompany( String companyId, String name, String country, String address, String city, String postcode, String email, String phone, String password );
    
    boolean removeCompany(String companyId);
    
    Company getCompany(String companyId);
    
    /******************************************************/
    
    boolean createOtherUser(String companyId, String firstname, String password, String lastname, String email, String phone, String vatnumber);
    
    boolean removeOtherUser(String companyId, String userEmail);
    
    User getUser( String companyId, String userEmail );
    
}
