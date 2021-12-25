package mypack;
import java.util.ArrayList;
import java.util.List;
public class VE
{
    public String MaSoVe;
    public String MaSoTour;
    public int Gia;
    public TOUR Tour;
    public List<DANGKY> dsDangKy_Ve;
    public VE(String MaSoVe, String MaSoTour, int Gia, ArrayList<DANGKY> dsDangKy_Ve)
    {
        this.MaSoVe = MaSoVe;
        this.MaSoTour = MaSoTour;
        this.Gia = Gia;
        this.dsDangKy_Ve = dsDangKy_Ve;
    }
    public VE(VE ve)
    {
        this.MaSoVe = ve.MaSoVe;
        this.MaSoTour = ve.MaSoTour;
        this.Gia = ve.Gia;
        this.dsDangKy_Ve = ve.dsDangKy_Ve;
    }
	public String getMaSoVe() {
		return MaSoVe;
	}
	public void setMaSoVe(String maSoVe) {
		MaSoVe = maSoVe;
	}
	public String getMaSoTour() {
		return MaSoTour;
	}
	public void setMaSoTour(String maSoTour) {
		MaSoTour = maSoTour;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	public TOUR getTour() {
		return Tour;
	}
	public void setTour(TOUR tour) {
		Tour = tour;
	}
	public List<DANGKY> getDsDangKy_Ve() {
		return dsDangKy_Ve;
	}
	public void setDsDangKy_Ve(List<DANGKY> dsDangKy_Ve) {
		this.dsDangKy_Ve = dsDangKy_Ve;
	}
    
}
