package ae;

import android.graphics.drawable.Drawable;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import yd.EnumC8622e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ae.e */
/* loaded from: classes.dex */
public final class C0124e extends AbstractC0125f {

    /* renamed from: a */
    public final Drawable f407a;

    /* renamed from: b */
    public final boolean f408b;

    /* renamed from: c */
    public final EnumC8622e f409c;

    public C0124e(Drawable drawable, boolean z6, EnumC8622e enumC8622e) {
        this.f407a = drawable;
        this.f408b = z6;
        this.f409c = enumC8622e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0124e)) {
            return false;
        }
        C0124e c0124e = (C0124e) obj;
        return AbstractC4154l.m8918a(this.f407a, c0124e.f407a) && this.f408b == c0124e.f408b && this.f409c == c0124e.f409c;
    }

    public final int hashCode() {
        return this.f409c.hashCode() + AbstractC1452a.m4558e(this.f407a.hashCode() * 31, 31, this.f408b);
    }
}
