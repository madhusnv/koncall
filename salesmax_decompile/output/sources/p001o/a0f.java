package p001o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001o.vre;

/* loaded from: classes6.dex */
public final class a0f implements n64, k84 {

    /* renamed from: b */
    public static final C12074a f14007b = new C12074a(null);

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f14008c = AtomicReferenceFieldUpdater.newUpdater(a0f.class, Object.class, "result");

    /* renamed from: a */
    public final n64 f14009a;
    private volatile Object result;

    /* renamed from: o.a0f$a */
    public static final class C12074a {
        public C12074a() {
        }

        public /* synthetic */ C12074a(id5 id5Var) {
            this();
        }
    }

    public a0f(n64 n64Var, Object obj) {
        sq8.m48649h(n64Var, "delegate");
        this.f14009a = n64Var;
        this.result = obj;
    }

    /* renamed from: b */
    public final Object m16313b() throws Throwable {
        Object obj = this.result;
        j84 j84Var = j84.UNDECIDED;
        if (obj == j84Var) {
            if (j9.m33417a(f14008c, this, j84Var, uq8.m51918f())) {
                return uq8.m51918f();
            }
            obj = this.result;
        }
        if (obj == j84.RESUMED) {
            return uq8.m51918f();
        }
        if (obj instanceof vre.C17666b) {
            throw ((vre.C17666b) obj).f50799a;
        }
        return obj;
    }

    @Override // p001o.k84
    public k84 getCallerFrame() {
        n64 n64Var = this.f14009a;
        if (n64Var instanceof k84) {
            return (k84) n64Var;
        }
        return null;
    }

    @Override // p001o.n64
    public q74 getContext() {
        return this.f14009a.getContext();
    }

    @Override // p001o.n64
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            j84 j84Var = j84.UNDECIDED;
            if (obj2 == j84Var) {
                if (j9.m33417a(f14008c, this, j84Var, obj)) {
                    return;
                }
            } else {
                if (obj2 != uq8.m51918f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (j9.m33417a(f14008c, this, uq8.m51918f(), j84.RESUMED)) {
                    this.f14009a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f14009a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0f(n64 n64Var) {
        this(n64Var, j84.UNDECIDED);
        sq8.m48649h(n64Var, "delegate");
    }
}
