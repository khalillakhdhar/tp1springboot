package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Device;
import com.example.demo.model.Input;
import com.example.demo.model.Output;

@RestController
public class DefautController {
@GetMapping("device")
public String getDevices()
{
Device d=new Device(1, "toshiba", "toshiba satelite i7", 1800);

return d.toString();

}
@GetMapping("input")
public String getInputs()
{
Input inp=new Input(12, "usb","usb device", 1,64);
return inp.toString();
}
@GetMapping("output")
public String getOutput()
{
Output outer=new Output(3, "ecran LCD","ecran samsung LCD", 400,"FHD");
return outer.toString();
}
}
