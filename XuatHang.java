package Main;

import java.util.Date;

public class XuatHang extends KhoHang {
private Date ngayXuat;
private Double thanhTien;
private String matHang;
public XuatHang(String maHang, String nhomHang, String chatLieu, Double soLuong, Double donGia, Date ngayXuat,
	Double thanhTien, String matHang) {
	super(maHang, nhomHang, chatLieu, soLuong, donGia);
	this.ngayXuat = ngayXuat;
	this.thanhTien = thanhTien;
	this.matHang = matHang;
}
public Date getNgayXuat() {
	return ngayXuat;
}
public void setNgayXuat(Date ngayXuat) {
	this.ngayXuat = ngayXuat;
}
public Double getThanhTien() {
	return thanhTien;
}
public void setThanhTien(Double thanhTien) {
	this.thanhTien = thanhTien;
}
public String getMatHang() {
	return matHang;
}
public void setMatHang(String matHang) {
	this.matHang = matHang;
}
@Override
	public String toString() {
	return "NhapHang" +super.toString()+"\nNgayXuat:"+this.ngayXuat+"\nThanhTien:"+this.thanhTien+"\nMatHang:"+this.matHang;
}
	}
