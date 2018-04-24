package br.com.capolupo.consultorioAPI.entity
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Paciente(@Id var id : String?,
                       var nome  : String,
                       //var cPF : String,
                       var idade    : Int,
                       var descricao : String?,
                       var urlImagem : String?
                        ) /*? pode ser nulo*/

