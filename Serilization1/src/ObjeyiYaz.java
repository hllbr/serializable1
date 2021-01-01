
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObjeyiYaz {
    public static void main(String[] args) {
        //objeyi serileştirmek için objectoutputstream'e ihtiyacımız var
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
            Ogrenci ogrenci1 = new Ogrenci("hllbr", 15, "eem");
            Ogrenci ogrenci2 = new Ogrenci("hllbr2", 158, "developer");
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken bir sorun meydana geldi");
        }
    }
}
