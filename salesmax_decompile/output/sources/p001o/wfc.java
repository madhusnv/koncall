package p001o;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class wfc {
    /* renamed from: h */
    public static wfc m54332h(int i, int i2, Rect rect, Size size, int i3, boolean z) {
        return m54333i(i, i2, rect, size, i3, z, false);
    }

    /* renamed from: i */
    public static wfc m54333i(int i, int i2, Rect rect, Size size, int i3, boolean z, boolean z2) {
        return new b51(UUID.randomUUID(), i, i2, rect, size, i3, z, z2);
    }

    /* renamed from: a */
    public abstract Rect mo18157a();

    /* renamed from: b */
    public abstract int mo18158b();

    /* renamed from: c */
    public abstract int mo18159c();

    /* renamed from: d */
    public abstract Size mo18160d();

    /* renamed from: e */
    public abstract int mo18161e();

    /* renamed from: f */
    public abstract UUID mo18162f();

    /* renamed from: g */
    public abstract boolean mo18163g();

    /* renamed from: j */
    public abstract boolean mo18164j();
}
