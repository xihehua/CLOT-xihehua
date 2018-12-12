package com.clot.entity;


public class Commoditylist {

  private int cynumber;
  private int cybrandid;
  private int cytypeid;
  private int cycolorid;
  private String cyname;
  private int cyprice;
  private String cyphotoa;
  private String cydetails;
  private String cyphotob;

  private Commoditybrand commoditybrand;
  private Commoditytype commoditytype;
  private Commoditycolor commoditycolor;

  public Commoditybrand getCommoditybrand() {
    return commoditybrand;
  }

  public void setCommoditybrand(Commoditybrand commoditybrand) {
    this.commoditybrand = commoditybrand;
  }

  public Commoditytype getCommoditytype() {
    return commoditytype;
  }

  public void setCommoditytype(Commoditytype commoditytype) {
    this.commoditytype = commoditytype;
  }

  public Commoditycolor getCommoditycolor() {
    return commoditycolor;
  }

  public void setCommoditycolor(Commoditycolor commoditycolor) {
    this.commoditycolor = commoditycolor;
  }

  public int getCynumber() {
    return cynumber;
  }

  public void setCynumber(int cynumber) {
    this.cynumber = cynumber;
  }


  public int getCybrandid() {
    return cybrandid;
  }

  public void setCybrandid(int cybrandid) {
    this.cybrandid = cybrandid;
  }


  public int getCytypeid() {
    return cytypeid;
  }

  public void setCytypeid(int cytypeid) {
    this.cytypeid = cytypeid;
  }


  public int getCycolorid() {
    return cycolorid;
  }

  public void setCycolorid(int cycolorid) {
    this.cycolorid = cycolorid;
  }


  public String getCyname() {
    return cyname;
  }

  public void setCyname(String cyname) {
    this.cyname = cyname;
  }


  public int getCyprice() {
    return cyprice;
  }

  public void setCyprice(int cyprice) {
    this.cyprice = cyprice;
  }


  public String getCyphotoa() {
    return cyphotoa;
  }

  public void setCyphotoa(String cyphotoa) {
    this.cyphotoa = cyphotoa;
  }


  public String getCydetails() {
    return cydetails;
  }

  public void setCydetails(String cydetails) {
    this.cydetails = cydetails;
  }


  public String getCyphotob() {
    return cyphotob;
  }

  public void setCyphotob(String cyphotob) {
    this.cyphotob = cyphotob;
  }

  public Commoditylist() {
  }

  public Commoditylist(int cynumber, int cybrandid, int cytypeid, int cycolorid, String cyname, int cyprice, String cyphotoa, String cydetails, String cyphotob) {
    this.cynumber = cynumber;
    this.cybrandid = cybrandid;
    this.cytypeid = cytypeid;
    this.cycolorid = cycolorid;
    this.cyname = cyname;
    this.cyprice = cyprice;
    this.cyphotoa = cyphotoa;
    this.cydetails = cydetails;
    this.cyphotob = cyphotob;

  }

  @Override
  public String toString() {
    return "Commoditylist{" +
            "cynumber=" + cynumber +
            ", cybrandid=" + cybrandid +
            ", cytypeid=" + cytypeid +
            ", cycolorid=" + cycolorid +
            ", cyname='" + cyname + '\'' +
            ", cyprice=" + cyprice +
            ", cyphotoa='" + cyphotoa + '\'' +
            ", cydetails='" + cydetails + '\'' +
            ", cyphotob='" + cyphotob + '\'' +
            ", commoditybrand=" + commoditybrand +
            ", commoditytype=" + commoditytype +
            ", commoditycolor=" + commoditycolor +
            '}';
  }
}
