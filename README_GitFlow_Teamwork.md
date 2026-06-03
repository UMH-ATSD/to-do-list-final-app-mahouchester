# TO DO LIST APP - MAHOUCHESTER.

### Nuestro equipo.
- Jhener Albarado Mamani.
- Jaume Climent ....
- James Brown ...
- Mykhailo ...


## DockerHub Image

The Docker image for this project has been published to DockerHub.

**DockerHub image:**

jamesbobbrown/todolist-mahouchester:1.3.0-snapshot

## To download the image, run:

docker pull jamesbobbrown/todolist-mahouchester:1.3.0-snapshot

## To test the image with the Postgres profile and a custom database host, run:

docker run --rm jamesbobbrown/todolist-mahouchester:1.3.0-snapshot --spring.profiles.active=postgres --POSTGRES_HOST=host-prueba

## This command is expected to fail with an UnknownHostException because host-prueba does not exist. This confirms that the Docker image correctly accepts runtime parameters and loads the Postgres profile.