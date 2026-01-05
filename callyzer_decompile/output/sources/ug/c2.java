package ug;

import al.C0182j;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35313a;

    /* renamed from: b */
    public final /* synthetic */ q2 f35314b;

    public /* synthetic */ c2(q2 q2Var, int i10) {
        this.f35313a = i10;
        this.f35314b = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35313a) {
            case 0:
                this.f35314b.j0();
                break;
            case 1:
                l4.d0 d0Var = this.f35314b.f35785t;
                n1 n1Var = (n1) d0Var.f21881b;
                m1 m1Var = n1Var.f35670g;
                q2 q2Var = n1Var.f35676n;
                d1 d1Var = n1Var.f35668e;
                n1.m14085m(m1Var);
                m1Var.mo325M();
                if (d0Var.m9077D()) {
                    if (d0Var.m9075B()) {
                        n1.m14083i(d1Var);
                        d1Var.f35349z.m429t(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        n1.m14084k(q2Var);
                        q2Var.m14122T("auto", "_cmpx", bundle);
                    } else {
                        n1.m14083i(d1Var);
                        C0182j c0182j = d1Var.f35349z;
                        String strM428s = c0182j.m428s();
                        if (TextUtils.isEmpty(strM428s)) {
                            v0 v0Var = n1Var.f35669f;
                            n1.m14085m(v0Var);
                            v0Var.f35863g.m14140a("Cache still valid but referrer not found");
                        } else {
                            long jM13856a = d1Var.f35327B.m13856a() / 3600000;
                            Uri uri = Uri.parse(strM428s);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jM13856a - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            n1.m14084k(q2Var);
                            q2Var.m14122T(str2, "_cmp", (Bundle) pair.second);
                        }
                        c0182j.m429t(null);
                    }
                    n1.m14083i(d1Var);
                    d1Var.f35327B.m13857b(0L);
                    break;
                }
                break;
            case 2:
                q2 q2Var2 = this.f35314b;
                q2Var2.mo325M();
                n1 n1Var2 = (n1) q2Var2.f482a;
                d1 d1Var2 = n1Var2.f35668e;
                v0 v0Var2 = n1Var2.f35669f;
                n1.m14083i(d1Var2);
                b1 b1Var = d1Var2.f35346w;
                if (b1Var.m13837a()) {
                    n1.m14085m(v0Var2);
                    v0Var2.f35869n.m14140a("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    c1 c1Var = d1Var2.f35347x;
                    long jM13856a2 = c1Var.m13856a();
                    c1Var.m13857b(1 + jM13856a2);
                    if (jM13856a2 >= 5) {
                        n1.m14085m(v0Var2);
                        v0Var2.f35865j.m14140a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        b1Var.m13838b(true);
                        break;
                    } else {
                        if (q2Var2.f35787w == null) {
                            q2Var2.f35787w = new d2(q2Var2, n1Var2, 3);
                        }
                        q2Var2.f35787w.m14096b(0L);
                        break;
                    }
                }
            default:
                this.f35314b.j0();
                break;
        }
    }
}
