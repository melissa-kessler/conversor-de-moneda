💱 Conversor de Moneda (Java)
Aplicación Java de consola que permite convertir valores entre diferentes monedas en tiempo real, utilizando una API externa y un menú interactivo. Ideal como ejercicio práctico de programación orientada a objetos, manejo de errores y consumo de APIs con Java moderno.

Características
✅ Menú interactivo en consola
🌎 Conversión entre USD, ARS, BRL y COP
🔄 Consumo de ExchangeRate API
⚙️ Estructura modular (POO): Menu, Conversor, Main
🧩 Uso de HttpClient y Gson para peticiones HTTP y parsing de JSON

📂 Estructura del proyecto
conversor-de-moneda/
├── src/
│   ├── Main.java
│   └── conversor/
│       └── modelos/
│           ├── Menu.java
│           └── Conversor.java

📦 Requisitos
- Java 11 o superior (necesario para HttpClient)
- Gson (librería para parsear JSON)
- Clave de API válida de ExchangeRate API
- Conexión a internet

▶️ Cómo compilar y ejecutar
1. Descargar Gson (si no usás Maven/Gradle)
Descargá el .jar desde: https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/
2. Compilar y correr desde terminal
# Compilar (Linux/macOS)
javac -cp ".:gson-2.10.1.jar" src/Main.java src/conversor/modelos/*.java
# Ejecutar
java -cp ".:gson-2.10.1.jar:src" src.Main
En Windows cambiá : por ; en la opción -cp.

🧠 Lógica del programa
- Menú (Menu.java)
Muestra las 6 opciones de conversión.
Valida entrada del usuario.
Permite salir con opción 7.
Pide el valor a convertir y maneja errores con try-catch.
- Conversor (Conversor.java)
Establece la moneda base y destino según la opción.
Llama a la API: https://v6.exchangerate-api.com/v6/api-key/pair/moneda_base/moneda_target/valor
Usa HttpClient para hacer la solicitud.
Usa Gson para extraer el valor de "conversion_result" del JSON.
- Main (Main.java)
Orquesta el flujo entre el menú y el conversor.
Ejecuta la conversión seleccionada por el usuario.


🖼️ Ejemplo de uso

Bienvenido/a al Conversor de Moneda.

Las opciones de conversión son:

1) Dólar -> Peso argentino
2) Peso argentino -> Dólar
3) Dólar -> Real brasileño
4) Real brasileño -> Dólar
5) Dólar -> Peso colombiano
6) Peso colombiano -> Dólar
7) Salir

Ingrese una opción válida: 1
Ingrese el valor a convertir: 100

Resultado: 115617.0

(Junio 2025)
