package p001o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class ey5 implements jpe {

    /* renamed from: a */
    public final mi1 f22379a;

    /* renamed from: b */
    public final jpe f22380b;

    /* renamed from: c */
    public final jpe f22381c;

    public ey5(mi1 mi1Var, jpe jpeVar, jpe jpeVar2) {
        this.f22379a = mi1Var;
        this.f22380b = jpeVar;
        this.f22381c = jpeVar2;
    }

    /* renamed from: b */
    public static zne m25844b(zne zneVar) {
        return zneVar;
    }

    @Override // p001o.jpe
    /* renamed from: a */
    public zne mo17137a(zne zneVar, rec recVar) {
        Drawable drawable = (Drawable) zneVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f22380b.mo17137a(oi1.m42257d(((BitmapDrawable) drawable).getBitmap(), this.f22379a), recVar);
        }
        if (drawable instanceof js7) {
            return this.f22381c.mo17137a(m25844b(zneVar), recVar);
        }
        return null;
    }
}
