package quiz;
import java.util.HashMap;
// class PersonInfo {
	

	
	

	class PersonInfo {
	    private final String MondayHour1;
	    private final String MondayHour2;
	    private final String MondayHour3;
	    private final String MondayHour4;
	    private final String TuesdayHour1;
	    private final String TuesdayHour2;
	    private final String TuesdayHour3;
	    private final String TuesdayHour4;
	    private final String WednesdayHour1;
	    private final String WednesdayHour2;
	    private final String WednesdayHour3;
	    private final String WednesdayHour4;
	    private final String ThursdayHour1;
	    private final String ThursdayHour2;
	    private final String ThursdayHour3;
	    private final String ThursdayHour4;
	    private final String FridayHour1;
	    private final String FridayHour2;
	    private final String FridayHour3;
	    private final String FridayHour4;

	    public PersonInfo(String MondayHour1, String MondayHour2, String MondayHour3,String MondayHour4, 
	    		String TuesdayHour1, String TuesdayHour2,String TuesdayHour3, String TuesdayHour4,
	    		String WednesdayHour1,String WednesdayHour2,String WednesdayHour3,String WednesdayHour4, 
	    		String ThursdayHour1,String ThursdayHour2,String ThursdayHour3,String ThursdayHour4,
	    		String FridayHour1,String FridayHour2,String FridayHour3,String FridayHour4) {
	        this.MondayHour1 = MondayHour1;
	        this.MondayHour2 = MondayHour2;
	        this.MondayHour3 = MondayHour3;
	        this.MondayHour4 = MondayHour4;
	        this.TuesdayHour1 = TuesdayHour1;
	        this.TuesdayHour2 = TuesdayHour2;
	        this.TuesdayHour3 = TuesdayHour3;
	        this.TuesdayHour4 = TuesdayHour4;
	        this.WednesdayHour1 = WednesdayHour1;
	        this.WednesdayHour2 = WednesdayHour2;
	        this.WednesdayHour3 = WednesdayHour3;
	        this.WednesdayHour4 = WednesdayHour4;
	        this.ThursdayHour1 = ThursdayHour1;
	        this.ThursdayHour2 = ThursdayHour2;
	        this.ThursdayHour3 = ThursdayHour3;
	        this.ThursdayHour4 = ThursdayHour4;
	        this.FridayHour1 = FridayHour1;
	        this.FridayHour2 = FridayHour2;
	        this.FridayHour3 = FridayHour3;
	        this.FridayHour4 = FridayHour4;
	    }

	    // Getters for accessing the information
	    public String getMondayHour1() {
	        return MondayHour1;
	    }

	    public String getMondayHour2() {
	        return MondayHour2;
	    }

	    public String getMondayHour3() {
	        return MondayHour3;
	    }
	    public String getMondayHour4() {
	        return MondayHour4;
	    }

	    public String getTuesdayHour1() {
	        return TuesdayHour1;
	    }

	    public String getTuesdayHour2() {
	        return TuesdayHour2;
	    }
	    public String getTuesdayHour3() {
	        return TuesdayHour3;
	    }

	    public String getTuesdayHour4() {
	        return TuesdayHour4;
	    }

	    public String getWednesdayHour1() {
	        return WednesdayHour1;
	    }
	    public String getWednesdayHour2() {
	        return WednesdayHour2;
	    }
	    public String getWednesdayHour3() {
	        return WednesdayHour3;
	    }
	    public String getWednesdayHour4() {
	        return WednesdayHour4;
	    }
	    public String getThursdayHour1() {
	    	return ThursdayHour1;
	    }
	    public String getThursdayHour2() {
	    	return ThursdayHour2;
	    }
	    public String getThursdayHour3() {
	    	return ThursdayHour3;
	    }
	    public String getThursdayHour4() {
	    	return ThursdayHour4;
	    }
	    public String getFridayHour1() {
	    	return FridayHour1;
	    }
	    public String getFridayHour2() {
	    	return FridayHour2;
	    }
	    public String getFridayHour3() {
	    	return FridayHour3;
	    }
	    public String getFridayHour4() {
	    	return FridayHour4;
	    }
	

	    public static void main(String[] args) {
	        // Creating a HashMap with a custom class as the value type
	        HashMap<String, PersonInfo> personInfoMap = new HashMap<>();

	        // Adding key-value pairs
	        personInfoMap.put("John", new PersonInfo("Study", "Study", "notStudy","Study",//Monday 
	        		          "notStudy", "notStudy","Study", "Study", //Tuesday
	        		          "Study","NotStudy","Study","NotStudy", //Wednesday
	        		          "Study","Study","Study","Study",   //Thursday
	        		          "Study","Study","Study","NotStudy"));//Friday
	       
	        System.out.println("================Monday's Schedule===============");
	        // Retrieving values
	        PersonInfo johnInfo = personInfoMap.get("John");
	        //PersonInfo janeInfo = personInfoMap.get("Jane");
	        System.out.println("John's Monday 9AM: " + johnInfo.getMondayHour1());
	        System.out.println("John's Monday 11AM: " + johnInfo.getMondayHour2());
	        System.out.println("John's Monday 2PM: " + johnInfo.getMondayHour3());
	        System.out.println("John's Monday 4PM: " + johnInfo.getMondayHour4());
	        System.out.println("================Tuesday's Schedule===============");
	        PersonInfo johnInfo1 = personInfoMap.get("John");
	        System.out.println("Jane's Tuesday 9AM: " + johnInfo1.getTuesdayHour1());
	        System.out.println("Jane's Tuesday 11AM: " + johnInfo1.getMondayHour2());
	        System.out.println("Jane's Tuesday 2PM: " + johnInfo1.getTuesdayHour3());
	        System.out.println("Jane's Tuesday 4PM: " + johnInfo1.getTuesdayHour4());
	        System.out.println("================Wednesday's Schedule===============");
	        PersonInfo johnInfo2 = personInfoMap.get("John");
	        System.out.println("John's Wednesday 9AM: " + johnInfo2.getWednesdayHour1());
	        System.out.println("John's Wednesday 11AM: " + johnInfo2.getWednesdayHour2());
	        System.out.println("John's Wednesday 2PM: " + johnInfo2.getWednesdayHour3());
	        System.out.println("John's Wednesday 4PM: " + johnInfo2.getWednesdayHour4());
	        System.out.println("================Thursday's Schedule===============");
	        PersonInfo johnInfo3 = personInfoMap.get("John");
	        System.out.println("John's Thursday 9AM: " + johnInfo3.getThursdayHour1());
	        System.out.println("John's Thursday 11AM: " + johnInfo2.getThursdayHour2());
	        System.out.println("John's Thursday 2PM: " + johnInfo2.getThursdayHour3());
	        System.out.println("John's Thursday 4PM: " + johnInfo2.getThursdayHour4());
	        System.out.println("================Friday's Schedule===============");
	        PersonInfo johnInfo4 = personInfoMap.get("John");
	        System.out.println("John's Friday  9AM: " + johnInfo3.getFridayHour1());
	        System.out.println("John's Frisday 11AM: " + johnInfo2.getFridayHour2());
	        System.out.println("John's Friday  2PM: " + johnInfo2.getFridayHour3());
	        System.out.println("John's Friday  4PM: " + johnInfo2.getFridayHour4());
	    }
	}


