# *자동차 경주 게임* 
프리코스 2주차 미션<br>
n대의 자동차가 일정 횟수 동안 전진 또는 멈춤을 수행하며 경주를 하는 게임이다. <br>
한번의 시도마다 '-'문자를 전진 횟수만큼 표시하는 방식으로 결과를 보여주며, 최종적으로 가장 많이 전진한 자동차가 우승한다.

##*입출력*
- *입력* : n개의 자동차 이름, 시도 횟수
- *출력* : 1회당 시도 결과, 최종 우승자

## 기능 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다. 
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다. 
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다. 
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이
하의 값이면 멈춘다. 
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

## 구현 기능 목록 
 1. 문자열 입력받아 자동차 이름 추출
    - 이름은 5자 이하만 가능, 각 이름은 unique한 문자열
    - 위 조건을 만족하지 못한 경우 재입력 받기
 2. 추출한 자동차 이름으로 Car 객체 생성     
 3. 시도 횟수 입력받기
    - 양의 정수가 아닐 경우 재입력 받기
 4. 각 Car 객체 Racing 수행
    - 0~9의 random 값 생성
    - 4 이상일 경우 position 1 증가
 5. Racing 결과 출력
    - position 값만큼 '-' 문자를 표시하는 방식
 6. 시도횟수만큼 4,5 과정 반복
 7. 우승자 출력
    - position 값이 가장 큰 Car 객체가 우승
    - 우승자는 한 명 이상