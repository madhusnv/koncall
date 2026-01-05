package p001o;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class af8 implements wge, Closeable {

    /* renamed from: a */
    public final gi9 f14596a;

    /* renamed from: b */
    public final f9d f14597b;

    /* renamed from: c */
    public final ii9 f14598c;

    /* renamed from: o.af8$a */
    public /* synthetic */ class C12151a extends dm7 implements xk7 {
        public C12151a(Object obj) {
            super(1, obj, af8.class, "loadRegion", "loadRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n64 n64Var) {
            return ((af8) this.receiver).m16989d(n64Var);
        }
    }

    public af8(gi9 gi9Var, f9d f9dVar) {
        sq8.m48649h(gi9Var, "client");
        sq8.m48649h(f9dVar, "platformProvider");
        this.f14596a = gi9Var;
        this.f14597b = f9dVar;
        this.f14598c = ki9.m35729a(new C12151a(this));
    }

    @Override // p001o.wge
    /* renamed from: a */
    public Object mo16988a(n64 n64Var) {
        if (sq8.m48644c(bj6.m19237f(o81.f37890a.m41736i(), this.f14597b), ml1.m39301a(true))) {
            return null;
        }
        return this.f14598c.mo32174a(n64Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f14596a.isInitialized()) {
            ((fk8) this.f14596a.getValue()).close();
        }
    }

    /* renamed from: d */
    public final Object m16989d(n64 n64Var) {
        return ((fk8) this.f14596a.getValue()).e0("/latest/meta-data/placement/region", n64Var);
    }
}
