package bk;

import ak.C0162a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import pg.l8;
import yg.C8656m;
import yg.InterfaceC8644a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.b */
/* loaded from: classes.dex */
public final class RunnableC0671b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4232a;

    /* renamed from: b */
    public final /* synthetic */ long f4233b;

    /* renamed from: c */
    public final /* synthetic */ C0672c f4234c;

    public RunnableC0671b(C0672c c0672c, int i10, long j6) {
        this.f4234c = c0672c;
        this.f4232a = i10;
        this.f4233b = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C0672c c0672c = this.f4234c;
        int i10 = this.f4232a;
        final long j6 = this.f4233b;
        synchronized (c0672c) {
            final int i11 = i10 - 1;
            final C8656m c8656mM1958c = c0672c.f4237c.m1958c(EnumC0680k.REALTIME, 3 - i11);
            final C8656m c8656mM1948b = c0672c.f4238d.m1948b();
            l8.m11767h(c8656mM1958c, c8656mM1948b).m15981h(c0672c.f4240f, new InterfaceC8644a() { // from class: bk.a
                @Override // yg.InterfaceC8644a
                /* renamed from: f */
                public final Object mo20f(C8656m c8656m) throws JSONException {
                    Boolean boolValueOf;
                    C0672c c0672c2 = c0672c;
                    C8656m c8656m2 = c8656mM1958c;
                    C8656m c8656m3 = c8656mM1948b;
                    long j10 = j6;
                    int i12 = i11;
                    if (!c8656m2.m15985l()) {
                        return l8.m11764e(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", c8656m2.m15982i()));
                    }
                    if (!c8656m3.m15985l()) {
                        return l8.m11764e(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", c8656m3.m15982i()));
                    }
                    C0679j c0679j = (C0679j) c8656m2.m15983j();
                    C0676g c0676gM1951a = (C0676g) c8656m3.m15983j();
                    C0676g c0676g = c0679j.f4273b;
                    if (c0676g != null) {
                        boolValueOf = Boolean.valueOf(c0676g.f4262f >= j10);
                    } else {
                        boolValueOf = Boolean.valueOf(c0679j.f4272a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        c0672c2.m1942a(i12, j10);
                        return l8.m11765f(null);
                    }
                    if (c0679j.f4273b == null) {
                        return l8.m11765f(null);
                    }
                    if (c0676gM1951a == null) {
                        c0676gM1951a = C0676g.m1953c().m1951a();
                    }
                    C0676g c0676g2 = c0679j.f4273b;
                    JSONObject jSONObject = c0676gM1951a.f4261e;
                    JSONObject jSONObject2 = c0676g2.f4257a;
                    JSONObject jSONObject3 = c0676g2.f4258b;
                    JSONObject jSONObject4 = c0676g2.f4261e;
                    JSONObject jSONObject5 = C0676g.m1952a(new JSONObject(jSONObject2.toString())).f4258b;
                    HashMap mapM1954b = c0676gM1951a.m1954b();
                    HashMap mapM1954b2 = c0676g2.m1954b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = c0676gM1951a.f4258b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (mapM1954b.containsKey(next) != mapM1954b2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapM1954b.containsKey(next) && mapM1954b2.containsKey(next) && !((Map) mapM1954b.get(next)).equals(mapM1954b2.get(next))) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        return l8.m11765f(null);
                    }
                    C0162a c0162a = new C0162a(hashSet);
                    synchronized (c0672c2) {
                        Iterator it = c0672c2.f4235a.iterator();
                        while (it.hasNext()) {
                            ((C0684o) it.next()).m1964b(c0162a);
                        }
                    }
                    return l8.m11765f(null);
                }
            });
        }
    }
}
