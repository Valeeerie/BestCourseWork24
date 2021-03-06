package kurs24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Coefficient
 */

@WebServlet(name = "Coefficient", urlPatterns = "/Coefficient")

public class Coefficient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Coefficient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double[] coef = new double[29];
		String filepath = new File("").getCanonicalPath();
		String[] parsfilepath = filepath.split("/");
		int lengthpath = parsfilepath.length;
		String abspath = "";
		for (int i = 0; i < (lengthpath - 1); i++) {
		abspath = abspath + parsfilepath[i] + "/";
		}
		filepath = abspath + "webapps/Calculate/Coef.txt";
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		String line = "";
		for(int i =0; i < 29; i+=1) {
		line = br.readLine();
		coef[i]=Double.parseDouble(line);
		}
		request.setAttribute("tipMebel1", coef[0]);
		request.setAttribute("tipMebel2", coef[1]);
		request.setAttribute("tipMebel3", coef[2]);
		request.setAttribute("tipMebel4", coef[3]);
		request.setAttribute("tipMebel5", coef[4]);
		request.setAttribute("tipMebel6", coef[5]);
		request.setAttribute("tipMebel7", coef[6]);
		request.setAttribute("tipMebel8", coef[7]);
		request.setAttribute("tipMebel9", coef[8]);
		request.setAttribute("tipMebel10", coef[9]);
		request.setAttribute("tipMebel11", coef[10]);
		request.setAttribute("tipMebel12", coef[11]);
		request.setAttribute("tipCloth1", coef[12]);
		request.setAttribute("tipCloth2", coef[13]);
		request.setAttribute("tipCloth3", coef[14]);
		request.setAttribute("tipCloth4", coef[15]);
		request.setAttribute("tipCloth5", coef[16]);
		request.setAttribute("tipCloth6", coef[17]);
		request.setAttribute("tipCloth7", coef[18]);
		request.setAttribute("tipCloth8", coef[19]);
		request.setAttribute("tipCloth9", coef[20]);
		request.setAttribute("tipCloth10", coef[21]);
		request.setAttribute("tipCloth11", coef[22]);
		request.setAttribute("tipCloth12", coef[23]);
		request.setAttribute("tipNap1", coef[24]);
		request.setAttribute("tipNap2", coef[25]);
		request.setAttribute("Delivery1", coef[26]);
		request.setAttribute("Delivery2", coef[27]);
		request.setAttribute("Delivery3", coef[28]);
		request.getRequestDispatcher("/CoefficientJSP.jsp").forward(request, response);
	}

}
