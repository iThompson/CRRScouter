package org.team639.scouting;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.ListView;

public class CRRScouterActivity extends Activity {
	
	Fragment testFragment;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView teamList = (ListView) findViewById(R.id.TeamList);
        
        final List<MatchData> matchList = new ArrayList<MatchData>();
        matchList.add(new MatchData());
        
        MatchDataAdapter adapter = new MatchDataAdapter(this, matchList);
        teamList.setAdapter(adapter);
    }
}