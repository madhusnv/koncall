package f8;

import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5179q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.l */
/* loaded from: classes.dex */
public final class C2217l {

    /* renamed from: a */
    public final String f10192a;

    /* renamed from: b */
    public final String f10193b;

    public C2217l(String name, String str) {
        AbstractC4154l.m8923f(name, "name");
        this.f10192a = name;
        this.f10193b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2217l) {
                C2217l c2217l = (C2217l) obj;
                String str = c2217l.f10193b;
                if (AbstractC4154l.m8918a(this.f10192a, c2217l.f10192a)) {
                    String str2 = this.f10193b;
                    if (str2 != null ? AbstractC4154l.m8918a(str2, str) : str == null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f10192a.hashCode() * 31;
        String str = this.f10193b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC5179q.m10123e("\n            |ViewInfo {\n            |   name = '" + this.f10192a + "',\n            |   sql = '" + this.f10193b + "'\n            |}\n        ");
    }
}
