package test.com.comr;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Ignore;
import org.junit.Test;

import com.comr.utils.Utils;

public class UtilsTest {
	protected final Log log = LogFactory.getLog(getClass());
	@Ignore
	@Test
	public void isNullOrEmpty(){
		String s = "-";
		log.info("Testear isNullOrEmpty con " + s);
		boolean ok=false;
		try{
			if(Utils.isNullOrEmpty(s)){
				log.info("si es null:" + s);
			}else{
				log.info("No es null:" + s);
			}
			ok = true;
		}catch(Exception e){
			log.error(e);
		}
		assertTrue(ok);
	}
	
	@Test
	public void timeMilisegundos(){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, -2);
		log.info("#="  + c.getTimeInMillis());
		assertTrue(c.getTimeInMillis() > 0);
	}
}
