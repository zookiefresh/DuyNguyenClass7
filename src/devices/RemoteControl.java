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
public interface RemoteControl {
    int maxVolume = 100;
    int minVolume = 0;
    void powerOnOff();
    void volumeUp();
    void volumeDown();
    void mute();
}
