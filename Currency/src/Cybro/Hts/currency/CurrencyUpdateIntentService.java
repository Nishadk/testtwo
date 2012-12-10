package Cybro.Hts.currency;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.format.DateUtils;
import android.text.format.Time;

import android.widget.Toast;

public class CurrencyUpdateIntentService extends IntentService
{
	String strAED=null,strQAR=null,strBAH=null,strOMR=null,strSAR=null,strUSD=null,strGPB=null,strINR=null;
	SharedPreferences msharedpreference;
	public CurrencyUpdateIntentService() 
	{		
		super("CurrencyUpdateIntentService");
	}
	@Override
	protected void onHandleIntent(Intent intent) 
	{
		Toast.makeText(getApplicationContext(),"updating",1).show();
		//scheduleNextUpdate();
	}
	@Override
	public void onCreate() 
	{
		scheduleNextUpdate();
		//Toast.makeText(getApplicationContext(),"updating",1).show();
		super.onCreate();
	}
	private void scheduleNextUpdate()
	{
		Toast.makeText(getApplicationContext(),"updating",1).show();
		Intent intent = new Intent(this, this.getClass());
		PendingIntent pendingIntent =PendingIntent.getService(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
		// The update frequency should often be user configurable.  This is not.
		long currentTimeMillis = System.currentTimeMillis();
		long nextUpdateTimeMillis = currentTimeMillis + 1 * DateUtils.MINUTE_IN_MILLIS;		
	   /* Time nextUpdateTime = new Time();
		nextUpdateTime.set(nextUpdateTimeMillis);
		
		if (nextUpdateTime.hour < 8 || nextUpdateTime.hour >= 18)
		{
			nextUpdateTime.hour = 8;
			nextUpdateTime.minute = 0;
			nextUpdateTime.second = 0;
			nextUpdateTimeMillis = nextUpdateTime.toMillis(false) + DateUtils.DAY_IN_MILLIS;
		}*/
		AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
		alarmManager.set(AlarmManager.RTC, nextUpdateTimeMillis, pendingIntent);
	}
	private void clearpreference()
	{
		msharedpreference=getSharedPreferences("key", MODE_PRIVATE);
		SharedPreferences.Editor editor=msharedpreference.edit();
		editor.clear();
		editor.commit();
	}
	private void sevepreference(String key,String value)
	{		
		msharedpreference=getSharedPreferences("key", MODE_PRIVATE);
		SharedPreferences.Editor editor=msharedpreference.edit();
		editor.putString(key, value);
		editor.commit();
	}
	private void Loadpreference()
	{
		strAED="AED-"+msharedpreference.getString("AED","");	
		strQAR="QAR-"+msharedpreference.getString("QAR","");
		strBAH="BAH-"+msharedpreference.getString("BAH","");	
		strOMR="OMR-"+msharedpreference.getString("OMR","");	
		strSAR="SAR-"+msharedpreference.getString("SAR","");	
		strUSD="USD-"+msharedpreference.getString("USD","");	
		strGPB="GPB-"+msharedpreference.getString("GPB","");	
		strINR="INR-"+msharedpreference.getString("INR","");	 
	}
}
