/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.CarportDimensioner;
import FunctionLayer.LoginSampleException;
import PresentationLayer.Materials;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class DataMapper {

    public static CarportDimensioner ChangeOrder(CarportDimensioner dimension, int OrderID) throws LoginSampleException {
        try {
            Connection l_cCon = Connector.connection();
            String l_sSQL = "";
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return dimension;
    }

    public static List<Materials> CalculateOrder(CarportDimensioner dimension) throws LoginSampleException {
        List<Materials> materials = new ArrayList();
        try {
            Connection l_cCon = Connector.connection();
            String l_sSQL = "";
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return materials;
    }

}
