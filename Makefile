default:
	javac -cp . Main.java 

run:
	java -cp . Main 


clean:
	$(RM) *.class
	$(RM) familiar/*.class
	$(RM) carro/*.class
