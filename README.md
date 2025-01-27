# fodspor

Tracing the steps of a Java app

## How to

Create a far JAR with

```
./gradlew :agent:shadowJar
```

This produces the artifact **agent/build/libs/agent-all.jar**.

Start the Java process you want to monitor with the `-javaagent`
JVM option. For example, if **app.jar** contains your app, do

```
java -javaagent:path/to/agent-all.jar -jar app.jar
```

The agent should now print a message everytime a method is entered.

