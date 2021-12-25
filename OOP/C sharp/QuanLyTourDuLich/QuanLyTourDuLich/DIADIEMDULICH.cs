using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
	public class DIADIEMDULICH
	{
		public string MaSoDD { get; set; }
		public string TenDD { get; set; }
		public string DiaDiem { get; set; }
		public ICollection<TOUR> dsTour_DiaDiemDL { get; set; }

		public DIADIEMDULICH(string MaSoDD, string TenDD, string DiaDiem, ICollection<TOUR> dsTour_DiaDiemDL)
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
	}
}
