package com.clot.entity;


public class Commoditysignup {

  private int id;
  private String firstname;
  private String lastname;
  private String emailaddress;
  private String pamssword;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public String getEmailaddress() {
    return emailaddress;
  }

  public void setEmailaddress(String emailaddress) {
    this.emailaddress = emailaddress;
  }


  public String getPamssword() {
    return pamssword;
  }

  public void setPamssword(String pamssword) {
    this.pamssword = pamssword;
  }

  public Commoditysignup() {
  }

  public Commoditysignup(int id, String firstname, String lastname, String emailaddress, String pamssword) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.emailaddress = emailaddress;
    this.pamssword = pamssword;
  }

  @Override
  public String toString() {
    return "Commoditysignup{" +
            "id=" + id +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", emailaddress='" + emailaddress + '\'' +
            ", pamssword='" + pamssword + '\'' +
            '}';
  }
}
