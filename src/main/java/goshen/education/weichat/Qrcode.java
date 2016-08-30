/**
 * 
 */
package goshen.education.weichat;

/**
 * @author cunli 2016年8月27日 上午11:02:10 二维码
 */
public class Qrcode {
	private String action_name="QR_LIMIT_STR_SCENE";
	private ActionInfo action_info;

	/**
	 * @return 二维码类型-永久
	 */
	public String getAction_name() {
		return action_name;
	}

	/**
	 * @param 二维码类型-永久
	 */
	public void setAction_name(String action_name) {
		this.action_name = action_name;
	}

	/**
	 * @return 二维码-信息
	 */
	public ActionInfo getAction_info() {
		return action_info;
	}

	/**
	 * @param 二维码-信息
	 */
	public void setAction_info(ActionInfo action_info) {
		this.action_info = action_info;
	}
}
