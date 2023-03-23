## Getting Started
Hay una familia de cucaburras en mi patio.

No los veo a todos, ¡pero los oigo!

¿Cuántas cucaburras hay?

Sugerencia
El truco para contar cucaburras es escuchar atentamente

Los machos suenan como HaHaHa...

Las hembras suenan como hahaha...

Y siempre alternan macho/hembra

## Examples

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