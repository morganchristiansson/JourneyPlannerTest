package se.mog.tfl.test;

import se.mog.tfl.Result;
import android.content.Intent;
import android.sax.StartElementListener;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

public class ResultTest extends ActivityInstrumentationTestCase2<Result> {
	public ResultTest() {
		super("se.mog.tfl", Result.class);
	}

	@Override protected void setUp() throws Exception {
		super.setUp();

		//setActivityInitialTouchMode(false);

		//activity = getActivity();
	}
	public void testNoValueForDestination() {
		//http://journeyplanner.tfl.gov.uk/lite/XSLT_TRIP_REQUEST2?type_origin=address&name_origin=lytton+grove&place_origin=London&type_destination=stop&name_destination=richmond&place_destination=London&language=en
		String response="{  parameters:[   {    name:\"requestID\",    value:0},   {    name:\"sessionID\",    value:0}],  trips:[   {    duration:\"00:33\",    interchanges:0,    desc:1,    legs:[     {      points:[       {        name:\"Lytton Grove\",        usage:\"departure\",        desc:\"Departure from <b>Lytton Grove</b> at <b>00:25</b>. <a target=\'_blank\' href=\\\"XSLT_REQUEST?language=en&itdLPxx_src=FILELOAD?Filename=JP06__4D6D8FE71.pdf&itdLPxx_map=origin\\\">Print Map</a>\",        dateTime:{         date:\"2.03.2011\",         time:\"00:25\"},        stamp:{         date:20110302,         time:0025},        links:{         link:{          name:\"RM\",          type:\"RM\",          href:\"FILELOAD?Filename=JP06__4D6D8FE71.pdf\"}},        ref:{         id:99999997,         area:0,         coords:\"524199,825552\"}},       {        name:\"Putney Heath / Green Man\",        usage:\"arrival\",        desc:\"Arrival at <b>Putney Heath / Green Man</b> <a target=\'_blank\' href=\\\"XSLT_REQUEST?language=en&itdLPxx_src=FILELOAD?Filename=JP06__4D6D8FE72.pdf&itdLPxx_map=destination\\\">Print Map</a>\",        dateTime:{         date:\"2.03.2011\",         time:\"00:36\"},        stamp:{         date:20110302,         time:0036},        links:[         {          name:\"RM\",          type:\"RM\",          href:\"FILELOAD?Filename=JP06__4D6D8FE72.pdf\"},         {          name:\"SM\",          type:\"SM\",          href:\"tfl/SP_putneyheathgreenman.pdf\"}],        ref:{         id:1011285,         area:0,         platform:\"C\",         coords:\"523679,825801\"}}],      mode:{       name:\"Fussweg\",       type:100,       desc:\"Walk to Putney Heath / Green Man\"},      turnInst:[       {        dir:\"STRAIGHT\",        dist:379,        name:\"Lytton Grove\",        coords:\"524197,825555\"},       {        dir:\"LEFT\",        dist:305,        name:\"Putney Hill\",        coords:\"523833,825453\"},       {        dir:\"SLIGHT_RIGHT\",        dist:89,        name:\"Wildcroft Road\",        coords:\"523750,825746\"}]},     {      points:[       {        name:\"Putney Heath / Green Man\",        usage:\"departure\",        desc:\"Departure from <b>Putney Heath / Green Man</b> at <b>00:36</b>. <a target=\'_blank\' href=\\\"XSLT_REQUEST?language=en&itdLPxx_src=FILELOAD?Filename=JP06__4D6D8FE72.pdf&itdLPxx_map=origin\\\">Print Map</a>\",        dateTime:{         date:\"2.03.2011\",         time:\"00:36\"},        stamp:{         date:20110302,         time:0036},        links:[         {          name:\"RM\",          type:\"RM\",          href:\"FILELOAD?Filename=JP06__4D6D8FE72.pdf\"},         {          name:\"SM\",          type:\"SM\",          href:\"tfl/SP_putneyheathgreenman.pdf\"}],        ref:{         id:1011285,         area:0,         platform:\"C\",         coords:\"523679,825801\"}},       {        name:\"Richmond Station\",        usage:\"arrival\",        desc:\"Arrival at <b>Richmond Station</b> at 00:58 <a target=\'_blank\' href=\\\"XSLT_REQUEST?language=en&itdLPxx_src=FILELOAD?Filename=JP06__4D6D8FE73.pdf&itdLPxx_map=destination\\\">Print Map</a>\",        dateTime:{         date:\"2.03.2011\",         time:\"00:58\"},        stamp:{         date:20110302,         time:0058},        links:[         {          name:\"RM\",          type:\"RM\",          href:\"FILELOAD?Filename=JP06__4D6D8FE73.pdf\"},         {          name:\"SM\",          type:\"SM\",          href:\"tfl/SP_richmond.pdf\"}],        ref:{         id:1000192,         area:1,         platform:\"M\",         coords:\"518031,824795\"}}],      mode:{       name:\"Bus 493\",       type:3,       code:5,       destination:\"Richmond / Manor Road Homebase\",       desc:\"Take Route Bus 493 towards Richmond / Manor Road Homebase\",       diva:{        branch:49,        line:493,        supplement:\"j\",        project:\"y05\",        network:\"tfl\"}}}]}]}";
		Intent i = new Intent();
		i.putExtra("response", response);
		setActivityIntent(i);
		final Result a = getActivity();
//		LinearLayout main = (LinearLayout) a.findViewById(se.mog.tfl.R.id.layout_main);
//		ListView list = (ListView) main.findViewById(se.mog.tfl.R.id.list);
	    a.runOnUiThread(
			new Runnable() {
				public void run() {
					a.showDetails(0);
				}
			}
	    );
	}
}
