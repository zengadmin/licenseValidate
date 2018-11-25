package com.fyqz;

//客户端
public class licenseVerifyTest {
	public static void main(String[] args){
		VerifyLicense vLicense = new VerifyLicense();
		//获取参数
		vLicense.setParam("./param.properties");
		//生成证书
		vLicense.verify();
		//卸载
		//vLicense.uninstallLic();
	}
}
