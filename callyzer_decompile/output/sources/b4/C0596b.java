package b4;

import android.content.res.Resources;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b4.b */
/* loaded from: classes.dex */
public final class C0596b {

    /* renamed from: a */
    public final Resources.Theme f3972a;

    /* renamed from: b */
    public final int f3973b;

    public C0596b(Resources.Theme theme, int i10) {
        this.f3972a = theme;
        this.f3973b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0596b)) {
            return false;
        }
        C0596b c0596b = (C0596b) obj;
        return AbstractC4154l.m8918a(this.f3972a, c0596b.f3972a) && this.f3973b == c0596b.f3973b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3973b) + (this.f3972a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f3972a);
        sb2.append(", id=");
        return AbstractC1452a.m4563j(sb2, this.f3973b, ')');
    }
}
