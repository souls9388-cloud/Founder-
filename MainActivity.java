package com.tgshield.ai;
import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.*;
import android.graphics.drawable.GradientDrawable;

public class MainActivity extends Activity {
 LinearLayout root;
 int bg=Color.rgb(10,17,33), panel=Color.rgb(23,37,60), blue=Color.rgb(55,153,255);
 TextView label(String text,int size,boolean bold){TextView v=new TextView(this);v.setText(text);v.setTextSize(size);v.setTextColor(Color.WHITE);v.setPadding(12,13,12,13);if(bold)v.setTypeface(null,Typeface.BOLD);return v;}
 void card(String title,String desc){LinearLayout box=new LinearLayout(this);box.setOrientation(1);GradientDrawable d=new GradientDrawable();d.setColor(panel);d.setCornerRadius(20);box.setBackground(d);box.setPadding(14,10,14,10);LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,-2);p.setMargins(0,0,0,16);root.addView(box,p);box.addView(label(title,19,true));TextView t=label(desc,14,false);t.setTextColor(0xffc3d3e8);box.addView(t);}
 @Override public void onCreate(Bundle b){super.onCreate(b);ScrollView scroll=new ScrollView(this);scroll.setBackgroundColor(bg);root=new LinearLayout(this);root.setOrientation(1);root.setPadding(24,36,24,24);scroll.addView(root);setContentView(scroll);
 TextView header=label("🛡 TG Shield AI",27,true);header.setTextColor(blue);root.addView(header);
 root.addView(label("Dashboard keamanan grup Telegram • Versi demo",14,false));
 card("STATUS SISTEM", "Belum terhubung ke bot. Tidak ada data grup yang diambil.");
 card("👥 Anggota Grup", "Jumlah anggota: —\nSambungkan backend bot untuk menampilkan data.");
 card("🧩 CAPTCHA", "Rancangan: verifikasi anggota baru menggunakan tantangan sederhana.");
 card("🔎 Filter Spam", "Rancangan: aturan moderasi pesan dan tautan mencurigakan.");
 card("✅ Persetujuan Anggota", "Rancangan: tinjau permintaan bergabung melalui API bot resmi.");
 card("🔔 Peringatan Keamanan", "Rancangan: notifikasi untuk admin ketika terjadi aktivitas mencurigakan.");
 Button btn=new Button(this);btn.setText("Panduan menghubungkan bot");root.addView(btn);btn.setOnClickListener(v->new android.app.AlertDialog.Builder(this).setTitle("Integrasi aman").setMessage("1. Buat backend bot Telegram resmi di server.\n2. Simpan token bot hanya di server, bukan di APK.\n3. Beri bot izin admin yang diperlukan.\n4. Hubungkan aplikasi melalui endpoint HTTPS dengan autentikasi.\n\nVersi ini adalah prototipe antarmuka, bukan bot aktif.").setPositiveButton("Mengerti",null).show());
 }
}
