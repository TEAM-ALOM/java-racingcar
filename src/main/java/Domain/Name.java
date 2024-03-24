package Domain;

public class Name {    //자동차의 이름 저장
    private final String name;

    public Name(final String name){
        validate(name);
        this.name = name;  //조건에 부합하는 이름을 입력 받았다면 변수에 저장
    }

    private void validate(final String name){  //이름이 조건에 어긋나는지 판별
        if (name == null || name.isEmpty()) {  //이름에 null값이 들어가면 오류 출력
            throw new IllegalArgumentException("[ERROR]");
        }
        if(name.length() > 5){                 //이름은 5자 이하만 가능
            throw new IllegalArgumentException("[ERROR]이름은 5글자까지 가능합니다.");
        }
    }

    public String getName(){
        return name;
    }

}
