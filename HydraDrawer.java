package hydra.drawbyhand;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.util.*;

public class HydraDrawer extends View
{
    private Paint paint;
    private Path path;

    public HydraDrawer(Context context)
	{
        super(context);
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        path = new Path();
    }

	public HydraDrawer(Context context, AttributeSet attributeSet)
	{
        super(context, attributeSet);
        paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        path = new Path();
    }
    @Override
    protected void onDraw(Canvas canvas)
	{
        super.onDraw(canvas);
		canvas.drawColor(Color.BLACK);
        canvas.drawPath(path, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
	{
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction())
		{
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x, y);
                return true;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x, y);
                break;
            default:
                return false;
        }
        invalidate();
        return true;
    }
}
