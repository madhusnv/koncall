package ug;

import android.os.Bundle;
import com.sun.mail.imap.IMAPStore;
import java.util.Iterator;
import java.util.TreeSet;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35542a;

    /* renamed from: b */
    public final /* synthetic */ q2 f35543b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f35544c;

    public /* synthetic */ j2(q2 q2Var, Bundle bundle, int i10) {
        this.f35542a = i10;
        this.f35544c = bundle;
        this.f35543b = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f35542a) {
            case 0:
                q2 q2Var = this.f35543b;
                q2Var.mo325M();
                q2Var.m13936N();
                Bundle bundle2 = this.f35544c;
                String string = bundle2.getString(IMAPStore.ID_NAME);
                AbstractC6840z.m13033d(string);
                n1 n1Var = (n1) q2Var.f482a;
                if (!n1Var.m14087d()) {
                    v0 v0Var = n1Var.f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35870p.m14140a("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    j4 j4Var = new j4(0L, null, string, "");
                    try {
                        l4 l4Var = n1Var.f35672j;
                        n1.m14083i(l4Var);
                        bundle2.getString("app_id");
                        n1Var.m14093p().f0(new C7434e(bundle2.getString("app_id"), "", j4Var, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), l4Var.p0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            default:
                q2 q2Var2 = this.f35543b;
                l4.d0 d0Var = q2Var2.f35790z;
                n1 n1Var2 = (n1) q2Var2.f482a;
                Bundle bundle3 = this.f35544c;
                if (bundle3.isEmpty()) {
                    bundle = bundle3;
                } else {
                    d1 d1Var = n1Var2.f35668e;
                    l4 l4Var2 = n1Var2.f35672j;
                    C7436g c7436g = n1Var2.f35667d;
                    v0 v0Var2 = n1Var2.f35669f;
                    n1.m14083i(d1Var);
                    bundle = new Bundle(d1Var.f35328C.m15246Y());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            n1.m14083i(l4Var2);
                            if (l4.V0(obj)) {
                                l4.c0(d0Var, null, 27, null, null, 0);
                            }
                            n1.m14085m(v0Var2);
                            v0Var2.f35867l.m14142c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (l4.l0(str)) {
                            n1.m14085m(v0Var2);
                            v0Var2.f35867l.m14141b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            n1.m14083i(l4Var2);
                            c7436g.getClass();
                            if (l4Var2.W0(500, obj, "param", str)) {
                                l4Var2.b0(bundle, str, obj);
                            }
                        }
                    }
                    n1.m14083i(l4Var2);
                    l4 l4Var3 = ((n1) c7436g.f482a).f35672j;
                    n1.m14083i(l4Var3);
                    int i10 = l4Var3.s0(201500000) ? 100 : 25;
                    if (bundle.size() > i10) {
                        Iterator it = new TreeSet(bundle.keySet()).iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i11++;
                            if (i11 > i10) {
                                bundle.remove(str2);
                            }
                        }
                        n1.m14083i(l4Var2);
                        l4.c0(d0Var, null, 26, null, null, 0);
                        n1.m14085m(v0Var2);
                        v0Var2.f35867l.m14140a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                d1 d1Var2 = n1Var2.f35668e;
                n1.m14083i(d1Var2);
                d1Var2.f35328C.m15247Z(bundle);
                if (!bundle3.isEmpty() || n1Var2.f35667d.m13889W(null, f0.W0)) {
                    n1Var2.m14093p().m14018R(bundle);
                    break;
                }
                break;
        }
    }
}
