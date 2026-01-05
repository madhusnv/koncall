package ig;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import i0.m0;
import kf.C4075b;
import mg.k1;
import nf.C5043e;
import p020v.x0;
import qf.InterfaceC6204c;
import qf.InterfaceC6207f;
import qf.InterfaceC6208g;
import rf.C6511p;
import sf.C6829o;
import uf.C7429d;
import wg.C8028a;
import xf.C8373h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ig.a */
/* loaded from: classes.dex */
public final class C3245a {

    /* renamed from: b */
    public static final /* synthetic */ int f17417b = 0;

    /* renamed from: a */
    public final /* synthetic */ int f17418a;

    /* renamed from: a */
    public InterfaceC6204c m7582a(Context context, Looper looper, x0 x0Var, Object obj, InterfaceC6207f interfaceC6207f, InterfaceC6208g interfaceC6208g) {
        switch (this.f17418a) {
            case 2:
                return new C3254j(context, looper, x0Var, (C4075b) obj, (C6511p) interfaceC6207f, (C6511p) interfaceC6208g);
            case 3:
                return new C5043e(context, looper, x0Var, (GoogleSignInOptions) obj, (C6511p) interfaceC6207f, (C6511p) interfaceC6208g);
            case 4:
                return new k1(context, looper, 148, x0Var, interfaceC6207f, interfaceC6208g, 0);
            case 5:
            default:
                C6511p c6511p = (C6511p) interfaceC6207f;
                C6511p c6511p2 = (C6511p) interfaceC6208g;
                switch (this.f17418a) {
                    case 0:
                        return new C3256l(context, looper, x0Var, c6511p, c6511p2);
                    case 1:
                        return new C3249e(context, looper, x0Var, c6511p, c6511p2);
                    case 5:
                        return new C7429d(context, looper, x0Var, (C6829o) obj, c6511p, c6511p2);
                    case 8:
                        return new C8373h(context, looper, 308, x0Var, c6511p, c6511p2, 0);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 6:
                x0Var.getClass();
                Integer num = (Integer) x0Var.f36759g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C8028a(context, looper, x0Var, bundle, interfaceC6207f, interfaceC6208g);
            case 7:
                throw m0.m7376i(obj);
        }
    }
}
