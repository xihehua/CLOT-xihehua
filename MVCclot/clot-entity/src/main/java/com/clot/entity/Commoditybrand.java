package com.clot.entity;


public class Commoditybrand {

  private int brandid;
  private String brandname;


  public int getBrandid() {
    return brandid;
  }

  public void setBrandid(int brandid) {
    this.brandid = brandid;
  }


  public String getBrandname() {
    return brandname;
  }

  public void setBrandname(String brandname) {
    this.brandname = brandname;
  }

  public Commoditybrand() {
  }

  public Commoditybrand(int brandid, String brandname) {
    this.brandid = brandid;
    this.brandname = brandname;
  }

  @Override
  public String toString() {
    return "Commoditybrand{" +
            "brandid=" + brandid +
            ", brandname='" + brandname + '\'' +
            '}';
  }
}
