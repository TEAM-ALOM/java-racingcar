package Domain;

public class Name {
    private final String name;
    public Name(String name){
        validate(name);
        this.name = name;
    }

    //이름 5글자 이하
    //이름 미존재

    public void validate(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("이름이 존재하지 않습니다.");
        }
        if (name.length() > 5) {
            throw new IllegalStateException("이름이 너무 깁니다.");
        }
    }

    public String getName(){
        return name;
    }
}
