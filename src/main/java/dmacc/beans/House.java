package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class House {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	@Column(name="NUMOFBEDROOMS")
	private int numOfBedrooms;
	/**
	 * @param address
	 * @param numOfBedrooms
	 */
	public House(String address, int numOfBedrooms) {
		super();
		this.address = address;
		this.numOfBedrooms = numOfBedrooms;
	}
	/**
	 * @param address
	 */
	public House(String address) {
		super();
		this.address = address;
	}
	/**
	 * 
	 */
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the numOfBedrooms
	 */
	public int getNumOfBedrooms() {
		return numOfBedrooms;
	}
	/**
	 * @param numOfBedrooms the numOfBedrooms to set
	 */
	public void setNumOfBedrooms(int numOfBedrooms) {
		this.numOfBedrooms = numOfBedrooms;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "House [id=" + id + ", address=" + address + ", numOfBedrooms=" + numOfBedrooms + "]";
	}
	 
	
}
