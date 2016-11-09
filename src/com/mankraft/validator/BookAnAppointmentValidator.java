package com.mankraft.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.mankraft.model.Appointment;

public class BookAnAppointmentValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		// just validate the Customer instances
		return Appointment.class.isAssignableFrom(clazz);

	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientName",
				"required.patientName", "Field name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientMobile",
				"required.patientMobile", "Field name is required.");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientAddress",
				"required.patientAddress", "Field name is required.");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientEmail",
				"required.patientEmail", "Field name is required.");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientGender",
				"required.patientGender", "Field name is required.");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientVisitType",
				"required.patientVisitType", "Field name is required.");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientDiseaseName",
				"required.patientDiseaseName", "Field name is required.");

		/*ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientState",
				"required.patientState", "Field name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientDistrict",
				"required.patientDistrict", "Field name is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "patientCountry",
				"required.patientCountry", "Field name is required.");*/
		
		Appointment appointment = (Appointment)target;
		
		if("NONE".equals(appointment.getPatientCountry())){
			errors.rejectValue("patientCountry", "required.patientCountry");
		}
		if("NONE".equals(appointment.getPatientState())){
			errors.rejectValue("patientState", "required.patientState");
		}
		if("NONE".equals(appointment.getPatientCountry())){
			errors.rejectValue("patientDistrict", "required.patientDistrict");
		}
		
				
	

	}
}
