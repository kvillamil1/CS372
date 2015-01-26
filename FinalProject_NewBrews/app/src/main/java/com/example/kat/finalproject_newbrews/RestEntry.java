package com.example.kat.finalproject_newbrews;

/**
 * Created by stephenthoen on 1/25/15.
 */
public class RestEntry {

    private String _Rest_ID_Num;
    private String _Rest_Name;
    private String _Rest_Phone;
    private String _Rest_Address;
    private String _Rest_City;
    private String _Rest_State;
    private String _Rest_Description;
    private String _Rest_Zip;


    public RestEntry(String id, String RName, String RPhone, String RAddress, String RCity,
                     String RState, String RDescription, String RZip) {
        _Rest_ID_Num = id;
        _Rest_Name = RName;
        _Rest_Phone = RPhone;
        _Rest_Address = RAddress;
        _Rest_City = RCity;
        _Rest_State = RState;
        _Rest_Description = RDescription;
        _Rest_Zip = RZip;
    }

    public String getTypeName() {
        return _Rest_Name;
    }


}
