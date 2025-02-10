FROM ubuntu:22.04

RUN apt update
# RUN apt -y install openjdk-17-jdk
RUN apt -y install python3

# test.py 파일을 컨테이너의 /home에 이동시켜라
COPY test.py home
#COPY C:/Users/yegkw/Desktop/test.py /home

# 나의 50000번이랑 너의 80을 연결시켜라
# EXPOSE 50000:80

EXPOSE 8000

CMD ["python", "/home/test.py"]
