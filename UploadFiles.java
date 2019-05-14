package Model;

import java.util.Date;

class UploadFiles {
	
	private String upFidInc;
	private Date upFdtInc;
	private String upFname;
	private String upFpath;
	
	public UploadFiles(String login) {
		setUPFDtInc();
		setUPFIdInc(login);
	}
	public UploadFiles() {
		setUPFDtInc();
	}
	public String getUPFIdInc(){
		return upFidInc;
	}
	public void setUPFIdInc(String upFIdInc) {
		if (upFIdInc.trim().length() != 0)
			this.upFidInc = upFIdInc;
	}
	
	public String getUPFDtInc(){
		return upFidInc;
	}
	public void setUPFDtInc() {
		this.upFdtInc = new Date();
	}
	
	public String getUPFName(){
		return upFname;
	}
	public void setUPFName(String upFName) {
		if (upFName.trim().length() != 0)
			this.upFname = upFName;
	}
	
	public String getUPPath(){
		return upFpath;
	}
	public void setUPFPath(String upFPath) {
		if (upFPath.trim().length() != 0)
			this.upFpath = upFPath;
	}
}
