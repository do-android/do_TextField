package doext.define;

import core.object.DoUIModule;
import core.object.DoProperty;
import core.object.DoProperty.PropertyDataType;

public abstract class do_TextField_MAbstract extends DoUIModule {

	protected do_TextField_MAbstract() throws Exception {
		super();
	}

	/**
	 * 初始化
	 */
	@Override
	public void onInit() throws Exception {
		super.onInit();
		// 注册属性
		this.registProperty(new DoProperty("text", PropertyDataType.String, "", false));
		this.registProperty(new DoProperty("fontColor", PropertyDataType.String, "000000", false));
		this.registProperty(new DoProperty("cursorColor", PropertyDataType.String, "000000FF", false));
		this.registProperty(new DoProperty("fontSize", PropertyDataType.Number, "9", false));
		this.registProperty(new DoProperty("textFlag", PropertyDataType.String, "normal", true));
		this.registProperty(new DoProperty("fontStyle", PropertyDataType.String, "normal", false));
		this.registProperty(new DoProperty("hint", PropertyDataType.String, "", false));
		this.registProperty(new DoProperty("hintColor", PropertyDataType.String, "808080FF", false));
		this.registProperty(new DoProperty("inputType", PropertyDataType.String, "", false));
		this.registProperty(new DoProperty("enterText", PropertyDataType.String, "default", true));
		this.registProperty(new DoProperty("password", PropertyDataType.Bool, "false", false));
		this.registProperty(new DoProperty("clearAll", PropertyDataType.Bool, "false", true));
		this.registProperty(new DoProperty("clearImg", PropertyDataType.String, "", false));
		this.registProperty(new DoProperty("maxLength", PropertyDataType.Number, "100", true));
		this.registProperty(new DoProperty("enabled", PropertyDataType.Bool, "true", false));
		this.registProperty(new DoProperty("textAlign", PropertyDataType.String, "left", true));
		this.registProperty(new DoProperty("padding", PropertyDataType.String, "left", true));
	}
}