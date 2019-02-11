package tgd.aplikasi.pembelajaran;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Menu extends Activity {
	Integer no;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.menu);
	    
	    // TODO Auto-generated method stub
	}
	public void menubelajar(View v){
		setContentView(R.layout.menubelajar);
	}
	public void menuutama(View v){
		setContentView(R.layout.menu) ;
	}

	public void tentang(View v){
		setContentView(R.layout.tentang);
	}
	public void tentangaplikasi(View v){
		setContentView(R.layout.tentangaplikasi);
	}
	
	public void bermain(View v){
		setContentView(R.layout.menubermain);
	}
	
	public void rumahadat(View v){
		setContentView(R.layout.rumahadat);
		no=1;
		rumahadat();
	}
	public void tarian(View v){
		setContentView(R.layout.tarian) ;
		no=1;
		tarian();
}
	public void alatmusik(View v){
	setContentView(R.layout.alatmusik);
	no=1;
	alatmusik();			
}
	public void pakaian(View v){
	setContentView(R.layout.pakaian);
	no=1;
	pakaian();
}
	public void senjata(View v){
		setContentView(R.layout.senjata);
		no=1;
		senjata();
}
	public void kembali(View v){
	setContentView(R.layout.menu) ;
}
	public void menu(View v){
	setContentView(R.layout.main) ;
}
	

		
/** Koding Untuk Tarian */
public void tarian(){
	ImageView tarian=(ImageView)findViewById(R.id.gambar);
	TextView kettarian=(TextView)findViewById(R.id.keterangan);
	if (no==1){
		tarian.setImageResource(R.drawable.taripayungminangkabaubersaldarisumaterabarat);
		kettarian.setText("Tari Tradisional Payung, Berasal Dari Sumatera Barat");	
	}
	else if (no==2){
		tarian.setImageResource(R.drawable.tariandunberasaldaribengkulu);
		kettarian.setText("Tari Tradisional Andun, berasal dari Bengkulu");
	}
	else if (no==3){
		tarian.setImageResource(R.drawable.taribaksakembangberasaldarikalimantanselatan);
		kettarian.setText("Tari Tradisional Baksa Kembang, Berasal Dari Kalimantan Selatan");
	}
	else if (no==4){
		tarian.setImageResource(R.drawable.taribalumpaberasaldarisulawesitenggara);
		kettarian.setText("Tari Tradisional Balumpa, Berasal Dari Sulawesi Tenggara");
	}
	else if (no==5){
	tarian.setImageResource(R.drawable.taribedhayaberasaldariyogyakarta);
	kettarian.setText("Tari Tradisional Bedhaya, Berasal Dari Yogyakarta");
	}
	else if (no==6){
	tarian.setImageResource(R.drawable.taribidadariteminanganakberasaldarirejanglebong);
	kettarian.setText("Tari Tradisional Bidadari Teminanganak, Berasal Dari Rejang Lebong");
	}
	else if (no==7){
	tarian.setImageResource(R.drawable.tariblambangancakilberasaldarijawatengah);
	kettarian.setText("Tari Tradisional Blambangan Caki, Berasal Dari Jawa Tengah");
	}
	else if (no==8){
	tarian.setImageResource(R.drawable.taribosaraberasaldarisulawesiselatan);
	kettarian.setText("Tari Tradisional Bosara, Berasal Dari Sulawesi Selatan");	
	}
	else if (no==9){
	tarian.setImageResource(R.drawable.taricakaleleberasaldarimaluku);
	kettarian.setText("Tari Tradisional Cakalele, Berasal Dari Maluku ");
}
else if (no==10){
	tarian.setImageResource(R.drawable.tarigarenglamengberasaldarinusatenggaratimur);
	kettarian.setText("Tari Tradisional Gareng Lameng, Berasal Dari Nusatenggara Timur");
}
else if (no==11){
	tarian.setImageResource(R.drawable.tarigongberasaldarikalimantantimur);
	kettarian.setText("Tari Tradisional Gong, Berasal Dari Kalimantan Timur");
}
else if (no==12){
	tarian.setImageResource(R.drawable.tarijanggetberasaldariampung);
	kettarian.setText("Tari Tradisional Jangget, Berasal Dari Ampung");
}
else if (no==13){
	tarian.setImageResource(R.drawable.tarijogedalambakberasaldaririau);
	kettarian.setText("Tari Tradisional Jogedal,  Berasal Dari Kalimantan Riau");
}
else if (no==14){
	tarian.setImageResource(R.drawable.tarikecakberasaldaribali);
	kettarian.setText("Tari Tradisional  Kecak, Berasal Dari Bali");
}
else if (no==15){
	tarian.setImageResource(R.drawable.tarikkipasberasaldariulawesiselatan);
	kettarian.setText("Tari Tradisional Kipas, Berasal Dari Sulawesi Selatan");
}
else if (no==16){
	tarian.setImageResource(R.drawable.tarilegongberasaldaribali);
	kettarian.setText("Tari Tradisional Legong, Berasal Dari Bali");
}
else if (no==17){
	tarian.setImageResource(R.drawable.tarilensoberasaldarimaluku);
	kettarian.setText("Tari Tradisional Serimpi Sangupati, Berasal Dari Maluku");
}
else if (no==18){
	tarian.setImageResource(R.drawable.tarilumenseberasaldarisulawesitengah);
	kettarian.setText("Tari Tradisional Lumense, Berasal Dari Sulawesi Tengah");
}
else if (no==19){
	tarian.setImageResource(R.drawable.tarimaengketberasaldarisulawesiutara);
	kettarian.setText("Tari Tradisional Maengket, Berasal Dari Sulawesi Utara");
}
else if (no==20){
	tarian.setImageResource(R.drawable.taripendetberasaldaribali);
	kettarian.setText("Tari Tradisional Pendet , Berasal Dari Bali");
}
else if (no==21){
	tarian.setImageResource(R.drawable.tarimalintingberasaldarilampung);
	kettarian.setText("Tari Tradisional Malinting, Berasal Dari Lampung");
}
else if (no==22){
	tarian.setImageResource(R.drawable.tarimerakberasaldarijawabarat);
	kettarian.setText("Tari Tradisional Merak, Berasal Dari Jawa Barat");
}
else if (no==23){
	tarian.setImageResource(R.drawable.tarimonongberasaldarikalimantanbarat);
	kettarian.setText("Tari Tradisional Monong, Berasal Dari Kalimantan Barat");
}
else if (no==24){
	tarian.setImageResource(R.drawable.tarimpaalenggogoberasaldarinusatenggarabarat);
	kettarian.setText("Tari Tradisional  Mpaa lenggogo, Berasal Dari Nusa Tenggara Barat");
}
else if (no==25){
	tarian.setImageResource(R.drawable.taripendetberasaldaribali);
	kettarian.setText("Tari Pendet Tradisional, Berasal Dari Bali");
}
else if (no==26){
	tarian.setImageResource(R.drawable.tariperangberasaldarikalimantantimur);
	kettarian.setText("Tari Tradisional Perang, Berasal Dari Kalimanatan Timur");
}
else if (no==27){
	tarian.setImageResource(R.drawable.tariperangberasaldarinusatenggaratimur);
	kettarian.setText("Tari Tradisional Perang, Berasal Dari Nusa Tenggara Timur");
}
else if (no==28){
	tarian.setImageResource(R.drawable.tariperangberasaldaripapua);
	kettarian.setText("Tari Tradisional Perang, Berasal Dari Papua");
}
else if (no==29){
	tarian.setImageResource(R.drawable.tariperangmalukuberasaldarinusatenggaratimur);
	kettarian.setText("Tari Tradisional Perang Maluku, Berasal Dari Nusa Tenggara Timur");
}
else if (no==30){
	tarian.setImageResource(R.drawable.taripiringminangkabauberasaldarisumaterabarat);
	kettarian.setText("Tari Tradisional Piring Minang Kabau, Berasal Dari Sumatera Barat ");
}
else if (no==31){
	tarian.setImageResource(R.drawable.taripolopaloberasaldarigorontalo);
	kettarian.setText("Tari Tradisional Polopal, Berasal Dari Gorontalo");
}
else if (no==32){
	tarian.setImageResource(R.drawable.tariputribekhusekberasaldarisumateraselatan);
	kettarian.setText("Tari Tradisional Putri Bekhusek, Berasal Dari Sumatera Selatan");
}
else if (no==33){
	tarian.setImageResource(R.drawable.tariratarirahayuberasaldarikalimantan);
	kettarian.setText("Tari Tradisional Rata Rirahayu, Berasal Dari Kalimantan");
}
else if (no==34){
	tarian.setImageResource(R.drawable.tariremongberasaldarijawatimur);
	kettarian.setText("Tari Tradisional Remong, Berasal DariJawa Timur");
}
else if (no==35){
	tarian.setImageResource(R.drawable.tarireogponorogoberasaldarijawatimur);
	kettarian.setText("Tari Tradisional Reog Ponorogo, Berasal Dari Jawa Timur");
}
else if (no==36){
	tarian.setImageResource(R.drawable.tarisamanmeuseukatberasaldariaceh);
	kettarian.setText("Tari Tradisional Saman Meuseuka, Berasal Dari Aceh");
}
else if (no==37){
	tarian.setImageResource(R.drawable.tarisekapursirihberasaldarijambi);
	kettarian.setText("Tari Tradisional Sekapur Sirih, Berasal Dari Jambi");
}
else if (no==38){
	tarian.setImageResource(R.drawable.tariselamatdatangberasaldaripapuatimur);
	kettarian.setText("Tari Tradisional Selamat Datang, Berasal Dari Papua Timur");
}
else if (no==39){
	tarian.setImageResource(R.drawable.tariselampirdelapanberasaldarijambi);
	kettarian.setText("Tari Tradisional Selampir Delapan , Berasal Dari Jambi");
}
else if (no==40){
	tarian.setImageResource(R.drawable.tariserampangduabelasberasaldarisumaterautara);
	kettarian.setText("Tari Tradisional Serampang Duabelas, Berasal Dari Sumatera Utara");
}
else if (no==41){
	tarian.setImageResource(R.drawable.tariserimpiberasaldarijawatengah);
	kettarian.setText("Tari Tradisional Serimpi, Berasal Dari Jawa Tengah");
}
else if (no==42){
	tarian.setImageResource(R.drawable.tariserimpisangupatiberasaldariyogyakarta);
	kettarian.setText("Tari Tradisional Serimpi Sangupati, Berasal Dari Yogyakarta");
}
else if (no==43){
	tarian.setImageResource(R.drawable.tariseudatiberasaldariaceh);
	kettarian.setText("Tari Tradisional Seudati, Berasal Dari Aceh");
}
else if (no==44){
	tarian.setImageResource(R.drawable.taritambundanbungaiberasaldarikalimantantengah);
	kettarian.setText("Tari Tradisional Tambun dan Bungai, Berasal Dari Kalimantan Tengah");
}
else if (no==45){
	tarian.setImageResource(R.drawable.taritandakberasaldaririau);
	kettarian.setText("Tari Tradisional Tandak, Berasal Dari Riau");
}
else if (no==46){
	tarian.setImageResource(R.drawable.taritanggaiberasaldarisumateraselatan);
	kettarian.setText("Tari Tradisional Tanggai, Berasal Dari Sumatera Selatan");
}
else if (no==47){
	tarian.setImageResource(R.drawable.taritopengbetawiberasaldarijakarta);
	kettarian.setText("Tari Tradisional Topeng Betawi, Berasal Dari Jakarta");
}
else if (no==48){
	tarian.setImageResource(R.drawable.taritopengkuncaranberasaldarijawabarat);
	kettarian.setText("Tari Tradisional Topeng Kuncaran, Berasal Dari Jawa Barat");
}
else if (no==49){
	tarian.setImageResource(R.drawable.taritortorberasaldarisumaterautara);
	kettarian.setText("Tari Tradisional Tor-Tor, Berasal Dari Sumatera Utara");
}
else if (no==50){
	tarian.setImageResource(R.drawable.tariyapongbetawiberasaldarijakarta);
	kettarian.setText("Tari Tradisional Yapong Betawi, Berasal Dari Jakarta");
}
else if (no==51){
	tarian.setImageResource(R.drawable.tarizapintembungberasaldarikalimantan);
	kettarian.setText("Tari Tradisional Zapin Tembung, Berasal Kalimantan");
}else if (no==0){
	setContentView(R.layout.menubelajar);
}else if (no==51){
	setContentView(R.layout.menubelajar);
}
}
public void lanjuttarian(View v){
	no+=1;
	tarian();		
}
public void kembalitarian(View v){
	no-=1;
	tarian();
}


