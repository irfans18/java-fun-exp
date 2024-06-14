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


`1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7 + 3 + 1`


Mari kita hitung jumlahnya:


`1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7 + 3 + 1 = 1994`


Jadi, string "Hello" dicetak sebanyak 1994 kali setelah pemanggilan `rusak(1000)`.

## roger
```java
public static int roger(int k, int b) {
     if (b == 1) return 1;
     else if (k % b == 0) return 1 + roger(k, --b);
     else return 0 + roger(k, --b);
 }
```
Berapakah return value dari pemanggilan roger(8,8)?

Untuk menentukan nilai return dari pemanggilan fungsi `roger(8, 8)`, kita perlu melacak panggilan rekursif dari fungsi tersebut dan menghitung hasil akhirnya. Fungsi ini menghitung berapa banyak bilangan `b` yang bisa membagi habis bilangan `k` dengan mengecek dari `b` hingga 1.

Mari kita uraikan langkah-langkah pemanggilan fungsi ini:

1. **Panggilan pertama**: `roger(8, 8)`
   - `b` bukan 1, maka lanjut ke `else if`
   - `k % b == 0` (8 % 8 == 0) benar, jadi kita lakukan `1 + roger(8, 7)`

2. **Panggilan kedua**: `roger(8, 7)`
   - `b` bukan 1, maka lanjut ke `else if`
   - `k % b == 0` (8 % 7 == 0) salah, jadi kita lakukan `0 + roger(8, 6)`

3. **Panggilan ketiga**: `roger(8, 6)`
   - `b` bukan 1, maka lanjut ke `else if`
   - `k % b == 0` (8 % 6 == 0) salah, jadi kita lakukan `0 + roger(8, 5)`

4. **Panggilan keempat**: `roger(8, 5)`
   - `b` bukan 1, maka lanjut ke `else if`
   - `k % b == 0` (8 % 5 == 0) salah, jadi kita lakukan `0 + roger(8, 4)`

5. **Panggilan kelima**: `roger(8, 4)`
   - `b` bukan 1, maka lanjut ke `else if`
   - `k % b == 0` (8 % 4 == 0) benar, jadi kita lakukan `1 + roger(8, 3)`

6. **Panggilan keenam**: `roger(8, 3)`
   - `b` bukan 1, maka lanjut ke `else if`
   - `k % b == 0` (8 % 3 == 0) salah, jadi kita lakukan `0 + roger(8, 2)`

7. **Panggilan ketujuh**: `roger(8, 2)`
   - `b` bukan 1, maka lanjut ke `else if`
   - `k % b == 0` (8 % 2 == 0) benar, jadi kita lakukan `1 + roger(8, 1)`

8. **Panggilan kedelapan**: `roger(8, 1)`
   - `b` sama dengan 1, jadi return 1

Sekarang kita dapat menghitung total nilai dari setiap panggilan rekursif:

- `roger(8, 1)` mengembalikan 1
- `roger(8, 2)` mengembalikan 1 + 1 = 2
- `roger(8, 3)` mengembalikan 0 + 2 = 2
- `roger(8, 4)` mengembalikan 1 + 2 = 3
- `roger(8, 5)` mengembalikan 0 + 3 = 3
- `roger(8, 6)` mengembalikan 0 + 3 = 3
- `roger(8, 7)` mengembalikan 0 + 3 = 3
- `roger(8, 8)` mengembalikan 1 + 3 = 4

Jadi, nilai return dari pemanggilan `roger(8, 8)` adalah 4.

## charCounter
Buatkan program yang akan menghitung jumlah uppercase, lowercase, angka dan symbol lainnya dalam suatu string.

Input
```
pemrogramanDasarJava1
```
Output
```
uppercase : 2
lowecase : 18
angka : 1
symbol : 0
```

Untuk memecahkan persoalan ini kita dapat menggunakan 2 pendekatan.

### charCount
```java
for (int i = 0; i < text.length(); i++) {
   char c = text.charAt(i);
   if (Character.isUpperCase(c)) {
       upperCount++;
   } else if (Character.isLowerCase(c)) {
       lowerCount++;
   } else if (Character.isDigit(c)) {
       digitCount++;
   } else {
       symbolCount++;
   }
}

```

Penjelasan program:
1. Program ini mendeklarasikan variabel `input` yang berisi string yang akan dihitung.
2. Empat variabel (`upperCount`, `lowerCount`, `digitCount`, `symbolCount`) digunakan untuk menyimpan jumlah masing-masing karakter yang diinginkan.
3. Program kemudian menggunakan loop `for` untuk mengiterasi setiap karakter dalam string `input`.
4. Pada setiap iterasi, karakter diperiksa menggunakan metode `Character.isUpperCase()`, `Character.isLowerCase()`, `Character.isDigit()`, dan jika tidak termasuk dalam kategori tersebut, dihitung sebagai simbol.
5. Setelah loop selesai, program mencetak jumlah setiap jenis karakter.

Jalankan program ini dengan string input yang diberikan, dan hasilnya akan sesuai dengan contoh output yang diberikan:

```
Uppercase : 2
Lowercase : 18
Angka : 1
Symbol : 0
```

### charCountUsingDict
```java
String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String lowercase = uppercase.toLowerCase();
String digit = "1234567890";

for (char c : text.toCharArray()) {
   if (uppercase.contains(String.valueOf(c))) {
       upperCount++;
   } else if (lowercase.contains(String.valueOf(c))) {
       lowerCount++;
   } else if (digit.contains(String.valueOf(c))) {
       digitCount++;
   }else {
       symbolCount++;
   }
}
```

Penjelasan fungsi `charCountUsingDict`:
1. Tiga string (`uppercase`, `lowercase`, `digit`) didefinisikan untuk mengandung semua huruf besar, huruf kecil, dan digit.
2. Empat variabel (`upperCount`, `lowerCount`, `digitCount`, `symbolCount`) digunakan untuk menyimpan jumlah masing-masing jenis karakter.
3. Fungsi ini kemudian mengiterasi setiap karakter dalam string `text`.
4. Pada setiap iterasi, karakter diperiksa apakah termasuk dalam `uppercase`, `lowercase`, atau `digit` menggunakan metode `contains`. Jika tidak termasuk dalam salah satu dari ketiga kategori tersebut, maka dihitung sebagai simbol.
5. Setelah loop selesai, fungsi ini mencetak jumlah setiap jenis karakter dengan format yang diinginkan.

Program ini akan menghasilkan output yang sesuai dengan input yang diberikan:

```
Uppercase	: 2
Lowercase	: 18
Angka		: 1
Symbol		: 0
```