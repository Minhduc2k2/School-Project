using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
    public class PHUONGTIEN
    {
        public string MaSoPT { get; set; }
        public string TenPT { get; set; }
        public string LoaiPT { get; set; }
        public string HienTrang { get; set; }
        public int SucChua { get; set; }
        public ICollection<TOUR> dsTour_PhuongTien { get; set; }
        public PHUONGTIEN(string MaSoPT, string TenPT, string LoaiPT, string HienTrang, int SucChua, ICollection<TOUR> dsTour_PhuongTien)
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
    }
}
