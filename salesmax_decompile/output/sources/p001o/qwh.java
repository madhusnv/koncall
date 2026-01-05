package p001o;

import android.util.Base64;
import p001o.z51;

/* loaded from: classes5.dex */
public abstract class qwh {

    /* renamed from: o.qwh$a */
    public static abstract class AbstractC16484a {
        /* renamed from: a */
        public abstract qwh mo45897a();

        /* renamed from: b */
        public abstract AbstractC16484a mo45898b(String str);

        /* renamed from: c */
        public abstract AbstractC16484a mo45899c(byte[] bArr);

        /* renamed from: d */
        public abstract AbstractC16484a mo45900d(fid fidVar);
    }

    /* renamed from: a */
    public static AbstractC16484a m45891a() {
        return new z51.C18559b().mo45900d(fid.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo45892b();

    /* renamed from: c */
    public abstract byte[] mo45893c();

    /* renamed from: d */
    public abstract fid mo45894d();

    /* renamed from: e */
    public boolean m45895e() {
        return mo45893c() != null;
    }

    /* renamed from: f */
    public qwh m45896f(fid fidVar) {
        return m45891a().mo45898b(mo45892b()).mo45900d(fidVar).mo45899c(mo45893c()).mo45897a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo45892b();
        objArr[1] = mo45894d();
        objArr[2] = mo45893c() == null ? "" : Base64.encodeToString(mo45893c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
