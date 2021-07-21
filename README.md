## Aplikacja / zadanie: github-user-information

Aplikacja github-user-information z informacjami o uzytkownikach GitHub.

- Struktura odpowiedzi serwisu w formacie JSON:
	+ Identyfikator
	+ Login
	+ Nazwa
	+ Typ
	+ Url do avatara
	+ Data stworzenia
	+ Obliczenia


### Endpoint do serwisu REST:

```
http://localhost:8080/users/{login}
```

### Endpoint do bazy H2

```
http://localhost:8080/h2-console/
```