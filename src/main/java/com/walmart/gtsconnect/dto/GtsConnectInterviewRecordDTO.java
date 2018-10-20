package com.walmart.gtsconnect.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GtsConnectInterviewRecordDTO {

    @JsonProperty("govtIdNbr")
    private String govtIdNbr;

    @JsonProperty ("fullName")
    private String fullName;

    @JsonProperty ("contactNbr")
    private String contactNbr;

    @JsonProperty ("badgeNbr")
    private String badgeNbr;

    @JsonProperty ("toMeet")
    private String toMeet;

    @JsonProperty ("purpose")
    private String purpose;

    @JsonProperty ("remarks")
    private String remarks;

    @Override
    public String toString() {
        return "GtsConnectInterviewRecordDTO{" +
                "govtIdNbr='" + govtIdNbr + '\'' +
                ", fullName='" + fullName + '\'' +
                ", contactNbr='" + contactNbr + '\'' +
                ", badgeNbr='" + badgeNbr + '\'' +
                ", toMeet='" + toMeet + '\'' +
                ", purpose='" + purpose + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public String getGovtIdNbr() {
        return govtIdNbr;
    }

    public void setGovtIdNbr(String govtIdNbr) {
        this.govtIdNbr = govtIdNbr;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactNbr() {
        return contactNbr;
    }

    public void setContactNbr(String contactNbr) {
        this.contactNbr = contactNbr;
    }

    public String getBadgeNbr() {
        return badgeNbr;
    }

    public void setBadgeNbr(String badgeNbr) {
        this.badgeNbr = badgeNbr;
    }

    public String getToMeet() {
        return toMeet;
    }

    public void setToMeet(String toMeet) {
        this.toMeet = toMeet;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
