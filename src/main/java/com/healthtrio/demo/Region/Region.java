package com.healthtrio.demo.Region;

import com.google.gson.annotations.SerializedName;
import java.util.List;


/**
 * Region data type class to be used for manipulating the list of Regions that is obtained via the service endpoint.
 * I used Intellij's generate for the getters and setters, so my apologies if the code is not null checked / or there
 * is lacking error handling.  That is something that would have been implemented much more thoroughly if this were to be a
 * customer facing web app.
 *
 */

public class Region {

    public class RegionArray {
        List<Region> region;
    }
    @SerializedName("region")
    private String region;
    @SerializedName("regionCode")
    private String regionCode;
    @SerializedName("period")
    private String period;
    @SerializedName("pct_cah_hospitals_cehrt")
    private  String pct_cah_hospitals_cehrt;
    @SerializedName("pct_critical_access_hospitals_basic_ehr_notes")
    private  String pct_critical_access_hospitals_basic_ehr_notes;
    @SerializedName("pct_critical_access_hospitals_basic_ehr_no_notes")
    private  String pct_critical_access_hospitals_basic_ehr_no_notes;
    @SerializedName("pct_hospitals_basic_ehr_notes")
    private  String pct_hospitals_basic_ehr_notes;
    @SerializedName("pct_hospitals_basic_ehr_no_notes")
    private  String pct_hospitals_basic_ehr_no_notes;
    @SerializedName("pct_hospitals_cehrt")
    private  String pct_hospitals_cehrt;
    @SerializedName("pct_hospitals_find_clinical_info")
    private  String pct_hospitals_find_clinical_info;
    @SerializedName("pct_hospitals_integrate_any_clinical_info")
    private  String pct_hospitals_integrate_any_clinical_info;
    @SerializedName("pct_hospitals_integrate_scr")
    private  String pct_hospitals_integrate_scr;
    @SerializedName("pct_hospitals_patients_ecopy_discharge_instr")
    private  String pct_hospitals_patients_ecopy_discharge_instr;
    @SerializedName("pct_hospitals_patients_ecopy_ehr")
    private  String pct_hospitals_patients_ecopy_ehr;
    @SerializedName("pct_hospitals_patients_secure_message")
    private  String pct_hospitals_patients_secure_message;
    @SerializedName("pct_hospitals_patients_vdt")
    private  String pct_hospitals_patients_vdt;
    @SerializedName("pct_hospitals_receive_clinical_info")
    private  String pct_hospitals_receive_clinical_info;
    @SerializedName("pct_hospitals_send_clinical_info")
    private  String pct_hospitals_send_clinical_info;
    @SerializedName("pct_hospitals_share_care_summaries_any_outside_ambu_provs")
    private  String pct_hospitals_share_care_summaries_any_outside_ambu_provs;
    @SerializedName("pct_hospitals_share_care_summaries_any_outside_hospitals")
    private  String pct_hospitals_share_care_summaries_any_outside_hospitals;
    @SerializedName("pct_hospitals_share_care_summaries_any_outside_provs")
    private  String pct_hospitals_share_care_summaries_any_outside_provs;
    @SerializedName("pct_hospitals_share_labs_any_outside_ambu_provs")
    private  String pct_hospitals_share_labs_any_outside_ambu_provs;
    @SerializedName("pct_hospitals_share_labs_any_outside_hospitals")
    private  String pct_hospitals_share_labs_any_outside_hospitals;
    @SerializedName("pct_hospitals_share_labs_any_outside_provs")
    private  String pct_hospitals_share_labs_any_outside_provs;
    @SerializedName("pct_rural_hospitals_basic_ehr_notes")
    private  String pct_rural_hospitals_basic_ehr_notes;
    @SerializedName("pct_rural_hospitals_basic_ehr_no_notes")
    private  String pct_rural_hospitals_basic_ehr_no_notes;
    @SerializedName("pct_small_hospitals_basic_ehr_notes")
    private  String pct_small_hospitals_basic_ehr_notes;
    @SerializedName("pct_small_hospitals_basic_ehr_no_notes")
    private  String pct_small_hospitals_basic_ehr_no_notes;
    @SerializedName("pct_small_rural_hospitals_cehrt")
    private  String pct_small_rural_hospitals_cehrt;

