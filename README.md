Checkout project 
 
```bash 
https://github.com/pyavchik/trueAutomationParallelGRID.git
```

Install TrueAutomation Client
https://trueautomation.io/docs/#/install-client

Run command to initialize your project

```bash
trueautomation init
```

TO LAUNCH GRID HUB

```bash
java -jar environment/selenium-server-standalone-3.13.0.jar -role hub 
```

TO LAUNCH GRID NODE

```bash
java -jar environment/selenium-server-standalone-3.13.0.jar -role node -hub http://localhost:4444/grid/register -port 5556 
```

TO RUN TEST 

```bash
mvn clean test
```