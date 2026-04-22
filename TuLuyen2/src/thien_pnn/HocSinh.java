package thien_pnn;

public class HocSinh {
  private String ten;
  private int nam;
  public String getTen() {
	return ten;
  }
  public void setTen(String ten) {
	this.ten = ten;
  }
  public int getNam() {
	return nam;
  }
  public void setNam(int nam) {
	this.nam = nam;
  }
  public HocSinh(String ten, int nam) {
	super();
	this.ten = ten;
	this.nam = nam;
  }
  public double getTuoi()
  {
	  return 2026- nam;
  }
  @Override
  public String toString() {
	return "HocSinh [ten=" + ten + ", nam=" + nam + "]";
  }
  public HocSinh() {
	super();

  }
  
 
  
}
