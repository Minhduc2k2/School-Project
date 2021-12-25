using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
    public class DANGKY
    {

        public string MaSoKH { get; set; }

        public string MaSoVe { get; set; }
        public string MaSoDL { get; set; }
        public DateTime NgayDki { get; set; }
        public int TienKhachTra { get; set; }
        public int TienThua { get; set; }
        public string MaDL { get; set; }
        public KHACHHANG KhachHang { get; set; }
        public VE Ve { get; set; }
        public DAILY DaiLy { get; set; }

        public DANGKY(string MaSoVe, string MaSoKH, string MaSoDL, DateTime NgayDki, int TienKhachTra, int TienThua,
                     DAILY DaiLy, KHACHHANG KhachHang, VE Ve)
        {
            this.MaSoVe = MaSoVe;
            this.MaSoKH = MaSoKH;
            this.MaSoDL = MaSoDL;
            this.NgayDki = NgayDki;
            this.TienKhachTra = TienKhachTra;
            this.TienThua = TienThua;
            this.DaiLy = DaiLy;
            this.KhachHang = KhachHang;
            this.Ve = Ve;
        }
        public DANGKY(DANGKY dangky)
        {
            this.MaSoKH = dangky.MaSoKH;
            this.MaSoVe = dangky.MaSoVe;
            this.MaSoDL = dangky.MaSoDL;
            this.NgayDki = dangky.NgayDki;
            this.TienKhachTra = dangky.TienKhachTra;
            this.TienThua = dangky.TienThua;
            this.DaiLy = dangky.DaiLy;
            this.KhachHang = dangky.KhachHang;
            this.Ve = dangky.Ve;
        }
    }
}
