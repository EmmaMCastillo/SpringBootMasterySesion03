package com.tdx.sesion3.controller;

import com.tdx.sesion3.dto.RespuestaApi;
import com.tdx.sesion3.dto.RespuestaEmpleadoDTO;
import com.tdx.sesion3.dto.SolicitudEmpleadoDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/empleados")
public class ControladorEmpleado {

    @PostMapping
    public ResponseEntity<RespuestaApi<RespuestaEmpleadoDTO>> crearEmpleado (@Valid @RequestBody SolicitudEmpleadoDTO solicitudEmpleadoDTO)
    {
        RespuestaEmpleadoDTO respuestaEmpleadoDTO = new RespuestaEmpleadoDTO();
        respuestaEmpleadoDTO.setId(1L);
        respuestaEmpleadoDTO.setNombre(solicitudEmpleadoDTO.getNombre());
        respuestaEmpleadoDTO.setApellido(solicitudEmpleadoDTO.getApellido());
        respuestaEmpleadoDTO.setCorreo(solicitudEmpleadoDTO.getCorreo());
        respuestaEmpleadoDTO.setNombreDepartamento(solicitudEmpleadoDTO.getNombreDepartamento());
        RespuestaApi<RespuestaEmpleadoDTO> respuestaApi = new RespuestaApi<>("EXITO", respuestaEmpleadoDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body(respuestaApi);
    }
}
