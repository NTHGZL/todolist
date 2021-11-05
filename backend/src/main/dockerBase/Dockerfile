# L'instruction FROM initialise une nouvelle étape de construction et définit l'image de base pour les instructions suivantes.
# En tant que tel, un Dockerfile valide doit commencer par une instruction FROM.
FROM openjdk:17-jdk-alpine

# L'instruction WORKDIR définit le répertoire de travail pour toutes les instructions RUN, CMD, ENTRYPOINT, COPY et ADD qui le suivent dans le Dockerfile.
WORKDIR app

# L'instruction COPY copie les nouveaux fichiers ou répertoires de <src> et les ajoute au système de fichiers du conteneur au chemin <dest>.
COPY ./build/libs/todolist-0.0.1-SNAPSHOT.jar ./

# Un ENTRYPOINT vous permet de configurer un conteneur qui s'exécutera en tant qu'exécutable.
ENTRYPOINT ["java", "-jar", "todolist-0.0.1-SNAPSHOT.jar"]