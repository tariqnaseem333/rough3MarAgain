package com.infy.service;

import com.infy.dao.CandidateDAO;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;

public class CandidateService {

	// can have result as 'P' only if all 3 marks are 50 and above
	public String addCandidate(Candidate candidate) {
		if( ( candidate.getMark1() < 50 || candidate.getMark2() < 50
			|| candidate.getMark3() < 50 ) && candidate.getResult().equals('P')) {
			return  "Result should be 'F' (Fail) if student scores less than 50 in any one subject";
		} else {
			CandidateDAO candidateDAO = new CandidateDAO();
			return candidateDAO.addCandidate(candidate);
		}
	}

	// calculating grade for candidate based on his marks and result
	public String calculateGrade(CandidateReport candidateReportTO) {
		if( candidateReportTO.getResult().equals('F') ) {
			return "NA";
		}
		else {
			int average = ( candidateReportTO.getMark1() + candidateReportTO.getMark2() + candidateReportTO.getMark3() ) / 3;
			if( average >= 85 ) {
				return "A";
			}
			else if( average >= 75 && average < 85 ) {
				return "B";
			}
			else {
				return "C";
			}
		}
	}

	// populating String[] by calling calculateGrade(candidateReportTO) and returning the same.
	public String[] getGradesForAllCandidates() {
		CandidateDAO candidateDAO = new CandidateDAO();
		CandidateReport[] candidateReports = candidateDAO.getAllCandidates();
		String[] gradesForAllCandidates = new String[candidateReports.length];
		for( int i = 0; i < candidateReports.length; i++ ) {
			gradesForAllCandidates[i] = candidateReports[i].getCandidateId() + this.calculateGrade(candidateReports[i]);
		}
		return gradesForAllCandidates;
	}
}
