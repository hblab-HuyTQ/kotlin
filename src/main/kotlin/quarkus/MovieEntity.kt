package quarkus

import jakarta.persistence.*
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotEmpty


@Entity
@Table(name = "movies")
class MovieEntity {

    @Id
    @GeneratedValue
    var id: Long? = null;

    @Column(name = "title")
    @NotEmpty
    lateinit var title: String

    @Column(name = "year")
    @Min(1800)
    @Max(2200)
    var year: Int = 1800
}
