import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


public class TestOperation extends TestBasics{

    @Test
    public void TargetMissions(){
        
        MethodsPool.homePage();
        //www.gittigidiyor.com sitesi a��l�r.
        MethodsPool.correctPage();
        //Ana sayfan�n a��ld��� kontrol edilir.
        MethodsPool.login("gittigidiyorautomationtest1@gmail.com", "Deneme12345.");
        //Siteye login olunur. Login i�lemi kontrol edilir.
        MethodsPool.searchComputer("bilgisayar");
        //Arama kutucu�una bilgisayar kelimesi girilir.
        MethodsPool.goToPageTwo();
        //Arama sonu�lar� sayfas�ndan 2.sayfa a��l�r.
        MethodsPool.selectRandomComputer();
        //Sonuca g�re sergilenen �r�nlerden rastgele bir �r�n se�ilir.
        MethodsPool.addToBasket();
        //Se�ilen �r�n sepete eklenir.
        MethodsPool.priceValue();
        //�r�n sayfas�ndaki fiyat g�sterilir.
        MethodsPool.pathBasket();
        //Seper sayfas�na gidilir.
        MethodsPool.priceCheck();
        //�r�n sayfas�ndaki fiyat ile sepette yer alan �r�n fiyat�n�n do�rulu�u kar��la�t�r�l�r.
        MethodsPool.increaseBasketValue();
        //Adet artt�r�larak �r�n adedinin 2 oldu�u do�rulan�r.
        MethodsPool.clearBasket();
        //�r�n sepetten silinir.
    }
}
