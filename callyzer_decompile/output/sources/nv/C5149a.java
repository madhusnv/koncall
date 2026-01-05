package nv;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nv.a */
/* loaded from: classes3.dex */
public final class C5149a {

    /* renamed from: a */
    public final int f25213a;

    /* renamed from: b */
    public final String f25214b;

    /* renamed from: c */
    public final boolean f25215c;

    /* renamed from: d */
    public final String f25216d;

    /* renamed from: e */
    public final List f25217e;

    public C5149a(int i10, String str, boolean z6, String permissionDescription, List list) {
        AbstractC4154l.m8923f(permissionDescription, "permissionDescription");
        this.f25213a = i10;
        this.f25214b = str;
        this.f25215c = z6;
        this.f25216d = permissionDescription;
        this.f25217e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5149a)) {
            return false;
        }
        C5149a c5149a = (C5149a) obj;
        return this.f25213a == c5149a.f25213a && AbstractC4154l.m8918a(this.f25214b, c5149a.f25214b) && this.f25215c == c5149a.f25215c && AbstractC4154l.m8918a(this.f25216d, c5149a.f25216d) && AbstractC4154l.m8918a(this.f25217e, c5149a.f25217e);
    }

    public final int hashCode() {
        return this.f25217e.hashCode() + AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC0030c.m113d(Integer.hashCode(this.f25213a) * 31, 31, this.f25214b), 31, this.f25215c), 31, this.f25216d);
    }

    public final String toString() {
        StringBuilder sbM14337q = a1.m14337q(this.f25213a, "PermissionNotGrantData(icon=", ", permissionTitle=", this.f25214b, ", isPermissionGranted=");
        AbstractC4801l.m9751y(sbM14337q, this.f25215c, ", permissionDescription=", this.f25216d, ", permission=");
        return AbstractC5601a.m11240k(")", sbM14337q, this.f25217e);
    }
}
