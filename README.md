# java-lotto-precourse

# 기능구현사항

# 입력

- [x]  로또 구입 금액을 입력 받는다.
    - [x]  null이 들어오면 예외 처리한다.
    - [x]  blank가 들어오면 예외처리한다.

---

- [ ]  당첨 번호를 입력받는다.
    - [ ]  번호는 쉼표를 통해 구분한다.
    - [ ]  개별 당첨 번호 앞뒤로 공백을 삭제한다 → trim 말고 따른 거 사용하셈
    - [ ]  쉼표로 구분되지 않는다면 예외 처리한다
    - [ ]  null이 들어오면 예외 처리한다.
    - [ ]  blank가 들어오면 예외처리한다.

---

- [ ]  보너스 번호를 입력받는다.
    - [ ]  숫자가 들어오지 않으면 예외처리한다.
    - [ ]  null이 들어오면 예외 처리한다.
    - [ ]  blank가 들어오면 예외처리한다.

# 출력

- [ ]  발행한 로또 수량 및 번호를 출력한다.
    - [ ]  로또 번호는 오름차순으로 정렬하여 보여준다.
- [ ]  당첨 내역을 출력한다.
- [ ]  수익률을 출력한다.
    - [ ]  수익률은 소주점 둘째 자리에서 반올림한다. (ex. 100.0%, 51.5%)

# 당첨번호

- [ ]  당첨 번호들을 갖는다.
- [ ]  들어온 당첨 문자열을 파싱한다
    - [ ]  문자열에 숫자가 포함되어 있지 않다면 예외를 발생한다.
    - [ ]  1-45까지의 숫자가 들어오지 않는다면 예외처리한다.
    - [ ]  당첨번호의 수가 6개가 아니라면 예외처리한다.
- [ ]  보너스번호를 갖는다.
- [ ]  당첨번호를 반환한다.
- [ ]  보너스번호를 반환한다.

# 보너스번호

- [ ]  보너스 번호를 갖는다.
    - [ ]  숫자가 포함되어 있지 않다면 예외를 발생한다.
    - [ ]  1-45까지의 숫자가 들어오지 않는다면 예외처리한다.
- [ ]  같은 값을 지닌 번호는 같다.

# 돈

- [ ]  돈의 값을 지닌다.
    - [ ]  숫자가 아닌값이 들어오면 예외처리한다.
    - [ ]  구입 금액이 1000원으로 나누어 떨어지지 않는 경우 예외 처리한다.
- [ ]  같은 값을 지닌 돈은 같다.
- [ ]  돈을 추가할 수 있다.
- [ ]  돈을 사용할 수 있다.
    - [ ]  자신이 지닌 돈보다 많이 사용하면 예외 처리한다.

# 로또

- [ ]  로또 번호들을 가진다.
    - [ ]  1-45까지의 숫자를 지니지 않으면 예외처리한다.
    - [ ]  로또 번호가 6개가 아니라면 예외처리한다.
- [ ]  당첨여부를 확인한다.

# 나의 로또 구매 내역

- [ ]  구매한 로또 리스트를 가진다.
- [ ]  구매한 로또를 추가할 수 있다.
- [ ]  구매한 로또를 반환할 수 있다.

# 고객

- [ ]  사용할 수 있는 돈을 가진다.
- [ ]  지출한 금액을 가진다.
- [ ]  자신의 로또를 가진다.
- [ ]  로또를 구매할 수 있다.
- [ ]  당첨 내역을 확인할 수 있다.
- [ ]  수익률을 계산할 수 잇다.

# 로또 생성기

- [ ]  로또를 생성할 수 있다.
- [ ]  로또를 생성하기 위한 전략을 가진다.

# 로또 생성전략

- [ ]  1-45까지의 숫자 중 랜덤숫자를 반환한다.

# 판매자

- [ ]  로또 생성기를 가진다.
- [ ]  로또를 판매할 수 있다.
    - [ ]  구입금액이 1000원으로 나누어 떨어지지 않는 경우 예외를 발생한다.

//