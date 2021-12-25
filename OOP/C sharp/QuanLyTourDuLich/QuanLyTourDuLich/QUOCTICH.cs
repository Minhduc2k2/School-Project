using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
	public class QUOCTICH
	{
		public string MaQG { get; set; }
		public string TenQG { get; set; }
		public ICollection<KHACHHANG> dsKhachHang_QuocTich { get; set; }
		public QUOCTICH(string MaQG, string TenQG, ICollection<KHACHHANG> dsKhachHang_QuocTich)
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
	}
}
