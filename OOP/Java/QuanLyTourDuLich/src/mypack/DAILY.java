package mypack;
import java.util.ArrayList;
import java.util.List;

public class DAILY
{
    public String MaSoDL;
    public String TenDL;
    public String DiaChi;
    public String Sdt;
    public String MaNgQL;
    public NHANVIEN NhanVien;
    public List<DANGKY> dsDangKy_daiLy;
    public List<NHANVIEN> dsNhanVien_daily;
    public DAILY(String MaSoDL, String TenDL, String DiaChi, String Sdt,
                String MaNgQL, ArrayList<NHANVIEN> dsNhanVien_daily, ArrayList<DANGKY> dsDangKy_daily)
    {
        this.MaSoDL = MaSoDL;
        this.TenDL = TenDL;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.MaNgQL = MaNgQL;
        this.dsNhanVien_daily = dsNhanVien_daily;
        this.dsDangKy_daiLy = dsDangKy_daily;
    }
    public DAILY(DAILY daily)
    {
        this.MaSoDL = daily.MaSoDL;
        this.TenDL = daily.TenDL;
        this.DiaChi = daily.DiaChi;
        this.Sdt = daily.Sdt;
        this.MaNgQL = daily.MaNgQL;
        this.dsNhanVien_daily = daily.dsNhanVien_daily;
        this.dsDangKy_daiLy = daily.dsDangKy_daiLy;
    }
	public String getMaSoDL() {
		return MaSoDL;
	}
	public void setMaSoDL(String maSoDL) {
		MaSoDL = maSoDL;
	}
	public String getTenDL() {
		return TenDL;
	}
	public void setTenDL(String tenDL) {
		TenDL = tenDL;
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
	public String getMaNgQL() {
		return MaNgQL;
	}
	public void setMaNgQL(String maNgQL) {
		MaNgQL = maNgQL;
	}
	public NHANVIEN getNhanVien() {
		return NhanVien;
	}
	public void setNhanVien(NHANVIEN nhanVien) {
		NhanVien = nhanVien;
	}
	public List<DANGKY> getDsDangKy_daiLy() {
		return dsDangKy_daiLy;
	}
	public void setDsDangKy_daiLy(List<DANGKY> dsDangKy_daiLy) {
		this.dsDangKy_daiLy = dsDangKy_daiLy;
	}
	public List<NHANVIEN> getDsNhanVien_daily() {
		return dsNhanVien_daily;
	}
	public void setDsNhanVien_daily(List<NHANVIEN> dsNhanVien_daily) {
		this.dsNhanVien_daily = dsNhanVien_daily;
	}
    
}
