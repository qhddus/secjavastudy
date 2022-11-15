package d.generic;

public class GenericSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericSample sample= new GenericSample();
		sample.checkCastingDTO();
		//sample.checkDTO(dto1);
		sample.checkGenericDTO();
	}

	public void checkCastingDTO() {
		CastingDTO dto1= new CastingDTO();
		dto1.setObject(new String());
		
		CastingDTO dto2=new CastingDTO();
		dto2.setObject(new StringBuffer());
		
		CastingDTO dto3=new CastingDTO();
		dto3.setObject(new StringBuilder());
	}
	public void checkDTO(CastingDTO dto) {		//타입확인 스트링빌더인지 스트링버퍼인지
		Object tempObject=dto.getObject();
		if(tempObject instanceof StringBuilder) {
			System.out.println("StringBuilder");
		} else if(tempObject instanceof StringBuffer) {
			System.out.println("StringBuffer");
		}
	}
	public void checkGenericDTO() {
		CastingGenericDTO<String> dto1= new CastingGenericDTO<String>();
		dto1.setObject(new String());
		//String temp1=dto1.getObject(); 로 바꿀수있다.
		CastingGenericDTO<StringBuffer> dto2= new CastingGenericDTO<StringBuffer>();
		dto2.setObject(new StringBuffer());
		//StringBuffer temp2=dto2.getObject();로 바꿀수있다.
		CastingGenericDTO<StringBuilder> dto3= new CastingGenericDTO<StringBuilder>();
		dto3.setObject(new StringBuilder());
		//StringBuilder temp3=dto3.getObject();로 바꿀수있다.
	}
}
