package projetorestcomjakartaegradle.model;

import java.io.Serializable;
import java.util.Set;

public class SistemaGrupoDeUsuarios implements Serializable {
    private Set<SistemaUsuario> usuarios;

    public SistemaGrupoDeUsuarios() {
    }

    public SistemaGrupoDeUsuarios(Set<SistemaUsuario> usuarios) {
        this.usuarios = usuarios;
    }

	public Set<SistemaUsuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<SistemaUsuario> usuarios) {
		this.usuarios = usuarios;
	}

    
}
