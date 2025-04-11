# Conversor SOAP para REST - Integração com Web Service 3S

Este projeto tem como objetivo converter chamadas a um Web Service legado baseado em **SOAP** (utilizado pela **3S**) para uma arquitetura **RESTful** moderna. Ele permite que aplicações clientes consumam dados de forma padronizada via HTTP/JSON, sem se preocupar com a complexidade do protocolo SOAP original.

---

## 🧩 Visão Geral

Sistemas legados geralmente utilizam serviços SOAP, que são mais verbosos e complexos. Este conversor encapsula toda essa complexidade e disponibiliza os dados por meio de uma API REST construída com **Spring Boot**, facilitando a integração com sistemas modernos.

---

## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3
- Spring Web (REST)
- Jackson (Serialização JSON)
- Maven
- Web Services SOAP (JAX-WS)
- Docker (opcional para deploy)

---

## 🚀 Funcionalidades

- ✅ Converte respostas de serviços SOAP em endpoints REST
- ✅ Mapeamento de campos usando `@JsonProperty` com nomes compatíveis com o SOAP
- ✅ Tratamento de erros na comunicação com o serviço SOAP
- ✅ Extensível para novos endpoints ou integrações
- ✅ Swagger UI para testes e exploração da API

---

## 📂 Estrutura do Projeto

```
src
├── main
│   ├── java
│   │   └── com.tech.padawan.ServiceSoapToRest
│   │       ├── controller        # Controladores REST
│   │       ├── service           # Lógica de negócio e chamadas SOAP
│   │       ├── parser            # Conversão de resposta JSON para objetos Java
│   │       └── model             # Modelos de dados (DTOs)
│   └── resources
│       └── application.yml       # Configurações do sistema
```

---

## 📥 Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/soap-to-rest-3s.git
   cd soap-to-rest-3s
   ```

2. Compile o projeto:
   ```bash
   mvn clean install
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```


## 🛠️ Exemplo de Endpoint

**GET** `/api/veiculos/{login}/{senha}`

Retorna uma lista de veículos convertidos do serviço SOAP para REST:

```json
[
  {
    "Frota": "0",
    "Placa": "XXX XXXX",
    "Modelo": "SAVEIRO",
    "idEquipamento": "00000000000000",
    "idVeiculo": "00000000000000"
  }
]
```

---

## 📌 Observações

- Certifique-se de que o serviço SOAP da 3S está acessível pela rede.
- Certifique-se com a 3S sobre seu acesso.


---

## 📫 Contato

Desenvolvido por Angelo Gabriel Souza Santana
📧 angelo.gs.santana@outlook.com
