# Trabajo Práctico Nº 1: JAVA

**UNPA-UARG**

**Carreras:** Analista de Sistemas y Licenciatura en Sistemas  
**Asignatura:** Programación de Algoritmos  





**Profesores de Práctica:**  
- Lic. Franco Herrera  
- Mg. Fabiana Miranda  

---

## 1. Operaciones de casting

Dadas las siguientes declaraciones de variables:  
```java
int A, B, R1;
double C, D, R2;
```

Dadas las siguientes asignaciones:  
```java
A = 5;
B = 3;
C = 2.5;
D = 2.0;
```

Indicar el resultado de las siguientes operaciones:

| Operación                  | Resultado |
|----------------------------|-----------|
| `R1 = A / B;`              |           |
| `R2 = A / C;`              |           |
| `R2 = A * D;`              |           |
| `R1 = A * (int) D;`        |           |
| `R1 = (int) (C * D);`      |           |
| `R1 = A * (int) D;`        |           |
| `A++;`                     | A = ?     |
| `B = A++;`                 | B = ?  A = ? |

---

## 2. Ejercicio de casting (continuación)

Dadas las siguientes declaraciones de variables:  
```java
int A, B, X;
double C, D, Y;
```

Dadas las siguientes asignaciones:  
```java
A = 5;
B = 3;
C = 7.5;
D = 2.0;
```

**a)** Indicar el valor de `X` e `Y` que resultarán de las siguientes operaciones:

| Operación                                      | Resultado (X o Y) |
|------------------------------------------------|-------------------|
| `X = A / B`                                    |                   |
| `X = (int) (A * D) / (int) (C / A)`            |                   |
| `Y = A / B`                                    |                   |
| `Y = (double) (A / B)`                         |                   |
| `Y = (double) A * D / (int) C`                 |                   |
| `Y = (double) A * D`                           |                   |
| `Y = (double) (A * D) / (C * (int) D)`         |                   |
| `Y = A * (int) D`                              |                   |
| `Y = (int) (A * (int) D)`                      |                   |

---

## 3. Intercambio de valores (Tema: Algoritmo)

Se tienen 3 variables `A`, `B` y `C` enteras. Escribir un algoritmo que intercambie entre sí sus valores, para que queden finalmente de la siguiente forma:

- B y C toman el valor de A.
- A toma el valor original de C.

**Ejemplo:**  
Si A = 1, B = 2, C = 3 → Finalmente: B = 1, C = 1, A = 3.

**Nota:** Sólo se debe utilizar una variable auxiliar.

---

## 4. Encontrar el mayor número (Tema: Selección)

Dado tres números, escribir el mayor de ellos. Asumir que los tres números son distintos.

**Análisis**  
- **Entrada/s:** 3 números (enteros)  
- **Salida/s:** Número mayor de los 3 ingresados (entero)

**Algoritmo (pseudocódigo):**  
```
escribir “Ingrese 3 números enteros”
leer NRO1, NRO2, NRO3
si (NRO1 > NRO2 & NRO1 > NRO3)
    escribir “El mayor es : ”, NRO1
sino
    si (NRO2 > NRO1 & NRO2 > NRO3)
        escribir “El mayor es :”, NRO2
    sino
        escribir “El mayor es :”, NRO3
```

---

## 5. Día de la semana (Tema: Selección)

Ingresar un día de la semana y si se trata de uno de los días de la cátedra resolución escribir “HOY TENGO RESOLUCION”.  

Identificando a los días de la siguiente manera:  
- ‘L’ para Lunes  
- ‘M’ para Martes  
- ‘I’ para Miércoles  
- ‘J’ para Jueves  
- ‘V’ para Viernes  
- ‘S’ para Sábado  
- ‘D’ para Domingo  

Se puede agregar el caso dónde la letra ingresada no sea alguna de las nombradas anteriormente.

---

## 6. Suma y producto de tres números (Tema: Iteración)

Leer tres números enteros dentro de las variables `NUM1`, `NUM2` y `NUM3` respectivamente y calcular e imprimir el producto y la suma de ellos.  

Repetir la operación anterior, pero esta vez, para los tres valores utilizar una sola variable (`NUM`).

**Análisis**  
- **Entrada/s:** 3 números (enteros)  
- **Salida/s:** Producto y suma de los 3 números ingresados

**Algoritmo 1 (con tres variables):**  
```
leer NUM1, NUM2, NUM3
PRODUCTO = NUM1 * NUM2 * NUM3
SUMA = NUM1 + NUM2 + NUM3
escribir “Suma de enteros: ”, SUMA
escribir “Producto de enteros”, PRODUCTO
```

**Algoritmo 2 (con una sola variable):**  
```
PRODUCTO = 1;
SUMA = 0;
CONT = 1;
mientras (CONT <= 3) {
    leer NUM;
    SUMA = SUMA + NUM;
    PRODUCTO = PRODUCTO * NUM;
    CONT = CONT + 1;
}
escribir “Suma de enteros: ”, SUMA;
escribir “Producto de enteros”, PRODUCTO;
```

---

**Nota:** Convertir los pseudocódigos a código Java completo.
