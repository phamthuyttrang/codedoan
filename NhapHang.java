package Main;

public class NhapHang extends KhoHang {
 private String ngayNhap;
 private Double thanhTien;
 private String matHang;
 


public NhapHang(String maHang, String nhomHang, String chatLieu, Double soLuong, Double donGia, String ngayNhap,Double thanhTien, String matHang) {
	super(maHang, nhomHang, chatLieu, soLuong, donGia);
	this.ngayNhap = ngayNhap;
	this.thanhTien = thanhTien;
	this.matHang = matHang;
}


public String getNgayNhap() {
	return ngayNhap;
}
public void setNgayNhap(String ngayNhap) {
	this.ngayNhap = ngayNhap;
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
		return "NhapHang" +super.toString()+"\nNgayNhap:"+this.ngayNhap+"\nThanhTien:"+this.thanhTien+"\nMatHang:"+this.matHang;
	}
}    
