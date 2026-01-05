package p001o;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes3.dex */
public class dy5 extends Property {

    /* renamed from: a */
    public static final Property f20643a = new dy5();

    public dy5() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
