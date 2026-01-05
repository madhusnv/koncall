package bk;

import a1.c0;
import android.os.Trace;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import d7.g0;
import eb.i3;
import ex.InterfaceC2137a;
import iz.AbstractC3386s;
import iz.C3382o;
import iz.InterfaceC3385r;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;
import nz.C5205p;
import oc.C5335b;
import og.oa;
import org.json.JSONException;
import pc.C5873a;
import pc.C5878f;
import pc.C5889q;
import pg.l8;
import qw.a0;
import rj.C6555a;
import rw.AbstractC6662l;
import t8.C7077w;
import x4.C8299i;
import x4.InterfaceC8300j;
import yg.C8656m;
import yg.InterfaceC8644a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C0678i implements InterfaceC8644a, InterfaceC3385r, InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ Object f4267a;

    /* renamed from: b */
    public final /* synthetic */ Object f4268b;

    /* renamed from: c */
    public final /* synthetic */ Object f4269c;

    /* renamed from: d */
    public final /* synthetic */ Object f4270d;

    /* renamed from: e */
    public final /* synthetic */ Object f4271e;

    public /* synthetic */ C0678i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f4267a = obj;
        this.f4268b = obj2;
        this.f4269c = obj3;
        this.f4270d = obj4;
        this.f4271e = obj5;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(final C8299i c8299i) {
        Executor executor = (Executor) this.f4267a;
        final C7077w c7077w = (C7077w) this.f4268b;
        final String str = (String) this.f4269c;
        final InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f4270d;
        final g0 g0Var = (g0) this.f4271e;
        executor.execute(new Runnable() { // from class: t8.b0
            @Override // java.lang.Runnable
            public final void run() {
                String label = str;
                InterfaceC2137a interfaceC2137a2 = interfaceC2137a;
                d7.g0 g0Var2 = g0Var;
                C8299i c8299i2 = c8299i;
                c7077w.getClass();
                boolean zM10793c = oa.m10793c();
                if (zM10793c) {
                    try {
                        AbstractC4154l.m8923f(label, "label");
                        Trace.beginSection(oa.m10795e(label));
                    } finally {
                        if (zM10793c) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    interfaceC2137a2.invoke();
                    a0 a0Var = C7077w.f34175d;
                    g0Var2.m5319i(a0Var);
                    c8299i2.m15507b(a0Var);
                } catch (Throwable th2) {
                    g0Var2.m5319i(new C7080z(th2));
                    c8299i2.m15509d(th2);
                }
            }
        });
        return a0.f30746a;
    }

    @Override // iz.InterfaceC3385r
    /* renamed from: b */
    public AbstractC3386s mo1955b(C5205p c5205p) {
        C5047i c5047i = (C5047i) this.f4267a;
        C5889q c5889q = (C5889q) this.f4268b;
        C3382o c3382o = (C3382o) this.f4269c;
        C5335b c5335b = (C5335b) this.f4270d;
        AbstractC3386s[] abstractC3386sArr = (AbstractC3386s[]) this.f4271e;
        i3 i3Var = new i3(3);
        C5878f c5878f = new C5878f(c5047i, c5889q.f24747g, c3382o, c5335b, c5205p);
        ArrayList arrayList = i3Var.f9339a;
        arrayList.add(c5878f);
        i3Var.m5725c(abstractC3386sArr);
        Object[] elements = arrayList.toArray(new AbstractC3386s[arrayList.size()]);
        AbstractC4154l.m8923f(elements, "elements");
        return new C5873a(AbstractC6662l.m12729s(elements));
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public Object mo20f(C8656m c8656m) throws JSONException, NoSuchAlgorithmException, IOException {
        C0681l c0681l = (C0681l) this.f4267a;
        C8656m c8656m2 = (C8656m) this.f4268b;
        C8656m c8656m3 = (C8656m) this.f4269c;
        Date date = (Date) this.f4270d;
        HashMap map = (HashMap) this.f4271e;
        if (!c8656m2.m15985l()) {
            return l8.m11764e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", c8656m2.m15982i()));
        }
        if (!c8656m3.m15985l()) {
            return l8.m11764e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", c8656m3.m15982i()));
        }
        try {
            C0679j c0679jM1956a = c0681l.m1956a((String) c8656m2.m15983j(), ((C6555a) c8656m3.m15983j()).f31407a, date, map);
            return c0679jM1956a.f4272a != 0 ? l8.m11765f(c0679jM1956a) : c0681l.f4281e.m1950d(c0679jM1956a.f4273b).m15986m(c0681l.f4279c, new c0(1, c0679jM1956a));
        } catch (FirebaseRemoteConfigException e2) {
            return l8.m11764e(e2);
        }
    }
}
