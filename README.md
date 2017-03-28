# wizzy
Automated price check for Wizzair flights

# build
```bash
mvn clean package
```

# usage
```bash
java -jar wizzy.jar --dateFrom="YYYY-MM-DD" --dateTo="YYYY-MM-DD" --from="AIRPORT_CODE" --to="AIRPORT_CODE" --adults=XXX --childs=XXX
```

Usage example:

```bash
java -jar wizy.jar --dateFrom="2017-04-12" --dateTo="2017-04-15" --from="CLJ" --to="BCN" --adults=2
```
# properties
- dateFrom: standard ISO date format for the departure date
- dateTo: standard ISO Date format for the return date
- from: departure airport code
- to: destination airport code
- adults: number of adults; defaults to 1
- childs: number of children; defaults to 0

# notice
Wizzair tends to update their API version quite often. If you get a 503 when calling the service you probably need to update the endpoint URL in ```application.properties```.

In order to get email notificaftion you need to enter the SMTP connection details in ```application.properties```. In order to get notified you need to enter a valid email address in the ```notify.to``` property.
