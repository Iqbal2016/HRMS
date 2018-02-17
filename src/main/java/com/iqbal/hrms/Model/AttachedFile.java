package com.iqbal.hrms.Model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;  

public class AttachedFile {
	
	private String fileName;
	
	private String  fileType;
	
	private String filePath;
	
	private  List<MultipartFile>   files;
	
	private String id;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
 
	public List<MultipartFile> getFiles() {
		return files;
	}

	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "AttachedFile [fileName=" + fileName + ", fileType=" + fileType + ", filePath=" + filePath + ", files="
				+ files + ", id=" + id + "]";
	}
 
 
}
