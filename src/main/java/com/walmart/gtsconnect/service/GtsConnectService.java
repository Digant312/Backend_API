package com.walmart.gtsconnect.service;

import com.walmart.gtsconnect.dto.GtsConnectInterviewRecordDTO;

public interface GtsConnectService {
    public String insertInterviewCanadidate (GtsConnectInterviewRecordDTO candidateDetails) throws Exception;
}
