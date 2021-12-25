using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
	public class CHUCVU
	{
		public string MaSoCV { get; set; }
		public string TenCV { get; set; }
		public ICollection<NHANVIEN> dsNhanVien_ChucVu { get; set; }

		public CHUCVU(string MaSoCV, string TenCV, ICollection<NHANVIEN> dsNhanVien_ChucVu)
		{
			this.MaSoCV = MaSoCV;
			this.TenCV = TenCV;
			this.dsNhanVien_ChucVu = dsNhanVien_ChucVu;
		}	
		public CHUCVU(CHUCVU cv)
		{
			this.MaSoCV = cv.MaSoCV;
			this.TenCV = cv.TenCV;
			this.dsNhanVien_ChucVu = cv.dsNhanVien_ChucVu;
		}
	}
}
