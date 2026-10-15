# Java FX Codes

Small collection of Java / JavaFX example programs and demos used for teaching and experimenting with JavaFX UI concepts (layouts, controls, images, CSS, timers). Useful for students or developers learning JavaFX by exploring runnable demo code organized by chapter and topic.

---

## Stack
- **Languages:** Java (primary), CSS (for styling)
- **Build:** Maven (mvn) with Maven Wrapper included
- **Notable:** modular Java (module-info.java); demos organized under the `champlaincollege.demo` package

## Repository layout
Top-level:

```
.gitignore
mvnw
mvnw.cmd
pom.xml
lib/
src/
temp.dat
```

Key source/resource tree (high level):

```
src/
  main/
    java/
      module-info.java
      champlaincollege/
        demo/
          chapter14/
          chapter15/
          chapter16/
          chapter17/
          chapter31/
          chapter32/
          clockdemo/
          lambda/
          utility/
    resources/
      css/
        mystyle.css
      image/
        (clockdemo.png, course.png, flag.png, img.png, us.gif, usflag.png, whole.png, etc.)
```

### How it fits together
Each demo is a small standalone JavaFX application or example under `champlaincollege.demo.*`. The code is modular (see `module-info.java`) and resources (CSS + images) used by demos live under `src/main/resources`.

The project is built with Maven; the repository includes the Maven Wrapper (`mvnw` / `mvnw.cmd`) so it can be built consistently without requiring a system-wide Maven installation.

## How to build and run

### Prerequisites
- JDK 11 or later (recommended). JavaFX modules are used, so ensure your JDK and JavaFX setup match; using Maven to fetch JavaFX artifacts or an IDE that provides JavaFX support is easiest.

### Build

```bash
# from project root (uses included wrapper)
# Unix/macOS
./mvnw clean package

# Windows (PowerShell/CMD)
mvnw.cmd clean package

# Or with a system Maven
mvn clean package
```

### Run

- From an IDE:
  1. Import the project as a Maven project.
  2. Run any demo class that contains a `public static void main(String[] args)` (look under `src/main/java/champlaincollege/demo/*`).
  3. The demos load CSS from `src/main/resources/css/mystyle.css` and images from `src/main/resources/image/`.

- From the command line (examples):
  - Using Maven Exec plugin (if configured in the pom):
    ```bash
    # replace <DemoMainClass> with a fully qualified class name, e.g. champlaincollege.demo.clockdemo.ClockDemo
    ./mvnw exec:java -Dexec.mainClass="champlaincollege.demo.clockdemo.ClockDemo"
    ```
  - After packaging (if the pom creates an executable jar):
    ```bash
    ./mvnw package
    java -jar target/your-artifact-id-version.jar
    ```

Notes
- If you see module/JavaFX runtime errors, ensure you either:
  - Run via Maven so required JavaFX dependencies are fetched, or
  - Use an SDK/IDE that provides JavaFX on the module path, or
  - Install a JavaFX SDK and add appropriate VM arguments to place JavaFX modules on the module path.

## What’s included / Notable files
- `module-info.java` — the project is modularized.
- `pom.xml` — Maven build file (project dependencies and build plugins).
- `src/main/java/champlaincollege/demo` — several demo packages (chapter-based and topic-based).
- `src/main/resources/css/mystyle.css` — example CSS used by demos.
- `src/main/resources/image` — images used by demos (icons, flags, sample images).
- `mvnw` / `mvnw.cmd` — Maven Wrapper for consistent builds across systems.

## Contributing
- Clone the repo, run and test demos locally.
- Follow the existing package structure when adding new demos (place source in `champlaincollege.demo.*`, assets in `src/main/resources`).
- Open a pull request with a short description of the demo, the Java/JavaFX version used, and any steps to run it if special arguments are needed.

## License
No license file is present in the repository. If you intend this code to be reused publicly, add a `LICENSE` file (for example MIT or Apache-2.0) to clarify reuse terms.

## Contact / Attribution
Author: omidpan (GitHub repository: https://github.com/omidpan/java-fx-codes)
