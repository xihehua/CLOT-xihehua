package com.clot.entity;


public class Commodity {

  private int commnumber;
  private String commname;
  private int commprice;
  private String commpicture;
  private String commsize;
  private String information;
  private int typeid;


  public int getCommnumber() {
    return commnumber;
  }

  public void setCommnumber(int commnumber) {
    this.commnumber = commnumber;
  }


  public String getCommname() {
    return commname;
  }

  public void setCommname(String commname) {
    this.commname = commname;
  }


  public int getCommprice() {
    return commprice;
  }

  public void setCommprice(int commprice) {
    this.commprice = commprice;
  }


  public String getCommpicture() {
    return commpicture;
  }

  public void setCommpicture(String commpicture) {
    this.commpicture = commpicture;
  }


  public String getCommsize() {
    return commsize;
  }

  public void setCommsize(String commsize) {
    this.commsize = commsize;
  }


  public String getInformation() {
    return information;
  }

  public void setInformation(String information) {
    this.information = information;
  }


  public int getTypeid() {
    return typeid;
  }

  public void setTypeid(int typeid) {
    this.typeid = typeid;
  }


  public Commodity() {
  }

  public Commodity(int commnumber, String commname, int commprice, String commpicture, String commsize, String information, int typeid) {
    this.commnumber = commnumber;
    this.commname = commname;
    this.commprice = commprice;
    this.commpicture = commpicture;
    this.commsize = commsize;
    this.information = information;
    this.typeid = typeid;
  }

  @Override
  public String toString() {
    return "Commodity{" +
            "commnumber=" + commnumber +
            ", commname='" + commname + '\'' +
            ", commprice=" + commprice +
            ", commpicture='" + commpicture + '\'' +
            ", commsize='" + commsize + '\'' +
            ", information='" + information + '\'' +
            ", typeid=" + typeid +
            '}';
  }
}
