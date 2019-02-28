package com.constants;

import java.util.HashMap;

public class TextCommand {
    private  String name, description, content;

    public TextCommand() {
    }

    public TextCommand(String name, String description, String content) {
        this.name = name;
        this.description = description;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public static HashMap<String, TextCommand> commandHashMap = initCommands();

    private static HashMap<String, TextCommand> initCommands() {
        HashMap<String, TextCommand> map = new HashMap<String, TextCommand>();
        map.put("#fir",new TextCommand("#fir","To file an online FIR in Delhi NCR Region","under maintenance"));
        map.put("#bh",new TextCommand("#bh","Basic Helpline Numbers",
                "*Basic Helpline Numbers*\n" +
                "PCR - 100 (Toll Free)\n" +
                "Eyes and Ears - 1090 (Toll Free)\n" +
                "Women in distress - 1091\n" +
                "Special Cell (North-Eastern States) - 1093\n" +
                "Missing Persons - 1094, 23241210\n" +
                "Traffic - 1095, 25844444\n" +
                "Vigilance (Anti-Corruption Helpline) - 1064\n" +
                "For uploading Audio and Video Clips - 9910641064\n"));
        map.put("#bbd",new TextCommand("#bbd","Blood Banks in Delhi-NCR",
                "*Blood Banks in Delhi-NCR*\n" + "AIIMS, New Delhi - 01126593726, 01126594438, 01126588700, 01126594405\n" +
                "Rotary Noida Blood Bank - 011-66364887\n" +
                "White Cross Blood Bank New Delhi - 011-26831063, 26844140\n" +
                "Lions Blood Bank New Delhi - 011-42258080, 42258494\n" +
                "Sir Ganga Ram Hospital New Delhi - 011-25750000, 25751111, 25861463\n" +
                "Extn:11870\n" +
                "Indian Red Cross Society - 011-23711551\n"));
        map.put("#bbi",new TextCommand("#bbi","Blood Banks in India",
                "*Blood Banks in India*\n" + "*MUMBAI: 104 or 1910*\n" +
                "St. George Blood Bank - 022-22620344, 22620242\n" +
                "J.J Hospital Blood Bank - 022-23769400\n" +
                "G.T Hospital Blood Bank - 022-22621464, 22621465, 22621467\n" +
                "Kama Hospital Blood Bank - 022-22611648\n" +
                "Indian Red Cross Society - 022-22663560\n" +

                "*DELHI*\n" +

                "AIIMS - 011-26594405, 011-26593726\n" +
                "Lions Blood Bank - 011-42258494\n" +
                "Red Cross Society - 011-23716441, 011-23716442\n" +
                "Rotary Blood Bank - 011-29054066\n" +
                "White Cross Blood Bank - 011- 26831063\n" +
                "Pitampura Blood Bank - 011-27011212, 8130597597\n" +
                "Ganga Ram Hospital - 011-42251800, 01142251868\n" +
                "Lal Bahadur Shastri Hospital (Mayur Vihar) - 011-22786688, 011-22223167\n" +
                "Dharamshila Cancer Foundation (Mayur Vihar) - 011-43066424, 011-43066425\n" + "\n" +

                "*HARYANA*\n" +

                "General Hospital (Ambala City) - 0171-2552908\n" +
                "Sanjeevani Blood Bank - 0171-2626557\n" +
                "Gold Field Blood Bank (Ballabgarh, Faridabad) - 0129-2209395\n" +
                "Faridabad General Hospital Blood Bank - 0129-2411881 \n" +
                "Gurugram General Hospital Blood Bank - 0124-2321121\n" + "\n" +

                "*KARNATAKA*\n" +

                "Lions Blood Bank - 080-22266807\n" +
                "Naveen Blood Bank - 080-26341907\n" +
                "Navarang Blood Bank - 080-23521233\n" +
                "Unique Blood Bank - 080-26700685, 080-26709970\n" +
                "Grace Blood Bank - 080-23336608\n" +
                "BKF Voluntary Blood Bank - 080-26392697\n" + "\n" +

                "*WEST BENGAL*\n" +

                "Bhoruka Blood Bank - 033-2456850\n" +
                "Central Blood Bank - 033-23510619\n" +
                "Siliguri Terrai Lions Blood Bank - 0353-2548925\n" +
                "Rotary Blood Bank - 0353-2513240\n" + "\n" +

                "*SURAT: 1090*\n" +

                "Surat Raktdan Kendra - 0261-2424594\n" +
                "Lok Samarpan Raktdan Kendra - 0261-2547575\n" +
                "Lockhat Hospital, Rampura - 0261-2422080/81\n" +
                "Civil Hospital Majura Gate - 0261-22444556/57\n" +
                "Mahavir Cardiac, RTO - 0261-2471770\n" + "\n" +

                "*TAMIL NADU*\n" +

                "Indian Red Cross Society - 28554425\n" +
                "Janseva Blood Services - 24835401\n" +
                "Jeevan Blood Bank - 28220494\n" +
                "Lions Blood Bank - 28414949\n" +
                "Rotary Blood Bank Vijaya Hospital - 24881392\n"));
        map.put("#bd",new TextCommand("#bd","Bomb Disposal Squad","under maintenance"));
        map.put("#dp",new TextCommand("#dp","Delhi Police","under maintenance"));
        map.put("#dm",new TextCommand("#dm","Disaster management Control Centre","under maintenance"));
        map.put("#getinfo",new TextCommand("#getinfo","To get information about some service","under maintenance"));

        return map;
    }

}
