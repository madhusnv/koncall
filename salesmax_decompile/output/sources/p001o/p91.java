package p001o;

/* loaded from: classes5.dex */
public abstract class p91 {

    /* renamed from: o.p91$a */
    public enum EnumC16032a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static p91 m43204a() {
        return new w31(EnumC16032a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static p91 m43205d() {
        return new w31(EnumC16032a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static p91 m43206e(long j) {
        return new w31(EnumC16032a.OK, j);
    }

    /* renamed from: f */
    public static p91 m43207f() {
        return new w31(EnumC16032a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo43208b();

    /* renamed from: c */
    public abstract EnumC16032a mo43209c();
}
