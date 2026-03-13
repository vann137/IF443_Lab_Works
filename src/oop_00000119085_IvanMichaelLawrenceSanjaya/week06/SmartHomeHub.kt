package oop_00000119085_IvanMichaelLawrenceSanjaya.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){
        devices.add(device)
    }

    fun turnOffAllSwitches(){
        for (device in devices){
            if (device is Switchable){
                device.turnOff()
            }
        }
    }
}