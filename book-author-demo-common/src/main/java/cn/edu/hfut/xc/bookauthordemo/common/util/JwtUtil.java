package cn.edu.hfut.xc.bookauthordemo.common.util;

import cn.edu.hfut.xc.bookauthordemo.common.model.Author;
import com.alibaba.fastjson.JSONObject;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//@Component
public class JwtUtil {

	public static final String JWT_ID = "jwt";
	public static final String JWT_SECRET = "7786df7fc3a34e26a61c034d5ec8245d";
	public static final int JWT_TTL = 7 * 24 * 60 * 60 * 1000;  //millisecond 过期时间7天

	/**
	 * 由字符串生成加密key
	 * @return
	 */
	public static SecretKey generalKey(){
		String stringKey =  JWT_SECRET;
		byte[] encodedKey = Base64.decodeBase64(stringKey);
	    SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
	    return key;
	}

	/**
	 * 创建jwt
	 * @param id
	 * @param subject
	 * @param ttlMillis
	 * @return
	 * @throws Exception
	 */
	public static String createJWT(String id, JSONObject subject, long ttlMillis) throws Exception {
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);
		SecretKey key = generalKey();
		JwtBuilder builder = Jwts.builder()
				.setHeaderParam("typ", "JWT")
				.setHeaderParam("alg", "HS256")
				.setIssuedAt(now)
			.claim("sub",subject)
		    .signWith(signatureAlgorithm, key);
		//添加Token过期时间
		if (ttlMillis >= 0) {
		    long expMillis = nowMillis + ttlMillis;
		    Date exp = new Date(expMillis);
		    builder.setExpiration(exp);
		}
		return builder.compact();
	}

	/**
	 * 解密jwt
	 * @param jwt
	 * @return
	 * @throws Exception
	 */
	public Claims parseJWT(String jwt){
		try{
			SecretKey key = generalKey();
			Claims claims = Jwts.parser()
					.setSigningKey(key)
					.parseClaimsJws(jwt).getBody();
			return claims;
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * 生成subject信息
	 * @param
	 * @return
	 */
	public static JSONObject generalSubject(Author author){
		JSONObject jo = new JSONObject();
		jo.put("id",author.getId());
		jo.put("authorName",author.getAuthorName());
		jo.put("emailNumber", author.getEmailNumber());
		jo.put("idCode",author.getIdCode());
		jo.put("phoneNumber",author.getPhoneNumber());
		jo.put("userName",author.getUserName());
		jo.put("nation",author.getNation());
		jo.put("age",author.getAge());
		jo.put("personalRemark",author.getPersonalRemark());
		return jo;
	}

	public static String getUserId(ServletRequest request){
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String auth = httpRequest.getHeader("Authorization");
		Map<String, String> usermap = new HashMap<String, String>();
		String userId = "";
		if (auth != null) {
			if (EcoSystemUtil.parseJWT(auth) != null) {
				usermap = EcoSystemUtil.ifAuthUsable(auth);
				userId = usermap.get("id");
			}
		}
		return  userId;
	}
}
