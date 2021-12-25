using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich

{
    public class DAILY
    {
        public string MaSoDL { get; set; }
        public string TenDL { get; set; }
        public string DiaChi { get; set; }
        public string Sdt { get; set; }
        public string MaNgQL { get; set; }
        public NHANVIEN NhanVien { get; set; }
        public ICollection<DANGKY> dsDangKy_daiLy { get; set; }
        public ICollection<NHANVIEN> dsNhanVien_daily { get; set; }
        public DAILY(string MaSoDL, string TenDL, string DiaChi, string Sdt,
                    string MaNgQL, ICollection<NHANVIEN> dsNhanVien_daily, ICollection<DANGKY> dsDangKy_daily)
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


    }
}
