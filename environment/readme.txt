TO LAUNCH GRID HUB
    java -jar environment/selenium-server-standalone-3.13.0.jar -role hub
TO LAUNCH GRID NODE
    java -jar environment/selenium-server-standalone-3.13.0.jar -role node -hub http://localhost:4444/grid/register -port 5556