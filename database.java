import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class database {
	public String movies(String s1){
		HashMap<String,ArrayList<String>> movies= new HashMap<String,ArrayList<String>>();
		ArrayList<String> jck=new ArrayList<>();
		ArrayList<String> blee=new ArrayList<>();
		ArrayList<String> othr=new ArrayList<>();
		jck.add("DrunkenMaster.mp4\"");
		jck.add("RushHour.mp4\"");
		blee.add("FistOfFury.mp4\"");
		blee.add("EnterTheDragon.mp4\"");
		othr.add("Anchorman2.mp4\"");
		othr.add("Fringe.mp4\"");
		othr.add("TheWalkingDead.mp4\"");
		othr.add("Hachiko.mp4\"");
		othr.add("Homefront.mp4\"");	
		movies.put("jackiechan",jck);
		movies.put("brucelee",blee);
		movies.put("others", othr);
		
		String aString1 = "";
		if(s1.equals("movies"))
		{
		        for (Map.Entry<String, ArrayList<String>> entry : movies.entrySet()) {
	                String key = entry.getKey();
	                
	                ArrayList<String> value = entry.getValue();
	                for(String aString : value)
                            {
                            aString1=aString1+","+aString;
	                    
                            }
                        
	            }
                        return aString1;
		}
		if(s1.equals("jackie chan movies"))
		{
			for(String s: movies.get("jackiechan"))
                        {
			aString1=aString1+","+s;
                        }
                        return aString1;
		}
		if(s1.equals("bruce lee movies"))
		{
			for(String s: movies.get("brucelee"))
			{
			aString1=aString1+","+s;
                        }
                        return aString1;
		}
		if(s1.equals("other movies"))
		{
			for(String s: movies.get("others"))
			{
			aString1=aString1+","+s;
                        }
                        return aString1;
		}
            return null;
	
	}
	public String songs(String s2){
		HashMap<String,List<String>> songs= new HashMap<String,List<String>>();
		List<String> bb=new ArrayList<>();
		List<String> en=new ArrayList<>();
		List<String> jm=new ArrayList<>();
		bb.add("Everybody.mp3\"");
		bb.add("LargerThanLife.mp3\"");
		en.add("Addicted.mp3\"");
		en.add("SomebodysMe.mp3\"");
		en.add("RingMyBells.mp3\"");
		jm.add("YourBodyIsWonderland.mp3\"");
		songs.put("backstreetboys", bb);
		songs.put("enrique",en);
		songs.put("johnmayor", jm);
                
                String aString1 = "";
		if(s2.equals("songs"))
		{
				
		
	            for (Map.Entry<String, List<String>> entry : songs.entrySet()) {
	                String key = entry.getKey();
	                
	                List<String> value = entry.getValue();
	                for(String aString : value){
	                    {
			aString1=aString1+","+aString;
                        }
                        }
                       }
                    return aString1;
		}
		if(s2.equals("backstreet boys songs"))
		{
			for(String s: songs.get("backstreetboys"))
			 {
			aString1=aString1+","+s;
                        }
                        return aString1;
		}
		if(s2.equals("enrique songs"))
		{
			for(String s: songs.get("enrique"))
			 {
			aString1=aString1+","+s;
                        }
                        return aString1;
		}
		if(s2.equals("john mayor songs"))
		{
			for(String s: songs.get("johnmayor"))
			 {
			aString1=aString1+","+s;
                        }
                        return aString1;
		}
		
	   
	    return null;
		
	}
 
	
}
