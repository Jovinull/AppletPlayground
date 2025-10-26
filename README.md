# Java Applets – Exemplos Didáticos (JDK 8)

> **Compatibilidade**: estes exemplos **somente funcionam no JDK 8** porque `Applet`/`AppletViewer` foram removidos das versões modernas do Java. Este repositório foi implementado e testado com **OpenJDK 8 Temurin (Adoptium)**.

## Conteúdo

Exercícios simples para praticar Java Applet:

* `MyApplet` – desenha uma linha com `g.drawLine(...)`
* **Applet 02** – retângulo (`drawRect`), círculo/oval (`drawOval`) e arco básico
* **Applet 03** – `fillRect` (retângulo preenchido), `setBackground(...)` e rounded rectangle
* **Applet 04** – `drawRoundRect`/`fillRoundRect` e `drawOval`/`fillOval` (coordenadas variadas)
* **Applet 05** – `drawArc` (arcos) e noções de ângulo inicial/varredura
* **Applet 06** – polígonos com `drawPolygon(int[] x, int[] y, int nPoints)`

Cada arquivo contém, no topo, um **comentário HTML** com a tag `<applet ...>` para facilitar a execução via `appletviewer`.

---

## Pré‑requisitos

* **Java 8 (Temurin/Adoptium)** instalado
* `JAVA_HOME` apontando para o JDK 8 e `java`/`javac` no `PATH`

### Verificando a versão

```bash
java -version
# Deve exibir algo como: "openjdk version \"1.8.0_xxx\" (Temurin)"
```

> Dica (Windows): se você tiver múltiplas JDKs instaladas, garanta que a do **Java 8** esteja primeiro no `PATH` ou use o caminho absoluto do `javac/java` do JDK 8 ao compilar/rodar.

---

## Estrutura sugerida do projeto

```
.
├─ src/
│  ├─ MyApplet.java
│  ├─ Applet02.java
│  ├─ Applet03.java
│  ├─ Applet04.java
│  ├─ Applet05.java
│  └─ Applet06_Polygon.java
└─ README.md
```

> **Sobre `package`:** Para evitar problemas de rota/nome qualificado em exercícios iniciais, os exemplos podem **não** declarar `package`. Se você usar `package`, ajuste o atributo `code` do `<applet>` e o `classpath` adequadamente (veja **Erros comuns**).

---

## Como compilar e executar

Você pode usar o **`appletviewer`** (presente no JDK 8) apontando para o **.java** que contém o comentário HTML com a tag `<applet>`.

### Windows (PowerShell/CMD)

```powershell
# 1) Entre na pasta do projeto
cd D:\workspace\AppletPlayground

# 2) Compile (gera .class ao lado do .java)
javac .\src\MyApplet.java

# 3) Execute com o appletviewer (lendo a tag <applet> do comentário HTML)
appletviewer .\src\MyApplet.java
```

### Linux/macOS (bash)

```bash
# 1) Entrar na pasta do projeto
cd ~/AppletPlayground

# 2) Compilar
javac ./src/MyApplet.java

# 3) Rodar com appletviewer
appletviewer ./src/MyApplet.java
```

> Se você optar por **organizar com `package`** (ex.: `package src;`), compile com saída no diretório raiz para respeitar a estrutura de pacotes:
>
> ```bash
> javac -d . ./src/MyApplet.java
> appletviewer ./src/MyApplet.java
> ```

---

## Exemplo do comentário HTML

Coloque no topo do seu `.java` (dentro de um comentário de bloco `/* ... */`):

```java
/*
<applet code="MyApplet" width="200" height="100"></applet>
*/
```

* Se **não** usar `package`, `code="MyApplet"` é suficiente.
* Se **usar `package`** (ex.: `package src;`), duas opções que costumam funcionar no `appletviewer`:

  * `code="src.MyApplet"` **e** compilar com `-d .` na raiz do projeto (para criar a pasta `src/` com o `.class`).
  * ou `code="src/MyApplet.class"` com `codebase` adequado. Ex.:

    ```html
    <applet codebase="." code="src/MyApplet.class" width="200" height="100"></applet>
    ```

> **Nota:** `appletviewer` é flexível ao ler o comentário HTML dentro do `.java`, mas **navegadores modernos não executam applets**. Use sempre o `appletviewer` do JDK 8.

---

## Dicas de coordenadas e desenho

* As coordenadas `(x, y)` são relativas ao **canto superior esquerdo**.
* `drawRect(x, y, w, h)` desenha o contorno; `fillRect(...)` preenche.
* `drawRoundRect(x, y, w, h, arcW, arcH)` controla a curvatura dos cantos.
* `drawOval(x, y, w, h)` desenha dentro da caixa delimitadora `w × h`.
* `drawArc(x, y, w, h, startAngle, arcAngle)` usa ângulos em graus; positivo = sentido anti‑horário.
* Para polígonos, garanta que `x.length == y.length == nPoints`.

---

## Erros comuns e soluções

* **`ClassNotFoundException: ...` ao rodar `appletviewer`:**

  * Verifique o atributo `code` do `<applet>`
  * Confira se o `.class` foi gerado e está na **estrutura de pastas** correta (especialmente se usar `package`).
  * Se usar pacote, **compile com `-d .`** a partir da raiz do projeto.

* **`appletviewer` não encontrado:**

  * Confirme que você usa **JDK 8**, não apenas JRE.
  * Cheque `JAVA_HOME` e `PATH`.

* **Várias JDKs instaladas (Windows):**

  * Coloque o `bin` do **JDK 8** antes no `PATH`, ou use o caminho completo:

    ```powershell
    "C:\Program Files\Eclipse Adoptium\jdk-8.0.x_hotspot\bin\javac.exe" .\src\MyApplet.java
    "C:\Program Files\Eclipse Adoptium\jdk-8.0.x_hotspot\bin\appletviewer.exe" .\src\MyApplet.java
    ```

---

## FAQ

**Por que não funciona no Java 11+?**
Porque `Applet` e o `appletviewer` foram descontinuados/removidos. Use **Java 8**.

**Posso abrir no navegador?**
Não nos navegadores modernos. Use o `appletviewer` do JDK 8.

**Posso usar VS Code?**
Sim. Compile/execute pelo terminal integrado apontando para o JDK 8. Se necessário, configure a extensão de Java para usar o JDK 8 nas **Settings**.