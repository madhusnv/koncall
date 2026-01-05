package rf;

import a1.C0007f;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.measurement.h0;
import ig.C3245a;
import java.util.Set;
import jg.AbstractC3762a;
import l0.RunnableC4307g;
import nf.C5040b;
import p020v.x0;
import pf.C5902b;
import qf.InterfaceC6207f;
import qf.InterfaceC6208g;
import sf.AbstractC6840z;
import sf.C6832r;
import vg.AbstractC7710b;
import wg.AbstractBinderC8030c;
import wg.C8028a;
import wg.C8031d;
import wg.C8033f;
import wg.C8035h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.y */
/* loaded from: classes.dex */
public final class BinderC6520y extends AbstractBinderC8030c implements InterfaceC6207f, InterfaceC6208g {

    /* renamed from: m */
    public static final C3245a f31286m = AbstractC7710b.f37239a;

    /* renamed from: f */
    public final Context f31287f;

    /* renamed from: g */
    public final Handler f31288g;

    /* renamed from: h */
    public final C3245a f31289h;

    /* renamed from: i */
    public final Set f31290i;

    /* renamed from: j */
    public final x0 f31291j;

    /* renamed from: k */
    public C8028a f31292k;

    /* renamed from: l */
    public C0007f f31293l;

    public BinderC6520y(Context context, h0 h0Var, x0 x0Var) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 1);
        this.f31287f = context;
        this.f31288g = h0Var;
        this.f31291j = x0Var;
        this.f31290i = (Set) x0Var.f36754b;
        this.f31289h = f31286m;
    }

    @Override // qf.InterfaceC6208g
    /* renamed from: d */
    public final void mo12226d(C5902b c5902b) {
        this.f31293l.m87c(c5902b);
    }

    @Override // qf.InterfaceC6207f
    /* renamed from: f */
    public final void mo12224f(int i10) {
        C0007f c0007f = this.f31293l;
        C6511p c6511p = (C6511p) ((C6500e) c0007f.f41f).f31232k.get((C6496a) c0007f.f38c);
        if (c6511p != null) {
            if (c6511p.f31263m) {
                c6511p.m12541p(new C5902b(17));
            } else {
                c6511p.mo12224f(i10);
            }
        }
    }

    @Override // qf.InterfaceC6207f
    /* renamed from: g */
    public final void mo12225g() {
        C8028a c8028a = this.f31292k;
        c8028a.getClass();
        try {
            c8028a.f38548E.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountM9958b = "<<default account>>".equals(account.name) ? C5040b.m9956a(c8028a.f32382c).m9958b() : null;
            Integer num = c8028a.f38550G;
            AbstractC6840z.m13036g(num);
            C6832r c6832r = new C6832r(2, account, num.intValue(), googleSignInAccountM9958b);
            C8031d c8031d = (C8031d) c8028a.m13009t();
            C8033f c8033f = new C8033f(1, c6832r);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c8031d.f6441g);
            AbstractC3762a.m8287c(parcelObtain, c8033f);
            parcelObtain.writeStrongBinder(this);
            c8031d.m3754d(parcelObtain, 12);
        } catch (RemoteException e2) {
            try {
                this.f31288g.post(new RunnableC4307g(10, this, new C8035h(1, new C5902b(8, null), null), false));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
