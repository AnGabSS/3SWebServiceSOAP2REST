# Etapa de build
FROM gradle:8.5-jdk17 AS build
WORKDIR /app

# Copia apenas arquivos essenciais primeiro para cache
COPY build.gradle.kts settings.gradle.kts gradlew gradlew.bat /app/
COPY gradle /app/gradle

# Baixa dependências antes de copiar o código-fonte
RUN ./gradlew build -x test || return 0

# Agora copia o restante do projeto
COPY . /app

# Build da aplicação
RUN ./gradlew build -x test

# Etapa de runtime
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copia o jar construído
COPY --from=build /app/build/libs/*.jar app.jar

# Expõe a porta usada pela aplicação
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
