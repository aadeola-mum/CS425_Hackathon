/**
 * 
 */
package mum.edu.cs.cs425.demowebapps.eregistrar.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author miu
 *
 */
@Entity(name="products")
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"productNumber"})})
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	 
	@NotBlank(message = "Supplier Number required")
	@Column(nullable = false, unique = true)
	private String productNumber;
	

	@NotBlank(message = "Product Name required")
	@Column(nullable = false)
	private String name;
	
	@NotNull(message = "Quantity required")
	@Column(nullable = false)
	private long quantityInStock;
	
	@NotNull(message = "Unit Price required")
	@Column(nullable = false)
	private double unitPrice;
	
	 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	private LocalDate dateSupplied;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Supplier supplier;
	
	public Product() {
		
	}

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * @return the productNumber
	 */
	public String getProductNumber() {
		return productNumber;
	}

	/**
	 * @param productNumber the productNumber to set
	 */
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
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
	 * @return the quantityInStock
	 */
	public long getQuantityInStock() {
		return quantityInStock;
	}

	/**
	 * @param quantityInStock the quantityInStock to set
	 */
	public void setQuantityInStock(long quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the dateSupplied
	 */
	public LocalDate getDateSupplied() {
		return dateSupplied;
	}

	/**
	 * @param dateSupplied the dateSupplied to set
	 */
	public void setDateSupplied(LocalDate dateSupplied) {
		this.dateSupplied = dateSupplied;
	}

	/**
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return String.format(
				"Product [productId=%s, productNumber=%s, name=%s, quantityInStock=%s, unitPrice=%s, dateSupplied=%s, supplier=%s]",
				productId, productNumber, name, quantityInStock, unitPrice, dateSupplied, supplier);
	}
	
	
	
	

}
