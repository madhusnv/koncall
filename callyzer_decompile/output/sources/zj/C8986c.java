package zj;

import a1.C0005d;
import a1.RunnableC0024w;
import ab.C0085c;
import ai.AbstractC0159p;
import android.R;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import bb.C0641b;
import bz.C0802a;
import bz.InterfaceC0804c;
import c0.d1;
import c8.C0903f;
import c9.C0917l;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.android.gms.fido.fido2.api.common.C1277c;
import com.sun.mail.util.LineInputStream;
import d0.AbstractC1545b;
import e0.C1894c;
import e6.C1963f;
import fg.BinderC2285b;
import g0.C2411a;
import g0.C2412b;
import g0.InterfaceC2415e;
import gb.C2555e;
import gh.InterfaceC2612a;
import h1.InterfaceC2786q;
import h1.InterfaceC2795z;
import hb.C2876b;
import hb.C2877c;
import hi.n1;
import hi.o1;
import hi.o2;
import hi.r1;
import hi.v1;
import hi.w1;
import hi.x1;
import hi.y1;
import i0.i0;
import i0.m1;
import i00.C3103h;
import i00.C3119x;
import i00.InterfaceC3101f;
import i00.InterfaceC3106k;
import ig.AbstractC3253i;
import ig.BinderC3246b;
import ig.C3249e;
import ig.C3256l;
import ig.C3257m;
import ig.C3258n;
import iz.n0;
import jakarta.mail.C3687s;
import jakarta.mail.C3688t;
import jakarta.mail.c0;
import jakarta.mail.e0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import jb.a3;
import kc.C4048c;
import kc.InterfaceC4053h;
import kotlin.jvm.internal.AbstractC4154l;
import l0.InterfaceC4303c;
import l8.InterfaceC4432f;
import l8.InterfaceC4433g;
import lf.C4456g;
import lf.C4457h;
import mg.AbstractC4732k;
import mg.k1;
import mg.l1;
import net.schmizz.sshj.common.InterfaceC5029i;
import nf.C5047i;
import og.qe;
import og.u1;
import og.ud;
import pg.AbstractC5926g;
import pg.b0;
import pg.e9;
import qf.AbstractC6206e;
import rf.InterfaceC6505j;
import rw.AbstractC6663m;
import sc.C6781a;
import sc.C6802v;
import sc.C6804x;
import sc.InterfaceC6783c;
import tc.C7117b;
import tf.AbstractC7149a;
import x4.C8299i;
import yg.C8650g;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zj.c */
/* loaded from: classes.dex */
public class C8986c implements InterfaceC6783c, InterfaceC0804c, InterfaceC5029i, InterfaceC4433g, InterfaceC6505j, InterfaceC2612a, InterfaceC2786q, m1, InterfaceC3101f, InterfaceC3106k, e0, InterfaceC4053h, InterfaceC4303c {

    /* renamed from: c */
    public static volatile C8986c f43333c;

    /* renamed from: d */
    public static final /* synthetic */ int f43334d = 0;

    /* renamed from: a */
    public final /* synthetic */ int f43335a;

    /* renamed from: b */
    public Object f43336b;

    public /* synthetic */ C8986c(int i10) {
        this.f43335a = i10;
    }

    /* renamed from: o */
    public static int m16459o() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i10 = 0;
        while (i10 == 0) {
            secureRandom.nextBytes(bArr);
            i10 = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i10;
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        ((C8299i) this.f43336b).m15509d(th2);
    }

