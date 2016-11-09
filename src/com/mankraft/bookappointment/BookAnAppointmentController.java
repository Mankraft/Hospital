package com.mankraft.bookappointment;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.mankraft.model.Appointment;
import com.mankraft.validator.BookAnAppointmentValidator;

@Controller
@RequestMapping("/appointment.htm")
public class BookAnAppointmentController {

	BookAnAppointmentValidator bookAnAppointmentValidator;

	@Autowired
	public BookAnAppointmentController(
			BookAnAppointmentValidator booAnAppointmentValidator) {
		this.bookAnAppointmentValidator = booAnAppointmentValidator;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(
			@ModelAttribute("appointment") Appointment appointment,
			BindingResult result, SessionStatus status) {
		bookAnAppointmentValidator.validate(appointment, result);

		if (result.hasErrors()) {
			// if validator failed
			return "AppointmentForm";
		} else {
			status.setComplete();
			// form success
			return "AppointmentSuccess";
		}
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initForm(ModelMap model) {

		Appointment appointment = new Appointment();
		// command object
		model.addAttribute("appointment", appointment);

		// return form view
		return "AppointmentForm";
	}

	@ModelAttribute("countryList")
	public Map<String, String> populateCountryList() {

		Map<String, String> country = new LinkedHashMap<String, String>();
		country.put("US", "United Stated");
		country.put("CHINA", "China");
		country.put("SG", "Singapore");
		country.put("MY", "Malaysia");
		country.put("IND", "India");
		country.put("SL", "Srilanka");
		country.put("AUS", "Australia");

		return country;
	}

	@ModelAttribute("stateList")
	public Map<String, String> populateStateList() {

		Map<String, String> state = new LinkedHashMap<String, String>();
		state.put("AP", "Andhra Pradesh");
		state.put("TS", "Telangana");
		state.put("KA", "Karnataka");
		state.put("TL", "Tamilnadu");

		return state;
	}

	@ModelAttribute("districtList")
	public Map<String, String> populateDistrictList() {

		Map<String, String> district = new LinkedHashMap<String, String>();
		district.put("EG", "East Godavari");
		district.put("WG", "West Godavari");
		district.put("CD", "Chittor");
		district.put("KD", "kadapa");
		district.put("Hyd", "Hyderabad");
		district.put("Wrngl", "Warangal");
		district.put("Krng", "Karimnagar");
		district.put("Yddri", "Yadadri");

		return district;

	}

}
