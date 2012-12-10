package Cybro.Hts.currency;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CurrencyViewMain extends Activity 
{
	private static String strSettedCurrency=null;
	Button btnC1;
	Button btnC2;
	Button btnC3;
	Button btnC4;
	Button btnC5;
	Button btnC6;
	Button btnC7;
	Button btnC8;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen_currency_main);
		btnC1=(Button)findViewById(R.id.btn1);
		btnC2=(Button)findViewById(R.id.btn2);
		btnC3=(Button)findViewById(R.id.btn3);
		btnC4=(Button)findViewById(R.id.btn4);
		btnC5=(Button)findViewById(R.id.btn5);
		btnC6=(Button)findViewById(R.id.btn6);
		btnC7=(Button)findViewById(R.id.btn7);
		btnC8=(Button)findViewById(R.id.btn8);	  
		SharedPreferences preferLastscreen=getSharedPreferences("Mscreen",0);
		if(preferLastscreen.getString("Kbtnc1","")!="")
		{
			btnC1.setText(preferLastscreen.getString("Kbtnc1",""));
			btnC2.setText(preferLastscreen.getString("Kbtnc2",""));
			btnC3.setText(preferLastscreen.getString("Kbtnc3",""));
			btnC4.setText(preferLastscreen.getString("Kbtnc4",""));
			btnC5.setText(preferLastscreen.getString("Kbtnc5",""));
			btnC6.setText(preferLastscreen.getString("Kbtnc6",""));
			btnC7.setText(preferLastscreen.getString("Kbtnc7",""));
			btnC8.setText(preferLastscreen.getString("Kbtnc8",""));
		}
	}
	public void currencyclick(View v)
	{
		if(v==btnC1)
		{
			AlertDialog.Builder adBuilder=new AlertDialog.Builder(CurrencyViewMain.this);
			adBuilder.setCancelable(false);
			final EditText etxtCurrencyvalue = new EditText(this);		
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			etxtCurrencyvalue.setLayoutParams(lp);
			adBuilder.setView(etxtCurrencyvalue);		
			final String[] strCurrencynamevalue =btnC1.getText().toString().split("-");
			adBuilder.setTitle("Enter:"+strCurrencynamevalue[0]);
			adBuilder.setIcon(R.drawable.ic_launcher);
			adBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					Toast.makeText(CurrencyViewMain.this,"ok pressed",Toast.LENGTH_SHORT).show();
					strSettedCurrency=etxtCurrencyvalue.getText().toString();
					btnC1.setText(strCurrencynamevalue[0].trim()+"-"+strSettedCurrency);
					Btnorder(strCurrencynamevalue[0].trim());
				}
			});
			adBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					dialog.cancel();				
				}
			});
			adBuilder.show();
		}	
		if(v==btnC2)
		{
			AlertDialog.Builder adBuilder=new AlertDialog.Builder(CurrencyViewMain.this);
			adBuilder.setCancelable(false);
			final EditText etxtCurrencyvalue = new EditText(this);		
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			etxtCurrencyvalue.setLayoutParams(lp);
			adBuilder.setView(etxtCurrencyvalue);		
			final String[] strCurrencynamevalue =btnC2.getText().toString().split("-");
			adBuilder.setTitle("Enter:"+strCurrencynamevalue[0]);
			adBuilder.setIcon(R.drawable.ic_launcher);
			adBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					Toast.makeText(CurrencyViewMain.this,"ok pressed",Toast.LENGTH_SHORT).show();
					strSettedCurrency=etxtCurrencyvalue.getText().toString();
					btnC1.setText(strCurrencynamevalue[0].trim()+"-"+strSettedCurrency);
					Btnorder(strCurrencynamevalue[0].trim());
				}
			});
			adBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					dialog.cancel();				
				}
			});
			adBuilder.show();
		}	
		if(v==btnC3)
		{
			AlertDialog.Builder adBuilder=new AlertDialog.Builder(CurrencyViewMain.this);
			adBuilder.setCancelable(false);
			final EditText etxtCurrencyvalue = new EditText(this);		
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			etxtCurrencyvalue.setLayoutParams(lp);
			adBuilder.setView(etxtCurrencyvalue);		
			final String[] strCurrencynamevalue =btnC3.getText().toString().split("-");
			adBuilder.setTitle("Enter:"+strCurrencynamevalue[0]);
			adBuilder.setIcon(R.drawable.ic_launcher);
			adBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					Toast.makeText(CurrencyViewMain.this,"ok pressed",Toast.LENGTH_SHORT).show();
					strSettedCurrency=etxtCurrencyvalue.getText().toString();
					btnC1.setText(strCurrencynamevalue[0].trim()+"-"+strSettedCurrency);
					Btnorder(strCurrencynamevalue[0].trim());
				}
			});
			adBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					dialog.cancel();				
				}
			});
			adBuilder.show();
		}	
		if(v==btnC4)
		{
			AlertDialog.Builder adBuilder=new AlertDialog.Builder(CurrencyViewMain.this);
			adBuilder.setCancelable(false);
			final EditText etxtCurrencyvalue = new EditText(this);		
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			etxtCurrencyvalue.setLayoutParams(lp);
			adBuilder.setView(etxtCurrencyvalue);		
			final String[] strCurrencynamevalue =btnC4.getText().toString().split("-");
			adBuilder.setTitle("Enter:"+strCurrencynamevalue[0]);
			adBuilder.setIcon(R.drawable.ic_launcher);
			adBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					Toast.makeText(CurrencyViewMain.this,"ok pressed",Toast.LENGTH_SHORT).show();
					strSettedCurrency=etxtCurrencyvalue.getText().toString();
					btnC1.setText(strCurrencynamevalue[0].trim()+"-"+strSettedCurrency);
					Btnorder(strCurrencynamevalue[0].trim());
				}
			});
			adBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					dialog.cancel();				
				}
			});
			adBuilder.show();
		}	
		if(v==btnC5)
		{
			AlertDialog.Builder adBuilder=new AlertDialog.Builder(CurrencyViewMain.this);
			adBuilder.setCancelable(false);
			final EditText etxtCurrencyvalue = new EditText(this);		
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			etxtCurrencyvalue.setLayoutParams(lp);
			adBuilder.setView(etxtCurrencyvalue);		
			final String[] strCurrencynamevalue =btnC5.getText().toString().split("-");
			adBuilder.setTitle("Enter:"+strCurrencynamevalue[0]);
			adBuilder.setIcon(R.drawable.ic_launcher);
			adBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					Toast.makeText(CurrencyViewMain.this,"ok pressed",Toast.LENGTH_SHORT).show();
					strSettedCurrency=etxtCurrencyvalue.getText().toString();
					btnC1.setText(strCurrencynamevalue[0].trim()+"-"+strSettedCurrency);
					Btnorder(strCurrencynamevalue[0].trim());
				}
			});
			adBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					dialog.cancel();				
				}
			});
			adBuilder.show();
		}	
		if(v==btnC6)
		{
			AlertDialog.Builder adBuilder=new AlertDialog.Builder(CurrencyViewMain.this);
			adBuilder.setCancelable(false);
			final EditText etxtCurrencyvalue = new EditText(this);		
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			etxtCurrencyvalue.setLayoutParams(lp);
			adBuilder.setView(etxtCurrencyvalue);		
			final String[] strCurrencynamevalue =btnC6.getText().toString().split("-");
			adBuilder.setTitle("Enter:"+strCurrencynamevalue[0]);
			adBuilder.setIcon(R.drawable.ic_launcher);
			adBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					Toast.makeText(CurrencyViewMain.this,"ok pressed",Toast.LENGTH_SHORT).show();
					strSettedCurrency=etxtCurrencyvalue.getText().toString();
					btnC1.setText(strCurrencynamevalue[0].trim()+"-"+strSettedCurrency);
					Btnorder(strCurrencynamevalue[0].trim());
				}
			});
			adBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					dialog.cancel();				
				}
			});
			adBuilder.show();
		}	
		if(v==btnC7)
		{
			AlertDialog.Builder adBuilder=new AlertDialog.Builder(CurrencyViewMain.this);
			adBuilder.setCancelable(false);
			final EditText etxtCurrencyvalue = new EditText(this);		
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			etxtCurrencyvalue.setLayoutParams(lp);
			adBuilder.setView(etxtCurrencyvalue);		
			final String[] strCurrencynamevalue =btnC7.getText().toString().split("-");
			adBuilder.setTitle("Enter:"+strCurrencynamevalue[0]);
			adBuilder.setIcon(R.drawable.ic_launcher);
			adBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					Toast.makeText(CurrencyViewMain.this,"ok pressed",Toast.LENGTH_SHORT).show();
					strSettedCurrency=etxtCurrencyvalue.getText().toString();
					btnC1.setText(strCurrencynamevalue[0].trim()+"-"+strSettedCurrency);
					Btnorder(strCurrencynamevalue[0].trim());
				}
			});
			adBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					dialog.cancel();				
				}
			});
			adBuilder.show();
		}	
		if(v==btnC8)
		{
			AlertDialog.Builder adBuilder=new AlertDialog.Builder(CurrencyViewMain.this);
			adBuilder.setCancelable(false);
			final EditText etxtCurrencyvalue = new EditText(this);		
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			etxtCurrencyvalue.setLayoutParams(lp);
			adBuilder.setView(etxtCurrencyvalue);		
			final String[] strCurrencynamevalue =btnC8.getText().toString().split("-");
			adBuilder.setTitle("Enter:"+strCurrencynamevalue[0]);
			adBuilder.setIcon(R.drawable.ic_launcher);
			adBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					Toast.makeText(CurrencyViewMain.this,"ok pressed",Toast.LENGTH_SHORT).show();
					strSettedCurrency=etxtCurrencyvalue.getText().toString();
					btnC1.setText(strCurrencynamevalue[0].trim()+"-"+strSettedCurrency);
					Btnorder(strCurrencynamevalue[0].trim());
				}
			});
			adBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener()
			{				
				@Override
				public void onClick(DialogInterface dialog, int which) 
				{
					dialog.cancel();				
				}
			});
			adBuilder.show();
		}	
	}
	private void Btnorder(String Currencyname)
	{
		Log.i("NISHAD", Currencyname);
		String[] strButtoncaptionsall={"INR","GBP","USD","SAR","OMR","BAH","QAR","AED"};
		String[] strButtoncaptions=new String[7];
		int inJ=0;
		for(int inI=0;inI<strButtoncaptionsall.length;inI++)
		{
			if(!strButtoncaptionsall[inI].equals(Currencyname))
			{   
				if(inJ<7)
				{
					strButtoncaptions[inJ]=strButtoncaptionsall[inI];		
				}
				inJ++;
			}
		}		
		Button[] btnButtons={btnC2,btnC3,btnC4,btnC5,btnC6,btnC7,btnC8};
		for(int inI=0;inI<strButtoncaptions.length;inI++)
		{
			if(strButtoncaptions[inI]=="INR")
			{
				//calculation
				//float INRvalue=convertToINR(Currencyname);
				//btnButtons[inI].setText("INR"+"-"+INRvalue);
				btnButtons[inI].setText("INR"+"-"+"INRvalue");

			}
			if(strButtoncaptions[inI]=="GBP")
			{
				//float GBPvalue=convertToGBP(Currencyname);
				//btnButtons[inI].setText("GBP"+"-"+GBPvalue);
				btnButtons[inI].setText("GBP"+"-"+"GBPvalue");
			}
			if(strButtoncaptions[inI]=="USD")
			{
				//float USDvalue=convertToUSD(Currencyname);
				//btnButtons[inI].setText("USD"+"-"+USDvalue);
				btnButtons[inI].setText("USD"+"-"+"USDvalue");
			}
			if(strButtoncaptions[inI]=="SAR")
			{
				btnButtons[inI].setText("SAR"+"-"+"SARvalue");			
			}
			if(strButtoncaptions[inI]=="OMR")
			{
				btnButtons[inI].setText("OMR"+"-"+"OMRvalue");
			}

			if(strButtoncaptions[inI]=="BAH")
			{
				btnButtons[inI].setText("BAH"+"-"+"BAHvalue");
			}
			if(strButtoncaptions[inI]=="QAR")
			{
				btnButtons[inI].setText("QAR"+"-"+"QARvalue");
			}
			if(strButtoncaptions[inI]=="AED")
			{
				btnButtons[inI].setText("AED"+"-"+"AEDvalue");
			}
		}	
	}
	private float convertToINR(String currencyfrom)
	{
		float INRValue=Float.parseFloat(strSettedCurrency);
		if(currencyfrom=="GBP")
		{
			//get value from service sharedpreference
			return INRValue;
		}
		if(currencyfrom=="USD")
		{
			return INRValue;
		}
		if(currencyfrom=="SAR")
		{
			return INRValue;
		}
		if(currencyfrom=="OMR")
		{
			return INRValue;
		}
		if(currencyfrom=="BAH")
		{
			return INRValue;
		}
		if(currencyfrom=="QAR")
		{
			return INRValue;
		}
		if(currencyfrom=="AED")
		{
			return INRValue;
		}
		return INRValue;
	}
	private float convertToGBP(String currencyfrom)
	{
		float GBPValue=Float.parseFloat(strSettedCurrency);
		if(currencyfrom=="GBP")
		{
			//get value from service sharedpreference
			return GBPValue;
		}
		if(currencyfrom=="USD")
		{
			return GBPValue;
		}
		if(currencyfrom=="SAR")
		{
			return GBPValue;
		}
		if(currencyfrom=="OMR")
		{
			return GBPValue;
		}
		if(currencyfrom=="BAH")
		{
			return GBPValue;
		}
		if(currencyfrom=="QAR")
		{
			return GBPValue;
		}
		if(currencyfrom=="AED")
		{
			return GBPValue;
		}
		return GBPValue;
	}
	private float convertToUSD(String currencyfrom)
	{
		float USDValue=Float.parseFloat(strSettedCurrency);
		if(currencyfrom=="GBP")
		{
			//get value from service sharedpreference
			return USDValue;
		}
		if(currencyfrom=="USD")
		{
			return USDValue;
		}
		if(currencyfrom=="SAR")
		{
			return USDValue;
		}
		if(currencyfrom=="OMR")
		{
			return USDValue;
		}
		if(currencyfrom=="BAH")
		{
			return USDValue;
		}
		if(currencyfrom=="QAR")
		{
			return USDValue;
		}
		if(currencyfrom=="AED")
		{
			return USDValue;
		}
		return USDValue;
	}
	private float convertToSAR(String currencyfrom)
	{
		float SARValue=Float.parseFloat(strSettedCurrency);
		if(currencyfrom=="GBP")
		{
			//get value from service sharedpreference
			return SARValue;
		}
		if(currencyfrom=="USD")
		{
			return SARValue;
		}
		if(currencyfrom=="SAR")
		{
			return SARValue;
		}
		if(currencyfrom=="OMR")
		{
			return SARValue;
		}
		if(currencyfrom=="BAH")
		{
			return SARValue;
		}
		if(currencyfrom=="QAR")
		{
			return SARValue;
		}
		if(currencyfrom=="AED")
		{
			return SARValue;
		}
		return SARValue;
	}
	private float convertToOMR(String currencyfrom)
	{
		float OMRValue=Float.parseFloat(strSettedCurrency);
		if(currencyfrom=="GBP")
		{
			//get value from service sharedpreference
			return OMRValue;
		}
		if(currencyfrom=="USD")
		{
			return OMRValue;
		}
		if(currencyfrom=="SAR")
		{
			return OMRValue;
		}
		if(currencyfrom=="OMR")
		{
			return OMRValue;
		}
		if(currencyfrom=="BAH")
		{
			return OMRValue;
		}
		if(currencyfrom=="QAR")
		{
			return OMRValue;
		}
		if(currencyfrom=="AED")
		{
			return OMRValue;
		}
		return OMRValue;
	}
	private float convertToBAH(String currencyfrom)
	{
		float BAHValue=Float.parseFloat(strSettedCurrency);
		if(currencyfrom=="GBP")
		{
			//get value from service sharedpreference
			return BAHValue;
		}
		if(currencyfrom=="USD")
		{
			return BAHValue;
		}
		if(currencyfrom=="SAR")
		{
			return BAHValue;
		}
		if(currencyfrom=="OMR")
		{
			return BAHValue;
		}
		if(currencyfrom=="BAH")
		{
			return BAHValue;
		}
		if(currencyfrom=="QAR")
		{
			return BAHValue;
		}
		if(currencyfrom=="AED")
		{
			return BAHValue;
		}
		return BAHValue;
	}
	private float convertToQAR(String currencyfrom)
	{
		float QARValue=Float.parseFloat(strSettedCurrency);
		if(currencyfrom=="GBP")
		{
			//get value from service sharedpreference
			return QARValue;
		}
		if(currencyfrom=="USD")
		{
			return QARValue;
		}
		if(currencyfrom=="SAR")
		{
			return QARValue;
		}
		if(currencyfrom=="OMR")
		{
			return QARValue;
		}
		if(currencyfrom=="BAH")
		{
			return QARValue;
		}
		if(currencyfrom=="QAR")
		{
			return QARValue;
		}
		if(currencyfrom=="AED")
		{
			return QARValue;
		}
		return QARValue;
	}
	private float convertToAED(String currencyfrom)
	{
		float AEDValue=Float.parseFloat(strSettedCurrency);
		if(currencyfrom=="GBP")
		{
			//get value from service sharedpreference
			return AEDValue;
		}
		if(currencyfrom=="USD")
		{
			return AEDValue;
		}
		if(currencyfrom=="SAR")
		{
			return AEDValue;
		}
		if(currencyfrom=="OMR")
		{
			return AEDValue;
		}
		if(currencyfrom=="BAH")
		{
			return AEDValue;
		}
		if(currencyfrom=="QAR")
		{
			return AEDValue;
		}
		if(currencyfrom=="AED")
		{
			return AEDValue;
		}
		return AEDValue;
	}
	@Override
	protected void onStop()
	{
		super.onStop();
		SharedPreferences preferLastscreen=getSharedPreferences("Mscreen",0);
		SharedPreferences.Editor editor=preferLastscreen.edit();
		editor.putString("Kbtnc1",btnC1.getText().toString());
		editor.putString("Kbtnc2",btnC2.getText().toString());
		editor.putString("Kbtnc3",btnC3.getText().toString());
		editor.putString("Kbtnc4",btnC4.getText().toString());
		editor.putString("Kbtnc5",btnC5.getText().toString());
		editor.putString("Kbtnc6",btnC6.getText().toString());
		editor.putString("Kbtnc7",btnC7.getText().toString());
		editor.putString("Kbtnc8",btnC8.getText().toString());
		editor.commit();
	}   

}
