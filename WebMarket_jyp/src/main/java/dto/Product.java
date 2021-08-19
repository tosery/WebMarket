package dto;
import java.io.Serializable;
public class Product implements Serializable
{
	private static final long serialVersionUID = -4274700572038677000L;
	
	private String productId;//��ǰ���̵�
	private String pname;//��ǰ��
	private Integer unitPrice;//��ǰ ����
	private String description;//��ǰ ����
	private String manufacturer;// ������
	private String category;//�з�
	private long unitsInStock;//��� ��
	private String condition;//�Ż�ǰ �Ǵ� �߰�ǰ �Ǵ� ���ǰ
	private String filename;
	
	public Product()
	{
		super();
	}
	
	public Product(String productId, String pname, Integer unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}

	public String getProductId() {
		return productId;
	}

	public String getPname() {
		return pname;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public String getCondition() {
		return condition;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
}
