# kafka_sample

## 주키퍼, 카프카 실행
### Zookeeper 실행
  - 터미널에서 cmd 실행
  - cd kafka압축해제경로\bin\windows
  - 실행 명령어: `zookeeper-server-start.bat ../../config/zookeeper.properties`
### Kafka 실행
  - 새로운 터미널 cmd 실행
  - 실행 명령어: `kafka-server-start.bat ..\..\config\server.properties`

### 서버실행후 url 주소창에 `localhost:8080/kafka/?message=어쩌구저쩌구`

로그창에 JSON 데이타로 받기

![producer](https://user-images.githubusercontent.com/94466572/167565675-784aca10-daac-4b94-aa14-8f041fc02c16.jpg)

![consumer](https://user-images.githubusercontent.com/94466572/167565686-c54ab7e0-3d59-4754-b51d-0b47a509ff92.jpg)
