# soapproject
1. I use VS code to create a maven spring boot project with two dependencies : 
spring-boot-starter-web , spring-boot-starter-web-services

2. put wsdl document in our project in the path: ...src\main\resources\wsdl( after gics deplyment on your server you can see this document in the url like "http://serverIP:8080/gics/gicsService?wsdl"   

3. add this plugin to generate stubs (please look pom.xml) :

<plugin>
				<groupId>org.jvnet.jaxb2.maven2</groupId>
				<artifactId>maven-jaxb2-plugin</artifactId>
				<version>0.15.1</version>
				<executions>
					<execution>
						<goals>
							<goal>generate</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<generatePackage>consumesoap.soapclient.stubs</generatePackage>
                    <generateDirectory>${project.basedir}/src/main/java</generateDirectory>
					<schemaDirectory>${project.basedir}/src/main/resources/wsdl</schemaDirectory>
					<schemaIncludes>
						<include>*.wsdl</include>
					</schemaIncludes>
				</configuration>
			</plugin>

also these : 

<dependency>
			<groupId>com.sun.xml.bind</groupId>
			<artifactId>jaxb-core</artifactId>
			<version>2.3.0.1</version>
		</dependency>
		 
		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.1</version>
		</dependency>
		 
		<dependency>
			<groupId>com.sun.xml.bind</groupId>
			<artifactId>jaxb-impl</artifactId>
			<version>2.3.1</version>
		</dependency>
		  
		<dependency>
			<groupId>org.javassist</groupId>
			<artifactId>javassist</artifactId>
			<version>3.25.0-GA</version>
		</dependency>
    
    
    4. for every service we should create class, config and controller files , I put one service "getDomain" .
    we should be careful about class difinition according to each gics service's input arguments and type of output and use them in it's controller . 
    for example: the type of "getDomain" output is "DomainDTO" 
