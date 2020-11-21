/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.akatsuki;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi karakter Akatsuki dari serial Naruto dengan pendekatan 
 * object oriented dan penerapan konsep pewarisan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnggotaAkatsuki pain = new AnggotaAkatsuki("Pain (Yahiko)", "Amegakure", "零 - れい, Rei - Nol/Tidak ada");
        pain.siapaSaya();
        
        AnggotaAkatsuki deidara = new AnggotaAkatsuki("Deidara", "Iwagakure", "青龍 - せいりゅう, Seiryū - Naga Biru/Hijau - Dewa Timur dan Musim Semi");
        deidara.siapaSaya();
        
        AnggotaAkatsuki konan = new AnggotaAkatsuki("Konan", "Amegakure", "白虎 - びゃっこ, Byakko - Harimau Putih - Dewa Barat dan Musim Gugur");
        konan.siapaSaya();
        
        AnggotaAkatsuki itachi = new AnggotaAkatsuki("Itachi Uchiha", "Konohagakure", "朱雀 - すざく, Suzaku - Merah darah - Dewa Selatan dan Musim Panas");
        itachi.siapaSaya();
        
        AnggotaAkatsuki zetsu = new AnggotaAkatsuki("Zetsu", "Tidak Diketahui", "玄武 - げんぶ, Genbu - Kura-Kura - Dewa Utara dan Musim Dingin");
        zetsu.siapaSaya();
        
        AnggotaAkatsuki orochimaru = new AnggotaAkatsuki("Orochimaru", "Konohagakure", "空陳 - くうちん, Sora - Langit");
        orochimaru.siapaSaya();
        
        AnggotaAkatsuki kisame = new AnggotaAkatsuki("Kisame Hoshigaki", "Kirigakure", "南斗 - なんじゅ, Nanju - Bintang Selatan");
        kisame.siapaSaya();
        
        AnggotaAkatsuki kakuzu = new AnggotaAkatsuki("Kakuzu", "Takigakure", "北斗 - ほくと, Hokuto - Bintang Utara");
        kakuzu.siapaSaya();
        
        AnggotaAkatsuki hidan = new AnggotaAkatsuki("Hidan", "Yugakure", "三台 - さんたい, Santai - Tiga Tingkatan");
        hidan.siapaSaya();
        
        AnggotaAkatsuki sasori = new AnggotaAkatsuki("Sasori", "Sunagakure", "玉女 - ぎょくにょ, Gyokunyo - Virgo");
        sasori.siapaSaya();
        
        AnggotaAkatsuki nagato = new AnggotaAkatsuki("Nagato", "Amegakure", "Tidak Memakai Cincin");
        nagato.siapaSaya();
        
        AnggotaAkatsuki obito = new AnggotaAkatsuki("Obito Uchiha (Tobi)", "Konohagakure", "玉女 - ぎょくにょ, Gyokunyo - Virgo");
        obito.siapaSaya();
        
        
    }
    
}
