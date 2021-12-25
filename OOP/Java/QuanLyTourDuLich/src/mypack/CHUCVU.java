package mypack;
import java.util.ArrayList;
import java.util.List;

public class CHUCVU {
    public String MaSoCV;
    public String TenCV;
    public List<NHANVIEN> dsNhanVien_ChucVu;

    public CHUCVU(String MaSoCV, String TenCV, ArrayList<NHANVIEN> dsNhanVien_ChucVu) {
        this.MaSoCV = MaSoCV;
        this.TenCV = TenCV;
        this.dsNhanVien_ChucVu = dsNhanVien_ChucVu;
    }

    public CHUCVU(CHUCVU cv) {
        this.MaSoCV = cv.MaSoCV;
        this.TenCV = cv.TenCV;
        this.dsNhanVien_ChucVu = cv.dsNhanVien_ChucVu;
    }

	public String getMaSoCV() {
		return MaSoCV;
	}

	public void setMaSoCV(String maSoCV) {
		MaSoCV = maSoCV;
	}

	public String getTenCV() {
		return TenCV;
	}

	public void setTenCV(String tenCV) {
		TenCV = tenCV;
	}

	public List<NHANVIEN> getDsNhanVien_ChucVu() {
		return dsNhanVien_ChucVu;
	}

	public void setDsNhanVien_ChucVu(List<NHANVIEN> dsNhanVien_ChucVu) {
		this.dsNhanVien_ChucVu = dsNhanVien_ChucVu;
	}

    
}