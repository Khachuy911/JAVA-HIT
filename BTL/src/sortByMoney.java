
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khac Huy
 */
public class sortByMoney implements Comparator<Film>{

    @Override
    public int compare(Film f, Film f1) {
        return (int) (f.getPrice() - f1.getPrice());
    }
    
}
