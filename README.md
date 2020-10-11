<p align="center"><img src="static/logo.png" height="230"></p>




Homeflow DataTime
=====

Homeflow DataTime (HDT) es una liberia de fechas que usa Date y Calendar con Kotlin para la automatización de operaciones con fechas, construido para la empresa Homeflow Technologies y asociados.

  - Obtener periodicidades.
  - Generar Planes de Pagos.
  - Rangos de fechas.

Instalación
--------
usa Gradle:

```gradle
repositories {
  maven { url 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.HomeflowTechnologies:hf-datetime:1.0.0-alpha02'
}
```

Usa Maven:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```
Agrega la dependencia:

```xml
<dependency>
  <groupId>com.github.HomeflowTechnologies</groupId>
  <artifactId>hf-datetime</artifactId>
  <version>1.0.0-alpha02</version>
</dependency>
```

Como uso Homeflow DataTime?
-------------------

Los casos de uso simples se verán así:

Cobranzas
```java
HFCobranzas.getStartEndDate(2, 7)
HFCobranzas.getPaymenPlan(2, 7)
```

Fechas
```java
HFDate.addDays(8)
HFDate.addMonth(8)
```
