package br.com.capolupo.consultorioAPI.controller

import br.com.capolupo.consultorioAPI.entity.Paciente
import br.com.capolupo.consultorioAPI.service.PacienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/paciente")
class PacienteController{

    @Autowired
    lateinit var pacienteService : PacienteService

    @GetMapping
    fun buscarTodos() : List<Paciente>{
        return pacienteService.buscarTodosOsPacientes()
    }
    /*
    oo
    @GetMapping("/find/{paciente}")
    fun buscarPorPlaca(@PathVariable("paciente") placa : String ) : Consultorio {
        return consultorioService.buscarCarroPorPlaca(placa)
    }
    */
    
    @DeleteMapping
    fun excluir(@RequestBody paciente: Paciente){
        pacienteService.excluir(paciente)
    }
    
    @PostMapping
    fun salvar(@RequestBody paciente: Paciente){
        pacienteService.salvar(paciente)
    }
}
