package com.ahgora.ah03;

import com.google.gson.Gson;
import java.util.Random;

public class Api {

    public static String cadastroFuncionario(String matricula) {
        final Random random = new Random();
        final Gson gsonResponse = new Gson();

        Response responseError = new Response();
        responseError.setError(true);
        responseError.setMatricula(matricula);

        Response responseSuccess = new Response();
        responseSuccess.setError(false);
        responseSuccess.setMatricula(matricula);
        responseSuccess.setBio("hash da biometria capturada");

        if (random.nextBoolean()) {
            return gsonResponse.toJson(responseSuccess);
        } else {
            return gsonResponse.toJson(responseError);
        }
    }

    public static String batidaFuncionario() {
        final Random random = new Random();
        final Gson gsonResponse = new Gson();

        Response responseError = new Response();
        responseError.setError(true);
        responseError.setMatricula("");

        Response responseSuccess = new Response();
        responseSuccess.setError(false);
        responseSuccess.setMatricula("0101010101");

        if (random.nextBoolean()) {
            return gsonResponse.toJson(responseSuccess);
        } else {
            return gsonResponse.toJson(responseError);
        }
    }

    public static String configura(String id, String bio) {
        final Random random = new Random();
        final Gson gsonResponse = new Gson();

        Response responseError = new Response();
        responseError.setError(true);

        Response responseSuccess = new Response();
        responseSuccess.setError(false);

        if (random.nextBoolean()) {
            return gsonResponse.toJson(responseSuccess);
        } else {
            return gsonResponse.toJson(responseError);
        }
    }
}
