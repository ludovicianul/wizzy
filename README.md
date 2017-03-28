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

# notice
Wizzair tends to update their API version quite often. If you get a 503 when calling the service you probably need to update the endpoint URL in ```application.properties```.

In order to get email notificaftion you need to enter the SMTP connection details in ```application.properties```. In order to get notified you need to enter a valid email address in the ```notify.to``` property.
