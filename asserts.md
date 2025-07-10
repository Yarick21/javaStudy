### Библиотеки для проверок
1. junit.Assertions [Документация](https://docs.junit.org/current/user-guide/#overview)
2. assertj
3. Mockito

### Fixtures
В тестах удобно выделять логические блоки внутри функции через фикстуру. 
```
//region Given
 ...
//endregion
``` 
Всё, что между `//region` & `//endregion` можно будет свернуть для лаконичного отображения.  
```
    @Test
    public void arrayListTest() {
        //region Given
        Integer expectedInt = 15;
        var sumOfEl = listInt
                .stream()
                .reduce((a, b) -> a + b)
                .get();
        //endregion
        
        //region Assert
        assertAll(
                () -> assertTrue(listInt.contains(1)),
                () -> Assertions.assertEquals(expectedInt, sumOfEl)
        );
        //endregion
    }
```