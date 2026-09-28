# 🏛 2026-2 백엔드실무프로젝트 튜터링

본 저장소는 전공 동아리 **EL**에서 진행하는 **2026학년도 2학기 전공 튜터링** 중  
**백엔드실무프로젝트** 과목의 실습 코드를 관리하는 공간입니다.

---

## 👥 멘토 및 멘티 소개

| 역할 | 이름 | GitHub |
| :--- | :--- | :--- |
| **Mentor** | **최정규** | [**@JeongGyul**](https://github.com/JeongGyul) |
| Mentee | 박다윗 | [@DavidPark04](https://github.com/DavidPark04) |
| Mentee | 마성혁 | [@neonunu](https://github.com/neonunu) |
| Mentee | 이채린 | [@Chae102](https://github.com/Chae102) |

---

## 🌲 브랜치 규칙
- **브랜치 명**: `week00_이름(영어)`
- 매 주차 새로운 실습을 진행할 때마다 해당 주차 브랜치를 생성하여 작업합니다.
- **예시**: `week01_JeongGyu`, `week02_JeongGyu`

## 📂 폴더 구조
- 본인 **이름(영어)** 폴더 내부에 프로젝트를 생성합니다.
- 해당 프로젝트에서 실습을 진행해주시면 됩니다.
```
├── JeongGyu (본인 이름)
│   └── BackendProject (프로젝트 폴더)
│       ├── src
│       ├── build.gradle
│       └── ...
├── README.md
```

## ✅ Pull Request 규칙
- **PR 제목**: `[week0n] 이름 n주차 실습`
- **내용**: 튜터링 및 실습 진행 간에 느낀 점 한마디
<img width="1425" height="811" alt="PR 작성 예시" src="https://github.com/user-attachments/assets/297682d2-854b-49d9-af5a-a08f7d00d0d5" />


### 👥 Reviewer & Assignee
- **Reviewer**: `JeongGyul` (튜터 지정)
- **Assignee**: 본인(작성자) 지정

📍 **Merge 규칙**: 튜터의 코드 리뷰가 완료된 후, **튜터가 최종 Merge** 합니다.
개별 Merge는 진행하지 않습니다.

---

## ✅ 커밋 메시지 규칙
모든 커밋은 아래의 타입을 준수하여 작성해 주세요.  
`ex) feat: 회원가입 API 구현`

| 타입      | 설명 |
|-----------|------|
| feat      | 새로운 기능 추가 |
| fix       | 버그 수정 |
| docs      | 문서 수정 (README, 주석 등) |
| style     | 코드 스타일 변경 (포맷, 세미콜론 등) |
| refactor  | 리팩토링 (기능 변화 없음) |
| test      | 테스트 코드 추가 / 수정 |
| chore     | 빌드 설정, 패키지 관리 등 기타 작업 |
| build     | 빌드 관련 파일 수정 |
| revert    | 이전 커밋 되돌리기 |

---

## 🛠 환경 설정 (Standard)
- **IDE**: IntelliJ IDEA Ultimate
- **JDK**: Java 17 버전 이상
- **Framework**: Spring Boot 3.x (Embedded Tomcat)
- **Build Tool**: Gradle (Groovy DSL)
- **DB**: MySQL 8.0