#### 2.1

Utwórz klasę `Program` zawierającą metodę `main`.

Utwórz klasę `Employee` z polami składowymi: `firstname`, `lastname` oraz `age`.

#### 2.2

Do klasy `Employee` dodaj metodę `print` wypisującą na ekranie pracownika wg szablonu:

`Jan Kowalski 31`

Jakiego typu powinna to być metoda: instancyjna czy statyczna?

Zweryfikuj poprawność działania metody: w metodzie `main` stwórz obiekt klasy `Employee`,
ustaw wartości pól a następnie wypisz przy pomocy nowo powstałej metody jego zawartość.

#### 2.3

Do klasy `Employee` dodaj metodę `read`, której zadaniem jest utworzenie i zaczytanie obiektu klasy `Employee`:

```
Podaj imię:      Jan
Podaj nazwisko:  Kowalski
Podaj wiek:      31
```

Jakiego typu powinna to być metoda: instancyjna czy statyczna?

Zweryfikuj działanie metody wykorzystując wcześniej utworzoną metodę `print`.

#### 2.4

Wszystkie pola klasy `Employee` oznacz jako prywatne (`private`).

W głównym programie, bez wykorzystania metody `read`, utwórz obiekt klasy `Employee` oraz zainicjalizuj jego pola wartościami: `Jan` `Kowalski` `31`.

Wprowadź niezbędne modyfikacje umożliwiające wykonanie powyższego zadania.

#### 2.5

Utwórz klasę `Company` posiadającą prywatne pole `employees` typu `ArrayList<Employee>`.

Do klasy `Company` dodaj metodę `add` przyjmującą jako argument obiekt klasy `Employee` i dodającą go do listy pracowników (`employees`).

Kiedy należy zainicjalizować pole `employees`?

Jakiego typu powinna być metoda `add`: instancyjna czy statyczna?


W części głównej programu utwórz instancję klasy `Company` oraz dodaj do niej pracownika przy pomocy metody `add`.

#### 2.6

Do klasy `Company` dodaj bezargumentową metodę `printEmployees` wypisującą listę wszystkich pracowników w formacie:

```
------------------
1  Jan Kowalski 31
2  Anna Kowalczyk 27
3  Piotr Nowak 36
------------------
```

Jakiego typu powinna to być metoda: statyczna czy instancyjna?

W głównej części programu przetestuj działanie metody `printEmployees` wykorzystując listę przedstawioną powyżej.

#### 2.7

Rozszerz metodę `add` klasy `Company` o sprawdzenie czy pracownik o takim imieniu, nazwisku i wieku znajduje się już na liście.
W tym celu klasę `Employee` rozszerz o metodę `isEqual` przyjmującą jako argument inny obiekt klasy `Employee` i zwracającą
informację czy obiekty posiadają takie same pola (`boolean`).

Jeśli taki sam pracownik znajduje się już na liście powininen zostać wypisany odpowiedni komunikat a pracownik nie powinien zostać ponownie dodany.

`Pracownik o tych samych danych znajduje się już na liście!`

#### 2.8

Do klasy `Company` dodaj bezargumentową metodę `add`, która samodzielnie zaczyta a następnie doda do listy pracownika.

Metoda powinna również niepozwalać na ponownie dodanie takiego samego pracownika.

Jakiego typu powinna to być metoda: statyczna czy instancyjna?

#### 2.9

Do klasy `Company` dodaj metodę `removeEmployee` usuwającą pracownika z listy. Jako argument metoda powinna przyjmować numer porządkowy
widoczny przed każdą osobą na liście wszystkich pracowników.

Jeśli wprowadzony został niepoprawny numer aplikacja powinna wyświetlić stosowny komunikat:

`Lista nie zawiera pracownika o podanym numerze porządkowym.`

#### 2.10

W głównej części programu utwórz następujące menu:

```
Lista operacji:

1 - wypisz listę pracowników
2 - dodaj pracownika
3 - usuń pracownika
9 - zakończ program

Podaj numer operacji:
``` 

Każda z operacji powinna zostać odpowiednio obsłużona i mieć odzwierciedlenie w stanie
wcześniej utworzonego obiektu klasy `Company`.

Po wybraniu operacji nr 3 program powinien poprosić o numer pracownika:

`Podaj numer pracownika do usunięcia:`

