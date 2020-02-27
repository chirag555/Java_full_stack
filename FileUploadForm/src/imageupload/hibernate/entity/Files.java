package imageupload.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name="files")
@Table (name="files")
public class Files {
	@Id
	@Column (name="id")
	int id;
	@Column (name="file_name")
	String fileName;
	@Column (name="label")
	String label;
	@Column (name="caption")
	String caption;
	public Files(String fileName) {
	
		this.fileName = fileName;
	}
	
	public Files(int fileId,String label, String caption,String fileName) {
		this.id=fileId;
		this.label = label;
		this.caption = caption;
		this.fileName=fileName;
	}

	public Files() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	@Override
	public String toString() {
		return "Files [id=" + id + ", fileName=" + fileName + ", label=" + label + ", caption=" + caption + "]";
	}
	
	
}
