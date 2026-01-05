package p001o;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import p001o.vre;

/* loaded from: classes2.dex */
public interface bb4 {

    /* renamed from: a */
    public static final C12337a f15855a = C12337a.f15856a;

    /* renamed from: o.bb4$a */
    public static final class C12337a {

        /* renamed from: a */
        public static final /* synthetic */ C12337a f15856a = new C12337a();

        /* renamed from: a */
        public final bb4 m18538a(Context context) {
            sq8.m48649h(context, "context");
            return new db4(context);
        }
    }

    /* renamed from: o.bb4$b */
    public static final class C12338b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ CancellationSignal f15857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12338b(CancellationSignal cancellationSignal) {
            super(1);
            this.f15857a = cancellationSignal;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            this.f15857a.cancel();
        }
    }

    /* renamed from: o.bb4$c */
    public static final class C12339c implements cb4 {

        /* renamed from: a */
        public final /* synthetic */ xb2 f15858a;

        public C12339c(xb2 xb2Var) {
            this.f15858a = xb2Var;
        }

        @Override // p001o.cb4
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo18539a(o94 o94Var) {
            sq8.m48649h(o94Var, "e");
            if (this.f15858a.mo48687a()) {
                xb2 xb2Var = this.f15858a;
                vre.C17665a c17665a = vre.f50797b;
                xb2Var.resumeWith(vre.m53351b(wre.m54933a(o94Var)));
            }
        }

        @Override // p001o.cb4
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(t94 t94Var) {
            sq8.m48649h(t94Var, "result");
            if (this.f15858a.mo48687a()) {
                this.f15858a.resumeWith(vre.m53351b(t94Var));
            }
        }
    }

    /* renamed from: o.bb4$d */
    public static final class C12340d extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ CancellationSignal f15859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12340d(CancellationSignal cancellationSignal) {
            super(1);
            this.f15859a = cancellationSignal;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            this.f15859a.cancel();
        }
    }

    /* renamed from: o.bb4$e */
    public static final class C12341e implements cb4 {

        /* renamed from: a */
        public final /* synthetic */ xb2 f15860a;

        public C12341e(xb2 xb2Var) {
            this.f15860a = xb2Var;
        }

        @Override // p001o.cb4
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo18539a(qo7 qo7Var) {
            sq8.m48649h(qo7Var, "e");
            if (this.f15860a.mo48687a()) {
                xb2 xb2Var = this.f15860a;
                vre.C17665a c17665a = vre.f50797b;
                xb2Var.resumeWith(vre.m53351b(wre.m54933a(qo7Var)));
            }
        }

        @Override // p001o.cb4
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(uo7 uo7Var) {
            sq8.m48649h(uo7Var, "result");
            if (this.f15860a.mo48687a()) {
                this.f15860a.resumeWith(vre.m53351b(uo7Var));
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m18532a(bb4 bb4Var, Context context, s94 s94Var, n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        CancellationSignal cancellationSignal = new CancellationSignal();
        zb2Var.mo48694y(new C12338b(cancellationSignal));
        bb4Var.mo18536e(context, s94Var, cancellationSignal, new ab4(), new C12339c(zb2Var));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    /* renamed from: d */
    static /* synthetic */ Object m18533d(bb4 bb4Var, Context context, to7 to7Var, n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        CancellationSignal cancellationSignal = new CancellationSignal();
        zb2Var.mo48694y(new C12340d(cancellationSignal));
        bb4Var.mo18537f(context, to7Var, cancellationSignal, new ab4(), new C12341e(zb2Var));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    /* renamed from: b */
    default Object m18534b(Context context, s94 s94Var, n64 n64Var) {
        return m18532a(this, context, s94Var, n64Var);
    }

    /* renamed from: c */
    default Object m18535c(Context context, to7 to7Var, n64 n64Var) {
        return m18533d(this, context, to7Var, n64Var);
    }

    /* renamed from: e */
    void mo18536e(Context context, s94 s94Var, CancellationSignal cancellationSignal, Executor executor, cb4 cb4Var);

    /* renamed from: f */
    void mo18537f(Context context, to7 to7Var, CancellationSignal cancellationSignal, Executor executor, cb4 cb4Var);
}
