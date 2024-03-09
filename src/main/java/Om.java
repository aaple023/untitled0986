public class Om {

   /* <build>

    <!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-gpg-plugin -->
    <dependency>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-gpg-plugin</artifactId>
      <version>3.1.0</version>

    <!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin -->
    <dependency>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-surefire-plugin</artifactId>
      <version>3.1.0</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-dependency-plugin -->
    <dependency>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-dependency-plugin</artifactId>
      <version>3.6.1</version>
    </dependency>
  <pluginManagement>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.1.0</version>
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
      </plugin>

    </plugins>

  </pluginManagement>


    <profiles>
    <profile>
      <id>TestNg</id>
      <build>
      <pluginManagement>
      <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.1.0</version>
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>suite/testNg.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
      </plugin>
      </plugins>
      </pluginManagement>
      </build>

    </profile>
    <profile>
      <id>error</id>
      <build>
        <pluginManagement>
          <plugins>
            <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-surefire-plugin</artifactId>
              <version>3.1.0</version>
              <configuration>
                <suiteXmlFiles>
                  <suiteXmlFile>suite/error.xml</suiteXmlFile>
                </suiteXmlFiles>
              </configuration>
            </plugin>
          </plugins>
        </pluginManagement>
      </build>
    </profile>
  </profiles>
<build>
  <plugin*/
}
