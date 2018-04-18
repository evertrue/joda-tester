# Joda Time Tester

This is the most simple of applications and it was hacked together in 10 minutes. It is a utility that tries to use a given format to parse a given date using the JODA time libraries for Java. 

I use this to test patterns used for the logstash date filter.

# Usage

Remember to surround your format and timestamp in quotes otherwise things will get real wierd and we don't want that.

```
$ java -jar target/joda-tester-0.0.1-SNAPSHOT.one-jar.jar "yyyyMMdd" "20150412"
2015-04-12T00:00:00.000-04:00

$ java -jar target/joda-tester-0.0.1-SNAPSHOT.one-jar.jar "yyyy-MM-dd HH:mm:ss.SSSS" "2015-04-12 12:34:45.8484"
2015-04-12T12:34:45.848-04:00

$ java -jar target/joda-tester-0.0.1-SNAPSHOT.one-jar.jar "yyyy-MM-dd HH:mm:ss.SSSS" "2015-04-12 12:34:45"
Invalid format: "2015-04-12 12:34:45" is too short
```

_pst_ you can add `alias joda="java -jar /full/path/to/oda-tester-0.0.1-SNAPSHOT.one-jar.jar"` to your `.bash_profile` to use this program like so:  `joda "yyyyMMdd" "20150412"`


# Authors

Eddie Hurtig <eddie.hurtig@evertrue.com>
