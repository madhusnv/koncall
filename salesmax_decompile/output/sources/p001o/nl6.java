package p001o;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class nl6 implements ls6 {

    /* renamed from: o.nl6$a */
    public static final class C15603a {

        /* renamed from: a */
        public static final nl6 f36993a = new nl6();
    }

    /* renamed from: a */
    public static nl6 m40745a() {
        return C15603a.f36993a;
    }

    /* renamed from: b */
    public static Executor m40746b() {
        return (Executor) cgd.m21197c(ml6.m39307a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return m40746b();
    }
}
