package mypack;

public class PHANCONG
{
    public String MaSoNV ;
    public String MaSoTour ;
    public NHANVIEN NhanVien ;
    public TOUR Tour ;
    public PHANCONG(String MaSoNV, String MaSoTour, NHANVIEN NhanVien, TOUR Tour)
    {
        this.MaSoNV = MaSoNV;
        this.MaSoTour = MaSoTour;
        this.NhanVien = NhanVien;
        this.Tour = Tour;
    }
    public PHANCONG(PHANCONG phancong)
    {
        MaSoNV = phancong.MaSoNV;
        MaSoTour = phancong.MaSoTour;
        NhanVien = phancong.NhanVien;
        Tour = phancong.Tour;
    }
	public String getMaSoNV() {
		return MaSoNV;
	}
	public void setMaSoNV(String maSoNV) {
		MaSoNV = maSoNV;
	}
	public String getMaSoTour() {
		return MaSoTour;
	}
	public void setMaSoTour(String maSoTour) {
		MaSoTour = maSoTour;
	}
	public NHANVIEN getNhanVien() {
		return NhanVien;
	}
	public void setNhanVien(NHANVIEN nhanVien) {
		NhanVien = nhanVien;
	}
	public TOUR getTour() {
		return Tour;
	}
	public void setTour(TOUR tour) {
		Tour = tour;
	}
    
}
