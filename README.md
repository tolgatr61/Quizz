# Quizz
    Quizz en réseau de 10 manches via Java. Projet personnel.

# Règles
    30 secondes par question. Pour le moment, les réponses doivent avoir un orthographe précis, majuscule y compris.
    Les points sont générés en fonction du thème et de la difficulté de la question.

# Ajoutez vos propres thèmes.
    Déposez dans le répertoire XML vos thèmes en suivant le modèle du fichier StructXML (10 questions maximum). (directory : "src/parsing/XML").

# Prérequis :
    Java SDK.

# Execution :
    Dans un terminal :
    javac -d "build/classes" src/view/*.java
    java -cp "build/classes" src.view.View

    ou exeVue.bat
    ou java -jar dist/jar/Vue.jar

    # Prérequis Ant :
        ou ant compile puis ant run.

    Jeu en réseau :
        Executer exeServer.bat sur une machine.
        Executer exeClient.bat sur les machines qui veulent jouer.
        (En cours de développement ...)
