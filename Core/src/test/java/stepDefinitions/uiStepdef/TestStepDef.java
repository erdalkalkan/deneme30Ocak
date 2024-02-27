package stepDefinitions.uiStepdef;

import com.google.common.collect.Lists;
import io.cucumber.datatable.DataTable;
import jdk.dynalink.linker.LinkerServices;
import org.checkerframework.checker.guieffect.qual.UI;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static stepDefinitions.Hooks.driver;

public class TestStepDef {



//    @Test
//    public void deneme(){
//        List<String> kelimeler = List.of("ben", "bir", "ceviz", "ağacıyım");
//
//// Listeyi tersine çevirme
//        Collections.reverse(kelimeler);
//        for (String kelime : kelimeler) {
//            System.out.println(kelime);
//        }


//    }


//    @Test
//    public void getAttributedeneme(){
//
//        driver.get("https://test.urbanicfarm.com/auth/login");
//        System.out.println(driver.findElement(By.xpath("//input[@placeholder='Email']")).getAttribute("validationMessage"));
//
//
//    }



    //Liste oluşumu ve ? hatırlamak için oluşturdum
    @Test
    public void soruIsaretiveListe(){

    //isim listesi oluşturma yolları
        // way 1
        List<String> list1 = new ArrayList<>();
        list1.add("Faruk");
        list1.add("Ayşe");
        list1.add("Fatma");

        // way 2
        List<String> list2 = List.of("Erdal", "Ayşe", "Fatma","Faruk");

        // way 3
        List<String> list3 = Lists.newArrayList("Ayşe", "Fatma");
                // list3.size() -> 2
                // isimListesi.get(0) -> "Ayse"


    //Listeleri barındıran liste oluşturmak için
        // way 1
        List<List<String>> listelerinListesi1 = Lists.newArrayList(list1,list2,list3);

        // way2
        List<List<String>> listelerinListesi2 = new ArrayList<>();

        List<String> isimListesi = Arrays.asList("Ahmet", "Ayşe", "Fatma");
        List<String> soyisimListesi = Arrays.asList("Yılmaz", "Demir", "Çetin");

        listelerinListesi2.add(isimListesi);
        listelerinListesi2.add(soyisimListesi);
            // listelerinListesi2.size() -> 2
            // listelerinListesi2.get(0).size() -> 3
            // listelerinListesi2.get(0).get(0) -> "Ahmet"

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
        System.out.println("listelerinListesi1 = " + listelerinListesi1);
        System.out.println("listelerinListesi2 = " + listelerinListesi2);
        System.out.println("-----------------TASK FARUK---------------------");

//TASK: Oluşturduğun listelerden Faruk u bul
        String Faruk = "Gözümün nuru";
//        List<String> gozumunNuru = Arrays.asList("Gözümün nuru");

        for (int i = 0; i < listelerinListesi1.size(); i++) {

                for (int j = 0; j < listelerinListesi1.get(i).size(); j++) {


                    if (listelerinListesi1.get(i).get(j).equals("Faruk")) {
                        listelerinListesi1.get(i).set(j,Faruk);
                    }


//                   String element = ( (listelerinListesi1.get(i).get(j).equals("Faruk") ) ? Faruk : listelerinListesi1.get(i).get(j) );


//                    if( listelerinListesi1.get(i).get(j).equals("Faruk") ) {
//                        listelerinListesi1.get(i).set(j,Faruk);
//                    }



//                    listelerinListesi1 = listelerinListesi1.stream().map(list -> list.stream().map(s -> s.equals("Faruk") ? "Gözümün nuru" : s).collect(Collectors.toList()))
//                            .toList();


                    System.out.println(i + ".listenin " + j +".elemanı: " + listelerinListesi1.get(i).get(j));
                }





        }


    }

}
