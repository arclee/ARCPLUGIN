package com.Company.AssetBundle;
import com.unity3d.player.UnityPlayerActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.bluetooth.BluetoothAdapter;

public class UnityPlayerExtendActivity extends UnityPlayerActivity {
	private BluetoothAdapter mBluetoothAdapter = null;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	//setContentView(R.layout.main);
	mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	if (mBluetoothAdapter == null) {
	Toast.makeText(this,
	"Bluetooth is not available.",
	Toast.LENGTH_LONG).show();
	finish();
	return;
	}
	if (!mBluetoothAdapter.isEnabled()) {
	Toast.makeText(this,
	"Please check your BT settings.", // and re-run this program
	Toast.LENGTH_LONG).show();
	//finish();
	//return;
	}
	}
}
