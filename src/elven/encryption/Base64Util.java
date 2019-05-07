package elven.encryption;


import org.apache.commons.lang.StringUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * BASE64算法实现加解密
 * @author xzb
 *
 */
public class Base64Util {

	/**
	 * base64算法加密
	 * @param data
	 * @return
	 */
	public static String base64Encrypt(String data){
		if(!StringUtils.isEmpty(data)){
			return base64Encrypt(data.getBytes());
		}
		return "";
	}
	/**
	 * base64算法加密
	 * @param data
	 * @return
	 */
	public static String base64Encrypt(byte[] data){
		return new BASE64Encoder().encode(data);
	}
	
	/**
	 * base64算法解密
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public static String base64Decrypt(String data) throws Exception{
		byte[] resultBytes = new BASE64Decoder().decodeBuffer(data);
		return new String(resultBytes);
	}
}
