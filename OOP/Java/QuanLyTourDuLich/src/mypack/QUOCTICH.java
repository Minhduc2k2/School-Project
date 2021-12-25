package mypack;

import java.util.ArrayList;
import java.util.List;

public class QUOCTICH
{
	public String MaQG;
	public String TenQG;
	public List<KHACHHANG> dsKhachHang_QuocTich;

	public QUOCTICH(String MaQG, String TenQG, ArrayList<KHACHHANG> dsKhachHang_QuocTich)
	{
		this.MaQG = MaQG;
		this.TenQG = TenQG;
		this.dsKhachHang_QuocTich = dsKhachHang_QuocTich;
	}
	public QUOCTICH(QUOCTICH qt)
	{
		this.MaQG = qt.MaQG;
		this.TenQG = qt.TenQG;
		this.dsKhachHang_QuocTich = qt.dsKhachHang_QuocTich;
	}
	public String getMaQG() {
		return MaQG;
	}
	public void setMaQG(String maQG) {
		MaQG = maQG;
	}
	public String getTenQG() {
		return TenQG;
	}
	public void setTenQG(String tenQG) {
		TenQG = tenQG;
	}
	public List<KHACHHANG> getDsKhachHang_QuocTich() {
		return dsKhachHang_QuocTich;
	}
	public void setDsKhachHang_QuocTich(List<KHACHHANG> dsKhachHang_QuocTich) {
		this.dsKhachHang_QuocTich = dsKhachHang_QuocTich;
	}
	
}