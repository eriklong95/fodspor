./gradlew :agent:shadowJar
javac example/Example.java
java -javaagent:agent/build/libs/agent-all.jar example.Example
