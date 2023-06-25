package hydra.drawbyhand;

import android.app.*;
import android.os.*;
import android.view.*;

public class MainActivity extends Activity
{
	private HydraDrawer hydraDrawer;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		hydraDrawer=new HydraDrawer(this);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event)
	{
		return hydraDrawer.onTouchEvent(event);
	}
}
