package p001o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public abstract class dbj {

    /* renamed from: o.dbj$a */
    public static class C12860a {
        /* renamed from: a */
        public static Rect m22764a(WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    /* renamed from: o.dbj$b */
    public static class C12861b {
        /* renamed from: a */
        public static Rect m22765a(WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    /* renamed from: a */
    public static Rect m22763a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? C12861b.m22765a(windowManager) : C12860a.m22764a(windowManager);
    }
}
