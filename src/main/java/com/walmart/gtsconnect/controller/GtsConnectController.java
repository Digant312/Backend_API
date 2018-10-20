package com.walmart.gtsconnect.controller;

import com.walmart.gtsconnect.dto.GtsConnectInterviewRecordDTO;
import com.walmart.gtsconnect.service.GtsConnectService;
import com.walmart.gtsconnect.util.GtsConnectCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GtsConnectController {

    @Autowired
    @Qualifier("GtsServiceImpl")
    GtsConnectService gtsConnectService;

    @RequestMapping(value = {"/", "/home"}, method=RequestMethod.GET)
    public @ResponseBody String home (HttpServletRequest request) throws Exception {
        return "Hello!! This is Succession App Home.";
    }

    @PostMapping(value = "/visitor")
    public @ResponseBody String insertVisitor (HttpServletRequest request) throws Exception {
        return "Success!!";
    }

    @RequestMapping (value = "/interviewCandidate", method=RequestMethod.POST)
    public @ResponseBody String insertInterviewCanadidate (HttpServletRequest request, @RequestBody String candidateDetails) throws Exception {
//        System.out.println("CandidateDetails: " + candidateDetails);
        GtsConnectInterviewRecordDTO interviewRecordDTO = (GtsConnectInterviewRecordDTO) GtsConnectCommonUtil.getObjectForJSON(candidateDetails, GtsConnectInterviewRecordDTO.class);
        System.out.println(interviewRecordDTO.getFullName());
//        return candidateDetails;
        return gtsConnectService.insertInterviewCanadidate(interviewRecordDTO);
    }
}
