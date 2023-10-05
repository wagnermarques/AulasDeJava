package projetorestcomjakartaegradle.model;

import java.io.Serializable;

public class SistemaUsuario implements Serializable {
    private String loginName;

    public SistemaUsuario() {
    }

    public SistemaUsuario(String loginName) {
        this.loginName = loginName;
    }

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

    
}

