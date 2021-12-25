package mypack;

import java.util.ArrayList;
import java.util.List;

public class KHACHSAN
{
    public String MaSoKS;
    public String TenKS;
    public String DiaChi;
    public String Sdt;
    public int Sosao;
    public List<TOUR> dsTour_KhachSan;
    public KHACHSAN(String MaSoKS, String TenKS, String DiaChi, String Sdt, int Sosao, ArrayList<TOUR> dsTour_KhachSan)
    {
        this.MaSoKS = MaSoKS;
        this.TenKS = TenKS;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.Sosao = Sosao;
        this.dsTour_KhachSan = dsTour_KhachSan;
    }
    public KHACHSAN(KHACHSAN khachsan)
    {
        this.MaSoKS = khachsan.MaSoKS;
        this.TenKS = khachsan.TenKS;
        this.DiaChi = khachsan.DiaChi;
        this.Sdt = khachsan.Sdt;
        this.Sosao = khachsan.Sosao;
        this.dsTour_KhachSan = khachsan.dsTour_KhachSan;
    }
	public String getMaSoKS() {
		return MaSoKS;
	}
	public void setMaSoKS(String maSoKS) {
		MaSoKS = maSoKS;
	}
	public String getTenKS() {
		return TenKS;
	}
	public void setTenKS(String tenKS) {
		TenKS = tenKS;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getSdt() {
		return Sdt;
	}
	public void setSdt(String sdt) {
		Sdt = sdt;
	}
	public int getSosao() {
		return Sosao;
	}
	public void setSosao(int sosao) {
		Sosao = sosao;
	}
	public List<TOUR> getDsTour_KhachSan() {
		return dsTour_KhachSan;
	}
	public void setDsTour_KhachSan(List<TOUR> dsTour_KhachSan) {
		this.dsTour_KhachSan = dsTour_KhachSan;
	}
    

}
