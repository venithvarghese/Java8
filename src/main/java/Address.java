import java.util.Objects;

public class Address {

	private String street;
	private String postalCode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(postalCode, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(postalCode, other.postalCode) && Objects.equals(street, other.street);
	}
	
	
}
