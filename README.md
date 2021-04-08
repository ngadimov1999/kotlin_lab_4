# kotlin_lab_4
# PokeAPI AndroidStudioProject

Android проект для получения списка покемонов с помощью PokeAPI.


## Содержание

#### [PokeAPI описание и документация](#pokeapi)
#### [Стек технологий](#ts-desc)
#### [Структура проекта](#structure)


----------

### POKEAPI описание и документация
<a name="pokeapi"></a>
[PokeAPI](https://pokeapi.co/)
RESTful Pokémon API - 
Обслуживание более 60 000 000 вызовов API каждый месяц!

Узнать больше в [документации](https://pokeapi.co/docs/v2)

В данном проекте использовались GET запросы к API:
1) Получение покемона по индексу ```https://pokeapi.co/api/v2/pokemon-form/{id}``` [Открыть пример запроса бульбазавра](https://pokeapi.co/api/v2/pokemon-form/1)
2) Получение список 200 покемонов ```https://pokeapi.co/api/v2/pokemon?limit=200&offset=1``` [Открыть пример запроса](https://pokeapi.co/api/v2/pokemon?limit=200&offset=1)

----------

### Стек технологий
<a name="ts-desc"></a>

 * Android/Kotlin
 * PokeAPI
 * Retrofit 2

----------

### Структура проекта
<a name="structure"></a>
```
kotlin-lab4-master
├─ app
│  ├─ manifests
│  ├─ java
│  │  ├─ com.example.pokeapi
│  │  │  └─ models
│  │  │  │  └─ Pokemon
│  │  │  │  └─ PokemonResponse
│  │  │  └─ ApiService
│  │  │  └─ MainActivity
│  │  │  └─ PokemonAdapter
```
(изменяется)

**Pokemon** - класс для получения одного покемона из запроса

**PokemonResponse** - класс для получения списка покемонов из запроса

**PokemonAdapter** - адаптер для подгрузки данных в RecyclerView

**ApiService** - сервис для api запросов


