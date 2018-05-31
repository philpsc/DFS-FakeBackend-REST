Stand: 31.05.18

-----------------------------------------------------------
Installation:

1. https://tomcat.apache.org/download-70.cgi
Apache Tomcat 7 hier runterladen, und zwar die Core Distribution. (64-bit Windows zip für Windows)
2. Entpacken
3. RUNNING.txt folgen um den Server zu starten (Java-Umgebungsvariable setzen, Kommandos zum starten/stoppen)
4. dfs.war in den Ordner wo Apache Tomcat liegt /webapps legen
5. probieren und sagen ob es geht

------------------------------------------------------------
Pfadstruktur: 
ip:8080/dfs/webapi/users/{userId}/images/{imageId}/thumbnail
						  /metadata

------------------------------------------------------------
Implementierte Requests:

GET: 	/users : Gibt alle Nutzer mit allen Images und allen Details zurück
	/users/{userId}/images: Gibt alle Images vom gewählten User zurück
	/users/{userId}/images/{imageId}: Gibt ein gewähltes Image zurück
	/users/{userId}/images/{imageId}/thumbnail: Gibt Thumbnail zu einem gewählten Image zurück
	/users/{userId}/images/{imageId}/metadata: Gibt Metadaten zu einem gewählten Image zurück

POST:	/users/{userId}/images: Nimmt Image in JSON-Format an und speichert es bei den Images des Users. 
				ImageId wird automatisch gesetzt, kann ausgelassen werden.
	
PUT:	/users/{userId}/images/{imageId}: Nimmt Image in JSON-Format an und überschreibt das alte Image mit der gleichen imageId.

------------------------------------------------------------
Bekannte User:
raph, tobi, benni, juli, phil, aude, mario

------------------------------------------------------------
Funktionsweise:
- Bei jedem Programmstart werden o.g. User erstellt
- Jedem User werden 5-15 Images zugewiesen
- Jedes Image besteht aus:
	int imageId
	URL fileImage // Zufälliges Bild von https://picsum.photos/ in Größe 600*400
	URL thumbnail // das gleiche zufällige Bild in Größe 150*100
	Metadata metadata // Hilfsklasse mit 	String owner
						String date
						String location
						String[] tagList
	User user // Hilfsklasse mit 	String userId
					String userName
					String userPw
					List<Image> imageList
- POST/PUT-Requests werden verworfen, wenn das Programm neu gestartet wird. Dann gibt es wieder neue, zufällige Bilder

------------------------------------------------------------
Source code: 