    public Region(String region, String regionCode, String period, String pct_cah_hospitals_cehrt, String pct_critical_access_hospitals_basic_ehr_notes, String pct_critical_access_hospitals_basic_ehr_no_notes, String pct_hospitals_basic_ehr_notes,
                  String pct_hospitals_basic_ehr_no_notes, String pct_hospitals_cehrt, String pct_hospitals_find_clinical_info, String pct_hospitals_integrate_any_clinical_info, String pct_hospitals_integrate_scr, String pct_hospitals_patients_ecopy_discharge_instr,
                  String pct_hospitals_patients_ecopy_ehr,
                  String pct_hospitals_patients_secure_message,
                  String pct_hospitals_patients_vdt,
                  String pct_hospitals_receive_clinical_info,
                  String pct_hospitals_send_clinical_info,
                  String  pct_hospitals_share_care_summaries_any_outside_ambu_provs,
                  String  pct_hospitals_share_care_summaries_any_outside_hospitals,
                  String  pct_hospitals_share_care_summaries_any_outside_provs,
                  String  pct_hospitals_share_labs_any_outside_ambu_provs,
                  String     pct_hospitals_share_labs_any_outside_hospitals,
                  String     pct_hospitals_share_labs_any_outside_provs,
                  String     pct_rural_hospitals_basic_ehr_notes,
                  String     pct_rural_hospitals_basic_ehr_no_notes,
                  String     pct_small_hospitals_basic_ehr_notes,
                  String     pct_small_hospitals_basic_ehr_no_notes,
                  String pct_small_rural_hospitals_cehrt) {
        this.region = region;
        this.regionCode = regionCode;
        this.period = period;
        this.pct_cah_hospitals_cehrt = pct_cah_hospitals_cehrt;
        this.pct_critical_access_hospitals_basic_ehr_notes = pct_critical_access_hospitals_basic_ehr_notes;
        this.pct_critical_access_hospitals_basic_ehr_no_notes = pct_critical_access_hospitals_basic_ehr_no_notes;
        this.pct_hospitals_basic_ehr_notes = pct_hospitals_basic_ehr_notes;
        this.pct_hospitals_basic_ehr_no_notes = pct_hospitals_basic_ehr_no_notes;
        this.pct_hospitals_cehrt = pct_hospitals_cehrt;
        this.pct_hospitals_find_clinical_info = pct_hospitals_find_clinical_info;
        this.pct_hospitals_integrate_any_clinical_info = pct_hospitals_integrate_any_clinical_info;
        this.pct_hospitals_integrate_scr = pct_hospitals_integrate_scr;
        this.pct_hospitals_patients_ecopy_discharge_instr = pct_hospitals_patients_ecopy_discharge_instr;
        this.pct_hospitals_patients_ecopy_ehr = pct_hospitals_patients_ecopy_ehr;
        this.pct_hospitals_patients_secure_message = pct_hospitals_patients_secure_message;
        this.pct_hospitals_patients_vdt = pct_hospitals_patients_vdt;
        this.pct_hospitals_receive_clinical_info = pct_hospitals_receive_clinical_info;
        this.pct_hospitals_send_clinical_info = pct_hospitals_send_clinical_info;
        this.pct_hospitals_share_care_summaries_any_outside_ambu_provs = pct_hospitals_share_care_summaries_any_outside_ambu_provs;
        this.pct_hospitals_share_care_summaries_any_outside_hospitals = pct_hospitals_share_care_summaries_any_outside_hospitals;
        this.pct_hospitals_share_care_summaries_any_outside_provs = pct_hospitals_share_care_summaries_any_outside_provs;
        this.pct_hospitals_share_labs_any_outside_ambu_provs = pct_hospitals_share_labs_any_outside_ambu_provs;
        this.pct_hospitals_share_labs_any_outside_hospitals = pct_hospitals_share_labs_any_outside_hospitals;
        this.pct_hospitals_share_labs_any_outside_provs = pct_hospitals_share_labs_any_outside_provs;
        this.pct_rural_hospitals_basic_ehr_notes = pct_rural_hospitals_basic_ehr_notes;
        this.pct_rural_hospitals_basic_ehr_no_notes = pct_rural_hospitals_basic_ehr_no_notes;
        this.pct_small_hospitals_basic_ehr_notes = pct_small_hospitals_basic_ehr_notes;
        this.pct_small_hospitals_basic_ehr_no_notes = pct_small_hospitals_basic_ehr_no_notes;
        this.pct_small_rural_hospitals_cehrt = pct_small_rural_hospitals_cehrt;
    }

    public String getRegion() {
        if(region != null) {
            return region;
        } else {
            return "";
        }
    }

