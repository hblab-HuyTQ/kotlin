package quarkus

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped


@ApplicationScoped
class MovieRepository: PanacheRepository<MovieEntity> {

    fun findByTitle(title: String) = find("title", title).firstResult()
    fun findByYear(year: String) = find("year", year).list()
}
