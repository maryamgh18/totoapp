package com.mkyong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.mkyong.model.Report;

public class ReportFieldSetMapper implements FieldSetMapper<Report> {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {

		System.out.println("ReportFieldSetMapper.mapFieldSet");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("fieldSet.readInt(0) = " + fieldSet.readInt(0));
		System.out.println("fieldSet.readBigDecimal(1) = " + fieldSet.readBigDecimal(1));
		System.out.println("fieldSet.readInt(2) = " + fieldSet.readInt(2));
		System.out.println("fieldSet.readString(3) = " + fieldSet.readString(3));
		System.out.println("fieldSet.readString(4) = " + fieldSet.readString(4));

		Report report = new Report();


		report.setId(fieldSet.readInt(0));
		report.setSales(fieldSet.readBigDecimal(1));
		report.setQty(fieldSet.readInt(2));
		report.setStaffName(fieldSet.readString(3));


		String date = fieldSet.readString(4);
		try {
			report.setDate(dateFormat.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
			e.getMessage();
		}

		return report;

	}


}

