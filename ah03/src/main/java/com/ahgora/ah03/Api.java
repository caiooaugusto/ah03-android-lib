package com.ahgora.ah03;

import java.util.HashMap;

public class Api {

    public static HashMap<String, String> cadastroFuncionario(String matricula, String codEmpresa) {

        final String mat = matricula;

        HashMap<String, String> responseError = new HashMap<String, String>() {
            {
                put("error", "true");
                put("matricula", mat);
                put("res", "Ops! Sua digital não ficou muito boa.");
            }
        };

        HashMap<String, String> responseSuccess = new HashMap<String, String>() {
            {
                put("error", "false");
                put("matricula", mat);
                put("res", "Cadastro realizado com sucesso!");
            }
        };

        if (matricula == null || codEmpresa == null) {
            return responseError;
        }

        return responseSuccess;
    }
}