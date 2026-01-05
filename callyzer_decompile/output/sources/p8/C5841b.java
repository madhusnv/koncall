package p8;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.b */
/* loaded from: classes.dex */
public final class C5841b extends Property {

    /* renamed from: a */
    public Rect f28545a;

    @Override // android.util.Property
    public final Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.f28545a);
        return new PointF(r0.left, r0.top);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.f28545a;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}
