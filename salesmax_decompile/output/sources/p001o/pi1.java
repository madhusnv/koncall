package p001o;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C10724a;

/* loaded from: classes5.dex */
public abstract class pi1 implements xuh {
    @Override // p001o.xuh
    /* renamed from: b */
    public final zne mo26072b(Context context, zne zneVar, int i, int i2) {
        if (!uqi.m51938s(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        mi1 mi1VarM12656f = ComponentCallbacks2C10724a.m12647c(context).m12656f();
        Bitmap bitmap = (Bitmap) zneVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo37060c = mo37060c(mi1VarM12656f, bitmap, i, i2);
        return bitmap.equals(bitmapMo37060c) ? zneVar : oi1.m42257d(bitmapMo37060c, mi1VarM12656f);
    }

    /* renamed from: c */
    public abstract Bitmap mo37060c(mi1 mi1Var, Bitmap bitmap, int i, int i2);
}
