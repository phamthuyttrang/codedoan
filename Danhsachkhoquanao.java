import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.Comparator;

	public class Danhsachkhoquanao {
	private ArrayList<KhoHang> danhSach;
	public Danhsachkhoquanao() {
	  this.danhSach=new ArrayList<KhoHang>();
	}
	public Danhsachkhoquanao(ArrayList<KhoHang> danhSach) {
		this.danhSach = danhSach;
	}
	public void themMatHang(KhoHang kh) {
		this.danhSach.add(kh);

	}
	public void inDanhsachmathang() {
		for(KhoHang khohang: danhSach ) {
			System.out.println(khohang);
	}
	}
	public boolean kiemTraTonTai(KhoHang kh) {
		return this.danhSach.contains(kh);
	}
	public boolean xoaMatHang(KhoHang kh) {
		return this.danhSach.remove(kh);
	}
	public void sapXepMatHangGiamDan() {
		Collections.sort(this.danhSach, new Comparator<KhoHang>() {

			public int compare(KhoHang kh1, KhoHang kh2) {
				if(kh1.getDonGia()<kh2.getDonGia()) {
					return -1;
				}else if(kh1.getDonGia()>kh2.getDonGia()){
					return 1;
				}else {
					return 0;
				}
			}				
		});
	}
	}

