## Proje Bilgilendirmesi

- Proje Java programlama dilinde yazılmıştır
- Proje Maven projesi olarak yazılmıştır.
- Selenium, JUnit ve Log4J kütüphanelerini kullanılarak oluşturulmuştur.
- Projede OOP (Object Oriented Programming) prensipleri kullanılmıştır.

Selenium Web Otomasyon Programının çalışma aşamaları:

- www.gittigidiyor.com sitesi açılır.
- Ana sayfanın açıldığı kontrol edilir. Siteye login olunur
- Login işlemi kontrol edilir.
- Arama kutucuğuna bilgisayar kelimesi girilir.
- Arama sonuçları sayfasından 2.sayfa açılır.
- 2.sayfanın açıldığı kontrol edilir.
- Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
- Seçilen ürün sepete eklenir.
- Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
- Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.
- Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.

## Kod Bilgisi

### MethodsPool.java : 

Tüm gerekli fonksiyon ve metodların yer aldığı sınıftır. Her aşamanın işlemine bağımsız erişim sağlamamıza olanak tanır.

### TestBasics.java :

Teste başlamadan ve test grubu bittikten sonra yapılması gereken işlemlerin bulunduğu başka projelere de kolayca entegre edebileceğimiz temel kısımdır.

### TestOperation.java :

İstenilen görevlerin yerine getirildiği operasyon merkezidir. TestBasics sınıfı ile Inheritance bağlantısı vardır. Bu sayede @Before @After işlemlerine buradan ulaşır. Olası bir değişimde ise sadece bu merkeze eklemeler ve çıkartmlar yapılarak operasyon sürdürülür.





