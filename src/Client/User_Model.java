/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.time.LocalDate;

/**
 *
 * @author jakew
 */
public class User_Model 
{
 private String userName;
 private String placeOfBirth;
 private LocalDate birthday;
 
 public User_Model()
 {
     this.userName = null;
     this.placeOfBirth = null;
     this.birthday = null;
 }
 
 public void setUserName(String username)
 {
     this.userName = username;
 }
 public String getUserName()
 {
     return userName;
 }
 
 public void setplaceOfBirth(String pob){
     this.placeOfBirth = pob;
 }
 
 public String getplaceOfBirth(){
     return placeOfBirth;
 }
 
 public void setBirthday(LocalDate birthday){
     this.birthday = birthday;
     
 }
 
 public LocalDate getBirthday(){
     return birthday;
 }
 
}
