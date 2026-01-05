package p001o;

import p001o.z41;

/* loaded from: classes6.dex */
public abstract class kcb extends de1 {

    /* renamed from: o.kcb$a */
    public static abstract class AbstractC14782a {
        /* renamed from: a */
        public abstract kcb mo35405a();

        /* renamed from: b */
        public abstract AbstractC14782a mo35406b(long j);

        /* renamed from: c */
        public abstract AbstractC14782a mo35407c(long j);

        /* renamed from: d */
        public abstract AbstractC14782a mo35408d(long j);
    }

    /* renamed from: o.kcb$b */
    public enum EnumC14783b {
        SENT,
        RECEIVED
    }

    /* renamed from: a */
    public static AbstractC14782a m35400a(EnumC14783b enumC14783b, long j) {
        return new z41.C18550b().m58682e((EnumC14783b) kri.m36136b(enumC14783b, "type")).mo35407c(j).mo35408d(0L).mo35406b(0L);
    }

    /* renamed from: b */
    public abstract long mo35401b();

    /* renamed from: c */
    public abstract long mo35402c();

    /* renamed from: d */
    public abstract EnumC14783b mo35403d();

    /* renamed from: e */
    public abstract long mo35404e();
}
