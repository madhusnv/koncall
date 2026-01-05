package tu;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tu.b */
/* loaded from: classes3.dex */
public final class C7226b {

    /* renamed from: a */
    public final int f34557a;

    /* renamed from: b */
    public final int f34558b;

    /* renamed from: c */
    public final String f34559c;

    /* renamed from: d */
    public final boolean f34560d;

    public C7226b(String value, int i10, int i11, boolean z6) {
        AbstractC4154l.m8923f(value, "value");
        this.f34557a = i10;
        this.f34558b = i11;
        this.f34559c = value;
        this.f34560d = z6;
    }

    /* renamed from: a */
    public static C7226b m13454a(C7226b c7226b, String str) {
        int i10 = c7226b.f34557a;
        int i11 = c7226b.f34558b;
        boolean z6 = c7226b.f34560d;
        c7226b.getClass();
        return new C7226b(str, i10, i11, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7226b)) {
            return false;
        }
        C7226b c7226b = (C7226b) obj;
        return this.f34557a == c7226b.f34557a && this.f34558b == c7226b.f34558b && AbstractC4154l.m8918a(this.f34559c, c7226b.f34559c) && this.f34560d == c7226b.f34560d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34560d) + AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f34558b, Integer.hashCode(this.f34557a) * 31, 31), 31, this.f34559c);
    }

    public final String toString() {
        StringBuilder sbM4566m = AbstractC1452a.m4566m(this.f34557a, this.f34558b, "SettingsUiModel(icon=", ", title=", ", value=");
        sbM4566m.append(this.f34559c);
        sbM4566m.append(", isEnabled=");
        sbM4566m.append(this.f34560d);
        sbM4566m.append(")");
        return sbM4566m.toString();
    }
}