/** Koding Untuk Rumah */
public void rumahadat(){
	ImageView rumah=(ImageView)findViewById(R.id.gambar);
	TextView ketrumah=(TextView)findViewById(R.id.keterangan);
	if (no==1){
		rumah.setImageResource(R.drawable.rumahadatgadangberasaldarisumatrabarat);
		ketrumah.setText("Rumah Adat Gadang, Berasal Dari Sumtera Barat");
		
	}
	else if (no==2){
		rumah.setImageResource(R.drawable.rumahadatbolonberasaldarisumatrautara);
		ketrumah.setText("Rumah Adat Bolon Berasal Dari Sumatera Utara");
	}
	else if (no==3){
		rumah.setImageResource(R.drawable.rumahadataakyatberasaldaribengkulu);
		ketrumah.setText("Rumah Adat Aakyat Berasal Dari Bengkulu");
	}
	else if (no==4){
		rumah.setImageResource(R.drawable.rumahadatbaduyberasaldaribanten);
		ketrumah.setText("Rumah Adat Baduy Berasal Dari Banten");
	}
else if (no==5){
	rumah.setImageResource(R.drawable.rumahadatbangsalkenconoberasaldarijogja);
	ketrumah.setText("Rumah Adat Bangsal Kencono Berasal Dari Jogja");
}
else if (no==6){
	rumah.setImageResource(R.drawable.rumahadatbanjarbubungantinggiberasaldarikalimantanselatan);
	ketrumah.setText("Rumah Adat Banjar Bubungan Tinggi Berasal Dari Kalimantan Selatan");
}
else if (no==7){
	rumah.setImageResource(R.drawable.rumahadatbetangberasaldarikalimantantengah);
	ketrumah.setText("Rumah Adat Betang Berasal Dari Kalimantan Tengah");
}
else if (no==8){
	rumah.setImageResource(R.drawable.rumahadatdalamlokasamawaberasaldarinusatenggarabarat);
	ketrumah.setText("Rumah Adat Dalam Lokasamawa Berasal Dari Nusa Tenggara Barat");
	
}
else if (no==9){
	rumah.setImageResource(R.drawable.rumahadatgapuracandibentarberasaldaribali);
	ketrumah.setText("Rumah Adat Gapura Candi Berasal Dari Bali");
}
else if (no==10){
	rumah.setImageResource(R.drawable.rumahadathonaiberasaldaripapua);
	ketrumah.setText("Rumah Adat Honai Berasal Dari Papua");
}
else if (no==11){
	rumah.setImageResource(R.drawable.rumahadathonaiberasaldaripapuautara);
	ketrumah.setText("Rumah Adat Honai Berasal Dari Papua Utara");
}
else if (no==12){
	rumah.setImageResource(R.drawable.rumahadatistanabutonberasaldarisulawesitenggara);
	ketrumah.setText("Rumah Adat Istana Buton Berasal Dari Sulawesi Tenggara");
}
else if (no==13){
	rumah.setImageResource(R.drawable.rumahadatistanakesultananpontianakberasaldarikalimantanbarat);
	ketrumah.setText("Rumah Adat Kesultanan Pontianak  Berasal Dari Kalimantan Barat");
}
else if (no==14){
	rumah.setImageResource(R.drawable.rumahadatjogloberasaldarijawatengah);
	ketrumah.setText("Rumah Adat Joglo Berasal Dari Jawa Tengah");
}
else if (no==15){
	rumah.setImageResource(R.drawable.rumahadatjoglositubondoberasaldarijawatimur);
	ketrumah.setText("Rumah Adat JogLos Berasal Dari Jawa Timur");
}
else if (no==16){
	rumah.setImageResource(R.drawable.rumahadatkasepuhancirebonberasaldarijawabarat);
	ketrumah.setText("Rumah Adat Kasepuhanci Cirebon Berasal Dari Jawa Barat");
}
else if (no==17){
	rumah.setImageResource(R.drawable.rumahadatkebayaberasaldarijakarta);
	ketrumah.setText("Rumah Adat Kebaya Berasal Dari Jakarta");
}
else if (no==18){
	rumah.setImageResource(R.drawable.rumahadatkrongberasaldaribadeaceh);
	ketrumah.setText("Rumah Adat Krong Berasal Dari Bade Aceh");
}
else if (no==19){
	rumah.setImageResource(R.drawable.rumahadatmelayuselasojatuhkembarkepulauanriau);
	ketrumah.setText("Rumah Adat Melayu Selaso Jatuh Kembar Berasal Dari Kepulauan Riau");
}
else if (no==20){
	rumah.setImageResource(R.drawable.rumahadatmusalakiberasaldarinusatenggaratimur);
	ketrumah.setText("Rumah Adat Musalaki Berasal Dari Nusa Tenggara Timur");
}
else if (no==21){
	rumah.setImageResource(R.drawable.rumahadatnuwousesatberasaldarilampung);
	ketrumah.setText("Rumah Adat Nuwou Sesat Berasal Dari lampung");
}
else if (no==22){
	rumah.setImageResource(R.drawable.rumahadatpanjanberasaldarijambi);
	ketrumah.setText("Rumah Adat Panjan Berasal Dari Jambi");
}
else if (no==23){
	rumah.setImageResource(R.drawable.rumahadatpewarisberasaldarigorontalo);
	ketrumah.setText("Rumah Adat Pewaris Berasal Dari Gorontalo");
}
else if (no==24){
	rumah.setImageResource(R.drawable.rumahadatpewarisberasaldarisulawesiutara);
	ketrumah.setText("Rumah Adat Pewaris Berasal Dari Sulawesi Utara");
}
else if (no==25){
	rumah.setImageResource(R.drawable.rumahadatrakitberasaldaribangkabelitung);
	ketrumah.setText("Rumah Adat Raki Berasal Dari Bangka Belitung");
}
else if (no==26){
	rumah.setImageResource(R.drawable.rumahadattambiberasaldarisulawesitengah);
	ketrumah.setText("Rumah Adat Tambi Berasal Dari Sulawesi Tengah");
}
else if (no==27){
	rumah.setImageResource(R.drawable.rumahadattongkonanberasaldarisulawesibarat);
	ketrumah.setText("Rumah Adat Tongkonan Berasal Dari Sulawesi Barat");
}
else if (no==28){
	rumah.setImageResource(R.drawable.rumahadattongkonanberasaldarisulawesiselatan);
	ketrumah.setText("Rumah Adat Tongkonan Berasal Dari Sulawesi Selatan");
}
else if (no==29){
	rumah.setImageResource(R.drawable.rumahlaminberasaldarikalimantantimur);
	ketrumah.setText("Rumah Adat Lamin Berasal Dari Kalimantan Timur");
}
else if (no==30){
	rumah.setImageResource(R.drawable.rumahlimasberasaldarisumatraselatan);
	ketrumah.setText("Rumah Adat Limas Berasal Dari Sumatera Selatan");
}
else if (no==31){
	rumah.setImageResource(R.drawable.rumahmdatmelayuselasojatuhkembarberasaldaririau);
	ketrumah.setText("Rumah Adat Melayu Selaso Jatuh Kembar Berasal Dari Riau");
}
else if (no==32){
	rumah.setImageResource(R.drawable.rumahbaileoberasaldarimalukuutara);
	ketrumah.setText("Rumah Adat Bai Leoi Berasal Maluku Utara");
}else if (no==0){
	setContentView(R.layout.menubelajar);
}else if (no==32){
	setContentView(R.layout.menubelajar);
}
}
public void lanjutrumahadat(View v){
	no+=1;
	rumahadat();		
}
public void kembalirumahadat(View v){
	no-=1;
	rumahadat();
}


