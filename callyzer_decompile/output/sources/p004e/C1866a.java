package p004e;

import android.window.BackEvent;
import c6.e0;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.a */
/* loaded from: classes.dex */
public final class C1866a {

    /* renamed from: a */
    public final float f8855a;

    /* renamed from: b */
    public final float f8856b;

    /* renamed from: c */
    public final float f8857c;

    /* renamed from: d */
    public final int f8858d;

    public C1866a(BackEvent backEvent) {
        float fM2376w = e0.m2376w(backEvent);
        float fM2377x = e0.m2377x(backEvent);
        float fM2371r = e0.m2371r(backEvent);
        int iM2375v = e0.m2375v(backEvent);
        this.f8855a = fM2376w;
        this.f8856b = fM2377x;
        this.f8857c = fM2371r;
        this.f8858d = iM2375v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f8855a);
        sb2.append(", touchY=");
        sb2.append(this.f8856b);
        sb2.append(", progress=");
        sb2.append(this.f8857c);
        sb2.append(", swipeEdge=");
        return AbstractC1452a.m4563j(sb2, this.f8858d, '}');
    }
}
