package br.com.capolupo.consultorioAPI.repository

import br.com.capolupo.consultorioAPI.entity.Paciente
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PacienteRepository : MongoRepository<Paciente, String>{
    fun findByIdade(idade: Int)                  : List<Paciente>
    fun findByNomeContaining(nome: String)       : List<Paciente>
    fun findByCPF(cpf: String)                   : Paciente
}