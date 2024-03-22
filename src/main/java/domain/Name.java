package domain;

public class Name {
    private static final String NO_NAME_EXISTS_MESSAGE = "[ERROR] 이름은 반드시 있어야 합니다.";
    private static final String INVALID_LENGTH_MESSAGE = "[ERROR] 이름은 5글자까지 가능합니다.";

    private final String name; //자동차의 이름

    public Name(final String name){
        validate(name); //이름 유효성 검사
        this.name = name; //유효한 이름이면 name필드에 저장

    }

    //이름의 유효성 검사
    private void validate(final String name){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException(NO_NAME_EXISTS_MESSAGE);
        }
        if (name.length() > 5){
            throw new IllegalArgumentException(INVALID_LENGTH_MESSAGE);
        }
    }
    public String getName(){
        return name;
    }
}
