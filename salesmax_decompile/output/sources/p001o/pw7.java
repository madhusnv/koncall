package p001o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class pw7 extends qw7 {

    /* renamed from: c */
    public final Handler f40678c;

    /* renamed from: d */
    public final String f40679d;

    /* renamed from: e */
    public final boolean f40680e;

    /* renamed from: f */
    public final pw7 f40681f;

    /* renamed from: o.pw7$a */
    public static final class RunnableC16206a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ xb2 f40682a;

        /* renamed from: b */
        public final /* synthetic */ pw7 f40683b;

        public RunnableC16206a(xb2 xb2Var, pw7 pw7Var) {
            this.f40682a = xb2Var;
            this.f40683b = pw7Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f40682a.mo48688e(this.f40683b, y3i.f54824a);
        }
    }

    public pw7(Handler handler, String str, boolean z) {
        super(null);
        this.f40678c = handler;
        this.f40679d = str;
        this.f40680e = z;
        this.f40681f = z ? this : new pw7(handler, str, true);
    }

    public static final void F0(pw7 pw7Var, Runnable runnable) {
        pw7Var.f40678c.removeCallbacks(runnable);
    }

    public static final y3i G0(pw7 pw7Var, Runnable runnable, Throwable th) {
        pw7Var.f40678c.removeCallbacks(runnable);
        return y3i.f54824a;
    }

    public final void A0(q74 q74Var, Runnable runnable) {
        z69.m58838c(q74Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        eu5.m25611b().mo22314K(q74Var, runnable);
    }

    @Override // p001o.mk5
    /* renamed from: D */
    public void mo26962D(long j, xb2 xb2Var) {
        final RunnableC16206a runnableC16206a = new RunnableC16206a(xb2Var, this);
        if (this.f40678c.postDelayed(runnableC16206a, bce.m18605h(j, 4611686018427387903L))) {
            xb2Var.mo48694y(new xk7() { // from class: o.ow7
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return pw7.G0(this.f39009a, runnableC16206a, (Throwable) obj);
                }
            });
        } else {
            A0(xb2Var.getContext(), runnableC16206a);
        }
    }

    @Override // p001o.qw7
    /* renamed from: E0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public pw7 v0() {
        return this.f40681f;
    }

    @Override // p001o.z74
    /* renamed from: K */
    public void mo22314K(q74 q74Var, Runnable runnable) {
        if (this.f40678c.post(runnable)) {
            return;
        }
        A0(q74Var, runnable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof pw7) {
            pw7 pw7Var = (pw7) obj;
            if (pw7Var.f40678c == this.f40678c && pw7Var.f40680e == this.f40680e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f40678c) ^ (this.f40680e ? 1231 : 1237);
    }

    @Override // p001o.z74
    public boolean k0(q74 q74Var) {
        return (this.f40680e && sq8.m48644c(Looper.myLooper(), this.f40678c.getLooper())) ? false : true;
    }

    @Override // p001o.mk5
    /* renamed from: t */
    public yu5 mo26963t(long j, final Runnable runnable, q74 q74Var) {
        if (this.f40678c.postDelayed(runnable, bce.m18605h(j, 4611686018427387903L))) {
            return new yu5() { // from class: o.nw7
                @Override // p001o.yu5
                public final void dispose() {
                    pw7.F0(this.f37359a, runnable);
                }
            };
        }
        A0(q74Var, runnable);
        return e0c.f20709a;
    }

    @Override // p001o.z74
    public String toString() {
        String strU0 = u0();
        if (strU0 != null) {
            return strU0;
        }
        String string = this.f40679d;
        if (string == null) {
            string = this.f40678c.toString();
        }
        if (!this.f40680e) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ pw7(Handler handler, String str, int i, id5 id5Var) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public pw7(Handler handler, String str) {
        this(handler, str, false);
    }
}
