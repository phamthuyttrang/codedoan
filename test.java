package Main;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Danhsachkhoquanao dskqa=new Danhsachkhoquanao();
		PhieuNhap pn=new PhieuNhap();
		int luaChon=0;
		do {
			System.out.println("------Menu-----");
		    System.out.println("Chon chuc nang");
		    System.out.println(
		    "1.Them mat hang vao kho.\n"
		    +"2.In danh sach co trong kho trong kho.\n"	
		    +"3.Nhap phieu nhap hang.\n"
		    +"4.In Phieu Nhap Hang.\n"
		      +"5.Kiem tra mat hang co ton tai khong dua tren ma hang.\n"
		      +"6.Xoa mot mat hang ra khoi danh sach.\n"
		      +"7.Xuat ra danh sach mat hang giam dan theo don gia.\n"
		      +"0.Thoat chuong trinh" );
		     luaChon=sc.nextInt();
		     sc.nextLine();
		      if(luaChon==1) {
		    System.out.println("Nhap ma hang:");String maHang=sc.nextLine();
		    System.out.println("Nhap nhom hang:");String nhomHang=sc.nextLine();
		    System.out.println("Nhap chat lieu:");String chatLieu=sc.nextLine();
		    System.out.println("Nhap don gia");Double donGia=sc.nextDouble();
		    System.out.println("Nhap so luong:");Double soLuong=sc.nextDouble();
		    KhoHang kh=new KhoHang(maHang, nhomHang, chatLieu, soLuong, donGia);
		    dskqa.themMatHang(kh);
		     }else if(luaChon==2) {
		     dskqa.inDanhsachmathang();
		     }else if(luaChon==3) {
		   System.out.println("Nhap ma hang:");String maHang=sc.nextLine();
		   System.out.println("Nhap nhom hang:");String nhomHang=sc.nextLine();
		   System.out.println("Nhap chat lieu:");String chatLieu=sc.nextLine();
           System.out.println("Nhap don gia");Double donGia=sc.nextDouble();
		   System.out.println("Nhap so luong:");Double soLuong=sc.nextDouble();	 
		   System.out.println("Nhap ngay nhap hang");String ngayNhap=sc.nextLine();
		   sc.nextLine();
		   System.out.println("Nhap ten mat hang  ");String matHang=sc.nextLine();
	       System.out.println("Nhap thanh tien"); Double thanhTien=sc.nextDouble();
	      NhapHang nh=new NhapHang(maHang, nhomHang, chatLieu, soLuong, donGia, ngayNhap, thanhTien, matHang);
	      pn.themHangNhap(nh);
			    }else  if(luaChon==4) {
				  pn.inPhieuNhap();
			    }  else if(luaChon==7) {
		    System.out.println("Nhap ma hang: ");String maHang=sc.nextLine();
		    KhoHang kh= new KhoHang( maHang, null, null, null,null);
		    System.out.println("Kiểm tra : "+dskqa.kiemTraTonTai(kh));
		     }else if(luaChon==8) {
		    System.out.println("Nhap ma hang: ");String maHang=sc.nextLine();
		    KhoHang kh= new KhoHang(maHang, null, null, null, null);
		    System.out.println("Xoa mat hang ra khoi danh sach :"+dskqa.xoaMatHang(kh));
		     }else if(luaChon==9) {
		    dskqa.sapXepMatHangGiamDan();
		    dskqa.inDanhsachmathang();
		     }
		}while (luaChon!=0);	
	}
	}
