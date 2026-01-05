package p001o;

import p001o.f41;

/* loaded from: classes5.dex */
public abstract class ab3 {

    /* renamed from: o.ab3$a */
    public static abstract class AbstractC12131a {
        /* renamed from: a */
        public abstract ab3 mo16809a();

        /* renamed from: b */
        public abstract AbstractC12131a mo16810b(od0 od0Var);

        /* renamed from: c */
        public abstract AbstractC12131a mo16811c(EnumC12132b enumC12132b);
    }

    /* renamed from: o.ab3$b */
    public enum EnumC12132b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        EnumC12132b(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public static AbstractC12131a m16806a() {
        return new f41.C13322b();
    }

    /* renamed from: b */
    public abstract od0 mo16807b();

    /* renamed from: c */
    public abstract EnumC12132b mo16808c();
}
