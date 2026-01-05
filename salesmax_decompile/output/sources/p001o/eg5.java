package p001o;

import com.google.android.gms.common.Scopes;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class eg5 extends ahe implements Closeable {

    /* renamed from: o.eg5$a */
    public static final class C13183a extends jgg implements xk7 {

        /* renamed from: a */
        public int f21589a;

        /* renamed from: b */
        public final /* synthetic */ r9d f21590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13183a(r9d r9dVar, n64 n64Var) {
            super(1, n64Var);
            this.f21590b = r9dVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C13183a(this.f21590b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f21589a;
            if (i == 0) {
                wre.m54934b(obj);
                r9d r9dVar = this.f21590b;
                this.f21589a = 1;
                obj = n71.m40193c(r9dVar, null, null, this, 6, null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return ((r81) obj).m46332a();
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C13183a) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg5(r9d r9dVar, gi9 gi9Var, ii9 ii9Var) {
        super(new kb9(r9dVar), new xi6(r9dVar), new tmd(ii9Var), new af8(gi9Var, r9dVar));
        sq8.m48649h(r9dVar, "platformProvider");
        sq8.m48649h(gi9Var, "imdsClient");
        sq8.m48649h(ii9Var, Scopes.PROFILE);
    }

    /* renamed from: C */
    public static final te8 m24966C() {
        return new te8();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        for (wge wgeVar : m17093h()) {
            if (wgeVar instanceof Closeable) {
                ((Closeable) wgeVar).close();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ eg5(r9d r9dVar, gi9 gi9Var, ii9 ii9Var, int i, id5 id5Var) {
        r9dVar = (i & 1) != 0 ? r9d.f43250a.m46382a() : r9dVar;
        this(r9dVar, (i & 2) != 0 ? si9.m48360a(new uk7() { // from class: o.dg5
            @Override // p001o.uk7
            public final Object invoke() {
                return eg5.m24966C();
            }
        }) : gi9Var, (i & 4) != 0 ? ki9.m35729a(new C13183a(r9dVar, null)) : ii9Var);
    }
}
