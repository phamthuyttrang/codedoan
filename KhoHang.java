package Main;

import java.util.Objects;
public class KhoHang{
   private String maHang;
   private String nhomHang;
   private String chatLieu;
   private Double soLuong;
   private Double donGia;
   public KhoHang(String maHang,String nhomHang, String chatLieu,Double soLuong,Double donGia) {
   this.maHang=maHang;
   this.nhomHang=nhomHang;
   this.chatLieu=chatLieu;
   this.soLuong=soLuong;
   this.donGia=donGia;
}
public String getMaHang() {
	return maHang;
}
public void setMaHang(String maHang) {
	this.maHang = maHang;
}
public String getNhomHang() {
	return nhomHang;
}
public void setNhomHang(String nhomHang) {
	this.nhomHang = nhomHang;
}
public String getChatLieu() {
	return chatLieu;
}
public void setChatLieu(String chatLieu) {
	this.chatLieu = chatLieu;
}
public Double getSoLuong() {
	return soLuong;
}
public void setSoLuong(Double soLuong) {
	this.soLuong = soLuong;
}
public Double getDonGia() {
	return donGia;
}
public void setDonGia(Double donGia) {
	this.donGia = donGia;
}
@Override
	public String toString() {
		return "KhoHang["+"MaHang:'"+maHang+'\''+",NhomHang:'"+nhomHang+'\''+",chatLieu:'"+chatLieu+'\''+",SoLuong:'"+soLuong+'\''+",DonGia:'"+donGia+'\''+']';
}
public int compareTo(KhoHang o) {
		return this.maHang.compareTo(maHang);
}

@Override
	public int hashCode() {
		return Objects.hash(nhomHang,chatLieu,donGia,soLuong);
	}
@Override
	public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	KhoHang other = (KhoHang) obj;
	return Objects.equals(maHang, other.maHang);

	}
}




