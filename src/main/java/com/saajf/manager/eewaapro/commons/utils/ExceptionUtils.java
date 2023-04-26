package com.saajf.manager.eewaapro.commons.utils;

import java.util.concurrent.Callable;

public class ExceptionUtils {

    public static <T> T executeWithMethodName(Callable<T> task) throws Exception {
        try {
            return task.call();
        } catch (Exception e) {
            // Obtener el nombre del método actual
            String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
            // Lanzar una nueva excepción con el nombre del método
            throw new Exception("Error en el método [" + methodName + "]", e);
        }
    }
}
