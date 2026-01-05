package p001o;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class db4 implements bb4 {

    /* renamed from: c */
    public static final C12857a f19512c = new C12857a(null);

    /* renamed from: b */
    public final Context f19513b;

    /* renamed from: o.db4$a */
    public static final class C12857a {
        public C12857a() {
        }

        public /* synthetic */ C12857a(id5 id5Var) {
            this();
        }
    }

    public db4(Context context) {
        sq8.m48649h(context, "context");
        this.f19513b = context;
    }

    @Override // p001o.bb4
    /* renamed from: e */
    public void mo18536e(Context context, s94 s94Var, CancellationSignal cancellationSignal, Executor executor, cb4 cb4Var) {
        sq8.m48649h(context, "context");
        sq8.m48649h(s94Var, "request");
        sq8.m48649h(executor, "executor");
        sq8.m48649h(cb4Var, "callback");
        fb4 fb4VarM28300c = gb4.m28300c(new gb4(this.f19513b), false, 1, null);
        if (fb4VarM28300c == null) {
            cb4Var.mo18539a(new r94("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            fb4VarM28300c.mo26375a(context, s94Var, cancellationSignal, executor, cb4Var);
        }
    }

    @Override // p001o.bb4
    /* renamed from: f */
    public void mo18537f(Context context, to7 to7Var, CancellationSignal cancellationSignal, Executor executor, cb4 cb4Var) {
        sq8.m48649h(context, "context");
        sq8.m48649h(to7Var, "request");
        sq8.m48649h(executor, "executor");
        sq8.m48649h(cb4Var, "callback");
        fb4 fb4VarM28300c = gb4.m28300c(new gb4(context), false, 1, null);
        if (fb4VarM28300c == null) {
            cb4Var.mo18539a(new so7("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            fb4VarM28300c.mo26377c(context, to7Var, cancellationSignal, executor, cb4Var);
        }
    }
}
