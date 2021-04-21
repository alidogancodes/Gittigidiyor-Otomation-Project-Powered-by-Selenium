import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


public class TestOperation extends TestBasics{

    @Test
    public void TargetMissions(){
        
        MethodsPool.homePage();
        //www.gittigidiyor.com sitesi açýlýr.
        MethodsPool.correctPage();
        //Ana sayfanýn açýldýðý kontrol edilir.
        MethodsPool.login("gittigidiyorautomationtest1@gmail.com", "Deneme12345.");
        //Siteye login olunur. Login iþlemi kontrol edilir.
        MethodsPool.searchComputer("bilgisayar");
        //Arama kutucuðuna bilgisayar kelimesi girilir.
        MethodsPool.goToPageTwo();
        //Arama sonuçlarý sayfasýndan 2.sayfa açýlýr.
        MethodsPool.selectRandomComputer();
        //Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
        MethodsPool.addToBasket();
        //Seçilen ürün sepete eklenir.
        MethodsPool.priceValue();
        //Ürün sayfasýndaki fiyat gösterilir.
        MethodsPool.pathBasket();
        //Seper sayfasýna gidilir.
        MethodsPool.priceCheck();
        //Ürün sayfasýndaki fiyat ile sepette yer alan ürün fiyatýnýn doðruluðu karþýlaþtýrýlýr.
        MethodsPool.increaseBasketValue();
        //Adet arttýrýlarak ürün adedinin 2 olduðu doðrulanýr.
        MethodsPool.clearBasket();
        //Ürün sepetten silinir.
    }
}
