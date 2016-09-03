/**
 * 
 */
package goshen.education.weichat;

/**
 * @author cunli 2016年8月23日 下午8:43:22 获取微信返回的信息
 */
public class WeichatReturnCodes {
	
//	token,网页授权
	private String access_token;
	private int expires_in;
	
//	网页授权
	private String refresh_token;
	private String openid;
	private String scope;
	
//	menu,网页授权
	private String errcode;
	private String errmsg;
	
	
//	二维码
	private String ticket;
	private String expire_seconds;
	private String url;

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WeichatReturnCodes [access_token=" + access_token + ", expires_in=" + expires_in + ", refresh_token="
				+ refresh_token + ", openid=" + openid + ", scope=" + scope + "]";
	}

	/** 
	 * @return the refresh_token
	 */
	public String getRefresh_token() {
		return refresh_token;
	}

	/**
	 * @param refresh_token the refresh_token to set
	 */
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	/** 
	 * @return the openid
	 */
	public String getOpenid() {
		return openid;
	}

	/**
	 * @param openid the openid to set
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	/** 
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * @param scope the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	/** 
	 * @return the ticket
	 */
	public String getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	/** 
	 * @return the expire_seconds
	 */
	public String getExpire_seconds() {
		return expire_seconds;
	}

	/**
	 * @param expire_seconds the expire_seconds to set
	 */
	public void setExpire_seconds(String expire_seconds) {
		this.expire_seconds = expire_seconds;
	}

	/** 
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/** 
	 * @return the errcode
	 */
	public String getErrcode() {
		return errcode;
	}

	/**
	 * @param errcode the errcode to set
	 */
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	/** 
	 * @return the errmsg
	 */
	public String getErrmsg() {
		return errmsg;
	}

	/**
	 * @param errmsg the errmsg to set
	 */
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	/**
	 * @param token
	 */
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	/**
	 * @param 错误码
	 */
	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	/**
	 * @return token
	 */
	public String getAccess_token() {
		return access_token;
	}

	/**
	 * @return 错误码
	 */
	public int getExpires_in() {
		return expires_in;
	}
}
