/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devices;

/**
 *
 * @author User
 */
public class TV implements RemoteControl{
    boolean power;
    int volume;
    int prevVolume;
    
    TV(){}
    
    @Override
    public void powerOnOff(){
        power = !power;
    }
    
    @Override
    public void volumeUp(){
        if(power){
            volume = prevVolume;
            volume++;
            volume = Math.min(volume, maxVolume);
            prevVolume = volume;
        }
    }
    
    @Override
    public void volumeDown(){
        if(power){
            volume = prevVolume;
            volume--;
            volume = Math.max(volume, minVolume);
            prevVolume = volume;
        }    
    }
    
    @Override
    public void mute(){     
        prevVolume = volume;
        volume = minVolume;        
    }
    
    @Override
    public String toString(){
        if(!power){
            return "TV is off";
        }
        else{
            return "TV volume = " + volume;
        }
    }
}
