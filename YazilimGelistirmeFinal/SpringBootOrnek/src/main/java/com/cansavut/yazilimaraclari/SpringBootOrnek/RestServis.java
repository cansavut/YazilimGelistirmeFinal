package com.cansavut.yazilimaraclari.SpringBootOrnek;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * RestServis öğrenci işlemlerini gerçekleştirmek için gerekli şeyleri yaratır.
 * @author can
 *
 */

@RestController

public class RestServis {
	/**
	 * islemler adinda arraylist'ten tureyen bir list nesnesi olusturup,
	 * icerisinde ogrencislem degiskeni dondurulur.
	 *
	 */

	private static final List<ogrencislem> islemler = new ArrayList<ogrencislem>();
	/**
	 * 
	 * @param ogrencislem
	 * 	adinda bir string 
	 * @param ogrencicerik
	 * 	 ogrencislem adinda yeni bir nesne olusturulup degiskenler atanir. 
	 *   islemler listesine olusturulan olusturulan ogrenci eklenir.
	 * @return ogrencislem dondurulur
	 */
	@RequestMapping("/ogrenci/ekle")
	public ogrencislem ogrenciEkle(String ogrencislem, String ogrencicerik) {
		ogrencislem ogrencislem = new ogrencislem();
		islemler.add(ogrencislem);
		return ogrencislem ;
		
	/**
	 * Tum ogrencileri gosteren fonksiyondur. 	
	 * @return islemler nesnesi dondurulur.
	 */
	@RequestMapping("/ogrenci/Goruntuleme")
	public List<ogrencislem> ogrenciGoruntuleme() {
		return islemler;
	}
	/**
	 * Istenilen ogrenciyi siler.
	 * @param index
	 * 	islemler listesinden index siler.
	 * @return "Ogrenci Silindi." doner.
	 */
	@RequestMapping("/ogrenci/sil")
	public String ogrenciSil(int index) {
		islemler.remove(index);
		return "Ogrenci Silindi.";
	}

	
	
	
}
