package com.walmart.gtsconnect.serviceImpl;

import com.walmart.gtsconnect.dto.GtsConnectInterviewRecordDTO;
import com.walmart.gtsconnect.service.GtsConnectService;
import org.springframework.stereotype.Service;

@Service("GtsServiceImpl")
public class GtsConnectServiceImpl implements GtsConnectService {

    @Override
    public String insertInterviewCanadidate(GtsConnectInterviewRecordDTO candidateDetails) throws Exception {
        return "Welcome " + candidateDetails.getFullName() + " GTS Connect service success!!";
    }

}
