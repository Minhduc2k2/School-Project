using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyTourDuLich
{
    public class KHACHSAN
    {
        public string MaSoKS { get; set; }
        public string TenKS { get; set; }
        public string DiaChi { get; set; }
        public string Sdt { get; set; }
        public int Sosao { get; set; }
        public ICollection<TOUR> dsTour_KhachSan { get; set; }
        public KHACHSAN(string MaSoKS, string TenKS, string DiaChi, string Sdt, int Sosao, ICollection<TOUR> dsTour_KhachSan)
        {
            this.MaSoKS = MaSoKS;
            this.TenKS = TenKS;
            this.DiaChi = DiaChi;
            this.Sdt = Sdt;
            this.Sosao = Sosao;
            this.dsTour_KhachSan = dsTour_KhachSan;
        }

        public KHACHSAN(KHACHSAN khachsan)
        {
            this.MaSoKS = khachsan.MaSoKS;
            this.TenKS = khachsan.TenKS;
            this.DiaChi = khachsan.DiaChi;
            this.Sdt = khachsan.Sdt;
            this.Sosao = khachsan.Sosao;
            this.dsTour_KhachSan = khachsan.dsTour_KhachSan;
        }


    }
}
