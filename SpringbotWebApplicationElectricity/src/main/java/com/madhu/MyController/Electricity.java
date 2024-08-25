package com.madhu.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class Electricity {
	@RequestMapping("/")
	public String myelectricityFrom()
	{
		return "electricity";
	}
	@RequestMapping("/req1")
	public String myelectricityData(@RequestParam int id,@RequestParam String name,@RequestParam int creading,@RequestParam int preading, ModelMap model)
	{
		 double units = creading-preading;
		double totalbill=0.0;
		if(units<300)
		{
			totalbill=units*1.75;
		}
		else if(units>=300 && units<500)
		{
			totalbill=units*3.25;
		}
		else
		{
			totalbill=units*7.25;
		
		}
	    model.put("id", id);
		model.put("Name", name);
		model.put("creading", creading);
		model.put("preading", preading);
		model.put("units", units);
		model.put("totalbill", totalbill);
		
		return "result";
		}
	
	}

