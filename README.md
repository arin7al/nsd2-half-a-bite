# nsd2-half-a-bite



Clone repo
git clone https://github.com/arin7al/nsd2-half-a-bite.git 

cd nsd2-half-a-bite/


To run backend:
cd backend/

Docker run:
docker build --build-arg JAR_FILE=NSD2-half-a-bite-0.0.1-SNAPSHOT.jar -t NSD2-half-a-bite:0.0.1-SNAPSHOT .

Gradle run:
./gradlew bootJar
./gradlew bootRun

---
Use http://127.0.0.1:8080/swagger-ui/ for swagger UI

Can use remote debug in IDE on port 5005

---
How to start frontend

-- cd frontend/
-- cd my-app/
-- yarn start 

Port: 3000
