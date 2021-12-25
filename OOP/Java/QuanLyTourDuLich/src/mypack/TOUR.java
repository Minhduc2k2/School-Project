package mypack;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class TOUR {
    public String MaSoTour;
    public String TenTour;
    public LocalDate NgayBatDau;
    public LocalDate NgayKetThuc;
    public String MaSoDD;
    public String MaSoKS;
    public String MaSoPT;
    public DIADIEMDULICH DiaDiemDL;
    public KHACHSAN KhachSan;
    public PHUONGTIEN PhuongTien;
    public List<PHANCONG> dsPhanCong_Tour;

    public TOUR(String MaSoTour, String TenTour, LocalDate NgayBatDau, LocalDate NgayKetThuc, String MaSoDD,
            String MaSoKS, String MaSoPT, DIADIEMDULICH DiaDiemDL, KHACHSAN KhachSan, PHUONGTIEN PhuongTien,
            ArrayList<PHANCONG> dsPhanCong_Tour) {
        this.MaSoTour = MaSoTour;
        this.TenTour = TenTour;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.MaSoDD = MaSoDD;
        this.MaSoKS = MaSoKS;
        this.MaSoPT = MaSoPT;
        this.DiaDiemDL = DiaDiemDL;
        this.KhachSan = KhachSan;
        this.PhuongTien = PhuongTien;
        this.dsPhanCong_Tour = dsPhanCong_Tour;
    }

    public TOUR(TOUR tour) {
        this.MaSoTour = tour.MaSoTour;
        this.TenTour = tour.TenTour;
        this.NgayBatDau = tour.NgayBatDau;
        this.NgayKetThuc = tour.NgayKetThuc;
        this.MaSoDD = tour.MaSoDD;
        this.MaSoKS = tour.MaSoKS;
        this.MaSoPT = tour.MaSoPT;
        this.DiaDiemDL = tour.DiaDiemDL;
        this.KhachSan = tour.KhachSan;
        this.PhuongTien = tour.PhuongTien;
        this.dsPhanCong_Tour = tour.dsPhanCong_Tour;
    }

	public String getMaSoTour() {
		return MaSoTour;
	}

	public void setMaSoTour(String maSoTour) {
		MaSoTour = maSoTour;
	}

	public String getTenTour() {
		return TenTour;
	}

	public void setTenTour(String tenTour) {
		TenTour = tenTour;
	}

	public LocalDate getNgayBatDau() {
		return NgayBatDau;
	}

	public void setNgayBatDau(LocalDate ngayBatDau) {
		NgayBatDau = ngayBatDau;
	}

	public LocalDate getNgayKetThuc() {
		return NgayKetThuc;
	}

	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		NgayKetThuc = ngayKetThuc;
	}

	public String getMaSoDD() {
		return MaSoDD;
	}

	public void setMaSoDD(String maSoDD) {
		MaSoDD = maSoDD;
	}

	public String getMaSoKS() {
		return MaSoKS;
	}

	public void setMaSoKS(String maSoKS) {
		MaSoKS = maSoKS;
	}

	public String getMaSoPT() {
		return MaSoPT;
	}

	public void setMaSoPT(String maSoPT) {
		MaSoPT = maSoPT;
	}

	public DIADIEMDULICH getDiaDiemDL() {
		return DiaDiemDL;
	}

	public void setDiaDiemDL(DIADIEMDULICH diaDiemDL) {
		DiaDiemDL = diaDiemDL;
	}

	public KHACHSAN getKhachSan() {
		return KhachSan;
	}

	public void setKhachSan(KHACHSAN khachSan) {
		KhachSan = khachSan;
	}

	public PHUONGTIEN getPhuongTien() {
		return PhuongTien;
	}

	public void setPhuongTien(PHUONGTIEN phuongTien) {
		PhuongTien = phuongTien;
	}

	public List<PHANCONG> getDsPhanCong_Tour() {
		return dsPhanCong_Tour;
	}

	public void setDsPhanCong_Tour(List<PHANCONG> dsPhanCong_Tour) {
		this.dsPhanCong_Tour = dsPhanCong_Tour;
	}
    
}
