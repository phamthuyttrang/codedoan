package Main;
	import java.util.ArrayList;

	public class PhieuNhap {
	private ArrayList<NhapHang> phieuNhap;
	public PhieuNhap() {
	  this.phieuNhap=new ArrayList<NhapHang>();
	}
	public PhieuNhap(ArrayList<NhapHang> phieuNhap) {
		this.phieuNhap = phieuNhap;
	}
	public void themHangNhap(NhapHang nh) {
		this.phieuNhap.add(nh);
		
	}
	public void inPhieuNhap() {
		for(NhapHang nhaphang: phieuNhap ) {
			System.out.println(nhaphang);
	}
	}
	
}
