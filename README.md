# java-racingcar

view 패키지

    Inputview 클래스와
    OutputView 클래스로
    입력과 출력을 관리하는 패키지

domain 패키지

    기본적으로 전체 게임을 관리하는 RacingGame 클래스,
    자동차들을 관리하는 Cars 클래스,
    자동차 하나의 객체를 관리하는 Car 클래스,
    자동차 하나마다 이름과 위치를 갖는데
    carName 클래스와 carPosition 클래스로 이름과 위치를 관리,
    게임을 시작 하고 몇번 움직일지 입력받는데
    그 횟수를 관리하는 Count 클래스,
    전진할 때 조건을 거칠 랜덤 숫자를 생성하는
    NumberGenerator 클래스.1.

controller 패키지

    RacingcarController 클래스로
    전체 domain 패키지와 View 패키지를
    중개하는 패키지
