package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudAuto;
import model.TblAuto;

/**
 * Servlet implementation class Controladorauto
 */
public class Controladorauto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controladorauto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		TblAuto tblauto=new TblAuto();
		ClassCrudAuto crudauto=new ClassCrudAuto();
		//RECUPERAMOS EL LISTADO
		List<TblAuto> listado=crudauto.ListarAuto();
		//ENVIAMOS A LA VISTA...
		request.setAttribute("listado",listado);
		//DIRECCIONAMOS
		request.getRequestDispatcher("/ListadoAuto.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