/** Koding Untuk pakaian */
public void pakaian(){
	ImageView pakaian=(ImageView)findViewById(R.id.gambar);
	TextView ketpakaian=(TextView)findViewById(R.id.keterangan);
	if (no==1){
		pakaian.setImageResource(R.drawable.pakaianadattradisionalulosberasaldarisumatrautara);
		ketpakaian.setText("Pakaian Adat Tradisional Ulos, Berasal Dari Sumatera Utara");
		
	}
	else if (no==2){
		pakaian.setImageResource(R.drawable.pakaianadatpengantinbagajahbamulungbaularlulutberasaldarikalimantanselatan);
		ketpakaian.setText("Pakaian Adat Tradisional Pengantin Bagajah Bamulung Baular Lulut, Berasal Dari Sumatra Utara");
	}
	else if (no==3){
		pakaian.setImageResource(R.drawable.pakaianadatradisionalleebalangaceh);
		ketpakaian.setText("Pakaian Adat Tradisional Leebalang, Berasal Dari Aceh");
	}
	else if (no==4){
		pakaian.setImageResource(R.drawable.pakaianadattradisionalaesangedeberasaldarisumatraselatan);
		ketpakaian.setText("Pakaian Adat Tradisional Aesangede, Berasal Dari Sumatera Selatan");
	}
else if (no==5){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalbajuceleberasaldarimaluku);
	ketpakaian.setText("Pakaian Adat Tradisional Baju Cele , Berasal Dari Maluku");
}
else if (no==6){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalbelangaberasaldarikepulauanriau);
	ketpakaian.setText("Pakaian Adat Tradisional Belanga, Berasal Dari Kepulauan Riau");
}
else if (no==7){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalberasaldarigorontalo);
	ketpakaian.setText("Pakaian Adat Tradisional, Berasal Dari Gorontalo");
}
else if (no==8){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalberasaldarikalimantantengah);
	ketpakaian.setText("Pakaian Adat Tradisional, Berasal Dari Kalimantan Tengah");
	
}
else if (no==9){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalberasaldarikalimantantimur);
	ketpakaian.setText("Pakaian Adat Tradisional, Berasal Dari Kalimantan Timur");
}
else if (no==10){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalberasaldarinusatenggaratimur);
	ketpakaian.setText("Pakaian Adat Tradisional, Berasal Dari Nusa Tenggara Timur");
}
else if (no==11){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalberasaldaripapua);
	ketpakaian.setText("Pakaian Adat Tradisional, Berasal Dari Papua");
}
else if (no==12){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalbundokanduangberasaldarisumatrabarat);
	ketpakaian.setText("Pakaian Adat Tradisional Bundo Kanduang, Berasal Dari Sumatera Barat");
}
else if (no==13){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalewerberasaldaripapuabarat);
	ketpakaian.setText("Pakaian Adat Tradisional Lewer, Berasal Dari Papua Barat");
}
else if (no==14){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalkainkebayaberasaldarijawatengah);
	ketpakaian.setText("Pakaian Adat Tradisional Kain Kebaya, Berasal Dari Jawa Tengah");
}
else if (no==15){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalkebayabersaldarijawabarat);
	ketpakaian.setText("Pakaian Adat Tradisional Kebaya, Berasal Dari Jawa Barat");
}
else if (no==16){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalksatrianberasaldarijawatengah);
	ketpakaian.setText("Pakaian Adat Tradisional Ksatrian, Berasal Dari Jawa Tengah");
}
else if (no==17){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalkulavidonggalaberasaldarisulawesiutara);
	ketpakaian.setText("Pakaian Adat Tradisional Kulavi Donggala, Berasal Dari Sulawesi Utara");
}
else if (no==18){
	pakaian.setImageResource(R.drawable.pakaianadattradisionallombokberasaldarinusatenggarabarat);
	ketpakaian.setText("Pakaian Adat Tradisional Lombok, Berasal Dari Nusa Tenggara Barat");
}
else if (no==19){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalmandarberasaldarisulawesibarat);
	ketpakaian.setText("Pakaian Adat Tradisional Mandar, Berasal Dari Sulawesi Barat");
}
else if (no==20){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalmanterenlamoberasaldarimalukuutara);
	ketpakaian.setText("Pakaian Adat Tradisional Manteren, Berasal Dari Maluku Utara");
}
else if (no==21){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalmelayuberasaldarijambi);
	ketpakaian.setText("Pakaian Adat Tradisional Melayu, Berasal Dari Jambi");
}
else if (no==22){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalmelayuberasaldaririau);
	ketpakaian.setText("Pakaian Adat Tradisional Melayu, Berasal Dari Riau");
}
else if (no==23){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalnggembeberasaldarisulawesitengah);
	ketpakaian.setText("Pakaian Adat Tradisional Nggembe, Berasal Dari Sulawesi Tengah");
}
else if (no==24){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalpaksianberasaldaribangkabelitung);
	ketpakaian.setText("Pakaian Adat Tradisional Paksian, Berasal Dari Bangka Belitung");
}
else if (no==25){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalpangsiberasaldaribanten);
	ketpakaian.setText("Pakaian Adat Tradisional Pangsi, Berasal Dari Banten");
}
else if (no==26){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalperangberasaldarikalimantanbarat);
	ketpakaian.setText("Pakaian Adat Tradisional Perang, Berasal Dari Kalimantan Barat");
}
else if (no==27){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalpesaanberasaldarijawatimur);
	ketpakaian.setText("Pakaian Adat Tradisional Pesaan, Berasal Dari Jawa Timur");
}
else if (no==28){
	pakaian.setImageResource(R.drawable.pakaianadattradisionalsukutolakiberasaldarisulawesitenggara);
	ketpakaian.setText("Pakaian Adat Tradisional Suku Tolaki, Berasal Dari Sulawesi Tenggara");
}
else if (no==29){
	pakaian.setImageResource(R.drawable.pakaianadattradisionaltulangbawanglampung);
	ketpakaian.setText("Pakaian Adat Tradisional Tulang Bawang, Berasal Dari Lampung");
}
else if (no==30){
	pakaian.setImageResource(R.drawable.pakaiandattradisionalberasaldaribengkulu);
	ketpakaian.setText("Pakaian Adat Tradisional, Berasal Dari Bengkulu");
}
else if (no==31){
	pakaian.setImageResource(R.drawable.pakaiandattradisionalbetawberasaldarijakarta);
	ketpakaian.setText("Pakaian Adat Tradisional Betawi, Berasal Dari Jakarta");
}else if (no==0){
	setContentView(R.layout.menubelajar);
}else if (no==32){
	setContentView(R.layout.menubelajar);
}
}
public void lanjutpakaian(View v){
	no+=1;
	pakaian();		
}
public void kembalipakaian(View v){
	no-=1;
	pakaian();
}

