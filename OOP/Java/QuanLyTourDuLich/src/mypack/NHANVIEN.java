package mypack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class NHANVIEN {
    public String MaSoNV;
    public String TenNV;
    public LocalDate NgaySinh;
    public String GioiTinh;
    public String DiaChi;
    public String Sdt;
    public String MaCV;
    public String MaDL;
    public CHUCVU ChucVu;
    public DAILY DaiLy;
    public List<PHANCONG> dsPhanCong_nhanvien;

    public NHANVIEN(String MaSoNV, String TenNV, LocalDate NgaySinh, String GioiTinh, String DiaChi, String Sdt,
            String MaCV, String MaDL, CHUCVU ChucVu, DAILY DaiLy, ArrayList<PHANCONG> dsPhanCong_nhanvien) {
        this.MaSoNV = MaSoNV;
        this.TenNV = TenNV;
		this.NgaySinh = NgaySinh;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.MaCV = MaCV;
        this.MaDL = MaDL;
        this.ChucVu = ChucVu;
        this.DaiLy = DaiLy;
        this.dsPhanCong_nhanvien = dsPhanCong_nhanvien;
    }

    public NHANVIEN(NHANVIEN nhanvien) {
        this.MaSoNV = nhanvien.MaSoNV;
        this.TenNV = nhanvien.TenNV;
        this.NgaySinh = nhanvien.NgaySinh;
        this.GioiTinh = nhanvien.GioiTinh;
        this.DiaChi = nhanvien.DiaChi;
        this.Sdt = nhanvien.Sdt;
        this.MaCV = nhanvien.MaCV;
        this.ChucVu = nhanvien.ChucVu;
        this.MaDL = nhanvien.MaDL;
        this.DaiLy = nhanvien.DaiLy;
        this.dsPhanCong_nhanvien = nhanvien.dsPhanCong_nhanvien;
    }

	public String getMaSoNV() {
		return MaSoNV;
	}

	public void setMaSoNV(String maSoNV) {
		MaSoNV = maSoNV;
	}

	public String getTenNV() {
		return TenNV;
	}

	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}

	public LocalDate getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
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

	public String getMaCV() {
		return MaCV;
	}

	public void setMaCV(String maCV) {
		MaCV = maCV;
	}

	public String getMaDL() {
		return MaDL;
	}

	public void setMaDL(String maDL) {
		MaDL = maDL;
	}

	public CHUCVU getChucVu() {
		return ChucVu;
	}

	public void setChucVu(CHUCVU chucVu) {
		ChucVu = chucVu;
	}

	public DAILY getDaiLy() {
		return DaiLy;
	}

	public void setDaiLy(DAILY daiLy) {
		DaiLy = daiLy;
	}

	public List<PHANCONG> getDsPhanCong_nhanvien() {
		return dsPhanCong_nhanvien;
	}

	public void setDsPhanCong_nhanvien(List<PHANCONG> dsPhanCong_nhanvien) {
		this.dsPhanCong_nhanvien = dsPhanCong_nhanvien;
	}
    
}
