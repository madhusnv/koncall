package p001o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p001o.l67;

/* loaded from: classes3.dex */
public abstract class z9 extends l67.AbstractC15003a implements Runnable {

    /* renamed from: h */
    public zfa f56717h;

    /* renamed from: q */
    public Object f56718q;

    /* renamed from: o.z9$a */
    public static final class C18581a extends z9 {
        public C18581a(zfa zfaVar, ol7 ol7Var) {
            super(zfaVar, ol7Var);
        }

        @Override // p001o.z9
        /* renamed from: H */
        public void mo58948H(Object obj) {
            mo43035B(obj);
        }

        @Override // p001o.z9
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public Object mo58947G(ol7 ol7Var, Object obj) {
            return ol7Var.apply(obj);
        }
    }

    public z9(zfa zfaVar, Object obj) {
        this.f56717h = (zfa) dgd.m23062o(zfaVar);
        this.f56718q = dgd.m23062o(obj);
    }

    /* renamed from: F */
    public static zfa m58946F(zfa zfaVar, ol7 ol7Var, Executor executor) {
        dgd.m23062o(ol7Var);
        C18581a c18581a = new C18581a(zfaVar, ol7Var);
        zfaVar.addListener(c18581a, bmb.m19376b(executor, c18581a));
        return c18581a;
    }

    /* renamed from: G */
    public abstract Object mo58947G(Object obj, Object obj2);

    /* renamed from: H */
    public abstract void mo58948H(Object obj);

    @Override // p001o.p7
    /* renamed from: m */
    public final void mo43041m() {
        m43046x(this.f56717h);
        this.f56717h = null;
        this.f56718q = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zfa zfaVar = this.f56717h;
        Object obj = this.f56718q;
        if ((isCancelled() | (zfaVar == null)) || (obj == null)) {
            return;
        }
        this.f56717h = null;
        if (zfaVar.isCancelled()) {
            m43037D(zfaVar);
            return;
        }
        try {
            try {
                Object objMo58947G = mo58947G(obj, cn7.m21443a(zfaVar));
                this.f56718q = null;
                mo58948H(objMo58947G);
            } catch (Throwable th) {
                try {
                    d9d.m22625a(th);
                    mo43036C(th);
                } finally {
                    this.f56718q = null;
                }
            }
        } catch (Error e) {
            mo43036C(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            mo43036C(e2.getCause());
        } catch (Exception e3) {
            mo43036C(e3);
        }
    }

    @Override // p001o.p7
    /* renamed from: y */
    public String mo43047y() {
        String str;
        zfa zfaVar = this.f56717h;
        Object obj = this.f56718q;
        String strMo43047y = super.mo43047y();
        if (zfaVar != null) {
            str = "inputFuture=[" + zfaVar + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        }
        if (strMo43047y == null) {
            return null;
        }
        return str + strMo43047y;
    }
}
