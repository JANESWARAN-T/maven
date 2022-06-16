package com.janesh.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.janesh.product.dao.ProductDAO;
import com.janesh.product.dao.ProductDAOImpl;
import com.janesh.product.dto.Product;

/**
 * Servlet implementation class DiplayProductDetailsServlet
 */
public class DiplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDAO dao = new ProductDAOImpl();
		
		Product product = dao.read(Integer.parseInt(request.getParameter("id")));
		PrintWriter out = response.getWriter();
		out.print("Product Details");
		out.print("Product ID"+ product.getId());
		out.print("Product Name"+ product.getPname());
		out.print("Product Description"+ product.getDesp());
		out.print("Product Price"+ product.getPrice());
	}

}
