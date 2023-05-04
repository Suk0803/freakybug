----

marp : true
class : invert
paginate : false
title : freakybug#01

----

# <!--fit--><span style="color:#FFA07A;">Freaky Bug Public Class #00</span>

---

# <span style="color:#FFA07A;">Index</span>

- LoadMap
- Basic Of Java

---

# <span style="color:#FFA07A;">LoadMap</span>

---

## 2023년 1학기

- 자바
  - 자바 기초
  - 문자열 처리
  - 객체지향 프로그래밍 기초
  - 고급 객체지향 프로그래밍
  - 예외 처리
  - ~~자바 입출력(I/O) 및 파일 처리~~

---

- 컴퓨터 과학
  - 컴퓨터 내부의 언어체계
  - 전자 회로의 조합논리
  - 메모리와 디스크의 핵심
  - 컴퓨터 내부구조

---

### 2023년 2학기

- 자바
  - 자바 입출력(I/O) 및 파일 처리
  - 자바 컬랙션 프레임워크
  - 멀티스레딩 및 동시성
  - 네트워크 프로그래밍
  - 데이터 베이스 연동 (JDBC)
  - ~~고급 자바 주제~~

---

- 컴퓨터 과학
  - 입출력과 네트워킹
  - 데이터 구조와 처리
  - 프로그래밍 언어처리
  - ~~웹브라우저~~

---

### 2024년 1학기

- None

### 2024년 2학기

- None

---

# <span style="color:#FFA07A;">Basic Of Java</span>

---

### <span style="color:#FFA07A;">변수와 자료형</span>

변수란?
많은 사람들이 하는 이야기를 들어보면 변수를 단순히 데이터를 담는 상자 정도로 설명을 하지만,
명확하게 이야기 하자면 변수란 데이터를 조작하기 위한 기본적인 단계 라고 이해하는것이 옳다.

즉 Data Handling 을 위한 기초적인 단계 인 것이다.

---

자바에서의 변수에 저장되는 자료형에는

1. 기본 자료형 (Primitive Data Type)
2. 참조 자료형(Reference Data Type)

이 있다.

---

### <span style="color:#FFA07A;">기본 자료형 (Primitive Data Type)</span>

\
정수형 데이터 타입

```
byte : 8bit = 1byte : -128 ~ 127

short : 16bit = 2byte : -32,768 ~ 32,767

int : 32bit = 4byte : -2,147,483,648 ~ 2,147,483,647

long : 64bit = 8byte : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
```

---

실수형 데이터 타입

```
float : 32bit = 4byte : 1.4E-45 ~ 3.4028235E38, 음수 포함

double : 64bit = 8byte : 4.9E-324 ~ 1.7976931348623157E308, 음수 포함
```

\
문자형 데이터 타입

```
char (character) : 16 비트크기의 유니코드 문자를 저장할 수 있다.
string : 16 비트크기의 유니코드 문자열을 저장할 수 있다.
```

\
논리형 데이터 타입

```
boolean : 옳은가? 틀렸는가? true/false 1/0
```

---

### <span style="color:#FFA07A;">참조 자료형(Reference Data Type)</span>

\
클래스 : 객체의 참조(메모리 주소)를 저장한다.
\
사용자 정의 클래스, 인터페이스, 배열

- 사용자가 정의한 클래스 + 자바에서 제공하는 클래스
- 인터페이스 : 사용자가 정의한 자료형
- 배열 : [1, 2, 3, 4, 5]

---

### <span style="color:#FFA07A;">자료의 형의 변환</span>

암시적 변환 : 자바가 자동으로 수행하는 형 변환
작은것에서 큰것으로 의 변환

명시적 변환 : 사용자가 수동으로 수행하는 형 변환
큰것에서 작은것으로 의 변환
