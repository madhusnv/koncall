package p001o;

import androidx.camera.core.impl.C1896a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p001o.v6c;

/* loaded from: classes2.dex */
public final class k5e {

    /* renamed from: b */
    public static final C1896a f31494b = C1896a.m4696b();

    /* renamed from: c */
    public static final k5e f31495c = new k5e();

    /* renamed from: a */
    public final dqb f31496a = dqb.m23683h(f31494b);

    /* renamed from: o.k5e$a */
    public static class C14715a implements v6c.InterfaceC17516a {

        /* renamed from: a */
        public final hu3 f31497a;

        public C14715a(hu3 hu3Var) {
            this.f31497a = hu3Var;
        }

        @Override // p001o.v6c.InterfaceC17516a
        /* renamed from: a */
        public void mo4754a(Object obj) {
            this.f31497a.accept(obj);
        }

        @Override // p001o.v6c.InterfaceC17516a
        public void onError(Throwable th) {
            wja.m54630d("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
        }
    }

    /* renamed from: b */
    public static k5e m35009b() {
        return f31495c;
    }

    /* renamed from: a */
    public C1896a m35010a() {
        try {
            return (C1896a) this.f31496a.m24340c().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
        }
    }

    /* renamed from: c */
    public void m35011c(Executor executor, hu3 hu3Var) {
        this.f31496a.mo24338a(executor, new C14715a(hu3Var));
    }

    /* renamed from: d */
    public void m35012d(C1896a c1896a) {
        this.f31496a.m23684g(c1896a);
    }
}
