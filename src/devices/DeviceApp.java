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
public class DeviceApp {
    public static void main(String[] arg){
        
        TV tv = new TV();
        tv.powerOnOff();
        System.out.println(tv);
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.volumeDown();
        System.out.println(tv);
        
    }
}
