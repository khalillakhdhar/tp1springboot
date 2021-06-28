package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Device;
import com.example.demo.model.Input;
import com.example.demo.model.Output;

@RestController
public class DefautController {
	@GetMapping("")
	public ModelAndView homepage()
	{
		ModelAndView page=new ModelAndView("device.html");
		return page;
		
		
	}
@GetMapping("device")
public String getDevices()
{
Device d=new Device(1, "toshiba", "toshiba satelite i7", 1800);

return d.toString();

}
@PostMapping("device")
public String adddevice(@RequestParam String name,int id)
{
return "le nom de votre device est: "+name+" et le id: "+id;	
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
