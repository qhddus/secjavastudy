package f.defaultmethod;

import java.util.Optional;

public class CreateOptionalObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateOptionalObjects coo = new CreateOptionalObjects();
		coo.createOptionalObjects();
		coo.checkOptionalData();
	}
	
	private void createOptionalObjects() {
		Optional<String> emptyString = Optional.empty();
		String common=null;
		Optional<String> nullableString = Optional.ofNullable(common);
		common="common";
		Optional<String> commonString = Optional.of(common);
		System.out.println(commonString);
		System.out.println(emptyString);
		System.out.println(nullableString);
	}
	
	private void checkOptionalData() {
		System.out.println(Optional.of("present").isPresent());
		System.out.println(Optional.ofNullable(null).isPresent());
	}
	

}
