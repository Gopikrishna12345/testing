set projectLocation=C:\Users\ASUS\eclipse-workspace\Batch008
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml