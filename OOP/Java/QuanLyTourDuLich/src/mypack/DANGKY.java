package mypack;

import java.time.LocalDate;

public class DANGKY {
    public String MaSoKH;

    public String MaSoVe;
    public String MaSoDL;
    public LocalDate NgayDki;
    public int TienKhachTra;
    public int TienThua;
    public KHACHHANG KhachHang;
    public VE Ve;
    public DAILY DaiLy;

    public DANGKY(String MaSoVe, String MaSoKH, String MaSoDL, LocalDate NgayDki, int TienKhachTra, int TienThua,
                 DAILY DaiLy, KHACHHANG KhachHang, VE Ve)
    {
        this.MaSoVe = MaSoVe;
        this.MaSoKH = MaSoKH;
        this.MaSoDL = MaSoDL;
        this.NgayDki = NgayDki;
        this.TienKhachTra = TienKhachTra;
        this.TienThua = TienThua;
        this.DaiLy = DaiLy;
        this.KhachHang = KhachHang;
        this.Ve = Ve;
    }
    public DANGKY(DANGKY dangky)
    {
        this.MaSoKH = dangky.MaSoKH;
        this.MaSoVe = dangky.MaSoVe;
        this.MaSoDL = dangky.MaSoDL;
        this.NgayDki = dangky.NgayDki;
        this.TienKhachTra = dangky.TienKhachTra;
        this.TienThua = dangky.TienThua;
        this.DaiLy = dangky.DaiLy;
        this.KhachHang = dangky.KhachHang;
        this.Ve = dangky.Ve;
    }
	public String getMaSoKH() {
		return MaSoKH;
	}
	public void setMaSoKH(String maSoKH) {
		MaSoKH = maSoKH;
	}
	public String getMaSoVe() {
		return MaSoVe;
	}
	public void setMaSoVe(String maSoVe) {
		MaSoVe = maSoVe;
	}
	public String getMaSoDL() {
		return MaSoDL;
	}
	public void setMaSoDL(String maSoDL) {
		MaSoDL = maSoDL;
	}
	public LocalDate getNgayDki() {
		return NgayDki;
	}
	public void setNgayDki(LocalDate ngayDki) {
		NgayDki = ngayDki;
	}
	public int getTienKhachTra() {
		return TienKhachTra;
	}
	public void setTienKhachTra(int tienKhachTra) {
		TienKhachTra = tienKhachTra;
	}
	public int getTienThua() {
		return TienThua;
	}
	public void setTienThua(int tienThua) {
		TienThua = tienThua;
	}
	public KHACHHANG getKhachHang() {
		return KhachHang;
	}
	public void setKhachHang(KHACHHANG khachHang) {
		KhachHang = khachHang;
	}
	public VE getVe() {
		return Ve;
	}
	public void setVe(VE ve) {
		Ve = ve;
	}
	public DAILY getDaiLy() {
		return DaiLy;
	}
	public void setDaiLy(DAILY daiLy) {
		DaiLy = daiLy;
	}
    
    
}
