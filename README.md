# **Quarkus Device Mock Server**

[![Quarkus](https://img.shields.io/badge/Quarkus-3.18.3-blue.svg)](https://quarkus.io/)  
[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)  
[![GitHub stars](https://img.shields.io/github/stars/evgenyv13/quarkus-device-mock-server?style=social)](https://github.com/evgenyv13/quarkus-device-mock-server)

## **📌 Description**
`quarkus-device-mock-server` is an **example project** demonstrating how to build a **mock server** using **Quarkus**. It exposes a REST API that dynamically generates and returns **mock device data**, making it useful for **testing, API prototyping, and simulating backend responses** without a real database.

## **🚀 Features**
- **REST API (`/devices?amount=5`)** → Returns a list of randomly generated devices.
- **Mock device attributes**:
  - `id` → Unique **UUID**.
  - `deviceOs` → Random OS (`Android`, `iOS`, `Linux`).
  - `serial` → Auto-generated serial number (`SN-XXXXXXX`).
- **Built with Quarkus for high performance and rapid development.**
- **No database required** → Data is generated dynamically.

## **🛠️ Technologies Used**
- **Quarkus** (RESTEasy + Jackson)
- **Java 17**
- **Jakarta CDI (`@ApplicationScoped`, `@Inject`)**
- **Maven**