package mypack;

import java.util.ArrayList;
import java.util.List;

public class KHACHHANG
	{
		public String MaSoKH;
		public String HoVaTenLot;
		public String Ten;
		public int NamSinh;
		public String GioiTinh;
		public String MaQG;
		public String CMND;
		public String DiaChi;
		public String Sdt;
		
		public QUOCTICH QuocTich;
		public List<DANGKY> dsDangKy_KhachHang;

		public KHACHHANG(String MaSoKH, String HoVaTenLot, String Ten, int NamSinh, String GioiTinh
						, String MaQG, String CMND, String DiaChi, String Sdt, QUOCTICH QuocTich, ArrayList<DANGKY> dsDangKy_KhachHang)
		{
			this.MaSoKH = MaSoKH;
			this.HoVaTenLot = HoVaTenLot;
			this.Ten = Ten;
			this.NamSinh = NamSinh;
			this.GioiTinh = GioiTinh;
			this.MaQG = MaQG;
			this.CMND = CMND;
			this.DiaChi = DiaChi;
			this.Sdt = Sdt;
			this.QuocTich = QuocTich;
			this.dsDangKy_KhachHang = dsDangKy_KhachHang;
		}
		public KHACHHANG(KHACHHANG kh)
		{
			this.MaSoKH = kh.MaSoKH;
			this.HoVaTenLot = kh.HoVaTenLot;
			this.Ten = kh.Ten;
			this.NamSinh = kh.NamSinh;
			this.GioiTinh = kh.GioiTinh;
			this.MaQG = kh.MaQG;
			this.CMND = kh.CMND;
			this.DiaChi = kh.DiaChi;
			this.Sdt = kh.Sdt;
			this.QuocTich = kh.QuocTich;
			this.dsDangKy_KhachHang = kh.dsDangKy_KhachHang;
		}
		public String getMaSoKH() {
			return MaSoKH;
		}
		public void setMaSoKH(String maSoKH) {
			MaSoKH = maSoKH;
		}
		public String getHoVaTenLot() {
			return HoVaTenLot;
		}
		public void setHoVaTenLot(String hoVaTenLot) {
			HoVaTenLot = hoVaTenLot;
		}
		public String getTen() {
			return Ten;
		}
		public void setTen(String ten) {
			Ten = ten;
		}
		public int getNamSinh() {
			return NamSinh;
		}
		public void setNamSinh(int namSinh) {
			NamSinh = namSinh;
		}
		public String getGioiTinh() {
			return GioiTinh;
		}
		public void setGioiTinh(String gioiTinh) {
			GioiTinh = gioiTinh;
		}
		public String getMaQG() {
			return MaQG;
		}
		public void setMaQG(String maQG) {
			MaQG = maQG;
		}
		public String getCMND() {
			return CMND;
		}
		public void setCMND(String cMND) {
			CMND = cMND;
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
		public QUOCTICH getQuocTich() {
			return QuocTich;
		}
		public void setQuocTich(QUOCTICH quocTich) {
			QuocTich = quocTich;
		}
		public List<DANGKY> getDsDangKy_KhachHang() {
			return dsDangKy_KhachHang;
		}
		public void setDsDangKy_KhachHang(List<DANGKY> dsDangKy_KhachHang) {
			this.dsDangKy_KhachHang = dsDangKy_KhachHang;
		}
        
	}