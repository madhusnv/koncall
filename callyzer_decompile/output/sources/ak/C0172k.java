package ak;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import ji.C3773g;
import oj.C5391c;
import oj.C5392d;
import p020v.x0;
import qi.C6234q;
import qi.InterfaceC6222e;
import zj.C8985b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ak.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0172k implements InterfaceC6222e {

    /* renamed from: a */
    public final /* synthetic */ int f532a;

    /* renamed from: b */
    public final /* synthetic */ C6234q f533b;

    public /* synthetic */ C0172k(C6234q c6234q, int i10) {
        this.f532a = i10;
        this.f533b = c6234q;
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public final Object mo21h(x0 x0Var) {
        switch (this.f532a) {
            case 0:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f533b, x0Var);
            case 1:
                return new C5391c((Context) x0Var.mo12234a(Context.class), ((C3773g) x0Var.mo12234a(C3773g.class)).m8295d(), x0Var.mo12239f(C6234q.m12250a(C5392d.class)), x0Var.mo12236c(C8985b.class), (Executor) x0Var.mo12237d(this.f533b));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f533b, x0Var);
        }
    }
}
