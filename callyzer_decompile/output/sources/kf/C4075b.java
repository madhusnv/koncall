package kf;

import java.util.Arrays;
import qf.InterfaceC6203b;
import sf.AbstractC6840z;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kf.b */
/* loaded from: classes.dex */
public final class C4075b implements InterfaceC6203b {

    /* renamed from: c */
    public static final C4075b f20943c;

    /* renamed from: a */
    public final boolean f20944a;

    /* renamed from: b */
    public final String f20945b;

    static {
        C7105p c7105p = new C7105p(8, (char) 0);
        c7105p.f34290b = Boolean.FALSE;
        f20943c = new C4075b(c7105p);
    }

    public C4075b(C7105p c7105p) {
        this.f20944a = ((Boolean) c7105p.f34290b).booleanValue();
        this.f20945b = (String) c7105p.f34291c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4075b)) {
            return false;
        }
        C4075b c4075b = (C4075b) obj;
        return AbstractC6840z.m13040k(null, null) && this.f20944a == c4075b.f20944a && AbstractC6840z.m13040k(this.f20945b, c4075b.f20945b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f20944a), this.f20945b});
    }
}
