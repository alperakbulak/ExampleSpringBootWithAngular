package com.aakbulak.util;

/**
 * @author Alper AKBULAK<alper.akbulak@indbilisim.com.tr>
 * @since 0.0.16
 */
public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage(){
        return errorMessage;
    }
}
