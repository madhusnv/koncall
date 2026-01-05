package ug;

import android.app.ActivityManager;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.recyclerview.widget.RecyclerView;
import com.sun.mail.imap.IMAPStore;
import ej.C2057b;
import ie.InterfaceC3244a;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import jg.AbstractC3762a;
import kc.C4049d;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4792c;
import mm.C4796g;
import nx.AbstractC5178p;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.json.JSONException;
import org.json.JSONObject;
import p021w.C7843i;
import p023y.AbstractC8523a;
import pg.l8;
import rb.C6489b;
import rf.InterfaceC6505j;
import rw.C6668r;
import ua.C7382b;
import ui.InterfaceC7471b;
import v0.C7622f;
import vc.InterfaceC7700c;
import vc.InterfaceC7703f;
import vi.InterfaceC7712a;
import wi.C8062l;
import wi.C8065o;
import wi.C8066p;
import wi.CallableC8060j;
import wi.RunnableC8064n;
import ws.C8176q;
import xd.C8335f;
import xd.C8339j;
import xf.BinderC8371f;
import xf.C8366a;
import xf.C8370e;
import xf.C8373h;
import y7.C8566a;
import yg.C8650g;
import yg.C8656m;
import yg.InterfaceC8645b;
import yg.InterfaceC8647d;
import yg.InterfaceC8648e;
import yg.InterfaceC8649f;
import yv.C8789d;
import yv.C8791f;
import zf.C8946a;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 implements InterfaceC7471b, InterfaceC7712a, p020v.l1, InterfaceC7703f, InterfaceC8649f, InterfaceC3244a, InterfaceC6505j, y7.c1, InterfaceC8648e, InterfaceC8647d, InterfaceC8645b {

    /* renamed from: a */
    public Object f35448a;

    public g1(int i10) {
        switch (i10) {
            case 19:
                this.f35448a = new CountDownLatch(1);
                break;
            case 20:
                this.f35448a = (ExtraSupportedSurfaceCombinationsQuirk) AbstractC8523a.f41447a.m5729g(ExtraSupportedSurfaceCombinationsQuirk.class);
                break;
            case 21:
                this.f35448a = (ExtraCroppingQuirk) AbstractC8523a.f41447a.m5729g(ExtraCroppingQuirk.class);
                break;
            default:
                this.f35448a = new C7622f(13);
                break;
        }
    }

    /* renamed from: A */
    public static String m13915A(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(IMAPStore.ID_NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: w */
    public static C8176q m13916w(C4796g c4796g) {
        String string;
        String string2;
        String string3;
        if (c4796g == null) {
            return null;
        }
        C4792c c4792c = c4796g.f23872b;
        int i10 = c4792c.f23847d;
        Long l9 = c4792c.f23851h;
        int i11 = 0;
        String strM16160g = l9 != null ? C8789d.m16160g(false, l9.longValue()) : null;
        C8791f c8791f = C8791f.f42457a;
        if (C8791f.m16171d(strM16160g)) {
            AbstractC4154l.m8920c(strM16160g);
            int iM10099J = AbstractC5178p.m10099J(strM16160g, "h", 0, false, 6);
            int iM10099J2 = AbstractC5178p.m10099J(strM16160g, "m", 0, false, 6);
            int iM10099J3 = AbstractC5178p.m10099J(strM16160g, "s", 0, false, 6);
            if (iM10099J != -1) {
                String strSubstring = strM16160g.substring(0, iM10099J);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
                string2 = AbstractC5178p.g0(strSubstring).toString();
            } else {
                string2 = "";
            }
            if (iM10099J2 != -1) {
                String strSubstring2 = strM16160g.substring(iM10099J != -1 ? iM10099J + 1 : 0, iM10099J2);
                AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                string3 = AbstractC5178p.g0(strSubstring2).toString();
            } else {
                string3 = "";
            }
            if (iM10099J3 != -1) {
                if (iM10099J2 != -1) {
                    i11 = iM10099J2 + 1;
                } else if (iM10099J != -1) {
                    i11 = iM10099J + 1;
                }
                String strSubstring3 = strM16160g.substring(i11, iM10099J3);
                AbstractC4154l.m8922e(strSubstring3, "substring(...)");
                string = AbstractC5178p.g0(strSubstring3).toString();
            } else {
                string = "";
            }
        } else {
            string = "";
            string2 = string;
            string3 = string2;
        }
        String str = c4792c.f23844a;
        int i12 = c4796g.f23871a;
        long j6 = c4792c.f23852j;
        String strValueOf = String.valueOf(i10);
        String str2 = string2;
        String str3 = c4792c.f23850g;
        EnumC8994d enumC8994d = c4792c.f23848e;
        String typeName = enumC8994d != null ? enumC8994d.getTypeName() : null;
        String str4 = c4792c.f23846c;
        String strValueOf2 = String.valueOf(i10);
        LocalDateTime localDateTime = c4792c.f23849f;
        String str5 = c4796g.f23873c;
        if ((8192 & 1024) != 0) {
            str2 = "";
        }
        return new C8176q(i12, j6, str, str3, localDateTime, str4, typeName, strM16160g, strValueOf, strValueOf2, str2, (8192 & NewHope.SENDB_BYTES) != 0 ? "" : string3, (8192 & 4096) != 0 ? "" : string, (8192 & 8192) != 0 ? C6668r.f31943a : null, str5);
    }

    /* renamed from: B */
    public void m13917B() {
        s3 s3Var = (s3) this.f35448a;
        s3Var.mo325M();
        n1 n1Var = (n1) s3Var.f482a;
        d1 d1Var = n1Var.f35668e;
        n1.m14083i(d1Var);
        C8946a c8946a = n1Var.f35674l;
        c8946a.getClass();
        if (d1Var.m13867W(System.currentTimeMillis())) {
            d1 d1Var2 = n1Var.f35668e;
            n1.m14083i(d1Var2);
            d1Var2.f35338m.m13838b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35870p.m14140a("Detected application was in foreground");
                c8946a.getClass();
                m13920E(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: C */
    public boolean m13918C() {
        v0 v0Var = ((n1) this.f35448a).f35669f;
        n1.m14085m(v0Var);
        return Log.isLoggable(v0Var.m14165W(), 3);
    }

    /* renamed from: D */
    public void m13919D(long j6) {
        s3 s3Var = (s3) this.f35448a;
        s3Var.mo325M();
        s3Var.m14139Q();
        n1 n1Var = (n1) s3Var.f482a;
        d1 d1Var = n1Var.f35668e;
        n1.m14083i(d1Var);
        if (d1Var.m13867W(j6)) {
            n1.m14083i(d1Var);
            d1Var.f35338m.m13838b(true);
            n1Var.m14095r().m14079R();
        }
        n1.m14083i(d1Var);
        d1Var.f35342r.m13857b(j6);
        if (d1Var.f35338m.m13837a()) {
            m13920E(j6);
        }
    }

    /* renamed from: E */
    public void m13920E(long j6) {
        s3 s3Var = (s3) this.f35448a;
        s3Var.mo325M();
        n1 n1Var = (n1) s3Var.f482a;
        if (n1Var.m14087d()) {
            d1 d1Var = n1Var.f35668e;
            n1.m14083i(d1Var);
            d1Var.f35342r.m13857b(j6);
            n1Var.f35674l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35870p.m14141b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j10 = j6 / 1000;
            Long lValueOf = Long.valueOf(j10);
            q2 q2Var = n1Var.f35676n;
            n1.m14084k(q2Var);
            q2Var.m14126X(j6, lValueOf, "auto", "_sid");
            n1.m14083i(d1Var);
            d1Var.f35343s.m13857b(j10);
            d1Var.f35338m.m13838b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            n1.m14084k(q2Var);
            q2Var.m14123U(j6, bundle, "auto", "_s");
            String strM428s = d1Var.f35348y.m428s();
            if (TextUtils.isEmpty(strM428s)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM428s);
            n1.m14084k(q2Var);
            q2Var.m14123U(j6, bundle2, "auto", "_ssr");
        }
    }

    @Override // vc.InterfaceC7703f
    /* renamed from: S */
    public InterfaceC7700c mo1857S(String schemeId) {
        AbstractC4154l.m8923f(schemeId, "schemeId");
        if (schemeId.equals("aws.auth#sigv4")) {
            return ((C7382b) this.f35448a).f35105f;
        }
        if (schemeId.equals("smithy.api#noAuth")) {
            return C4049d.f20892a;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) C6489b.m12497a(schemeId)) + " not configured for client").toString());
    }

    @Override // rf.InterfaceC6505j
    public void accept(Object obj, Object obj2) {
        BinderC8371f binderC8371f = new BinderC8371f((C8650g) obj2, 0);
        C8370e c8370e = (C8370e) ((C8373h) obj).m13009t();
        C8366a c8366a = (C8366a) this.f35448a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c8370e.f6441g);
        int i10 = AbstractC3762a.f19640a;
        parcelObtain.writeStrongBinder(binderC8371f);
        AbstractC3762a.m8287c(parcelObtain, c8366a);
        c8370e.m3754d(parcelObtain, 1);
    }

    @Override // y7.c1
    /* renamed from: b */
    public int mo13810b(View view) {
        return (view.getTop() - ((y7.g0) view.getLayoutParams()).f41640b.top) - ((ViewGroup.MarginLayoutParams) ((y7.g0) view.getLayoutParams())).topMargin;
    }

    @Override // p020v.l1
    /* renamed from: c */
    public float mo13922c() {
        Float f6 = (Float) ((C7843i) this.f35448a).m14823a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f6 != null && f6.floatValue() >= 1.0f) {
            return f6.floatValue();
        }
        return 1.0f;
    }

    @Override // y7.c1
    /* renamed from: d */
    public int mo13812d() {
        return ((y7.f0) this.f35448a).m15852C();
    }

    @Override // p020v.l1
    /* renamed from: e */
    public float mo13923e() {
        return 1.0f;
    }

    @Override // vi.InterfaceC7712a
    /* renamed from: f */
    public void mo13043f(C8065o c8065o) {
        this.f35448a = c8065o;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public void mo27g(Object obj) {
        ((CountDownLatch) this.f35448a).countDown();
    }

    @Override // ie.InterfaceC3244a
    /* renamed from: i */
    public void mo7581i(Drawable drawable) {
        C8339j c8339j = (C8339j) this.f35448a;
        c8339j.m15521k(new C8335f(drawable != null ? c8339j.m15520j(drawable) : null));
    }

    @Override // y7.c1
    /* renamed from: j */
    public int mo13815j() {
        y7.f0 f0Var = (y7.f0) this.f35448a;
        return f0Var.f41633o - f0Var.m15859z();
    }

    @Override // yg.InterfaceC8645b
    /* renamed from: k */
    public void mo1946k() {
        ((CountDownLatch) this.f35448a).countDown();
    }

    @Override // y7.c1
    /* renamed from: l */
    public View mo13817l(int i10) {
        return ((y7.f0) this.f35448a).m15857u(i10);
    }

    @Override // y7.c1
    /* renamed from: m */
    public int mo13818m(View view) {
        return view.getBottom() + ((y7.g0) view.getLayoutParams()).f41640b.bottom + ((ViewGroup.MarginLayoutParams) ((y7.g0) view.getLayoutParams())).bottomMargin;
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
        ((CountDownLatch) this.f35448a).countDown();
    }

    @Override // ui.InterfaceC7471b
    public void onEvent(String str, Bundle bundle) {
        C8065o c8065o = (C8065o) this.f35448a;
        if (c8065o != null) {
            try {
                String str2 = "$A$:" + m13915A(str, bundle);
                C8066p c8066p = c8065o.f38623a;
                c8066p.f38638o.f40063a.m15551a(new RunnableC8064n(c8066p, System.currentTimeMillis() - c8066p.f38627d, str2, 0));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        C2057b c2057b = (C2057b) obj;
        C8062l c8062l = ((CallableC8060j) this.f35448a).f38594e;
        return c2057b == null ? l8.m11765f(null) : l8.m11766g(Arrays.asList(C8062l.m15197a(c8062l), c8062l.f38611m.m2787z(c8062l.f38603e.f40063a, null)));
    }

    /* renamed from: q */
    public void m13926q() {
        ((C8656m) ((C7622f) this.f35448a).f36778a).m15990q(null);
    }

    /* renamed from: r */
    public void m13927r(C8566a c8566a) {
        RecyclerView recyclerView = (RecyclerView) this.f35448a;
        int i10 = c8566a.f41562a;
        if (i10 == 1) {
            recyclerView.f2824m.mo1282R(c8566a.f41563b, c8566a.f41564c);
            return;
        }
        if (i10 == 2) {
            recyclerView.f2824m.mo1285U(c8566a.f41563b, c8566a.f41564c);
        } else if (i10 == 4) {
            recyclerView.f2824m.mo1286V(c8566a.f41563b, c8566a.f41564c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.f2824m.mo1284T(c8566a.f41563b, c8566a.f41564c);
        }
    }

    /* renamed from: s */
    public y7.t0 m13928s(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f35448a;
        int iM14013x = recyclerView.f2817e.m14013x();
        int i11 = 0;
        y7.t0 t0Var = null;
        while (true) {
            if (i11 >= iM14013x) {
                break;
            }
            y7.t0 t0VarM1313H = RecyclerView.m1313H(recyclerView.f2817e.m14012w(i11));
            if (t0VarM1313H != null && !t0VarM1313H.m15923h() && t0VarM1313H.f41794c == i10) {
                if (!((ArrayList) recyclerView.f2817e.f35539d).contains(t0VarM1313H.f41792a)) {
                    t0Var = t0VarM1313H;
                    break;
                }
                t0Var = t0VarM1313H;
            }
            i11++;
        }
        if (t0Var != null) {
            if (!((ArrayList) recyclerView.f2817e.f35539d).contains(t0Var.f41792a)) {
                return t0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13929t(int r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xm.a4
            if (r0 == 0) goto L13
            r0 = r7
            xm.a4 r0 = (xm.a4) r0
            int r1 = r0.f40121d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40121d = r1
            goto L18
        L13:
            xm.a4 r0 = new xm.a4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f40119b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40121d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ug.g1 r6 = r0.f40118a
            og.od.m10798c(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            og.od.m10798c(r7)
            java.lang.Object r7 = r5.f35448a
            gn.x2 r7 = (gn.x2) r7
            r0.f40118a = r5
            r0.f40121d = r3
            an.g5 r7 = r7.f14948h
            z7.w r7 = r7.f862a
            an.r1 r2 = new an.r1
            r4 = 13
            r2.<init>(r6, r4)
            r6 = 0
            java.lang.Object r7 = og.pe.m10839n(r0, r7, r3, r6, r2)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r6 = r5
        L50:
            mm.g r7 = (mm.C4796g) r7
            r6.getClass()
            ws.q r6 = m13916w(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.g1.m13929t(int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m13930u(int r6, int r7, ww.AbstractC8193c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof xm.c4
            if (r0 == 0) goto L13
            r0 = r8
            xm.c4 r0 = (xm.c4) r0
            int r1 = r0.f40204d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40204d = r1
            goto L18
        L13:
            xm.c4 r0 = new xm.c4
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f40202b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40204d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ug.g1 r6 = r0.f40201a
            og.od.m10798c(r8)
            goto L4e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            og.od.m10798c(r8)
            java.lang.Object r8 = r5.f35448a
            gn.x2 r8 = (gn.x2) r8
            r0.f40201a = r5
            r0.f40204d = r3
            an.g5 r8 = r8.f14948h
            z7.w r2 = r8.f862a
            an.d5 r3 = new an.d5
            r4 = 0
            r3.<init>(r8, r6, r7, r4)
            java.lang.Object r8 = og.pe.m10838m(r2, r3, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r6 = r5
        L4e:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L54
            rw.r r8 = rw.C6668r.f31943a
        L54:
            r6.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r8.iterator()
        L60:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L76
            java.lang.Object r8 = r7.next()
            mm.g r8 = (mm.C4796g) r8
            ws.q r8 = m13916w(r8)
            if (r8 == 0) goto L60
            r6.add(r8)
            goto L60
        L76:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.g1.m13930u(int, int, ww.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m13931v(ww.AbstractC8193c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof xm.b4
            if (r0 == 0) goto L13
            r0 = r7
            xm.b4 r0 = (xm.b4) r0
            int r1 = r0.f40178d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40178d = r1
            goto L18
        L13:
            xm.b4 r0 = new xm.b4
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f40176b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f40178d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ug.g1 r0 = r0.f40175a
            og.od.m10798c(r7)
            goto L4f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            og.od.m10798c(r7)
            java.lang.Object r7 = r6.f35448a
            gn.x2 r7 = (gn.x2) r7
            r0.f40175a = r6
            r0.f40178d = r3
            an.g5 r7 = r7.f14948h
            z7.w r2 = r7.f862a
            an.e5 r3 = new an.e5
            r4 = 0
            r5 = 0
            r3.<init>(r7, r4, r5)
            java.lang.Object r7 = og.pe.m10838m(r2, r3, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r0 = r6
        L4f:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L55
            rw.r r7 = rw.C6668r.f31943a
        L55:
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L61:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r7.next()
            mm.g r1 = (mm.C4796g) r1
            ws.q r1 = m13916w(r1)
            if (r1 == 0) goto L61
            r0.add(r1)
            goto L61
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.g1.m13931v(ww.c):java.io.Serializable");
    }

    /* renamed from: x */
    public void m13932x(int i10, int i11) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f35448a;
        int iM14013x = recyclerView.f2817e.m14013x();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iM14013x; i15++) {
            View viewM14012w = recyclerView.f2817e.m14012w(i15);
            y7.t0 t0VarM1313H = RecyclerView.m1313H(viewM14012w);
            if (t0VarM1313H != null && !t0VarM1313H.m15930o() && (i13 = t0VarM1313H.f41794c) >= i10 && i13 < i14) {
                t0VarM1313H.m15916a(2);
                t0VarM1313H.m15916a(1024);
                ((y7.g0) viewM14012w.getLayoutParams()).f41641c = true;
            }
        }
        y7.l0 l0Var = recyclerView.f2814b;
        ArrayList arrayList = l0Var.f41706c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y7.t0 t0Var = (y7.t0) arrayList.get(size);
            if (t0Var != null && (i12 = t0Var.f41794c) >= i10 && i12 < i14) {
                t0Var.m15916a(2);
                l0Var.m15879e(size);
            }
        }
        recyclerView.f43703m1 = true;
    }

    /* renamed from: y */
    public void m13933y(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f35448a;
        int iM14013x = recyclerView.f2817e.m14013x();
        for (int i12 = 0; i12 < iM14013x; i12++) {
            y7.t0 t0VarM1313H = RecyclerView.m1313H(recyclerView.f2817e.m14012w(i12));
            if (t0VarM1313H != null && !t0VarM1313H.m15930o() && t0VarM1313H.f41794c >= i10) {
                t0VarM1313H.m15927l(i11, false);
                recyclerView.f43699i1.f41756f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2814b.f41706c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            y7.t0 t0Var = (y7.t0) arrayList.get(i13);
            if (t0Var != null && t0Var.f41794c >= i10) {
                t0Var.m15927l(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f43702l1 = true;
    }

    /* renamed from: z */
    public void m13934z(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f35448a;
        int iM14013x = recyclerView.f2817e.m14013x();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iM14013x; i20++) {
            y7.t0 t0VarM1313H = RecyclerView.m1313H(recyclerView.f2817e.m14012w(i20));
            if (t0VarM1313H != null && (i18 = t0VarM1313H.f41794c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    t0VarM1313H.m15927l(i11 - i10, false);
                } else {
                    t0VarM1313H.m15927l(i14, false);
                }
                recyclerView.f43699i1.f41756f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2814b.f41706c;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            y7.t0 t0Var = (y7.t0) arrayList.get(i21);
            if (t0Var != null && (i17 = t0Var.f41794c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    t0Var.m15927l(i11 - i10, false);
                } else {
                    t0Var.m15927l(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f43702l1 = true;
    }

    public /* synthetic */ g1(Object obj) {
        this.f35448a = obj;
    }

    public /* synthetic */ g1(Object obj, Object obj2) {
        this.f35448a = obj2;
    }

    @Override // p020v.l1
    /* renamed from: o */
    public void mo13925o() {
    }

    @Override // p020v.l1
    /* renamed from: a */
    public void mo13921a(TotalCaptureResult totalCaptureResult) {
    }

    @Override // p020v.l1
    /* renamed from: h */
    public void mo13924h(c0.h1 h1Var) {
    }
}
