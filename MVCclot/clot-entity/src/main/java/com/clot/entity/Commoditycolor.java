package com.clot.entity;


public class Commoditycolor {

  private int colorid;
  private String colorname;


  public int getColorid() {
    return colorid;
  }

  public void setColorid(int colorid) {
    this.colorid = colorid;
  }


  public String getColorname() {
    return colorname;
  }

  public void setColorname(String colorname) {
    this.colorname = colorname;
  }

  public Commoditycolor() {
  }

  public Commoditycolor(int colorid, String colorname) {
    this.colorid = colorid;
    this.colorname = colorname;
  }

  @Override
  public String toString() {
    return "Commoditycolor{" +
            "colorid=" + colorid +
            ", colorname='" + colorname + '\'' +
            '}';
  }
}