/** Koding Untuk Senjata */
public void senjata(){
	ImageView senjata=(ImageView)findViewById(R.id.gambar);
	TextView ketsenjata=(TextView)findViewById(R.id.keterangan);
	if (no==1){
		senjata.setImageResource(R.drawable.karihberasaldarisumaterabarat);
		ketsenjata.setText("Senjata Tradisional Karih, Berasal Dari Sumatera Barat");	
	}
	else if (no==2){
		senjata.setImageResource(R.drawable.badikberasaldarigorontalo);
		ketsenjata.setText("Senjata Tradisional Badik, berasal dari Gorontalo");
	}
	else if (no==3){
		senjata.setImageResource(R.drawable.badikberasaldaritumbukladajambi);
		ketsenjata.setText("Senjata Tradisional Badik, Berasal Dari Tumbuk Lada Jambi");
	}
	else if (no==4){
		senjata.setImageResource(R.drawable.bujakbeliungberasaldarikalimantanselatan);
		ketsenjata.setText("Senjata Tradisional Bujak Beliung, Berasal Dari Kalimantan Selatan");
	}
	else if (no==5){
	senjata.setImageResource(R.drawable.cluritberasaldarijawatimur);
	ketsenjata.setText("Senjata Tradisional Cluri, Berasal Dari Jawa Timur");
	}
	else if (no==6){
	senjata.setImageResource(R.drawable.golokberasaldarijakarta);
	ketsenjata.setText("Senjata Tradisional Golok, Berasal Dari Jakarta");
	}
	else if (no==7){
	senjata.setImageResource(R.drawable.kerisberasaldaribali);
	ketsenjata.setText("Senjata Tradisional Keris, Berasal Dari Bali");
	}
	else if (no==8){
	senjata.setImageResource(R.drawable.kerisberasaldarijawatengah);
	ketsenjata.setText("Senjata Tradisional Keris, Berasal Dari Jawa Tengah");	
	}
	else if (no==9){
	senjata.setImageResource(R.drawable.kerisberasaldarijogja);
	ketsenjata.setText("Senjata Tradisional Keris, Berasal Dari Jogja ");
}
else if (no==10){
	senjata.setImageResource(R.drawable.kerisberasaldarisulawesitenggara);
	ketsenjata.setText("Senjata Tradisional Keris, Berasal Dari Sulawesi Tenggara");
}
else if (no==11){
	senjata.setImageResource(R.drawable.kerisberasaldarisulawesiutara);
	ketsenjata.setText("Senjata Tradisional Keris, Berasal Dari Sulawesi Utara");
}
else if (no==12){
	senjata.setImageResource(R.drawable.kudukberasaldaribengkulu);
	ketsenjata.setText("Senjata Tradisional Kuduk, Berasal Dari Bengkulu");
}
else if (no==13){
	senjata.setImageResource(R.drawable.kujangberasaldaribanten);
	ketsenjata.setText("Senjata Tradisional Kujang, Berasal Dari Banten");
}
else if (no==14){
	senjata.setImageResource(R.drawable.kujangberasaldarijawabarat);
	ketsenjata.setText("Senjata Tradisional Kujang, Berasal Dari Jawa Barat");
}
else if (no==15){
	senjata.setImageResource(R.drawable.lunjuksumpitranduberasaldarikalimantantengah);
	ketsenjata.setText("Senjata Tradisional Lunjuk Sumpit Trandu, Berasal Dari Kalimantan Tengah");
}
else if (no==16){
	senjata.setImageResource(R.drawable.mandauberasaldarikalimantanbarat);
	ketsenjata.setText("Senjata Tradisional Mandau, Berasal Dari Kalimantan Barat");
}
else if (no==17){
	senjata.setImageResource(R.drawable.mandauberasaldarikalimantantimur);
	ketsenjata.setText("Senjata Tradisional Mandau, Berasal Dari Kalimantan Timur");
}
else if (no==18){
	senjata.setImageResource(R.drawable.panahberasaldaripapuabarat);
	ketsenjata.setText("Senjata Tradisional Panah, Berasal Dari Papua Barat");
}
else if (no==19){
	senjata.setImageResource(R.drawable.pasatimpoberasaldarisulawesitengah);
	ketsenjata.setText("Senjata Tradisional Pasatimpo, Berasal Dari Sulawesi Tengah");
}
else if (no==20){
	senjata.setImageResource(R.drawable.pedangjenawberasaldarikepulauanriau);
	ketsenjata.setText("Senjata Tradisional Pedang Jenaw, Berasal Dari Kepulauan Riau");
}
else if (no==21){
	senjata.setImageResource(R.drawable.pedangjenawiberasaldarisumaterabarat);
	ketsenjata.setText("Senjata Tradisional Pedang Jenawi, Berasal Dari Sumatera Barat ");
}
else if (no==22){
	senjata.setImageResource(R.drawable.pisaubelatiberasaldaripapua);
	ketsenjata.setText("Senjata Tradisional Pisau Belati, Berasal Dari Papua");
}
else if (no==23){
	senjata.setImageResource(R.drawable.pisogajadompakberasaldarisumaterautara);
	ketsenjata.setText("Senjata Tradisional Pisoga Jadompak, Berasal Dari Sumatera Utara");
}
else if (no==24){
	senjata.setImageResource(R.drawable.rencongberasaldariaceh);
	ketsenjata.setText("Senjata Tradisional Rencong, Berasal Dari Aceh");
}
else if (no==25){
	senjata.setImageResource(R.drawable.salawakuberasaldarimaluku);
	ketsenjata.setText("Senjata Tradisional Salawaku, Berasal Dari Maluku");
}
else if (no==26){
	senjata.setImageResource(R.drawable.siwarpanjangberasaldaribangkabelitung);
	ketsenjata.setText("Senjata Tradisional Siwar Panjang, Berasal Dari Bangka Belitung");

}
else if (no==27){
	senjata.setImageResource(R.drawable.sunduberasaldarinusatenggarabarat);
	ketsenjata.setText("Senjata Tradisional Sundu, Berasal Dari Nusa Tenggara Barat");
}
else if (no==28){
	senjata.setImageResource(R.drawable.sunduberasaldarinusatenggaratimur);
	ketsenjata.setText("Senjata Tradisional Sundu, Berasal Dari Nusa Tenggara Timur");

}
else if (no==29){
	senjata.setImageResource(R.drawable.terapangberasaldarilampung);
	ketsenjata.setText("Senjata Tradisional Terapang, Berasal Dari Lampung");
}
else if (no==30){
	senjata.setImageResource(R.drawable.tombakberasaldarisulawesibarat);
	ketsenjata.setText("Senjata Tradisional Tombok, Berasal Dari Sulawesi Barat");
}
else if (no==31){
	senjata.setImageResource(R.drawable.tombaktrisulaberasaldarisumateraselatan);
	ketsenjata.setText("Senjata Tradisional Tombok Trisula, Berasal Dari Sumatera Selatan");
}
else if (no==32){
	senjata.setImageResource(R.drawable.wamiloberasaldarigorontalo);
	ketsenjata.setText("Senjata Tradisional Wamilo, Berasal Gorontalo");
}else if (no==0){
	setContentView(R.layout.menubelajar);
}else if (no==32){
	setContentView(R.layout.menubelajar);
}
}
public void lanjutsenjata(View v){
no+=1;
senjata();		
}
public void kembalisenjata(View v){
no-=1;
senjata();
}


	/** Koding Untuk Alat Musik */
	public void alatmusik(){
		ImageView alatmusik = (ImageView)findViewById(R.id.gambar);
		TextView ketmusik = (TextView)findViewById(R.id.keterangan);
		if (no==1){
			alatmusik.setImageResource(R.drawable.alatmusiksaluangberasaldarisumatrabarat);
			ketmusik.setText("Alat Musik Tradisional Saluang, berasal dari Sumatera Barat");
		}
		else if (no==2){
			alatmusik.setImageResource(R.drawable.alatmusikaccordionberasaldarisumatraselatan);
			ketmusik.setText("Alat Musik Tradisional Accordiong, berasal dari Sumatera Selatan");
		}
		else if (no==3){
			alatmusik.setImageResource(R.drawable.alatmusikbendeberasaldarilampung);
			ketmusik.setText("Alat Musik Tradisional Bende, Berasal Dari Lampung");
		}
		else if (no==4){
			alatmusik.setImageResource(R.drawable.alatmusikberasaldaribonangjawatimur);
			ketmusik.setText("Alat Musik Tradisional, Berasal Dari Jawa Timur");
			
		}else if (no==5){
				alatmusik.setImageResource(R.drawable.alatmusikdollberasaldaribengkulu);
				ketmusik.setText("Alat Musik Tradisional Doll, Berasal Dari Bengkulu");
			}
			else if (no==6){
				alatmusik.setImageResource(R.drawable.alatmusikgambusberasaldarijambi);
				ketmusik.setText("Alat Musik Tradisional Gambus,Berasal Dari Jambi");
			}
			else if (no==7){
				alatmusik.setImageResource(R.drawable.alatmusikgambusberasaldaririau);
				ketmusik.setText("Alat Musik Tradisional Gambus, Berasal Dari Riau");
			}
			else if (no==8){
				alatmusik.setImageResource(R.drawable.alatmusikgamelanjawatengah);
				ketmusik.setText("Alat Musik Tradisional Gamelan, Berasal Dari Jawa Tengah");
			}
			else if (no==9){
				alatmusik.setImageResource(R.drawable.alatmusikgandaberasaldarigorontalo);
				ketmusik.setText("Alat Musik Tradisional Ganda, Berasal Dari Gorontalo");
			}
			else if (no==10){
				alatmusik.setImageResource(R.drawable.alatmusikgandaberasaldarisulawesitenggara);
				ketmusik.setText("Alat Musik Tradisional Ganda, Berasal Dari Sulawesi Tenggara");
			}
			else if (no==11){
				alatmusik.setImageResource(R.drawable.alatmusikgendangangklungberasaldarijawabarat);
				ketmusik.setText("Alat Musik Tradisional Ganda, Berasal Dari jambi");
			}
			else if (no==12){
				alatmusik.setImageResource(R.drawable.alatmusikgendangberasaldaribanten);
				ketmusik.setText("Alat Musik Tradisional Gendang, Berasal Dari Banten");
			}
			else if (no==13){
				alatmusik.setImageResource(R.drawable.alatmusikgendangberasaldarijogja);
				ketmusik.setText("Alat Musik Tradisional Gendang, Berasal Dari Jogja");
			}
			else if (no==14){
				alatmusik.setImageResource(R.drawable.alatmusikgendangmelayuberasaldaribangkabelitung);
				ketmusik.setText("Alat Musik Tradisional Gendang, Berasal Dari Bangka Belitung");
			}
			else if (no==15){
				alatmusik.setImageResource(R.drawable.alatmusikgendangpanjagberasaldarikepulauanriau);
				ketmusik.setText("Alat Musik Tradisional Gendang, Berasal Dari Kepulauan Riau");
			}
			else if (no==16){
				alatmusik.setImageResource(R.drawable.alatmusikgendangtehyanberasaldarijakarta);
				ketmusik.setText("Alat Musik Tradisional Gendang, Berasal Dari Jakarta");
			}
			else if (no==17){
				alatmusik.setImageResource(R.drawable.alatmusikgengengberasaldaribali);
				ketmusik.setText("Alat Musik Tradisional Gengeng, Berasal Dari Bali");
			}
			else if (no==18){
				alatmusik.setImageResource(R.drawable.alatmusikjapenberasaldarikalimantantengah);
				ketmusik.setText("Alat Musik Tradisional Japen, Berasal Dari Kalimantan Tengah");
			}
			else if (no==19){
				alatmusik.setImageResource(R.drawable.alatmusikkecapiberasaldarisulawesibarat);
				ketmusik.setText("Alat Musik Tradisional Kecapi, Berasal Dari Sulawesi Barat");
			}
			else if (no==20){
				alatmusik.setImageResource(R.drawable.alatmusikkesoberasaldarisulawesiselatan);
				ketmusik.setText("Alat Musik Tradisional Keso, Berasal Dari Sulawesi Selatan");
			}
			else if (no==21){
				alatmusik.setImageResource(R.drawable.alatmusikkolintangberasaldarisulawesiutara);
				ketmusik.setText("Alat Musik Tradisional Kolintang, Berasal Dari Sulawesi Utara");
			}
			else if (no==22){
				alatmusik.setImageResource(R.drawable.alatmusikladoladoberasaldarisulawesitenggara);
				ketmusik.setText("Alat Musik Tradisional Lado-Lado, Berasal Dari Sulawesi Tenggara");
			}
			else if (no==23){
				alatmusik.setImageResource(R.drawable.alatmusiknafiriberasaldarimalukuutara);
				ketmusik.setText("Alat Musik Tradisional Nafiri, Berasal Dari Maluku Utara");
			}
			else if (no==24){
				alatmusik.setImageResource(R.drawable.alatmusikpantingberasaldarikalimantanselatan);
				ketmusik.setText("Alat Musik Tradisional Panting, Berasal Dari Kalimantan Selatan");
			}
			else if (no==25){
				alatmusik.setImageResource(R.drawable.alatmusiksampeberasaldarikalimantantimur);
				ketmusik.setText("Alat Musik Tradisional Sampe, Berasal Dari Kalimantan Timur");
			}
			else if (no==26){
				alatmusik.setImageResource(R.drawable.alatmusiksasandoberasaldarinusatenggaratimur);
				ketmusik.setText("Alat Musik Tradisional Sasando, Berasal Dari Nusa Tenggara Timur ");
			}
			else if (no==27){
				alatmusik.setImageResource(R.drawable.alatmusikserunaiberasaldarinusatenggarabarat);
				ketmusik.setText("Alat Musik Tradisional Serunai, Berasal Dari Nusa Nusa Tenggara Barat");
			}
			else if (no==28){
				alatmusik.setImageResource(R.drawable.alatmusiktifaberasaldaripapua);
				ketmusik.setText("Alat Musik Tradisional TIfa Berasal Dari Papua");
			}
			else if (no==29){
				alatmusik.setImageResource(R.drawable.alatmusiktumaberasaldarikalimantanbarat);
				ketmusik.setText("Alat Musik Tradisional Tuma Berasal Dari Kalimanatan Barat");
			}else if (no==0){
				setContentView(R.layout.menubelajar);
			}else if (no==29){
				setContentView(R.layout.menubelajar);
			}
			}

public void lanjutalatmusik(View v){
	no+=1;
	alatmusik();		
}
public void kembalialatmusik(View v){
	no-=1;
	alatmusik();
}
public void soal2 (View v){
	setContentView(R.layout.bermain2);
}
public void soal3 (View v){
	setContentView(R.layout.bermain3);
}
public void soal4 (View v){
	setContentView(R.layout.bermain4);
}
public void soal5 (View v){
	setContentView(R.layout.bermain5);
}
public void salah (View v){
	setContentView(R.layout.salah);
}
public void kembalibermain (View v){
	setContentView(R.layout.menubermain);
}
public void soalselesai (View v){
	setContentView(R.layout.siap);
}
public void keluar (View v){
	this.finish();
	
}
	
}




