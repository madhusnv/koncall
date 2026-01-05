package ak;

import a1.C0013l;
import bk.C0674e;
import bk.C0676g;
import bk.C0688s;
import c9.C0927v;
import ck.RunnableC0980a;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import ek.C2064d;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import ki.C4079b;
import org.json.JSONArray;
import org.json.JSONException;
import pg.l8;
import ti.C7163c;
import wj.C8090p;
import yg.C8656m;
import yg.InterfaceC8644a;
import yg.InterfaceC8649f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ak.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0164c implements InterfaceC8649f, InterfaceC8644a {

    /* renamed from: a */
    public final /* synthetic */ C0165d f504a;

    public /* synthetic */ C0164c(C0165d c0165d) {
        this.f504a = c0165d;
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public Object mo20f(C8656m c8656m) throws JSONException {
        boolean z6;
        C0165d c0165d = this.f504a;
        if (c8656m.m15985l()) {
            C0674e c0674e = c0165d.f507c;
            synchronized (c0674e) {
                c0674e.f4249c = l8.m11765f(null);
            }
            C0688s c0688s = c0674e.f4248b;
            synchronized (c0688s) {
                c0688s.f4321a.deleteFile(c0688s.f4322b);
            }
            C0676g c0676g = (C0676g) c8656m.m15983j();
            if (c0676g != null) {
                JSONArray jSONArray = c0676g.f4260d;
                C4079b c4079b = c0165d.f505a;
                if (c4079b != null) {
                    try {
                        c4079b.m8849c(C0165d.m381d(jSONArray));
                    } catch (AbtException | JSONException unused) {
                    }
                }
                C8090p c8090p = c0165d.f514j;
                try {
                    C2064d c2064dM2701h = ((C0927v) c8090p.f38724b).m2701h(c0676g);
                    Iterator it = ((Set) c8090p.f38726d).iterator();
                    while (it.hasNext()) {
                        ((Executor) c8090p.f38725c).execute(new RunnableC0980a((C7163c) it.next(), c2064dM2701h, 1));
                    }
                } catch (FirebaseRemoteConfigException unused2) {
                }
            }
            z6 = true;
        } else {
            z6 = false;
        }
        return Boolean.valueOf(z6);
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        C0165d c0165d = this.f504a;
        C8656m c8656mM1948b = c0165d.f507c.m1948b();
        C8656m c8656mM1948b2 = c0165d.f508d.m1948b();
        return l8.m11767h(c8656mM1948b, c8656mM1948b2).m15981h(c0165d.f506b, new C0013l(2, c0165d, c8656mM1948b, c8656mM1948b2));
    }
}