    @Override // jakarta.mail.e0
    /* renamed from: T */
    public void mo8190T(InputStream inputStream) throws IOException {
        c0 c0Var = (c0) this.f43336b;
        LineInputStream lineInputStream = new LineInputStream(inputStream);
        while (true) {
            String line = lineInputStream.readLine();
            if (line == null) {
                return;
            }
            if (!line.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER) && line.trim().length() != 0) {
                StringTokenizer stringTokenizer = new StringTokenizer(line, ";");
                C3687s c3687s = null;
                String strSubstring = null;
                String strSubstring2 = null;
                String strSubstring3 = null;
                String strSubstring4 = null;
                while (stringTokenizer.hasMoreTokens()) {
                    String strTrim = stringTokenizer.nextToken().trim();
                    int iIndexOf = strTrim.indexOf("=");
                    if (strTrim.startsWith("protocol=")) {
                        strSubstring = strTrim.substring(iIndexOf + 1);
                    } else if (strTrim.startsWith("type=")) {
                        String strSubstring5 = strTrim.substring(iIndexOf + 1);
                        if (strSubstring5.equalsIgnoreCase("store")) {
                            c3687s = C3687s.f19417b;
                        } else if (strSubstring5.equalsIgnoreCase("transport")) {
                            c3687s = C3687s.f19418c;
                        }
                    } else if (strTrim.startsWith("class=")) {
                        strSubstring2 = strTrim.substring(iIndexOf + 1);
                    } else if (strTrim.startsWith("vendor=")) {
                        strSubstring3 = strTrim.substring(iIndexOf + 1);
                    } else if (strTrim.startsWith("version=")) {
                        strSubstring4 = strTrim.substring(iIndexOf + 1);
                    }
                }
                if (c3687s == null || strSubstring == null || strSubstring2 == null || strSubstring.length() <= 0 || strSubstring2.length() <= 0) {
                    c0Var.f19291e.log(Level.CONFIG, "Bad provider entry: {0}", line);
                } else {
                    c0Var.m8180a(new C3688t(c3687s, strSubstring, strSubstring2, strSubstring3, strSubstring4));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kc.InterfaceC4053h
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8836X(kc.C4055j r8, ww.AbstractC8193c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kb.C4045i
            if (r0 == 0) goto L13
            r0 = r9
            kb.i r0 = (kb.C4045i) r0
            int r1 = r0.f20887d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20887d = r1
            goto L18
        L13:
            kb.i r0 = new kb.i
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f20885b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20887d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kc.j r8 = r0.f20884a
            og.od.m10798c(r9)
            goto L75
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            og.od.m10798c(r9)
            vc.a r9 = r8.f20903b
            tc.b r2 = r8.f20902a
            boolean r4 = r9 instanceof sb.InterfaceC6777d
            if (r4 == 0) goto L3f
            sb.d r9 = (sb.InterfaceC6777d) r9
            goto L40
        L3f:
            r9 = 0
        L40:
            if (r9 == 0) goto L81
            sb.e r9 = (sb.C6778e) r9
            java.lang.String r9 = r9.f32241c
            if (r9 == 0) goto L81
            java.lang.String r4 = "X-Amz-S3session-Token"
            pg.AbstractC5926g.m11642d(r2, r4, r9)
            ec.b r9 = r8.f20904c
            ec.c r9 = og.ud.m10984j(r9)
            ec.a r4 = tb.AbstractC7094e.f34223m
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r9.mo1862b(r4, r5)
            java.lang.Object r4 = r7.f43336b
            zk.c r4 = (zk.C8989c) r4
            vc.a r5 = r8.f20903b
            java.lang.String r6 = "identity"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r5, r6)
            kc.j r6 = new kc.j
            r6.<init>(r2, r5, r9)
            r0.f20884a = r8
            r0.f20887d = r3
            java.lang.Object r9 = r4.mo8836X(r6, r0)
            if (r9 != r1) goto L75
            return r1
        L75:
            tc.b r8 = r8.f20902a
            jc.i r8 = r8.f34312c
            java.lang.String r9 = "X-Amz-Security-Token"
            r8.m315C(r9)
            qw.a0 r8 = qw.a0.f30746a
            return r8
        L81:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "No session token found on identity, required for S3 Express"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zj.C8986c.mo8836X(kc.j, ww.c):java.lang.Object");
    }

    @Override // bz.InterfaceC0804c
    /* renamed from: a */
    public void mo2134a(int i10, int i11, byte[] bArr) {
        ((InterfaceC0804c) this.f43336b).mo2134a(i10, i11, bArr);
    }

    @Override // rf.InterfaceC6505j
    public void accept(Object obj, Object obj2) {
        switch (this.f43335a) {
            case 11:
                BinderC2285b binderC2285b = new BinderC2285b((C8650g) obj2);
                l1 l1Var = (l1) ((k1) obj).m13009t();
                C1277c c1277c = (C1277c) this.f43336b;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(l1Var.f23673f);
                int i10 = AbstractC4732k.f23658a;
                parcelObtain.writeStrongBinder(binderC2285b);
                parcelObtain.writeInt(1);
                c1277c.writeToParcel(parcelObtain, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    l1Var.f23672e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            case 24:
                BinderC3246b binderC3246b = new BinderC3246b((C8650g) obj2, 0);
                C3257m c3257m = (C3257m) ((C3256l) obj).m13009t();
                C4457h c4457h = (C4457h) this.f43336b;
                Parcel parcelM3755f = c3257m.m3755f();
                int i11 = AbstractC3253i.f17432a;
                parcelM3755f.writeStrongBinder(binderC3246b);
                AbstractC3253i.m7600c(parcelM3755f, c4457h);
                c3257m.m3756g(parcelM3755f, 2);
                return;
            default:
                BinderC3246b binderC3246b2 = new BinderC3246b((C8650g) obj2, 2);
                C3258n c3258n = (C3258n) ((C3249e) obj).m13009t();
                C4456g c4456g = (C4456g) this.f43336b;
                Parcel parcelM3755f2 = c3258n.m3755f();
                int i12 = AbstractC3253i.f17432a;
                parcelM3755f2.writeStrongBinder(binderC3246b2);
                AbstractC3253i.m7600c(parcelM3755f2, c4456g);
                c3258n.m3756g(parcelM3755f2, 3);
                return;
        }
    }

    @Override // i00.InterfaceC3106k
    /* renamed from: b */
    public Object mo2700b(Object obj) {
        return Optional.ofNullable(((InterfaceC3106k) this.f43336b).mo2700b((n0) obj));
    }

    /* renamed from: d */
    public InterfaceC2415e m16460d(d1 d1Var, ArrayList arrayList, int i10, List list) {
        if (i10 < arrayList.size()) {
            int i11 = i10 + 1;
            InterfaceC2415e interfaceC2415eM16460d = m16460d(d1Var, arrayList, i11, AbstractC6663m.m12753Q(arrayList.get(i10), list));
            return interfaceC2415eM16460d instanceof C2411a ? interfaceC2415eM16460d : m16460d(d1Var, arrayList, i11, list);
        }
        LinkedHashSet linkedHashSetM10858d = qe.m10858d((Set) d1Var.f5071f, list);
        linkedHashSetM10858d.toString();
        Objects.toString((List) d1Var.f5069d);
        u1.m10942a("DefaultFeatureGroupResolver");
        i0.e0 e0Var = (i0.e0) this.f43336b;
        C1894c c1894c = new C1894c(linkedHashSetM10858d);
        Iterator it = linkedHashSetM10858d.iterator();
        while (true) {
            if (it.hasNext()) {
                AbstractC1545b abstractC1545b = (AbstractC1545b) it.next();
                if (!abstractC1545b.mo5084b(d1Var, e0Var)) {
                    abstractC1545b.toString();
                    u1.m10942a("CameraInfoInternal");
                    break;
                }
            } else {
                try {
                    b0.m11543a(e0Var, d1Var, c1894c);
                    return new C2411a(new C1894c(linkedHashSetM10858d));
                } catch (CameraUseCaseAdapter$CameraException | IllegalArgumentException unused) {
                    u1.m10947f(3, u1.m10950i("CameraInfoInternal"));
                }
            }
        }
        return C2412b.f10903a;
    }

    /* renamed from: e */
    public synchronized C5047i m16461e() {
        y1 y1Var;
        y1Var = (y1) ((v1) this.f43336b).m4458a();
        if (y1Var.m7235p() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new C5047i(2, y1Var);
    }

    /* renamed from: f */
    public void mo2346f() {
        View view = (View) this.f43336b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        C8299i c8299i = (C8299i) this.f43336b;
        try {
            c8299i.m15507b(obj);
        } catch (Throwable th2) {
            c8299i.m15509d(th2);
        }
    }

    @Override // h1.InterfaceC2786q
    public InterfaceC2795z get(int i10) {
        return (InterfaceC2795z) this.f43336b;
    }

    @Override // l8.InterfaceC4433g
    /* renamed from: h */
    public void mo5739h(InterfaceC4432f interfaceC4432f) {
        C0903f c0903f = (C0903f) this.f43336b;
        int length = c0903f.f5560d.length;
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = c0903f.f5560d[i10];
            if (i11 == 1) {
                interfaceC4432f.mo9276g(i10, c0903f.f5561e[i10]);
            } else if (i11 == 2) {
                interfaceC4432f.mo9275Z(c0903f.f5562f[i10], i10);
            } else if (i11 == 3) {
                String str = c0903f.f5563g[i10];
                AbstractC4154l.m8920c(str);
                interfaceC4432f.mo9278q(i10, str);
            } else if (i11 == 4) {
                byte[] bArr = c0903f.f5564h[i10];
                AbstractC4154l.m8920c(bArr);
                interfaceC4432f.mo9274L(i10, bArr);
            } else if (i11 == 5) {
                interfaceC4432f.mo9277i(i10);
            }
        }
    }

    @Override // i00.InterfaceC3101f
    /* renamed from: i */
    public Object mo2663i(C3119x c3119x) {
        C3103h c3103h = new C3103h(c3119x);
        c3119x.mo7442j(new C5047i(23, c3103h));
        return c3103h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // sc.InterfaceC6783c
    /* renamed from: j */
    public Object mo8769j(C6802v c6802v, C6781a c6781a) {
        switch (this.f43335a) {
            case 3:
                String str = (String) ud.m10978d(c6802v.f32331a, AbstractC8923q.f42882a);
                C0641b c0641b = ((C0085c) this.f43336b).f329r;
                c0641b.getClass();
                Object obj = c0641b.f4111b.get(str);
                if (obj == null) {
                    obj = c0641b.f4112c;
                }
                List list = (List) obj;
                List list2 = c0641b.f4110a;
                return list2 != null ? e9.m11605c(list2, list) : list;
            default:
                C0917l c0917l = new C0917l(7, false);
                c0917l.f5595c = (String) ud.m10978d(c6802v.f32331a, AbstractC8923q.f42882a);
                C6804x c6804x = new C6804x(c6802v.f32331a, AbstractC5926g.m11643e((C7117b) c6802v.f32332b), C4048c.f20890a);
                C2555e c2555e = (C2555e) this.f43336b;
                c0917l.f5594b = a3.m8270a(c2555e, c6804x);
                C2877c c2877c = new C2877c(c0917l);
                C2876b c2876b = c2555e.f13931H;
                c2876b.getClass();
                return c2876b.m6993a(c2877c, c6781a);
        }
    }

    /* renamed from: k */
    public synchronized boolean m16462k(int i10) {
        Iterator it = Collections.unmodifiableList(((y1) ((v1) this.f43336b).f7128b).m7236q()).iterator();
        while (it.hasNext()) {
            if (((x1) it.next()).m7223r() == i10) {
                return true;
            }
        }
        return false;
    }

    @Override // i00.InterfaceC3101f
    /* renamed from: l */
    public Type mo2666l() {
        return (Type) this.f43336b;
    }

    /* renamed from: m */
    public synchronized x1 m16463m(r1 r1Var) {
        n1 n1VarM368e;
        int iM16459o;
        try {
            n1VarM368e = AbstractC0159p.m368e(r1Var);
            synchronized (this) {
                iM16459o = m16459o();
                while (m16462k(iM16459o)) {
                    iM16459o = m16459o();
                }
            }
            return (x1) w1VarM7221v.m4458a();
        } catch (Throwable th2) {
            throw th2;
        }
        o2 o2VarM7190q = r1Var.m7190q();
        if (o2VarM7190q == o2.UNKNOWN_PREFIX) {
            o2VarM7190q = o2.TINK;
        }
        w1 w1VarM7221v = x1.m7221v();
        w1VarM7221v.m4460c();
        x1.m7217m((x1) w1VarM7221v.f7128b, n1VarM368e);
        w1VarM7221v.m4460c();
        x1.m7220p((x1) w1VarM7221v.f7128b, iM16459o);
        o1 o1Var = o1.ENABLED;
        w1VarM7221v.m4460c();
        x1.m7219o((x1) w1VarM7221v.f7128b, o1Var);
        w1VarM7221v.m4460c();
        x1.m7218n((x1) w1VarM7221v.f7128b, o2VarM7190q);
        return (x1) w1VarM7221v.m4458a();
    }

    @Override // l8.InterfaceC4433g
    /* renamed from: n */
    public String mo5740n() {
        return ((C0903f) this.f43336b).f5568b;
    }

    @Override // i0.m1
    public void onError(Throwable t7) {
        AbstractC4154l.m8923f(t7, "t");
        i0 i0Var = (i0) this.f43336b;
        if (i0Var.f16487h.get()) {
            u1.m10944c("CameraPresencePrvdr");
            d1 d1Var = i0Var.f16484e;
            if (d1Var != null) {
                d1Var.m2186f();
            }
        }
    }

    /* renamed from: p */
    public void mo2347p() {
        View viewFindViewById;
        View view = (View) this.f43336b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC0024w(5, viewFindViewById));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[LOOP:1: B:17:0x0057->B:19:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.lang.Object] */
    @Override // i0.m1
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo88q(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zj.C8986c.mo88q(java.lang.Object):void");
    }

    public /* synthetic */ C8986c(int i10, Object obj) {
        this.f43335a = i10;
        this.f43336b = obj;
    }

    public /* synthetic */ C8986c(AbstractC6206e abstractC6206e, AbstractC7149a abstractC7149a, int i10) {
        this.f43335a = i10;
        this.f43336b = abstractC7149a;
    }

    public C8986c(C0085c config) {
        this.f43335a = 3;
        AbstractC4154l.m8923f(config, "config");
        this.f43336b = config;
    }

    public C8986c(C2555e config) {
        this.f43335a = 19;
        AbstractC4154l.m8923f(config, "config");
        this.f43336b = config;
    }

    public C8986c(C0802a c0802a) {
        this.f43335a = 4;
        this.f43336b = (InterfaceC0804c) c0802a.mo2133c();
    }

    public C8986c() {
        this.f43335a = 0;
        this.f43336b = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[PHI: r10
      0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8986c(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 17
            r0.f43335a = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            h1.r[][] r4 = new h1.C2787r[r2][]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L14:
            if (r6 >= r2) goto L6b
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L2a
            if (r9 == r3) goto L33
            if (r9 == r11) goto L31
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 == r10) goto L2a
            r10 = 5
            if (r9 == r10) goto L2a
            r13 = r8
            goto L35
        L2a:
            r13 = r10
            goto L35
        L2c:
            if (r7 != r3) goto L33
            goto L31
        L2f:
            r13 = r7
            goto L35
        L31:
            r7 = r11
            goto L2f
        L33:
            r7 = r3
            goto L2f
        L35:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            h1.r[] r11 = new h1.C2787r[r3]
            r12 = r5
        L47:
            if (r12 >= r3) goto L65
            int r16 = r12 * 2
            r17 = r12
            h1.r r12 = new h1.r
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L47
        L65:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L14
        L6b:
            r0.f43336b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zj.C8986c.<init>(int[], float[], float[][]):void");
    }

    @Override // net.schmizz.sshj.common.InterfaceC5029i
    /* renamed from: c */
    public Object mo2133c() {
        return this;
    }

    public C8986c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f43335a = 8;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f43336b = new C1963f(uri, clipDescription, uri2);
        } else {
            this.f43336b = new C0005d(9, uri, clipDescription, uri2, false);
        }
    }
}
