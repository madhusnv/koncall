package p001o;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class a84 {

    /* renamed from: a */
    public static final a84 f14277a = new a84();

    /* renamed from: b */
    public static final CoroutineExceptionHandler f14278b = new C12111a(CoroutineExceptionHandler.f13954j);

    /* renamed from: c */
    public static final int f14279c = 8;

    /* renamed from: o.a84$a */
    public static final class C12111a extends i7 implements CoroutineExceptionHandler {
        public C12111a(CoroutineExceptionHandler.C11950a c11950a) {
            super(c11950a);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: Y */
        public void mo16249Y(q74 q74Var, Throwable th) {
            l07.m36402c(l07.f32907a, "coroutine: exception in processing", th, null, 4, null);
        }
    }

    /* renamed from: a */
    public final CoroutineExceptionHandler m16672a() {
        return f14278b;
    }
}
