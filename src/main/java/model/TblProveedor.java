package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_proveedor database table.
 * 
 */
@Entity
@Table(name="tbl_proveedor")
@NamedQuery(name="TblProveedor.findAll", query="SELECT t FROM TblProveedor t")
public class TblProveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproveedor;

	private String direccion;

	private String email;

	@Column(name="NOMBRE_COMERCIAL")
	private String nombreComercial;

	private String razonsocial;

	private String ruc;

	private String telefono;

	public TblProveedor() {
	}

	public int getIdproveedor() {
		return this.idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreComercial() {
		return this.nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getRazonsocial() {
		return this.razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}