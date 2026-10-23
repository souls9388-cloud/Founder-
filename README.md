# TG Shield AI (prototipe Android)

Aplikasi Android berbahasa Indonesia dengan tema biru gelap untuk pengelolaan satu grup Telegram.

**Status:** prototipe antarmuka offline. Belum terhubung ke Telegram, belum menjalankan CAPTCHA, filter spam, persetujuan anggota, atau notifikasi. Tidak ada klaim anti-deteksi atau jaminan anti-blokir.

## Build dari HP dengan GitHub Actions
1. Buat repository GitHub baru.
2. Unggah seluruh isi folder proyek ini ke root repository (termasuk `.github/workflows/android.yml`).
3. Buka tab **Actions** → **Build Android APK** → **Run workflow**.
4. Setelah sukses, buka hasil run dan unduh artifact `TGShieldAI-debug-apk` (ZIP berisi APK).

Build memerlukan koneksi internet dan layanan GitHub Actions. Jika gagal karena versi Gradle atau Android SDK, sesuaikan toolchain.

## Tahap selanjutnya
Backend bot Telegram terpisah, autentikasi admin, penyimpanan token bot aman di server, API HTTPS, kontrol akses, dan implementasi fitur moderasi melalui Telegram Bot API resmi. Jangan memasukkan token bot ke kode Android.
