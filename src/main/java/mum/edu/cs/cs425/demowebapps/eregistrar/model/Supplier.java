package mum.edu.cs.cs425.demowebapps.eregistrar.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity(name="suppliers")
public class Supplier {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long supplierId;
	
	 
	@NotBlank(message = "Supplier Number required")
	@Column(nullable = false)
	private String supplierNumber;
	

	@NotBlank(message = "Supplier Name required")
	@Column(nullable = false)
	private String name;
	
	 
	@NotBlank(message = "Contact Phone Number required")
	@Column(nullable = false)
	private String contactPhoneNumber;
	
	@OneToMany(mappedBy = "supplier")
	private List<Product> products;

	/**
	 * 
	 */
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the supplierId
	 */
	public Long getSupplierId() {
		return supplierId;
	}

	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	/**
	 * @return the supplierNumber
	 */
	public String getSupplierNumber() {
		return supplierNumber;
	}

	/**
	 * @param supplierNumber the supplierNumber to set
	 */
	public void setSupplierNumber(String supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the contactPhoneNumber
	 */
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	/**
	 * @param contactPhoneNumber the contactPhoneNumber to set
	 */
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return String.format("Supplier [supplierId=%s, supplierNumber=%s, name=%s, contactPhoneNumber=%s]", supplierId,
				supplierNumber, name, contactPhoneNumber);
	}
	
	
}
