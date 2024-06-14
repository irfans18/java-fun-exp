## rusak
```java
public static void rusak(int n) {
    if (n == 0) {
        return;
    }

    for (int i = 1 ; i <= n ; i++) {
        System.out.println("Hello");
    }

    rusak((int)n/2);
}
```
Berapa kali string Hello dicetak setelah pemanggilan rusak(1000)?

Untuk menentukan berapa kali string "Hello" dicetak setelah pemanggilan `rusak(1000)`, kita perlu memahami bagaimana fungsi `rusak` bekerja.

Mari kita analisis langkah demi langkah.

### Analisis Fungsi

1. **Basis Rekursif**:
    - Jika \( n == 0 \), fungsi berhenti (`return`).

2. **Proses dalam fungsi**:
    - Fungsi akan mencetak "Hello" sebanyak \( n \) kali.
    - Kemudian memanggil dirinya sendiri dengan argumen \( n/2 \) (dibulatkan ke bawah).

### Contoh Pemanggilan Fungsi

Mari kita lihat urutan panggilannya:

1. `rusak(1000)`
    - Mencetak "Hello" 1000 kali
    - Memanggil `rusak(500)`

2. `rusak(500)`
    - Mencetak "Hello" 500 kali
    - Memanggil `rusak(250)`

3. `rusak(250)`
    - Mencetak "Hello" 250 kali
    - Memanggil `rusak(125)`

4. `rusak(125)`
    - Mencetak "Hello" 125 kali
    - Memanggil `rusak(62)`

5. `rusak(62)`
    - Mencetak "Hello" 62 kali
    - Memanggil `rusak(31)`

6. `rusak(31)`
    - Mencetak "Hello" 31 kali
    - Memanggil `rusak(15)`

7. `rusak(15)`
    - Mencetak "Hello" 15 kali
    - Memanggil `rusak(7)`

8. `rusak(7)`
    - Mencetak "Hello" 7 kali
    - Memanggil `rusak(3)`

9. `rusak(3)`
    - Mencetak "Hello" 3 kali
    - Memanggil `rusak(1)`

10. `rusak(1)`
    - Mencetak "Hello" 1 kali
    - Memanggil `rusak(0)`

11. `rusak(0)`
    - Tidak mencetak apa-apa karena kondisi dasar (`n == 0`) tercapai.

### Total Penghitungan

Sekarang, kita jumlahkan semua cetakan "Hello":

\[
1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7 + 3 + 1
\]

Mari kita hitung jumlahnya:

\[
1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7 + 3 + 1 = 1994
\]

Jadi, string "Hello" dicetak sebanyak 1994 kali setelah pemanggilan `rusak(1000)`.

## 