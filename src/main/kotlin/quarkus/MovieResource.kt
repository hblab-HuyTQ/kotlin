package quarkus

import jakarta.enterprise.context.ApplicationScoped
import jakarta.validation.Valid
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType


@Path("/movies")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class MovieResource(
    private val movieService: MovieService
) {

    @GET
    fun getMovies() = movieService.getMovies()

    @GET
    @Path("/{id}")
    fun getMovie(id: Long) = movieService.getMovie(id)

    @POST
    fun createMovie(@Valid movieDto: MovieDTO) = movieService.createMovie(movieDto)
}
