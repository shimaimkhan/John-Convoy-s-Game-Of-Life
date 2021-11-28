/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameControls;
import State.State;
/**
 *
 * @author Shurahbeel Ahmad
 */
public interface DBInterface {
    
    public State loadState();
    public void save_in_File(State state);
    public void delete_recent_state(state_name);
    public void view_states();
    
    
    
}
