# kafka_sample - 카프카 실행하고 Producer, Consumer 메세지 전달 확인
## 카프카 다운로드
  - https://kafka.apache.org/downloads

## 설치 경로에서
  - `config/server.properties` 파일 메모장에서 열어 설정 변경
    - #listeners=PLAINTEXT://:9092 주석해제
    - 로그 경로 변경
    ```
      ############################# Log Basics #############################

      # A comma separated list of directories under which to store log files
      log.dirs=C:\\kafka_2.12-2.7.0\\logs
    ```
  - `config/zookeeper.properties` 메모장 열어 설정 변경
    - 데이타 경로 변경 
    ```
      # the directory where the snapshot is stored.
      dataDir=data
    ```

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
