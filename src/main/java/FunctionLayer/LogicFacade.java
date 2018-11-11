/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;
import DBAccess.DataMapper;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class LogicFacade {

    public static List<Materials> GetMaterials() {
        List<Materials> TotalMaterials = new ArrayList();
        
        return TotalMaterials;
    }

    public static Materials ChangeOrder(int OrderID, Materials materials) throws LoginSampleException {
        materials = DataMapper.ChangeOrder(materials, OrderID);
        throw new LoginSampleException("materials length: " + materials.getLength());
        //return materials;
    }
}
