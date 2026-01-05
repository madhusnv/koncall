package p001o;

import p001o.d01;

/* loaded from: classes3.dex */
public abstract class qrf {
    /* renamed from: a */
    public static final String m45814a(d01.C12776a c12776a) {
        sq8.m48649h(c12776a, "<this>");
        return d01.m22167e("aws.auth#sigv4s3express");
    }

    /* renamed from: b */
    public static final vz0 m45815b(boolean z, String str, String str2, Boolean bool, Boolean bool2) {
        return xz0.m56984a(m45814a(d01.f18915b), orf.m42605c(z, str, str2, bool, bool2).getAttributes());
    }

    /* renamed from: c */
    public static /* synthetic */ vz0 m45816c(boolean z, String str, String str2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        return m45815b(z, str, str2, bool, bool2);
    }
}
