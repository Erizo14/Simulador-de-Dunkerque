**Simulador de Evacuación de Dunkerque**

- Este es un simulador en Java que representa la evacuación de soldados desde la playa de Dunkerque durante la Segunda Guerra Mundial. 
- El programa utiliza hilos para simular grupos de lanchas y botes salvavidas que recogen soldados de la playa y los llevan a un barco para su evacuación.
- Hay dos tipos de botes: lanchas y botes salvavidas, cada uno con capacidades diferentes.
- Cada bote recoge soldados de la playa y los lleva al barco para su evacuación.
- La simulación dura 6 días (24,000 milisegundos por día).
- Los grupos de lanchas y botes salvavidas tienen prioridades diferentes.

**Instrucciones de Uso**

1 - Clona el repositorio en tu máquina local:

2 -Abre el proyecto en tu entorno de desarrollo preferido (por ejemplo, Eclipse, IntelliJ).

3 - Ejecuta la clase Main para iniciar la simulación.

Al finalizar la simulación, se mostrarán estadísticas sobre la cantidad de soldados salvados y los que quedaron en la playa.

**Estructura del Proyecto**

El proyecto está organizado en cuatro clases:

Barco:

Maneja el desembarco de soldados desde lanchas y botes salvavidas.
Mantiene un contador de soldados evacuados.

Bote:

Representa un grupo de lanchas o botes salvavidas.
Se encarga de recoger soldados de la playa y desembarcarlos en el barco.

Contador:

Controla el tiempo de combate y muestra mensajes periódicos.

Main:

Clase principal que inicia el simulador.
Crea instancias de barco, playa, grupos de lanchas y botes salvavidas, y el contador.
Asigna prioridades a los hilos y los inicia.
Imprime resultados al finalizar la simulación.