W przypadku podania niepoprawnego numeru powinien zostać wyświetlony odpowiedni komunikat:

`Operacja o podanym numerze nie istnieje!`

Menu powinno być wyświetlane ponownie po wykonaniu jakiejkolwiek operacji innej niż zakończenie programu,
również w przypadku wprowadzenia nieprawidłowego numeru operacji.


#### 2.11

Zdefiniuj nowy typ wyliczeniowy `Sex` (płeć) mogący przyjmować jedną z dwóch wartości: `FEMALE` (żeńska) oraz `MALE` (męska). Do klasy `Employee` dodaj nowe pole `sex` typu `Sex`. Metodę `read` klasy `Employee` poszerz o zaczytanie płci
pracownika w postaci:

```
Podaj płeć:      K
```

Aplikacja powinna zaczytać płeć jako `String`, jeśli pierwszym znakiem jest `K` lub `k` powinna ustawić płeć na `FEMALE` w przeciwnym wypadku `MALE`. Metoda `print` klasy `Employee` powinna zostać rozszerzona o wypisanie płci przy użyciu liter `K` / `M`, jak poniżej:

```
Anna Kowalczyk 27 K
Jan Kowalski 31 M
```

Dokonaj pozostałych zmian niezbędnych do zrealizowania powyższych wymagań.

#### 2.12

Rozszerz klasę `Employee` o dodatkowe pole `salary` typu `int`.
Zaktualizuj metody `read` i `print` klasy `Employee` oraz inne niezbędne miejsca w aplikacji.

```
Podaj zarobki:   3000
```

```
Anna Kowalczyk 27 K 3000zł
Jan Kowalski 31 M 2800zł
```

#### 2.13

Rozszerz klasę `Employee` o dodatkowe pole `skills` typu `String[]`.
Zaktualizuj metodę `read` i `print` klasy `Employee` oraz inne niezbędne miejsca w aplikacji.

```
Podaj umiejętności: Java, SQL,     HTML,CSS   
```

```
Anna Kowalczyk 27 K 3000zł [Java, SQL, HTML, CSS]
Jan Kowalski 31 M 2800zł [C#, JS]
```

W celu zaczytania całej linii wykorzystaj metodę `nextLine` klasy `Scanner`.
Aby podzielić ciąg znaków na fragmenty (tablicę łańcuchów) wykorzystaj metodę `split` klasy `String`.
Odwrotną operację można przeprowadzić za pomocą statycznej metody `join` klasy `String`.
Metoda `trim` pozwala na usunięcie spacji z początku i końca łańcucha znaków.


#### 2.14

Klasę `Employee` oznacz jako abstrakcyjną `abstract`.

Utwórz dwie nowe klasy rozszerzające klasę `Employee`: `Developer` i `Manager`.

Przekształć menu programu do postaci:

```
Lista operacji:

1 - wypisz listę pracowników
2 - dodaj programistę
3 - dodaj kierownika
4 - usuń pracownika
9 - zakończ program

Podaj numer operacji:
```

#### 2.15

Zaktualizuj metodę wypisującą pracownika (`print`) o przedrostek `P` dla programisty (`Developer`) oraz
`K` dla kierownika (`Manager`)

```
K Anna Kowalczyk 27 K 3000zł [Scrum]
P Jan Kowalski 31 M 2800zł [C#, JS]
```

#### 2.16

Rozszerz klasę `Manager` o dodatkowe pole `teamSize` typu `int`.
Zaktualizuj metodę `read` i `print` klasy `Manager` oraz inne niezbędne miejsca w aplikacji.

```
Podaj rozm. zespołu: 5
```

```
K Anna Kowalczyk 27 K 3000zł [Scrum] 5
P Jan Kowalski 31 M 2800zł [C#, JS]
```

#### 2.17

Do klasy `Employee` dodaj abstrakcyjną metodę `getTotalSalary` zwracającą całkowite wynagrodzenie pracownika (`int`).
Zaimplementuj metodę `getTotalSalary` w klasach `Developer` i `Manager` zgodnie z poniższymi wymaganiami:

- całkowite wynagrodzenie programisty powinno uwzględniać bonus za znajomość technologi - 2% (kwoty podstawowej) za
  każdą technologię

- całkowite wynagrodzenie kierownika powinno zawierać bonus za wielkość zespołu którym kieruje - 5% (kwoty podstawowej)
  za każde 5 osób w zespole.

