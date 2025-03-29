package com.desafio.Contato.Contato.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record ContatoDTO(

        @NotBlank(message = "O nome não pode estar em branco.")
        String nome,

        @NotBlank(message = "O email é obrigatório.")
        @Email(message = "O email deve ser válido.")
        String email,

        @NotBlank(message = "O número de telefone é obrigatório.")
        @Pattern(
                regexp = "\\d{11}",
                message = "O número de telefone deve conter 11 dígitos (ex: DDD + número)."
        )
        String telefone
) {}
