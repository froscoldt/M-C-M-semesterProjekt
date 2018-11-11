/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Materials;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Christian
 */
public class UpdateOrder extends Command {

    public UpdateOrder() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int height = Integer.valueOf(request.getParameter("height")) == null ? 0 : Integer.valueOf(request.getParameter("height"));
        int width = Integer.valueOf(request.getParameter("width")) == null ? 0 : Integer.valueOf(request.getParameter("width"));
        int length = Integer.valueOf(request.getParameter("length")) == null ? 0 : Integer.valueOf(request.getParameter("length"));
        int polls = Integer.valueOf(request.getParameter("polls")) == null ? 0 : Integer.valueOf(request.getParameter("polls"));
        int spears = Integer.valueOf(request.getParameter("spears")) == null ? 0 : Integer.valueOf(request.getParameter("spears"));
        Materials materials = new Materials(height, length, width, polls, spears);
        int Order = request.getSession().getAttribute("OrderID") == null ? 0 : (int) request.getSession().getAttribute("OrderID");
        materials = LogicFacade.ChangeOrder(Order, materials);
        return "implement still";
    }

}
