package com.ahgora.ah03;

import java.util.HashMap;

public class ah03api {

    HashMap<String, String> cadastro_funcionario(String matricula, String codEmpresa) {
        HashMap<String, String> responseError = new HashMap<String, String>();
        responseError.put("error", true);
        responseError.put("matricula", matricula);
        responseError.put("res", "Ops! Sua digital não ficou muito boa.");

        HashMap<String, String> responseSuccess = new HashMap<String, String>();
        responseSuccess.put("error", false);
        responseSuccess.put("matricula", matricula);
        responseSuccess.put("res", "Cadastro de João feito com sucesso!");

        if (matricula == null || codEmpresa == null) {
            return responseError;
        }

        return responseSuccess;
    }
}