Zaktualizuj metodę `print` aby wypisywała całkowite wynagrodzenie zamiast podstawowego.

#### 2.18

Utwórz klasę `ConsoleLogger` implementującą dwie metody: `info` oraz `error`.
Każda z metod jako parametr powinna przyjmować tekst do wypisania.

Metody powinny wypisywać do konsoli zadany tekst w formacie:

```
INFO : mój log
ERROR: mój log
```
gdzie `mój log` to podany tekst.


Klasę `Company` rozszerz o prywatne pole `logger` typu `ConsoleLogger`.

Rozszerz konstruktor klasy `Company` o możliwość zainicjalizowania pola `logger`,
dokonaj niezbędnych poprawek w pozostałej części programu.


Rozszerz metodę `addEmployee` klasy `Company` o dodanie loga w przypadku poprawnego dodania pracownika:

```
INFO: Pracownik dodany (K Anna Kowalczyk 27 K 3000zł [Scrum] 5)
```

oraz w przypadku powtórzenia danych:

```
ERROR: Próba dodania pracownika o tych samych danych: K Anna Kowalczyk 27 K 3000zł [Scrum] 5
```

Rozszerz metodę `removeEmployee` klasy `Company` o dodanie loga w przypadku poprawnego usunięcia pracownika:

```
INFO: Pracownik usunięty (K Anna Kowalczyk 27 K 3000zł [Scrum] 5)
```

oraz w przypadku nie odnalezienia pracownika o podanym numerze:

```
ERROR: Próba usunięcia pracownika o niepoprawnym numerze porządkowym: 6
```

#### 2.19

Utwórz klasę `FileLogger` implementującą metody: `info` i `error`. Klasa powinna zawierać prywatne pole `writer`
typu `PrintWriter`. Konstruktor klasy `FileLogger` powinien przyjąć następującą postać:

```
public FileLogger(String fileName) {
    try {
        FileOutputStream fileStream = new FileOutputStream(fileName, true);
        this.writer = new PrintWriter(fileStream, true);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

Klasa `PrintWriter` posiada metodę `printf`. Metody `info` i `error`, za pomocą obiektu `writer`, powinny zapisywać logi
w postaci:

```
[27-02-2021 10:00:00] INFO : mój log
[27-02-2021 10:01:00] ERROR: mój log
```

W celu uzyskania aktualnego czasu należy utworzyć instancję klasy `Date`:

```
Date now = new Date();
```

Do sformatowania daty można wykorzystać klasę `SimpleDateFormat`:

```
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
String dateTimeString = simpleDateFormat.format(now);
```

W klasie `Company` zamień typ pola `logger` na `FileLogger`.
Utwórz i przekaż do klasy `Company` instancję klasy `FileLogger` zapisującą logi do pliku `company-log.txt`

Przetestuj działanie programu.

#### 2.20

Klasa `Company` powinna pozwalać na współpracę z dowolnym typem klasy zapisującym logi.
W tym celu zaprojektuj i zdefiniuj nowy interfejs `Logger`, pozwalający na taką współpracę.

Nowy interfejs powinien być implementowany przez klasy: `ConsoleLogger` oraz `FileLogger`.
Pole `logger` klasy `Company` powinno przyjąć typ `Logger`.

#### 2.21

Zmodyfikuj klasę `FileLogger` aby pozwalała na wybór poziomu logowania.
W tym celu dodaj do konstruktora dwa parametry typu `boolean`: `logInfo` i `logError`.
Ustawienie flagi na true oznacza włączenie odpowiedniego poziomu logowania.

#### 2.22

Wymagane jest skonfigurowanie logowania w taki sposób aby wszyskie logi poziomu `info` trafiały do pliku: `company-info-log.txt`,
natomiast wszystkie logi poziomu `error` do pliku: `company-error-log.txt`.
Dodatkowo wszystkie logi powinny trafiać również na konsolę.

Zaprojektuj klasę `MultiLogger` implementującą interfejs `Logger` i przyjmującą jako argument konstruktora tablicę obiektów typu `Logger`.
Implementacja metod `info` i `error` powinna polegać na wykonaniu korespondującej metody na przesłanych uprzednio obiektach typu `Logger`, klasa ta powinna pełnić jedynię rolę pośrednika.