# TO DO LIST APP - MAHOUCHESTER.

### Team
- Jhener Albarado Mamani.
- Jaume Climent ....
- James Brown ...
- Mykhailo ...
---
## Phase 1: Phase 1: Team formation and repository configuration
## Changes:
```
# Files modified
pom.xml
src/main/resources/templates/abbout.html
```
The pom.xml and about.html files have been modified. The project name has been added alongside the team name and its 
SNAPSHOT version; furthermore, the names of the team members have been added to the about.html page.
---
## DockerHub Image

The Docker image for this project has been published to DockerHub.

**DockerHub image:**
```
  jamesbobbrown/todolist-mahouchester:1.3.0-snapshot
```
## To download the image, run:
```aiignore
docker pull jamesbobbrown/todolist-mahouchester:1.3.0-snapshot
```

## To test the image with the Postgres profile and a custom database host, run:
```
docker run --rm jamesbobbrown/todolist-mahouchester:1.3.0-snapshot --spring.profiles.active=postgres --POSTGRES_HOST=host-prueba
```
- This command is expected to fail with an UnknownHostException because host-prueba does not exist. This confirms that the Docker image correctly accepts runtime parameters and loads the Postgres profile.