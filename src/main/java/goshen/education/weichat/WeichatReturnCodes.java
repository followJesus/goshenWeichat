/**
 * 
 */
package goshen.education.weichat;

/**
 * @author cunli 2016年8月23日 下午8:43:22 获取微信返回的信息
 */
public class Token {
	
//	token
	private String access_token;
	private int expires_in;
	
//	menu
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
		return "Token [access_token=" + access_token + ", expires_in=" + expires_in + ", errcode=" + errcode
				+ ", errmsg=" + errmsg + ", ticket=" + ticket + ", expire_seconds=" + expire_seconds + ", url=" + url
				+ "]";
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
