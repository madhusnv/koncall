package p001o;

/* loaded from: classes2.dex */
public abstract class pa2 {

    /* renamed from: o.pa2$a */
    public static abstract class AbstractC16043a {
        /* renamed from: a */
        public static AbstractC16043a m43263a(int i) {
            return m43264b(i, null);
        }

        /* renamed from: b */
        public static AbstractC16043a m43264b(int i, Throwable th) {
            return new b41(i, th);
        }

        /* renamed from: c */
        public abstract Throwable mo18143c();

        /* renamed from: d */
        public abstract int mo18144d();
    }

    /* renamed from: o.pa2$b */
    public enum EnumC16044b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: a */
    public static pa2 m43261a(EnumC16044b enumC16044b) {
        return m43262b(enumC16044b, null);
    }

    /* renamed from: b */
    public static pa2 m43262b(EnumC16044b enumC16044b, AbstractC16043a abstractC16043a) {
        return new a41(enumC16044b, abstractC16043a);
    }

    /* renamed from: c */
    public abstract AbstractC16043a mo16401c();

    /* renamed from: d */
    public abstract EnumC16044b mo16402d();
}
