# SpringBootLoggerExamples

Examples of customizable loggers with Spring Boot. This repo implements Log4j2, Logback as well as Lombok using Log4j2/Slf4j annotations.

<br>
<br>

`/log4j2`
- Implements `log4j2`'s configuration through .yml format under `/src/main/resources`.
- Paths
  - `/`: Root path
  - `/log`: Generates logging through log4j2 - this writes to both a rolling file and console output.

`/log4j2-lombok`
- Implements logging through Lombok, which lets us use Annotations instead of adding an instance of a logger within code. Configuration file is in .xml format under `src/main/resources`.
- Paths
  - `/`: Root path
  - `/log4j`: Outputs logging directly from Log4j2 using the `@Log4j2` Lombok Annotation to a rolling file and console output.
  - `/slf4j`: Outputs logging with Slf4j using the `@Slf4j` Lombok Annotation to a rolling file and console output.

`/logback`
- Implements `logback`'s configuration through .yml format under `/src/main/resources`.
- Paths
  - `/`: Root path
  - `/logback`: Generates logging through logback - this writes to both a rolling file and console output.
