# Etapa de build
FROM gradle:8.5-jdk17 AS build
WORKDIR /app

# Copia arquivos essenciais do Gradle
COPY build.gradle settings.gradle gradlew gradlew.bat /app/
COPY gradle /app/gradle

# Copia o restante do código fonte
COPY . /app

RUN chmod +x ./gradlew

# Executa o build, ignorando os testes
RUN ./gradlew build -x test

# Etapa de runtime
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copia o .jar gerado
COPY --from=build /app/build/libs/*.jar app.jar

# Expõe a porta
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
