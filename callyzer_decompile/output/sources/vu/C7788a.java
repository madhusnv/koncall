package vu;

import a2.AbstractC0030c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vu.a */
/* loaded from: classes3.dex */
public final class C7788a {

    /* renamed from: a */
    public final List f37452a;

    /* renamed from: b */
    public final String f37453b;

    /* renamed from: c */
    public final boolean f37454c;

    public C7788a(String str, List versionList, boolean z6) {
        AbstractC4154l.m8923f(versionList, "versionList");
        this.f37452a = versionList;
        this.f37453b = str;
        this.f37454c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7788a)) {
            return false;
        }
        C7788a c7788a = (C7788a) obj;
        return AbstractC4154l.m8918a(this.f37452a, c7788a.f37452a) && this.f37453b.equals(c7788a.f37453b) && this.f37454c == c7788a.f37454c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37454c) + AbstractC0030c.m113d(this.f37452a.hashCode() * 31, 31, this.f37453b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VersionState(versionList=");
        sb2.append(this.f37452a);
        sb2.append(", lastVersion=");
        sb2.append(this.f37453b);
        sb2.append(", empty=");
        return AbstractC5601a.m11242m(sb2, this.f37454c, ")");
    }
}
