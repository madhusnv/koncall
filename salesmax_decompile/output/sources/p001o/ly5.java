package p001o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes5.dex */
public abstract class ly5 {

    /* renamed from: a */
    public static final mi1 f34510a = new C15177a();

    /* renamed from: o.ly5$a */
    public class C15177a extends ni1 {
        @Override // p001o.ni1, p001o.mi1
        /* renamed from: c */
        public void mo38104c(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    public static zne m38102a(mi1 mi1Var, Drawable drawable, int i, int i2) {
        Bitmap bitmapM38103b;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapM38103b = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapM38103b = null;
        } else {
            bitmapM38103b = m38103b(mi1Var, current, i, i2);
            z = true;
        }
        if (!z) {
            mi1Var = f34510a;
        }
        return oi1.m42257d(bitmapM38103b, mi1Var);
    }

    /* renamed from: b */
    public static Bitmap m38103b(mi1 mi1Var, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock lockM59960i = zuh.m59960i();
        lockM59960i.lock();
        Bitmap bitmapMo39089d = mi1Var.mo39089d(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo39089d);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo39089d;
        } finally {
            lockM59960i.unlock();
        }
    }
}
