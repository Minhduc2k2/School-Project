package mypack;

import java.util.ArrayList;
import java.util.List;

public class DIADIEMDULICH
{
	public String MaSoDD;
	public String TenDD ;
	public String DiaDiem ;
	public List<TOUR> dsTour_DiaDiemDL ;

	public DIADIEMDULICH(String MaSoDD, String TenDD, String DiaDiem, ArrayList<TOUR> dsTour_DiaDiemDL)
	{
		this.MaSoDD = MaSoDD;
		this.TenDD = TenDD;
		this.DiaDiem = DiaDiem;
		this.dsTour_DiaDiemDL = dsTour_DiaDiemDL;
	}
	public DIADIEMDULICH(DIADIEMDULICH dddl)
	{
		this.MaSoDD = dddl.MaSoDD;
		this.TenDD = dddl.TenDD;
		this.DiaDiem = dddl.DiaDiem;
		this.dsTour_DiaDiemDL = dddl.dsTour_DiaDiemDL;
	}
	public String getMaSoDD() {
		return MaSoDD;
	}
	public void setMaSoDD(String maSoDD) {
		MaSoDD = maSoDD;
	}
	public String getTenDD() {
		return TenDD;
	}
	public void setTenDD(String tenDD) {
		TenDD = tenDD;
	}
	public String getDiaDiem() {
		return DiaDiem;
	}
	public void setDiaDiem(String diaDiem) {
		DiaDiem = diaDiem;
	}
	public List<TOUR> getDsTour_DiaDiemDL() {
		return dsTour_DiaDiemDL;
	}
	public void setDsTour_DiaDiemDL(List<TOUR> dsTour_DiaDiemDL) {
		this.dsTour_DiaDiemDL = dsTour_DiaDiemDL;
	}
	
}
