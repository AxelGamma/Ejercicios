## Problema

Palíndromo más largo
Encuentra la longitud de la subcadena más larga de la cadena dada s que es la misma a la inversa.

Por ejemplo, si la entrada fuera "I like racecars that go fast", la longitud de la subcadena (racecar) sería 7.

Si la longitud de la cadena de entrada es 0, el valor de retorno debe ser 0.

## Ejemplos

ha = female => 1
Ha = male => 1
Haha = male + female => 2
haHa = female + male => 2
hahahahaha = female => 1
hahahahahaHaHaHa = female + male => 2
HaHaHahahaHaHa = male + female + male => 3

## Casos de prueba

    assertEquals(0, Dinglemouse.kookaCounter(""));
    assertEquals(1, Dinglemouse.kookaCounter("hahahahaha"));    
    assertEquals(2, Dinglemouse.kookaCounter("hahahahahaHaHaHa"));    
    assertEquals(3, Dinglemouse.kookaCounter("HaHaHahahaHaHa"));
