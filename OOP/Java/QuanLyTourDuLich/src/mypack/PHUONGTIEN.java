package mypack;

import java.util.ArrayList;
import java.util.List;

public class PHUONGTIEN
{
    public String MaSoPT ;
    public String TenPT ;
    public String LoaiPT ;
    public String HienTrang ;
    public int SucChua ;
    public List<TOUR> dsTour_PhuongTien ;
    public PHUONGTIEN(String MaSoPT, String TenPT, String LoaiPT, String HienTrang, int SucChua, ArrayList<TOUR> dsTour_PhuongTien)
    {
        this.MaSoPT = MaSoPT;
        this.TenPT = TenPT;
        this.LoaiPT = LoaiPT;
        this.HienTrang = HienTrang;
        this.SucChua = SucChua;
        this.dsTour_PhuongTien = dsTour_PhuongTien;
    }

    public PHUONGTIEN(PHUONGTIEN phuongtien)
    {
        this.MaSoPT = phuongtien.MaSoPT;
        this.TenPT = phuongtien.TenPT;
        this.LoaiPT = phuongtien.LoaiPT;
        this.HienTrang = phuongtien.HienTrang;
        this.SucChua = phuongtien.SucChua;
        this.dsTour_PhuongTien = phuongtien.dsTour_PhuongTien;
    }

	public String getMaSoPT() {
		return MaSoPT;
	}

	public void setMaSoPT(String maSoPT) {
		MaSoPT = maSoPT;
	}

	public String getTenPT() {
		return TenPT;
	}

	public void setTenPT(String tenPT) {
		TenPT = tenPT;
	}

	public String getLoaiPT() {
		return LoaiPT;
	}

	public void setLoaiPT(String loaiPT) {
		LoaiPT = loaiPT;
	}

	public String getHienTrang() {
		return HienTrang;
	}

	public void setHienTrang(String hienTrang) {
		HienTrang = hienTrang;
	}

	public int getSucChua() {
		return SucChua;
	}

	public void setSucChua(int sucChua) {
		SucChua = sucChua;
	}

	public List<TOUR> getDsTour_PhuongTien() {
		return dsTour_PhuongTien;
	}

	public void setDsTour_PhuongTien(List<TOUR> dsTour_PhuongTien) {
		this.dsTour_PhuongTien = dsTour_PhuongTien;
	}
    
}
