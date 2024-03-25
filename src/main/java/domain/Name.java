package domain;

public class Name {
    private static final String NAME_LENGTH_UNDER_FIVE = "이름은 5자 이하만 가능합니다.";
    private static final String NAME_SHOULD_EXIST = "이름은 입력되어야 합니다.";

    private final String name;

    public Name(final String name){
        validate(name); //유효성 검사
        this.name=name;
    }

    //유효성 검사
    private void validate(final String name){
        if (name == null || name.isEmpty()){ //name이 없으면
            throw new IllegalArgumentException(NAME_SHOULD_EXIST);
        }
        if (name.length()>5){//name 길이가 5초과
            throw new IllegalArgumentException(NAME_LENGTH_UNDER_FIVE);
        }
    }
    public String getName(){ //외부에서 클래스 객체 이름 확인 가능
        return name;
    }

}
