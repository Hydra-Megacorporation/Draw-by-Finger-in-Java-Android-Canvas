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
		hydraDrawer=new HydraDrawer(this);
		setContentView(hydraDrawer);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event)
	{
		return hydraDrawer.onTouchEvent(event);
	}
}
