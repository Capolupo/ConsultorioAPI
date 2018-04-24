package br.com.capolupo.consultorioAPI.service

import br.com.capolupo.consultorioAPI.entity.Paciente
import br.com.capolupo.consultorioAPI.repository.PacienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PacienteService{
    @Autowired
    lateinit var pacienteRepository : PacienteRepository

    fun buscarTodosOsPacientes() : List<Paciente>{
        return pacienteRepository.findAll()
    }

/*
    fun buscarPacientePorIdade(idade: Int): List<Paciente>{
        return pacienteRepository.findByIdade(idade)
    }

    fun buscarPacientePorNome(nome: String): List<Paciente>{
        return pacienteRepository.findByNomeContaining(nome)
    }

    fun buscarPacientePorCPF(cpf: String) : Paciente {
        return pacienteRepository.findByCPF(cpf)
    }
*/

    fun salvar(paciente: Paciente){
        pacienteRepository.save(paciente)
    }
}