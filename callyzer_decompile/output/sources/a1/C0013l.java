package a1;

import ak.C0164c;
import ak.C0165d;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.Size;
import bk.C0676g;
import bk.C0685p;
import c0.C0817j;
import c0.w1;
import c0.x1;
import c9.C0927v;
import cf.C0963a;
import ck.RunnableC0980a;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import ef.C2049i;
import ef.InterfaceC2047g;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import ff.InterfaceC2282a;
import i0.g0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ji.C3773g;
import k0.ExecutorC3900j;
import l0.C4304d;
import l0.InterfaceC4301a;
import l0.RunnableC4307g;
import nf.C5047i;
import o6.s0;
import og.f1;
import og.u1;
import org.json.JSONException;
import org.json.JSONObject;
import pg.l8;
import rj.C6555a;
import t8.EnumC7067m;
import t8.RunnableC7071q;
import ti.C7163c;
import tx.C7263w;
import tx.e1;
import ue.EnumC7422d;
import uf.C7427b;
import ug.g1;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import wj.C8083i;
import wj.C8090p;
import wj.C8091q;
import ww.AbstractC8199i;
import x4.C8299i;
import x4.C8302l;
import x4.InterfaceC8300j;
import xe.C8356h;
import xe.C8357i;
import yg.C8650g;
import yg.C8656m;
import yg.InterfaceC8644a;
import yg.InterfaceC8648e;
import yg.InterfaceC8649f;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C0013l implements w1, InterfaceC8644a, InterfaceC2282a, InterfaceC8648e, InterfaceC2047g, InterfaceC8300j, InterfaceC4301a, InterfaceC8649f {

    /* renamed from: a */
    public final /* synthetic */ int f65a;

    /* renamed from: b */
    public final /* synthetic */ Object f66b;

    /* renamed from: c */
    public final /* synthetic */ Object f67c;

    /* renamed from: d */
    public final /* synthetic */ Object f68d;

    public /* synthetic */ C0013l(int i10, Object obj, Object obj2, Object obj3) {
        this.f65a = i10;
        this.f66b = obj;
        this.f67c = obj2;
        this.f68d = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ex.e, ww.i] */
    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        switch (this.f65a) {
            case 9:
                C8302l c8302l = (C8302l) this.f66b;
                ExecutorC3900j executorC3900j = (ExecutorC3900j) this.f67c;
                Collection collection = (Collection) this.f68d;
                c8299i.m15506a(new RunnableC0024w(20, c8302l), executorC3900j);
                c8302l.mo9026a(new RunnableC4307g(0, c8302l, new C8989c(19, c8299i)), executorC3900j);
                return "surfaceList[" + collection + "]";
            case 10:
                InterfaceC7564h interfaceC7564h = (InterfaceC7564h) this.f66b;
                tx.b0 b0Var = (tx.b0) this.f67c;
                ?? r22 = (AbstractC8199i) this.f68d;
                c8299i.m15506a(new RunnableC0024w(29, (e1) interfaceC7564h.o0(C7263w.f34689b)), EnumC7067m.INSTANCE);
                return tx.c0.m13502y(tx.c0.m13479b(interfaceC7564h), null, b0Var, new s0((InterfaceC2141e) r22, c8299i, (InterfaceC7559c) null), 1);
            default:
                Executor executor = (Executor) this.f66b;
                String str = (String) this.f67c;
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f68d;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                c8299i.m15506a(new RunnableC7071q(atomicBoolean, 0), EnumC7067m.INSTANCE);
                executor.execute(new RunnableC0025x(19, atomicBoolean, c8299i, interfaceC2137a));
                return str;
        }
    }

    @Override // c0.w1
    /* renamed from: a */
    public void mo16a(C0817j c0817j) {
        AbstractC0019r abstractC0019r;
        C5047i c5047i = (C5047i) this.f66b;
        g0 g0Var = (g0) this.f67c;
        x1 x1Var = (x1) this.f68d;
        C0018q c0018q = (C0018q) c5047i.f24823b;
        Objects.toString(c0817j);
        u1.m10942a("PreviewView");
        boolean z6 = g0Var.mo7319q().mo7326i() == 0;
        C0009h c0009h = c0018q.f74d;
        Size size = x1Var.f5259b;
        c0009h.getClass();
        Objects.toString(c0817j);
        Objects.toString(size);
        u1.m10942a("PreviewTransform");
        c0009h.f53b = c0817j.f5110a;
        c0009h.f54c = c0817j.f5111b;
        int i10 = c0817j.f5112c;
        c0009h.f56e = i10;
        c0009h.f52a = size;
        c0009h.f57f = z6;
        c0009h.f58g = c0817j.f5113d;
        c0009h.f55d = c0817j.f5114e;
        if (i10 == -1 || ((abstractC0019r = c0018q.f72b) != null && (abstractC0019r instanceof b0))) {
            c0018q.f75e = true;
        } else {
            c0018q.f75e = false;
        }
        c0018q.m99a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x014b A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0019, B:12:0x002b, B:13:0x0043, B:17:0x0048, B:18:0x004f, B:20:0x0055, B:21:0x006b, B:22:0x00cb, B:24:0x00d1, B:25:0x00e6, B:27:0x00f6, B:29:0x00fa, B:30:0x0106, B:32:0x0123, B:34:0x0135, B:36:0x013d, B:40:0x014b, B:42:0x015d, B:45:0x0175, B:46:0x0182, B:48:0x0196, B:51:0x01ab, B:52:0x01b8, B:54:0x01d2, B:56:0x01d6, B:57:0x01df, B:58:0x0200, B:60:0x0206, B:61:0x0216, B:63:0x0230, B:64:0x0235, B:65:0x023d, B:68:0x0240, B:69:0x0246, B:71:0x0248, B:72:0x0261), top: B:76:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    @Override // ef.InterfaceC2047g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zh.InterfaceFutureC8957d apply(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0013l.apply(java.lang.Object):zh.d");
    }

    @Override // ff.InterfaceC2282a
    /* renamed from: b */
    public Object mo17b() {
        C0963a c0963a = (C0963a) this.f66b;
        C8357i c8357i = (C8357i) this.f67c;
        C8356h c8356h = (C8356h) this.f68d;
        C2049i c2049i = (C2049i) c0963a.f5768d;
        c2049i.getClass();
        EnumC7422d enumC7422d = c8357i.f40000c;
        if (Log.isLoggable(f1.m10639c("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(enumC7422d);
        }
        ((Long) c2049i.m5773n(new C0013l(6, c2049i, c8356h, c8357i))).getClass();
        c0963a.f5765a.a0(c8357i, 1, false);
        return null;
    }

    /* renamed from: c */
    public void m97c() {
        C5047i c5047i = (C5047i) this.f66b;
        C0007f c0007f = (C0007f) this.f68d;
        g0 g0Var = (g0) this.f67c;
        AtomicReference atomicReference = ((C0018q) c5047i.f24823b).f77g;
        while (true) {
            if (atomicReference.compareAndSet(c0007f, null)) {
                c0007f.m86b(EnumC0017p.IDLE);
                break;
            } else if (atomicReference.get() != c0007f) {
                break;
            }
        }
        C4304d c4304d = (C4304d) c0007f.f41f;
        if (c4304d != null) {
            c4304d.cancel(false);
            c0007f.f41f = null;
        }
        g0Var.mo7309b().mo2185c(c0007f);
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public Object mo20f(C8656m c8656m) {
        C0676g c0676g;
        URL url;
        switch (this.f65a) {
            case 2:
                C0165d c0165d = (C0165d) this.f66b;
                C8656m c8656m2 = (C8656m) this.f67c;
                C8656m c8656m3 = (C8656m) this.f68d;
                if (!c8656m2.m15985l() || c8656m2.m15983j() == null) {
                    return l8.m11765f(Boolean.FALSE);
                }
                C0676g c0676g2 = (C0676g) c8656m2.m15983j();
                return (c8656m3.m15985l() && (c0676g = (C0676g) c8656m3.m15983j()) != null && c0676g2.f4259c.equals(c0676g.f4259c)) ? l8.m11765f(Boolean.FALSE) : c0165d.f508d.m1950d(c0676g2).m15980g(c0165d.f506b, new C0164c(c0165d));
            case 3:
                C0685p c0685p = (C0685p) this.f66b;
                C8656m c8656m4 = (C8656m) this.f67c;
                C8656m c8656m5 = (C8656m) this.f68d;
                if (!c8656m4.m15985l()) {
                    return l8.m11764e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", c8656m4.m15982i()));
                }
                if (!c8656m5.m15985l()) {
                    return l8.m11764e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", c8656m5.m15982i()));
                }
                try {
                    try {
                        url = new URL(c0685p.m1969c(c0685p.f4307m));
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    c0685p.m1973i(httpURLConnection, (String) c8656m5.m15983j(), ((C6555a) c8656m4.m15983j()).f31407a);
                    return l8.m11765f(httpURLConnection);
                } catch (IOException e2) {
                    return l8.m11764e(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e2));
                }
            default:
                C8650g c8650g = (C8650g) this.f66b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f67c;
                g1 g1Var = (g1) this.f68d;
                if (c8656m.m15985l()) {
                    c8650g.m15971d(c8656m.m15983j());
                } else if (c8656m.m15982i() != null) {
                    c8650g.m15970c(c8656m.m15982i());
                } else if (atomicBoolean.getAndSet(true)) {
                    g1Var.m13926q();
                }
                return l8.m11765f(null);
        }
    }

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public void mo27g(Object obj) throws JSONException {
        C8090p c8090p = (C8090p) this.f66b;
        C8656m c8656m = (C8656m) this.f67c;
        C7163c c7163c = (C7163c) this.f68d;
        try {
            C0676g c0676g = (C0676g) c8656m.m15983j();
            if (c0676g != null) {
                ((Executor) c8090p.f38725c).execute(new RunnableC0980a(c7163c, ((C0927v) c8090p.f38724b).m2701h(c0676g), 0));
            }
        } catch (FirebaseRemoteConfigException unused) {
        }
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        String string;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f66b;
        String str = (String) this.f67c;
        C8091q c8091q = (C8091q) this.f68d;
        String str2 = (String) obj;
        C7427b c7427bM4479c = FirebaseMessaging.m4479c(firebaseMessaging.f7162b);
        C3773g c3773g = firebaseMessaging.f7161a;
        c3773g.m8293a();
        String strM8295d = "[DEFAULT]".equals(c3773g.f19663b) ? "" : c3773g.m8295d();
        String strM12863b = firebaseMessaging.f7168h.m12863b();
        synchronized (c7427bM4479c) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i10 = C8091q.f38728e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AWSCognitoLegacyCredentialStore.TOKEN_KEY, str2);
                jSONObject.put("appVersion", strM12863b);
                jSONObject.put("timestamp", jCurrentTimeMillis);
                string = jSONObject.toString();
            } catch (JSONException e2) {
                e2.toString();
                string = null;
            }
            if (string != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) c7427bM4479c.f35231b).edit();
                editorEdit.putString(strM8295d + "|T|" + str + "|*", string);
                editorEdit.commit();
            }
        }
        if (c8091q == null || !str2.equals(c8091q.f38729a)) {
            C3773g c3773g2 = firebaseMessaging.f7161a;
            c3773g2.m8293a();
            if ("[DEFAULT]".equals(c3773g2.f19663b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    c3773g2.m8293a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(AWSCognitoLegacyCredentialStore.TOKEN_KEY, str2);
                new C8083i(firebaseMessaging.f7162b).m15221b(intent);
            }
        }
        return l8.m11765f(str2);
    }

    public /* synthetic */ C0013l(C5047i c5047i, C0007f c0007f, g0 g0Var) {
        this.f65a = 1;
        this.f66b = c5047i;
        this.f68d = c0007f;
        this.f67c = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0013l(InterfaceC7564h interfaceC7564h, tx.b0 b0Var, InterfaceC2141e interfaceC2141e) {
        this.f65a = 10;
        this.f66b = interfaceC7564h;
        this.f67c = b0Var;
        this.f68d = (AbstractC8199i) interfaceC2141e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[PHI: r14
      0x0046: PHI (r14v25 af.c) = (r14v18 af.c), (r14v19 af.c), (r14v20 af.c), (r14v21 af.c), (r14v22 af.c), (r14v23 af.c) binds: [B:11:0x0044, B:14:0x004e, B:17:0x0057, B:20:0x0060, B:23:0x0069, B:26:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ef.InterfaceC2047g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0013l.apply(java.lang.Object):java.lang.Object");
    }
}
