package com.service;

public interface ServicioSeguridad {
	boolean isAuthenticated();
    void autoLogin(String username, String password);
}
