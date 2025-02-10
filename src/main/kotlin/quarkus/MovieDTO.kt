package quarkus

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank


data class MovieDTO(
    @field:NotBlank val title: String,
    @field:Min(1800) @field:Max(2200) val year: Int
)
