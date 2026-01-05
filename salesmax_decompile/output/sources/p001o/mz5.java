package p001o;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.x8b;

/* loaded from: classes2.dex */
public interface mz5 {

    /* renamed from: o.mz5$a */
    public static class C15451a {

        /* renamed from: a */
        public final int f36120a;

        /* renamed from: b */
        public final x8b.C18076b f36121b;

        /* renamed from: c */
        public final CopyOnWriteArrayList f36122c;

        /* renamed from: o.mz5$a$a */
        public static final class a {

            /* renamed from: a */
            public Handler f36123a;

            /* renamed from: b */
            public mz5 f36124b;

            public a(Handler handler, mz5 mz5Var) {
                this.f36123a = handler;
                this.f36124b = mz5Var;
            }
        }

        public C15451a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m39896n(mz5 mz5Var) {
            mz5Var.mo7411Z(this.f36120a, this.f36121b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m39897o(mz5 mz5Var) {
            mz5Var.mo7404E(this.f36120a, this.f36121b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m39898p(mz5 mz5Var) {
            mz5Var.n0(this.f36120a, this.f36121b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m39899q(mz5 mz5Var, int i) {
            mz5Var.m39889N(this.f36120a, this.f36121b);
            mz5Var.mo7407R(this.f36120a, this.f36121b, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m39900r(mz5 mz5Var, Exception exc) {
            mz5Var.mo7408T(this.f36120a, this.f36121b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m39901s(mz5 mz5Var) {
            mz5Var.i0(this.f36120a, this.f36121b);
        }

        /* renamed from: g */
        public void m39902g(Handler handler, mz5 mz5Var) {
            op0.m42515e(handler);
            op0.m42515e(mz5Var);
            this.f36122c.add(new a(handler, mz5Var));
        }

        /* renamed from: h */
        public void m39903h() {
            Iterator it = this.f36122c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final mz5 mz5Var = aVar.f36124b;
                sqi.W0(aVar.f36123a, new Runnable() { // from class: o.lz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34554a.m39896n(mz5Var);
                    }
                });
            }
        }

        /* renamed from: i */
        public void m39904i() {
            Iterator it = this.f36122c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final mz5 mz5Var = aVar.f36124b;
                sqi.W0(aVar.f36123a, new Runnable() { // from class: o.kz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32870a.m39897o(mz5Var);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m39905j() {
            Iterator it = this.f36122c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final mz5 mz5Var = aVar.f36124b;
                sqi.W0(aVar.f36123a, new Runnable() { // from class: o.jz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31282a.m39898p(mz5Var);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m39906k(final int i) {
            Iterator it = this.f36122c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final mz5 mz5Var = aVar.f36124b;
                sqi.W0(aVar.f36123a, new Runnable() { // from class: o.gz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25989a.m39899q(mz5Var, i);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m39907l(final Exception exc) {
            Iterator it = this.f36122c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final mz5 mz5Var = aVar.f36124b;
                sqi.W0(aVar.f36123a, new Runnable() { // from class: o.iz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29401a.m39900r(mz5Var, exc);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m39908m() {
            Iterator it = this.f36122c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final mz5 mz5Var = aVar.f36124b;
                sqi.W0(aVar.f36123a, new Runnable() { // from class: o.hz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27819a.m39901s(mz5Var);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m39909t(mz5 mz5Var) {
            Iterator it = this.f36122c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.f36124b == mz5Var) {
                    this.f36122c.remove(aVar);
                }
            }
        }

        /* renamed from: u */
        public C15451a m39910u(int i, x8b.C18076b c18076b) {
            return new C15451a(this.f36122c, i, c18076b);
        }

        public C15451a(CopyOnWriteArrayList copyOnWriteArrayList, int i, x8b.C18076b c18076b) {
            this.f36122c = copyOnWriteArrayList;
            this.f36120a = i;
            this.f36121b = c18076b;
        }
    }

    /* renamed from: E */
    void mo7404E(int i, x8b.C18076b c18076b);

    /* renamed from: N */
    default void m39889N(int i, x8b.C18076b c18076b) {
    }

    /* renamed from: R */
    void mo7407R(int i, x8b.C18076b c18076b, int i2);

    /* renamed from: T */
    void mo7408T(int i, x8b.C18076b c18076b, Exception exc);

    /* renamed from: Z */
    void mo7411Z(int i, x8b.C18076b c18076b);

    void i0(int i, x8b.C18076b c18076b);

    void n0(int i, x8b.C18076b c18076b);
}
