package ge;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.e */
/* loaded from: classes.dex */
public final class C2573e extends AbstractC2578j {

    /* renamed from: a */
    public final Drawable f13997a;

    /* renamed from: b */
    public final C2577i f13998b;

    /* renamed from: c */
    public final Throwable f13999c;

    public C2573e(Drawable drawable, C2577i c2577i, Throwable th2) {
        this.f13997a = drawable;
        this.f13998b = c2577i;
        this.f13999c = th2;
    }

    @Override // ge.AbstractC2578j
    /* renamed from: a */
    public final C2577i mo6573a() {
        return this.f13998b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2573e)) {
            return false;
        }
        C2573e c2573e = (C2573e) obj;
        return AbstractC4154l.m8918a(this.f13997a, c2573e.f13997a) && AbstractC4154l.m8918a(this.f13998b, c2573e.f13998b) && AbstractC4154l.m8918a(this.f13999c, c2573e.f13999c);
    }

    public final int hashCode() {
        Drawable drawable = this.f13997a;
        return this.f13999c.hashCode() + ((this.f13998b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