    public void setRegion(String region) {
        if(region != null && !region.equals("")){
            this.region = region;
        }
        this.region = "";
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public  String getPct_cah_hospitals_cehrt() {
        return pct_cah_hospitals_cehrt;
    }

    public void setPct_cah_hospitals_cehrt(String pct_cah_hospitals_cehrt) {
        this.pct_cah_hospitals_cehrt = pct_cah_hospitals_cehrt;
    }

    public String getPct_critical_access_hospitals_basic_ehr_notes() {
        return pct_critical_access_hospitals_basic_ehr_notes;
    }

    public void setPct_critical_access_hospitals_basic_ehr_notes(String pct_critical_access_hospitals_basic_ehr_notes) {
        this.pct_critical_access_hospitals_basic_ehr_notes = pct_critical_access_hospitals_basic_ehr_notes;
    }

    public String getPct_critical_access_hospitals_basic_ehr_no_notes() {
        return pct_critical_access_hospitals_basic_ehr_no_notes;
    }

    public void setPct_critical_access_hospitals_basic_ehr_no_notes(String pct_critical_access_hospitals_basic_ehr_no_notes) {
        this.pct_critical_access_hospitals_basic_ehr_no_notes = pct_critical_access_hospitals_basic_ehr_no_notes;
    }

    public String getPct_hospitals_basic_ehr_notes() {
        return pct_hospitals_basic_ehr_notes;
    }

    public void setPct_hospitals_basic_ehr_notes(String pct_hospitals_basic_ehr_notes) {
        this.pct_hospitals_basic_ehr_notes = pct_hospitals_basic_ehr_notes;
    }

    public String getPct_hospitals_basic_ehr_no_notes() {
        return pct_hospitals_basic_ehr_no_notes;
    }

    public void setPct_hospitals_basic_ehr_no_notes(String pct_hospitals_basic_ehr_no_notes) {
        this.pct_hospitals_basic_ehr_no_notes = pct_hospitals_basic_ehr_no_notes;
    }

    public String getPct_hospitals_cehrt() {
        return pct_hospitals_cehrt;
    }

    public void setPct_hospitals_cehrt(String pct_hospitals_cehrt) {
        this.pct_hospitals_cehrt = pct_hospitals_cehrt;
    }

    public String getPct_hospitals_find_clinical_info() {
        return pct_hospitals_find_clinical_info;
    }

    public void setPct_hospitals_find_clinical_info(String pct_hospitals_find_clinical_info) {
        this.pct_hospitals_find_clinical_info = pct_hospitals_find_clinical_info;
    }

    public String getPct_hospitals_integrate_any_clinical_info() {
        return pct_hospitals_integrate_any_clinical_info;
    }

    public void setPct_hospitals_integrate_any_clinical_info(String pct_hospitals_integrate_any_clinical_info) {
        this.pct_hospitals_integrate_any_clinical_info = pct_hospitals_integrate_any_clinical_info;
    }

    public String getPct_hospitals_integrate_scr() {
        return pct_hospitals_integrate_scr;
    }

    public void setPct_hospitals_integrate_scr(String pct_hospitals_integrate_scr) {
        this.pct_hospitals_integrate_scr = pct_hospitals_integrate_scr;
    }

    public String getPct_hospitals_patients_ecopy_discharge_instr() {
        return pct_hospitals_patients_ecopy_discharge_instr;
    }

    public void setPct_hospitals_patients_ecopy_discharge_instr(String pct_hospitals_patients_ecopy_discharge_instr) {
        this.pct_hospitals_patients_ecopy_discharge_instr = pct_hospitals_patients_ecopy_discharge_instr;
    }

    public String getPct_hospitals_patients_ecopy_ehr() {
        return pct_hospitals_patients_ecopy_ehr;
    }

    public void setPct_hospitals_patients_ecopy_ehr(String pct_hospitals_patients_ecopy_ehr) {
        this.pct_hospitals_patients_ecopy_ehr = pct_hospitals_patients_ecopy_ehr;
    }

    public String getPct_hospitals_patients_secure_message() {
        return pct_hospitals_patients_secure_message;
    }

    public void setPct_hospitals_patients_secure_message(String pct_hospitals_patients_secure_message) {
        this.pct_hospitals_patients_secure_message = pct_hospitals_patients_secure_message;
    }

    public String getPct_hospitals_patients_vdt() {
        return pct_hospitals_patients_vdt;
    }

    public void setPct_hospitals_patients_vdt(String pct_hospitals_patients_vdt) {
        this.pct_hospitals_patients_vdt = pct_hospitals_patients_vdt;
    }

    public String getPct_hospitals_receive_clinical_info() {
        return pct_hospitals_receive_clinical_info;
    }

    public void setPct_hospitals_receive_clinical_info(String pct_hospitals_receive_clinical_info) {
        this.pct_hospitals_receive_clinical_info = pct_hospitals_receive_clinical_info;
    }

    public String getPct_hospitals_send_clinical_info() {
        return pct_hospitals_send_clinical_info;
    }

    public void setPct_hospitals_send_clinical_info(String pct_hospitals_send_clinical_info) {
        this.pct_hospitals_send_clinical_info = pct_hospitals_send_clinical_info;
    }

    public String getPct_hospitals_share_care_summaries_any_outside_ambu_provs() {
        return pct_hospitals_share_care_summaries_any_outside_ambu_provs;
    }

    public void setPct_hospitals_share_care_summaries_any_outside_ambu_provs(String pct_hospitals_share_care_summaries_any_outside_ambu_provs) {
        this.pct_hospitals_share_care_summaries_any_outside_ambu_provs = pct_hospitals_share_care_summaries_any_outside_ambu_provs;
    }

    public String getPct_hospitals_share_care_summaries_any_outside_hospitals() {
        return pct_hospitals_share_care_summaries_any_outside_hospitals;
    }

    public void setPct_hospitals_share_care_summaries_any_outside_hospitals(String pct_hospitals_share_care_summaries_any_outside_hospitals) {
        this.pct_hospitals_share_care_summaries_any_outside_hospitals = pct_hospitals_share_care_summaries_any_outside_hospitals;
    }

    public String getPct_hospitals_share_care_summaries_any_outside_provs() {
        return pct_hospitals_share_care_summaries_any_outside_provs;
    }

    public void setPct_hospitals_share_care_summaries_any_outside_provs(String pct_hospitals_share_care_summaries_any_outside_provs) {
        this.pct_hospitals_share_care_summaries_any_outside_provs = pct_hospitals_share_care_summaries_any_outside_provs;
    }

    public String getPct_hospitals_share_labs_any_outside_ambu_provs() {
        return pct_hospitals_share_labs_any_outside_ambu_provs;
    }

    public void setPct_hospitals_share_labs_any_outside_ambu_provs(String pct_hospitals_share_labs_any_outside_ambu_provs) {
        this.pct_hospitals_share_labs_any_outside_ambu_provs = pct_hospitals_share_labs_any_outside_ambu_provs;
    }

    public String getPct_hospitals_share_labs_any_outside_hospitals() {
        return pct_hospitals_share_labs_any_outside_hospitals;
    }

    public void setPct_hospitals_share_labs_any_outside_hospitals(String pct_hospitals_share_labs_any_outside_hospitals) {
        this.pct_hospitals_share_labs_any_outside_hospitals = pct_hospitals_share_labs_any_outside_hospitals;
    }

    public String getPct_hospitals_share_labs_any_outside_provs() {
        return pct_hospitals_share_labs_any_outside_provs;
    }

    public void setPct_hospitals_share_labs_any_outside_provs(String pct_hospitals_share_labs_any_outside_provs) {
        this.pct_hospitals_share_labs_any_outside_provs = pct_hospitals_share_labs_any_outside_provs;
    }

    public String getPct_rural_hospitals_basic_ehr_notes() {
        return pct_rural_hospitals_basic_ehr_notes;
    }

    public void setPct_rural_hospitals_basic_ehr_notes(String pct_rural_hospitals_basic_ehr_notes) {
        this.pct_rural_hospitals_basic_ehr_notes = pct_rural_hospitals_basic_ehr_notes;
    }

    public String getPct_rural_hospitals_basic_ehr_no_notes() {
        return pct_rural_hospitals_basic_ehr_no_notes;
    }

    public void setPct_rural_hospitals_basic_ehr_no_notes(String pct_rural_hospitals_basic_ehr_no_notes) {
        this.pct_rural_hospitals_basic_ehr_no_notes = pct_rural_hospitals_basic_ehr_no_notes;
    }

    public String getPct_small_hospitals_basic_ehr_notes() {
        return pct_small_hospitals_basic_ehr_notes;
    }

    public void setPct_small_hospitals_basic_ehr_notes(String pct_small_hospitals_basic_ehr_notes) {
        this.pct_small_hospitals_basic_ehr_notes = pct_small_hospitals_basic_ehr_notes;
    }

    public String getPct_small_hospitals_basic_ehr_no_notes() {
        return pct_small_hospitals_basic_ehr_no_notes;
    }

    public void setPct_small_hospitals_basic_ehr_no_notes(String pct_small_hospitals_basic_ehr_no_notes) {
        this.pct_small_hospitals_basic_ehr_no_notes = pct_small_hospitals_basic_ehr_no_notes;
    }

    public String getPct_small_rural_hospitals_cehrt() {
        return pct_small_rural_hospitals_cehrt;
    }

    public void setPct_small_rural_hospitals_cehrt(String pct_small_rural_hospitals_cehrt) {
        this.pct_small_rural_hospitals_cehrt = pct_small_rural_hospitals_cehrt;
    }
}
