# Laboratory #3. Clients and Servers.

## Running the project

To download the project dependencies the following line must be executed.
```
mvn package
```
Execute this line to see the java documentation.
```
mvn javadoc:jar
```

In order to test the laboratory, each class has a main method that must be run.

#### The laboratory contains 7 exercises. To test each exercise follow the instructions below.

  1. Run simply the main method from exerciseOne class.
  2. Run the exerciseTwo class and enter an url. then, verify the resultado.html file.
  3. The EchoServer class must run first, then EchoClient.
  Afterwards, the program can be tested by opening the EchoClient terminal and entering a number. The EchoClient will receive the number squared.
  4. The EchoServerMath class must run first, then EchoClient.
  After, the program can be tested by opening the EchoClient terminal.
  To enter the type of operation to be performed. For example, fun:tan (tangent), fun:sin (sine), and fun:cos (cosine). The default operation is cosine (fun:cos).
  To know the cosine, sine or tangent of a number, just enter the number.
  5. Run simply the main method from WebServer class and verify the connection to the browser on localhost:3000.
  6. Run the ServerNonConcurrent class and then the EchoClient class.
  7. The DatagramTimeServer class must run first, then DatagramTimeClient.

## Author

Juan Camilo Velandia Botello - Escuela Colombiana de Ingeniería Julio Garavito, Colombia.

## License

This project is under the Apache license - see [LICENSE](LICENSE.md) for more details.
