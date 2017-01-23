package test.com.comr;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.comr.utils.UtilsEncrypt;

public class UtilsEncryptTest {
	protected final Log log = LogFactory.getLog(getClass());
	
	@Test
	public void EncriptaTest(){
		try{
			String txt = "omarmr";
			log.info("A Encriptar texto:"+txt);
			txt = UtilsEncrypt.encrypt(txt);
			log.info("Texto Encriptado:" + txt);
			txt = UtilsEncrypt.decipher(txt);
			log.info("Texto desencriptado:" + txt);
			assertTrue(txt.equals("omarmr"));
		}catch(Exception e){
			log.warn("Error " + e.getMessage());
		}
		
	}
}
