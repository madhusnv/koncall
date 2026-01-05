package p001o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes2.dex */
public abstract class gt7 {
    /* renamed from: a */
    public static final Bitmap m29470a(Context context, int i) {
        sq8.m48649h(context, "context");
        Drawable drawable = c64.getDrawable(context, i);
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof VectorDrawable) {
            return m29471b((VectorDrawable) drawable);
        }
        return null;
    }

    /* renamed from: b */
    public static final Bitmap m29471b(VectorDrawable vectorDrawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        sq8.m48648g(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        vectorDrawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
