
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiOku {
    public static void main(String[] args) {
        //buradada objectınputstream kullanıyoruz
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
            Ogrenci ogrenci1 = (Ogrenci)in.readObject();
            Ogrenci ogrenci2 = (Ogrenci)in.readObject();
            System.out.println("--------------------------------");
            System.out.println(ogrenci1);
            System.out.println("--------------------------------");
            System.out.println(ogrenci2);
        } catch (FileNotFoundException ex) {
            System.out.println("Okunacak Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir ıoexception meydana geldi");
        } catch (ClassNotFoundException ex) {
            System.out.println("Tür Dönüşümü Hatası ");
            System.out.println("Sınıf(Class) bulunamadı");
        }
    }
    
}
