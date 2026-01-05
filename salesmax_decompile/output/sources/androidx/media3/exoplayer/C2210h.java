package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.C2181a;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.C2208f;
import androidx.media3.exoplayer.C2214k;
import androidx.media3.exoplayer.C2216m;
import androidx.media3.exoplayer.C2217n;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.InterfaceC2211i;
import androidx.media3.exoplayer.InterfaceC2218o;
import androidx.media3.exoplayer.InterfaceC2221p;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.api.Service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.abf;
import p001o.ac0;
import p001o.auh;
import p001o.bh1;
import p001o.buh;
import p001o.byc;
import p001o.crf;
import p001o.fz4;
import p001o.fz5;
import p001o.gth;
import p001o.hdg;
import p001o.jad;
import p001o.jb3;
import p001o.jbd;
import p001o.kad;
import p001o.ko6;
import p001o.lif;
import p001o.lmh;
import p001o.mih;
import p001o.nf8;
import p001o.nke;
import p001o.op0;
import p001o.qga;
import p001o.qm6;
import p001o.ria;
import p001o.s2b;
import p001o.sbd;
import p001o.sqi;
import p001o.sth;
import p001o.t0f;
import p001o.ta1;
import p001o.tq;
import p001o.uw7;
import p001o.wdb;
import p001o.x4b;
import p001o.x8b;
import p001o.y4b;

/* renamed from: androidx.media3.exoplayer.h */
/* loaded from: classes2.dex */
public final class C2210h implements Handler.Callback, x4b.InterfaceC18049a, auh.InterfaceC12254a, C2216m.d, C2208f.a, C2217n.a {
    public static final long L0 = sqi.q1(10000);
    public int A0;
    public h B0;
    public long C0;
    public long D0;
    public int E0;
    public boolean F0;
    public qm6 G0;

    /* renamed from: H */
    public final long f8369H;
    public long H0;
    public ExoPlayer.C2190c J0;

    /* renamed from: L */
    public final boolean f8370L;

    /* renamed from: M */
    public final C2208f f8371M;

    /* renamed from: Q */
    public final ArrayList f8372Q;

    /* renamed from: X */
    public final jb3 f8373X;

    /* renamed from: Y */
    public final f f8374Y;

    /* renamed from: Z */
    public final C2215l f8375Z;

    /* renamed from: a */
    public final InterfaceC2218o[] f8376a;

    /* renamed from: b */
    public final Set f8377b;

    /* renamed from: c */
    public final InterfaceC2221p[] f8378c;

    /* renamed from: d */
    public final auh f8379d;

    /* renamed from: e */
    public final buh f8380e;

    /* renamed from: f */
    public final InterfaceC2211i f8381f;

    /* renamed from: g */
    public final ta1 f8382g;

    /* renamed from: h */
    public final uw7 f8383h;
    public final C2216m h0;
    public final qga i0;
    public final long j0;
    public final jbd k0;
    public final boolean l0;
    public abf m0;
    public jad n0;
    public e o0;
    public boolean p0;

    /* renamed from: q */
    public final HandlerThread f8384q;
    public boolean q0;
    public boolean r0;

    /* renamed from: s */
    public final Looper f8385s;
    public boolean s0;
    public boolean u0;
    public int v0;
    public boolean w0;

    /* renamed from: x */
    public final lmh.C15106c f8386x;
    public boolean x0;

    /* renamed from: y */
    public final lmh.C15105b f8387y;
    public boolean y0;
    public boolean z0;
    public long I0 = -9223372036854775807L;
    public long t0 = -9223372036854775807L;
    public lmh K0 = lmh.f34048a;

    /* renamed from: androidx.media3.exoplayer.h$a */
    public class a implements InterfaceC2218o.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.InterfaceC2218o.a
        /* renamed from: a */
        public void mo7253a() {
            C2210h.this.y0 = true;
        }

        @Override // androidx.media3.exoplayer.InterfaceC2218o.a
        /* renamed from: b */
        public void mo7254b() {
            if (C2210h.this.l0 || C2210h.this.z0) {
                C2210h.this.f8383h.mo28840i(2);
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.h$b */
    public static final class b {

        /* renamed from: a */
        public final List f8389a;

        /* renamed from: b */
        public final crf f8390b;

        /* renamed from: c */
        public final int f8391c;

        /* renamed from: d */
        public final long f8392d;

        public /* synthetic */ b(List list, crf crfVar, int i, long j, a aVar) {
            this(list, crfVar, i, j);
        }

        public b(List list, crf crfVar, int i, long j) {
            this.f8389a = list;
            this.f8390b = crfVar;
            this.f8391c = i;
            this.f8392d = j;
        }
    }

    /* renamed from: androidx.media3.exoplayer.h$c */
    public static class c {
    }

    /* renamed from: androidx.media3.exoplayer.h$d */
    public static final class d implements Comparable {

        /* renamed from: a */
        public final C2217n f8393a;

        /* renamed from: b */
        public int f8394b;

        /* renamed from: c */
        public long f8395c;

        /* renamed from: d */
        public Object f8396d;

        public d(C2217n c2217n) {
            this.f8393a = c2217n;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f8396d;
            if ((obj == null) != (dVar.f8396d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f8394b - dVar.f8394b;
            return i != 0 ? i : sqi.m48734m(this.f8395c, dVar.f8395c);
        }

        /* renamed from: c */
        public void m7260c(int i, long j, Object obj) {
            this.f8394b = i;
            this.f8395c = j;
            this.f8396d = obj;
        }
    }

    /* renamed from: androidx.media3.exoplayer.h$e */
    public static final class e {

        /* renamed from: a */
        public boolean f8397a;

        /* renamed from: b */
        public jad f8398b;

        /* renamed from: c */
        public int f8399c;

        /* renamed from: d */
        public boolean f8400d;

        /* renamed from: e */
        public int f8401e;

        public e(jad jadVar) {
            this.f8398b = jadVar;
        }

        /* renamed from: b */
        public void m7262b(int i) {
            this.f8397a |= i > 0;
            this.f8399c += i;
        }

        /* renamed from: c */
        public void m7263c(jad jadVar) {
            this.f8397a |= this.f8398b != jadVar;
            this.f8398b = jadVar;
        }

        /* renamed from: d */
        public void m7264d(int i) {
            if (this.f8400d && this.f8401e != 5) {
                op0.m42511a(i == 5);
                return;
            }
            this.f8397a = true;
            this.f8400d = true;
            this.f8401e = i;
        }
    }

    /* renamed from: androidx.media3.exoplayer.h$f */
    public interface f {
        /* renamed from: a */
        void mo7265a(e eVar);
    }

    /* renamed from: androidx.media3.exoplayer.h$g */
    public static final class g {

        /* renamed from: a */
        public final x8b.C18076b f8402a;

        /* renamed from: b */
        public final long f8403b;

        /* renamed from: c */
        public final long f8404c;

        /* renamed from: d */
        public final boolean f8405d;

        /* renamed from: e */
        public final boolean f8406e;

        /* renamed from: f */
        public final boolean f8407f;

        public g(x8b.C18076b c18076b, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f8402a = c18076b;
            this.f8403b = j;
            this.f8404c = j2;
            this.f8405d = z;
            this.f8406e = z2;
            this.f8407f = z3;
        }
    }

    /* renamed from: androidx.media3.exoplayer.h$h */
    public static final class h {

        /* renamed from: a */
        public final lmh f8408a;

        /* renamed from: b */
        public final int f8409b;

        /* renamed from: c */
        public final long f8410c;

        public h(lmh lmhVar, int i, long j) {
            this.f8408a = lmhVar;
            this.f8409b = i;
            this.f8410c = j;
        }
    }

    public C2210h(InterfaceC2218o[] interfaceC2218oArr, auh auhVar, buh buhVar, InterfaceC2211i interfaceC2211i, ta1 ta1Var, int i, boolean z, ac0 ac0Var, abf abfVar, qga qgaVar, long j, boolean z2, boolean z3, Looper looper, jb3 jb3Var, f fVar, jbd jbdVar, Looper looper2, ExoPlayer.C2190c c2190c) {
        this.f8374Y = fVar;
        this.f8376a = interfaceC2218oArr;
        this.f8379d = auhVar;
        this.f8380e = buhVar;
        this.f8381f = interfaceC2211i;
        this.f8382g = ta1Var;
        this.v0 = i;
        this.w0 = z;
        this.m0 = abfVar;
        this.i0 = qgaVar;
        this.j0 = j;
        this.H0 = j;
        this.q0 = z2;
        this.l0 = z3;
        this.f8373X = jb3Var;
        this.k0 = jbdVar;
        this.J0 = c2190c;
        this.f8369H = interfaceC2211i.mo7092h(jbdVar);
        this.f8370L = interfaceC2211i.mo7087c(jbdVar);
        jad jadVarM33445k = jad.m33445k(buhVar);
        this.n0 = jadVarM33445k;
        this.o0 = new e(jadVarM33445k);
        this.f8378c = new InterfaceC2221p[interfaceC2218oArr.length];
        InterfaceC2221p.a aVarMo17852d = auhVar.mo17852d();
        for (int i2 = 0; i2 < interfaceC2218oArr.length; i2++) {
            interfaceC2218oArr[i2].mo6874L(i2, jbdVar, jb3Var);
            this.f8378c[i2] = interfaceC2218oArr[i2].mo6870E();
            if (aVarMo17852d != null) {
                this.f8378c[i2].mo6871F(aVarMo17852d);
            }
        }
        this.f8371M = new C2208f(this, jb3Var);
        this.f8372Q = new ArrayList();
        this.f8377b = lif.m37328h();
        this.f8386x = new lmh.C15106c();
        this.f8387y = new lmh.C15105b();
        auhVar.m17853e(this, ta1Var);
        this.F0 = true;
        uw7 uw7VarMo21305b = jb3Var.mo21305b(looper, null);
        this.f8375Z = new C2215l(ac0Var, uw7VarMo21305b, new C2214k.a() { // from class: o.io6
            @Override // androidx.media3.exoplayer.C2214k.a
            /* renamed from: a */
            public final C2214k mo7304a(y4b y4bVar, long j2) {
                return this.f29031a.m7244r(y4bVar, j2);
            }
        }, c2190c);
        this.h0 = new C2216m(this, ac0Var, uw7VarMo21305b, jbdVar);
        if (looper2 != null) {
            this.f8384q = null;
            this.f8385s = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f8384q = handlerThread;
            handlerThread.start();
            this.f8385s = handlerThread.getLooper();
        }
        this.f8383h = jb3Var.mo21305b(this.f8385s, this);
    }

    public static void B0(lmh lmhVar, d dVar, lmh.C15106c c15106c, lmh.C15105b c15105b) {
        int i = lmhVar.m37476n(lmhVar.mo22380h(dVar.f8396d, c15105b).f34059c, c15106c).f34094o;
        Object obj = lmhVar.mo6950g(i, c15105b, true).f34058b;
        long j = c15105b.f34060d;
        dVar.m7260c(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    /* renamed from: C */
    public static C2181a[] m7203C(ko6 ko6Var) {
        int length = ko6Var != null ? ko6Var.length() : 0;
        C2181a[] c2181aArr = new C2181a[length];
        for (int i = 0; i < length; i++) {
            c2181aArr[i] = ko6Var.mo22949e(i);
        }
        return c2181aArr;
    }

    public static boolean C0(d dVar, lmh lmhVar, lmh lmhVar2, int i, boolean z, lmh.C15106c c15106c, lmh.C15105b c15105b) {
        Object obj = dVar.f8396d;
        if (obj == null) {
            Pair pairF0 = F0(lmhVar, new h(dVar.f8393a.m7420h(), dVar.f8393a.m7416d(), dVar.f8393a.m7418f() == Long.MIN_VALUE ? -9223372036854775807L : sqi.O0(dVar.f8393a.m7418f())), false, i, z, c15106c, c15105b);
            if (pairF0 == null) {
                return false;
            }
            dVar.m7260c(lmhVar.mo6949b(pairF0.first), ((Long) pairF0.second).longValue(), pairF0.first);
            if (dVar.f8393a.m7418f() == Long.MIN_VALUE) {
                B0(lmhVar, dVar, c15106c, c15105b);
            }
            return true;
        }
        int iMo6949b = lmhVar.mo6949b(obj);
        if (iMo6949b == -1) {
            return false;
        }
        if (dVar.f8393a.m7418f() == Long.MIN_VALUE) {
            B0(lmhVar, dVar, c15106c, c15105b);
            return true;
        }
        dVar.f8394b = iMo6949b;
        lmhVar2.mo22380h(dVar.f8396d, c15105b);
        if (c15105b.f34062f && lmhVar2.m37476n(c15105b.f34059c, c15106c).f34093n == lmhVar2.mo6949b(dVar.f8396d)) {
            Pair pairM37474j = lmhVar.m37474j(c15106c, c15105b, lmhVar.mo22380h(dVar.f8396d, c15105b).f34059c, dVar.f8395c + c15105b.m37492n());
            dVar.m7260c(lmhVar.mo6949b(pairM37474j.first), ((Long) pairM37474j.second).longValue(), pairM37474j.first);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g E0(lmh lmhVar, jad jadVar, h hVar, C2215l c2215l, int i, boolean z, lmh.C15106c c15106c, lmh.C15105b c15105b) {
        x8b.C18076b c18076b;
        int i2;
        x8b.C18076b c18076b2;
        int i3;
        long jLongValue;
        boolean z2;
        boolean z3;
        boolean z4;
        int iMo22377a;
        boolean z5;
        C2215l c2215l2;
        long j;
        x8b.C18076b c18076bM7318L;
        boolean z6;
        x8b.C18076b c18076b3;
        int i4;
        int iMo22377a2;
        boolean z7;
        boolean z8;
        boolean z9;
        if (lmhVar.m37477q()) {
            return new g(jad.m33446l(), 0L, -9223372036854775807L, false, true, false);
        }
        x8b.C18076b c18076b4 = jadVar.f30042b;
        Object obj = c18076b4.f53356a;
        boolean zM7206X = m7206X(jadVar, c15105b);
        long j2 = (jadVar.f30042b.m55842b() || zM7206X) ? jadVar.f30043c : jadVar.f30059s;
        if (hVar != null) {
            c18076b = c18076b4;
            i2 = -1;
            Pair pairF0 = F0(lmhVar, hVar, true, i, z, c15106c, c15105b);
            if (pairF0 == null) {
                iMo22377a2 = lmhVar.mo22377a(z);
                jLongValue = j2;
                z7 = false;
                z8 = false;
                z9 = true;
            } else {
                if (hVar.f8410c == -9223372036854775807L) {
                    iMo22377a2 = lmhVar.mo22380h(pairF0.first, c15105b).f34059c;
                    jLongValue = j2;
                    z7 = false;
                } else {
                    obj = pairF0.first;
                    jLongValue = ((Long) pairF0.second).longValue();
                    iMo22377a2 = -1;
                    z7 = true;
                }
                z8 = jadVar.f30045e == 4;
                z9 = false;
            }
            z4 = z7;
            z2 = z8;
            z3 = z9;
            i3 = iMo22377a2;
        } else {
            c18076b = c18076b4;
            i2 = -1;
            if (jadVar.f30041a.m37477q()) {
                iMo22377a = lmhVar.mo22377a(z);
            } else if (lmhVar.mo6949b(obj) == -1) {
                int iG0 = G0(c15106c, c15105b, i, z, obj, jadVar.f30041a, lmhVar);
                if (iG0 == -1) {
                    iG0 = lmhVar.mo22377a(z);
                    z5 = true;
                } else {
                    z5 = false;
                }
                i3 = iG0;
                z3 = z5;
                jLongValue = j2;
                z2 = false;
                z4 = false;
            } else {
                if (j2 != -9223372036854775807L) {
                    if (zM7206X) {
                        c18076b2 = c18076b;
                        jadVar.f30041a.mo22380h(c18076b2.f53356a, c15105b);
                        if (jadVar.f30041a.m37476n(c15105b.f34059c, c15106c).f34093n == jadVar.f30041a.mo6949b(c18076b2.f53356a)) {
                            Pair pairM37474j = lmhVar.m37474j(c15106c, c15105b, lmhVar.mo22380h(obj, c15105b).f34059c, j2 + c15105b.m37492n());
                            obj = pairM37474j.first;
                            jLongValue = ((Long) pairM37474j.second).longValue();
                        } else {
                            jLongValue = j2;
                        }
                        i3 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        c18076b2 = c18076b;
                        i3 = -1;
                        jLongValue = j2;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                    if (i3 == i2) {
                        Pair pairM37474j2 = lmhVar.m37474j(c15106c, c15105b, i3, -9223372036854775807L);
                        obj = pairM37474j2.first;
                        jLongValue = ((Long) pairM37474j2.second).longValue();
                        c2215l2 = c2215l;
                        j = -9223372036854775807L;
                    } else {
                        c2215l2 = c2215l;
                        j = jLongValue;
                    }
                    c18076bM7318L = c2215l2.m7318L(lmhVar, obj, jLongValue);
                    int i5 = c18076bM7318L.f53360e;
                    z6 = (c18076b2.f53356a.equals(obj) || c18076b2.m55842b() || c18076bM7318L.m55842b() || !(i5 != i2 || ((i4 = c18076b2.f53360e) != i2 && i5 >= i4))) ? false : true;
                    c18076b3 = c18076b2;
                    boolean zM7204T = m7204T(zM7206X, c18076b2, j2, c18076bM7318L, lmhVar.mo22380h(obj, c15105b), j);
                    if (!z6 || zM7204T) {
                        c18076bM7318L = c18076b3;
                    }
                    if (c18076bM7318L.m55842b()) {
                        if (c18076bM7318L.equals(c18076b3)) {
                            jLongValue = jadVar.f30059s;
                        } else {
                            lmhVar.mo22380h(c18076bM7318L.f53356a, c15105b);
                            jLongValue = c18076bM7318L.f53358c == c15105b.m37489k(c18076bM7318L.f53357b) ? c15105b.m37485g() : 0L;
                        }
                    }
                    return new g(c18076bM7318L, jLongValue, j, z2, z3, z4);
                }
                iMo22377a = lmhVar.mo22380h(obj, c15105b).f34059c;
            }
            i3 = iMo22377a;
            jLongValue = j2;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        c18076b2 = c18076b;
        if (i3 == i2) {
        }
        c18076bM7318L = c2215l2.m7318L(lmhVar, obj, jLongValue);
        int i52 = c18076bM7318L.f53360e;
        if (c18076b2.f53356a.equals(obj)) {
        }
        c18076b3 = c18076b2;
        boolean zM7204T2 = m7204T(zM7206X, c18076b2, j2, c18076bM7318L, lmhVar.mo22380h(obj, c15105b), j);
        if (!z6) {
            c18076bM7318L = c18076b3;
        }
        if (c18076bM7318L.m55842b()) {
        }
        return new g(c18076bM7318L, jLongValue, j, z2, z3, z4);
    }

    public static Pair F0(lmh lmhVar, h hVar, boolean z, int i, boolean z2, lmh.C15106c c15106c, lmh.C15105b c15105b) {
        Pair pairM37474j;
        int iG0;
        lmh lmhVar2 = hVar.f8408a;
        if (lmhVar.m37477q()) {
            return null;
        }
        lmh lmhVar3 = lmhVar2.m37477q() ? lmhVar : lmhVar2;
        try {
            pairM37474j = lmhVar3.m37474j(c15106c, c15105b, hVar.f8409b, hVar.f8410c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (lmhVar.equals(lmhVar3)) {
            return pairM37474j;
        }
        if (lmhVar.mo6949b(pairM37474j.first) != -1) {
            return (lmhVar3.mo22380h(pairM37474j.first, c15105b).f34062f && lmhVar3.m37476n(c15105b.f34059c, c15106c).f34093n == lmhVar3.mo6949b(pairM37474j.first)) ? lmhVar.m37474j(c15106c, c15105b, lmhVar.mo22380h(pairM37474j.first, c15105b).f34059c, hVar.f8410c) : pairM37474j;
        }
        if (z && (iG0 = G0(c15106c, c15105b, i, z2, pairM37474j.first, lmhVar3, lmhVar)) != -1) {
            return lmhVar.m37474j(c15106c, c15105b, iG0, -9223372036854775807L);
        }
        return null;
    }

    public static int G0(lmh.C15106c c15106c, lmh.C15105b c15105b, int i, boolean z, Object obj, lmh lmhVar, lmh lmhVar2) {
        Object obj2 = lmhVar.m37476n(lmhVar.mo22380h(obj, c15105b).f34059c, c15106c).f34080a;
        for (int i2 = 0; i2 < lmhVar2.mo6954p(); i2++) {
            if (lmhVar2.m37476n(i2, c15106c).f34080a.equals(obj2)) {
                return i2;
            }
        }
        int iMo6949b = lmhVar.mo6949b(obj);
        int iMo6951i = lmhVar.mo6951i();
        int iM37472d = iMo6949b;
        int iMo6949b2 = -1;
        for (int i3 = 0; i3 < iMo6951i && iMo6949b2 == -1; i3++) {
            iM37472d = lmhVar.m37472d(iM37472d, c15105b, c15106c, i, z);
            if (iM37472d == -1) {
                break;
            }
            iMo6949b2 = lmhVar2.mo6949b(lmhVar.mo6952m(iM37472d));
        }
        if (iMo6949b2 == -1) {
            return -1;
        }
        return lmhVar2.m37473f(iMo6949b2, c15105b).f34059c;
    }

    /* renamed from: T */
    public static boolean m7204T(boolean z, x8b.C18076b c18076b, long j, x8b.C18076b c18076b2, lmh.C15105b c15105b, long j2) {
        if (!z && j == j2 && c18076b.f53356a.equals(c18076b2.f53356a)) {
            return (c18076b.m55842b() && c15105b.m37496r(c18076b.f53357b)) ? (c15105b.m37486h(c18076b.f53357b, c18076b.f53358c) == 4 || c15105b.m37486h(c18076b.f53357b, c18076b.f53358c) == 2) ? false : true : c18076b2.m55842b() && c15105b.m37496r(c18076b2.f53357b);
        }
        return false;
    }

    /* renamed from: V */
    public static boolean m7205V(InterfaceC2218o interfaceC2218o) {
        return interfaceC2218o.getState() != 0;
    }

    /* renamed from: X */
    public static boolean m7206X(jad jadVar, lmh.C15105b c15105b) {
        x8b.C18076b c18076b = jadVar.f30042b;
        lmh lmhVar = jadVar.f30041a;
        return lmhVar.m37477q() || lmhVar.mo22380h(c18076b.f53356a, c15105b).f34062f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ Boolean m7207Y() {
        return Boolean.valueOf(this.p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m7208Z(C2217n c2217n) {
        try {
            m7245s(c2217n);
        } catch (qm6 e2) {
            ria.m46820d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: A */
    public final nf8 m7216A(ko6[] ko6VarArr) {
        nf8.C15566a c15566a = new nf8.C15566a();
        boolean z = false;
        for (ko6 ko6Var : ko6VarArr) {
            if (ko6Var != null) {
                Metadata metadata = ko6Var.mo22949e(0).f7940k;
                if (metadata == null) {
                    c15566a.mo32056a(new Metadata(new Metadata.Entry[0]));
                } else {
                    c15566a.mo32056a(metadata);
                    z = true;
                }
            }
        }
        return z ? c15566a.m40520k() : nf8.m40499E();
    }

    public final void A0(long j) {
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        long jM7278B = c2214kM7344t == null ? j + 1000000000000L : c2214kM7344t.m7278B(j);
        this.C0 = jM7278B;
        this.f8371M.m7102c(jM7278B);
        for (InterfaceC2218o interfaceC2218o : this.f8376a) {
            if (m7205V(interfaceC2218o)) {
                interfaceC2218o.mo6875M(this.C0);
            }
        }
        l0();
    }

    public final void A1(float f2) {
        for (C2214k c2214kM7344t = this.f8375Z.m7344t(); c2214kM7344t != null; c2214kM7344t = c2214kM7344t.m7289k()) {
            for (ko6 ko6Var : c2214kM7344t.m7294p().f16842c) {
                if (ko6Var != null) {
                    ko6Var.mo19891h(f2);
                }
            }
        }
    }

    /* renamed from: B */
    public final long m7217B() {
        jad jadVar = this.n0;
        return m7218D(jadVar.f30041a, jadVar.f30042b.f53356a, jadVar.f30059s);
    }

    public final synchronized void B1(hdg hdgVar, long j) {
        long jElapsedRealtime = this.f8373X.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) hdgVar.get()).booleanValue() && j > 0) {
            try {
                this.f8373X.mo21306c();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.f8373X.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: D */
    public final long m7218D(lmh lmhVar, Object obj, long j) {
        lmhVar.m37476n(lmhVar.mo22380h(obj, this.f8387y).f34059c, this.f8386x);
        lmh.C15106c c15106c = this.f8386x;
        if (c15106c.f34085f != -9223372036854775807L && c15106c.m37504f()) {
            lmh.C15106c c15106c2 = this.f8386x;
            if (c15106c2.f34088i) {
                return sqi.O0(c15106c2.m37499a() - this.f8386x.f34085f) - (j + this.f8387y.m37492n());
            }
        }
        return -9223372036854775807L;
    }

    public final void D0(lmh lmhVar, lmh lmhVar2) {
        if (lmhVar.m37477q() && lmhVar2.m37477q()) {
            return;
        }
        for (int size = this.f8372Q.size() - 1; size >= 0; size--) {
            if (!C0((d) this.f8372Q.get(size), lmhVar, lmhVar2, this.v0, this.w0, this.f8386x, this.f8387y)) {
                ((d) this.f8372Q.get(size)).f8393a.m7423k(false);
                this.f8372Q.remove(size);
            }
        }
        Collections.sort(this.f8372Q);
    }

    /* renamed from: E */
    public final long m7219E() {
        C2214k c2214kM7345u = this.f8375Z.m7345u();
        if (c2214kM7345u == null) {
            return 0L;
        }
        long jM7291m = c2214kM7345u.m7291m();
        if (!c2214kM7345u.f8430d) {
            return jM7291m;
        }
        int i = 0;
        while (true) {
            InterfaceC2218o[] interfaceC2218oArr = this.f8376a;
            if (i >= interfaceC2218oArr.length) {
                return jM7291m;
            }
            if (m7205V(interfaceC2218oArr[i]) && this.f8376a[i].getStream() == c2214kM7345u.f8429c[i]) {
                long jMo6873K = this.f8376a[i].mo6873K();
                if (jMo6873K == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM7291m = Math.max(jMo6873K, jM7291m);
            }
            i++;
        }
    }

    /* renamed from: F */
    public final Pair m7220F(lmh lmhVar) {
        if (lmhVar.m37477q()) {
            return Pair.create(jad.m33446l(), 0L);
        }
        Pair pairM37474j = lmhVar.m37474j(this.f8386x, this.f8387y, lmhVar.mo22377a(this.w0), -9223372036854775807L);
        x8b.C18076b c18076bM7318L = this.f8375Z.m7318L(lmhVar, pairM37474j.first, 0L);
        long jLongValue = ((Long) pairM37474j.second).longValue();
        if (c18076bM7318L.m55842b()) {
            lmhVar.mo22380h(c18076bM7318L.f53356a, this.f8387y);
            jLongValue = c18076bM7318L.f53358c == this.f8387y.m37489k(c18076bM7318L.f53357b) ? this.f8387y.m37485g() : 0L;
        }
        return Pair.create(c18076bM7318L, Long.valueOf(jLongValue));
    }

    /* renamed from: G */
    public Looper m7221G() {
        return this.f8385s;
    }

    /* renamed from: H */
    public final long m7222H() {
        return m7223I(this.n0.f30057q);
    }

    public final void H0(long j) {
        long jMin = (this.n0.f30045e != 3 || (!this.l0 && m1())) ? L0 : 1000L;
        if (this.l0 && m1()) {
            for (InterfaceC2218o interfaceC2218o : this.f8376a) {
                if (m7205V(interfaceC2218o)) {
                    jMin = Math.min(jMin, sqi.q1(interfaceC2218o.mo7427C(this.C0, this.D0)));
                }
            }
        }
        this.f8383h.mo28841j(2, j + jMin);
    }

    /* renamed from: I */
    public final long m7223I(long j) {
        C2214k c2214kM7337m = this.f8375Z.m7337m();
        if (c2214kM7337m == null) {
            return 0L;
        }
        return Math.max(0L, j - c2214kM7337m.m7277A(this.C0));
    }

    public void I0(lmh lmhVar, int i, long j) {
        this.f8383h.mo28834c(3, new h(lmhVar, i, j)).mo28843a();
    }

    /* renamed from: J */
    public final void m7224J(x4b x4bVar) {
        if (this.f8375Z.m7311B(x4bVar)) {
            this.f8375Z.m7313F(this.C0);
            a0();
        }
    }

    public final void J0(boolean z) throws qm6 {
        x8b.C18076b c18076b = this.f8375Z.m7344t().f8432f.f54866a;
        long jM0 = M0(c18076b, this.n0.f30059s, true, false);
        if (jM0 != this.n0.f30059s) {
            jad jadVar = this.n0;
            this.n0 = m7231Q(c18076b, jM0, jadVar.f30043c, jadVar.f30044d, z, 5);
        }
    }

    /* renamed from: K */
    public final void m7225K(IOException iOException, int i) {
        qm6 qm6VarM45649c = qm6.m45649c(iOException, i);
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        if (c2214kM7344t != null) {
            qm6VarM45649c = qm6VarM45649c.m45652a(c2214kM7344t.f8432f.f54866a);
        }
        ria.m46820d("ExoPlayerImplInternal", "Playback error", qm6VarM45649c);
        r1(false, false);
        this.n0 = this.n0.m33452f(qm6VarM45649c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a2, B:24:0x00ac, B:27:0x00b2, B:29:0x00b8, B:30:0x00bb, B:32:0x00c1, B:34:0x00cb, B:36:0x00d3, B:40:0x00db, B:42:0x00e5, B:44:0x00f5, B:48:0x00ff, B:52:0x0111, B:56:0x011a), top: B:74:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(h hVar) throws Throwable {
        long jLongValue;
        long j;
        boolean z;
        x8b.C18076b c18076b;
        long jM37485g;
        long j2;
        long j3;
        long jMo7005e;
        long j4;
        jad jadVar;
        int i;
        this.o0.m7262b(1);
        Pair pairF0 = F0(this.n0.f30041a, hVar, true, this.v0, this.w0, this.f8386x, this.f8387y);
        try {
            if (pairF0 == null) {
                Pair pairM7220F = m7220F(this.n0.f30041a);
                c18076b = (x8b.C18076b) pairM7220F.first;
                jLongValue = ((Long) pairM7220F.second).longValue();
                z = !this.n0.f30041a.m37477q();
                j = -9223372036854775807L;
            } else {
                Object obj = pairF0.first;
                jLongValue = ((Long) pairF0.second).longValue();
                long j5 = hVar.f8410c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                x8b.C18076b c18076bM7318L = this.f8375Z.m7318L(this.n0.f30041a, obj, jLongValue);
                if (c18076bM7318L.m55842b()) {
                    this.n0.f30041a.mo22380h(c18076bM7318L.f53356a, this.f8387y);
                    jM37485g = this.f8387y.m37489k(c18076bM7318L.f53357b) == c18076bM7318L.f53358c ? this.f8387y.m37485g() : 0L;
                    j2 = j5;
                    c18076b = c18076bM7318L;
                    z = true;
                    if (!this.n0.f30041a.m37477q()) {
                        this.B0 = hVar;
                    } else {
                        if (pairF0 != null) {
                            if (c18076b.equals(this.n0.f30042b)) {
                                C2214k c2214kM7344t = this.f8375Z.m7344t();
                                jMo7005e = (c2214kM7344t == null || !c2214kM7344t.f8430d || jM37485g == 0) ? jM37485g : c2214kM7344t.f8427a.mo7005e(jM37485g, this.m0);
                                if (sqi.q1(jMo7005e) == sqi.q1(this.n0.f30059s) && ((i = (jadVar = this.n0).f30045e) == 2 || i == 3)) {
                                    long j6 = jadVar.f30059s;
                                    this.n0 = m7231Q(c18076b, j6, j2, j6, z, 2);
                                    return;
                                }
                            } else {
                                jMo7005e = jM37485g;
                            }
                            long jL0 = L0(c18076b, jMo7005e, this.n0.f30045e == 4);
                            z |= jM37485g != jL0;
                            try {
                                jad jadVar2 = this.n0;
                                lmh lmhVar = jadVar2.f30041a;
                                y1(lmhVar, c18076b, lmhVar, jadVar2.f30042b, j2, true);
                                j4 = jL0;
                                this.n0 = m7231Q(c18076b, j4, j2, j4, z, 2);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                j3 = jL0;
                                this.n0 = m7231Q(c18076b, j3, j2, j3, z, 2);
                                throw th;
                            }
                        }
                        if (this.n0.f30045e != 1) {
                            j1(4);
                        }
                        y0(false, true, false, true);
                    }
                    j4 = jM37485g;
                    this.n0 = m7231Q(c18076b, j4, j2, j4, z, 2);
                    return;
                }
                j = j5;
                z = hVar.f8410c == -9223372036854775807L;
                c18076b = c18076bM7318L;
            }
            if (!this.n0.f30041a.m37477q()) {
            }
            j4 = jM37485g;
            this.n0 = m7231Q(c18076b, j4, j2, j4, z, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            j3 = jM37485g;
        }
        jM37485g = jLongValue;
        j2 = j;
    }

    /* renamed from: L */
    public final void m7226L(boolean z) {
        C2214k c2214kM7337m = this.f8375Z.m7337m();
        x8b.C18076b c18076b = c2214kM7337m == null ? this.n0.f30042b : c2214kM7337m.f8432f.f54866a;
        boolean z2 = !this.n0.f30051k.equals(c18076b);
        if (z2) {
            this.n0 = this.n0.m33449c(c18076b);
        }
        jad jadVar = this.n0;
        jadVar.f30057q = c2214kM7337m == null ? jadVar.f30059s : c2214kM7337m.m7288j();
        this.n0.f30058r = m7222H();
        if ((z2 || z) && c2214kM7337m != null && c2214kM7337m.f8430d) {
            u1(c2214kM7337m.f8432f.f54866a, c2214kM7337m.m7293o(), c2214kM7337m.m7294p());
        }
    }

    public final long L0(x8b.C18076b c18076b, long j, boolean z) {
        return M0(c18076b, j, this.f8375Z.m7344t() != this.f8375Z.m7345u(), z);
    }

    /* JADX WARN: Not initialized variable reg: 26, insn: 0x0152: MOVE (r5 I:??[long, double]) = (r26 I:??[long, double]) (LINE:339), block:B:75:0x0151 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7227M(lmh lmhVar, boolean z) throws Throwable {
        int i;
        h hVar;
        long j;
        long j2;
        long j3;
        long jL0;
        g gVarE0 = E0(lmhVar, this.n0, this.B0, this.f8375Z, this.v0, this.w0, this.f8386x, this.f8387y);
        x8b.C18076b c18076b = gVarE0.f8402a;
        long j4 = gVarE0.f8404c;
        boolean z2 = gVarE0.f8405d;
        long j5 = gVarE0.f8403b;
        int i2 = 1;
        boolean z3 = (this.n0.f30042b.equals(c18076b) && j5 == this.n0.f30059s) ? false : true;
        try {
            if (gVarE0.f8406e) {
                if (this.n0.f30045e != 1) {
                    j1(4);
                }
                y0(false, false, false, true);
            }
            try {
                for (InterfaceC2218o interfaceC2218o : this.f8376a) {
                    interfaceC2218o.mo6893q(lmhVar);
                }
                try {
                    if (z3) {
                        j3 = j5;
                        i2 = -1;
                        i = 4;
                        if (lmhVar.m37477q()) {
                            jL0 = j3;
                        } else {
                            try {
                                for (C2214k c2214kM7344t = this.f8375Z.m7344t(); c2214kM7344t != null; c2214kM7344t = c2214kM7344t.m7289k()) {
                                    if (c2214kM7344t.f8432f.f54866a.equals(c18076b)) {
                                        c2214kM7344t.f8432f = this.f8375Z.m7346v(lmhVar, c2214kM7344t.f8432f);
                                        c2214kM7344t.m7279C();
                                    }
                                }
                                j5 = j3;
                            } catch (Throwable th) {
                                th = th;
                                j5 = j3;
                            }
                            try {
                                jL0 = L0(c18076b, j5, z2);
                            } catch (Throwable th2) {
                                th = th2;
                                hVar = null;
                                jad jadVar = this.n0;
                                j = j5;
                                y1(lmhVar, c18076b, jadVar.f30041a, jadVar.f30042b, gVarE0.f8407f ? j5 : -9223372036854775807L, false);
                                if (z3) {
                                }
                                z0();
                                D0(lmhVar, this.n0.f30041a);
                                this.n0 = this.n0.m33456j(lmhVar);
                                if (!lmhVar.m37477q()) {
                                }
                                m7226L(false);
                                this.f8383h.mo28840i(2);
                                throw th;
                            }
                        }
                        jad jadVar2 = this.n0;
                        y1(lmhVar, c18076b, jadVar2.f30041a, jadVar2.f30042b, !gVarE0.f8407f ? jL0 : -9223372036854775807L, false);
                        if (!z3) {
                            jad jadVar3 = this.n0;
                            Object obj = jadVar3.f30042b.f53356a;
                            lmh lmhVar2 = jadVar3.f30041a;
                            if (z3) {
                                this.n0 = m7231Q(c18076b, jL0, j4, this.n0.f30044d, (z3 || !z || lmhVar2.m37477q() || lmhVar2.mo22380h(obj, this.f8387y).f34062f) ? false : true, lmhVar.mo6949b(obj) != i2 ? i : 3);
                            }
                        }
                        z0();
                        D0(lmhVar, this.n0.f30041a);
                        this.n0 = this.n0.m33456j(lmhVar);
                        if (!lmhVar.m37477q()) {
                        }
                        m7226L(false);
                        this.f8383h.mo28840i(2);
                        return;
                    }
                    try {
                        i = 4;
                        i2 = -1;
                        j3 = j5;
                        if (!this.f8375Z.m7324R(lmhVar, this.C0, m7219E())) {
                            J0(false);
                        }
                        jL0 = j3;
                        jad jadVar22 = this.n0;
                        y1(lmhVar, c18076b, jadVar22.f30041a, jadVar22.f30042b, !gVarE0.f8407f ? jL0 : -9223372036854775807L, false);
                        if (!z3 || j4 != this.n0.f30043c) {
                            jad jadVar32 = this.n0;
                            Object obj2 = jadVar32.f30042b.f53356a;
                            lmh lmhVar22 = jadVar32.f30041a;
                            this.n0 = m7231Q(c18076b, jL0, j4, this.n0.f30044d, (z3 || !z || lmhVar22.m37477q() || lmhVar22.mo22380h(obj2, this.f8387y).f34062f) ? false : true, lmhVar.mo6949b(obj2) != i2 ? i : 3);
                        }
                        z0();
                        D0(lmhVar, this.n0.f30041a);
                        this.n0 = this.n0.m33456j(lmhVar);
                        if (!lmhVar.m37477q()) {
                            this.B0 = null;
                        }
                        m7226L(false);
                        this.f8383h.mo28840i(2);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        i2 = -1;
                        i = 4;
                        hVar = null;
                        jad jadVar4 = this.n0;
                        j = j5;
                        y1(lmhVar, c18076b, jadVar4.f30041a, jadVar4.f30042b, gVarE0.f8407f ? j5 : -9223372036854775807L, false);
                        if (z3) {
                            jad jadVar5 = this.n0;
                            Object obj3 = jadVar5.f30042b.f53356a;
                            lmh lmhVar3 = jadVar5.f30041a;
                            if (z3) {
                                this.n0 = m7231Q(c18076b, j, j4, this.n0.f30044d, (z3 || !z || lmhVar3.m37477q() || lmhVar3.mo22380h(obj3, this.f8387y).f34062f) ? false : true, lmhVar.mo6949b(obj3) != i2 ? i : 3);
                            }
                        }
                        z0();
                        D0(lmhVar, this.n0.f30041a);
                        this.n0 = this.n0.m33456j(lmhVar);
                        if (!lmhVar.m37477q()) {
                        }
                        m7226L(false);
                        this.f8383h.mo28840i(2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    hVar = null;
                    j5 = j2;
                }
            } catch (Throwable th5) {
                th = th5;
                hVar = null;
                i2 = -1;
                i = 4;
            }
        } catch (Throwable th6) {
            th = th6;
            i = 4;
            hVar = null;
            i2 = -1;
        }
        jad jadVar42 = this.n0;
        j = j5;
        y1(lmhVar, c18076b, jadVar42.f30041a, jadVar42.f30042b, gVarE0.f8407f ? j5 : -9223372036854775807L, false);
        if (z3 || j4 != this.n0.f30043c) {
            jad jadVar52 = this.n0;
            Object obj32 = jadVar52.f30042b.f53356a;
            lmh lmhVar32 = jadVar52.f30041a;
            this.n0 = m7231Q(c18076b, j, j4, this.n0.f30044d, (z3 || !z || lmhVar32.m37477q() || lmhVar32.mo22380h(obj32, this.f8387y).f34062f) ? false : true, lmhVar.mo6949b(obj32) != i2 ? i : 3);
        }
        z0();
        D0(lmhVar, this.n0.f30041a);
        this.n0 = this.n0.m33456j(lmhVar);
        if (!lmhVar.m37477q()) {
            this.B0 = hVar;
        }
        m7226L(false);
        this.f8383h.mo28840i(2);
        throw th;
    }

    public final long M0(x8b.C18076b c18076b, long j, boolean z, boolean z2) throws qm6 {
        s1();
        z1(false, true);
        if (z2 || this.n0.f30045e == 3) {
            j1(2);
        }
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        C2214k c2214kM7289k = c2214kM7344t;
        while (c2214kM7289k != null && !c18076b.equals(c2214kM7289k.f8432f.f54866a)) {
            c2214kM7289k = c2214kM7289k.m7289k();
        }
        if (z || c2214kM7344t != c2214kM7289k || (c2214kM7289k != null && c2214kM7289k.m7278B(j) < 0)) {
            for (InterfaceC2218o interfaceC2218o : this.f8376a) {
                m7246t(interfaceC2218o);
            }
            if (c2214kM7289k != null) {
                while (this.f8375Z.m7344t() != c2214kM7289k) {
                    this.f8375Z.m7327b();
                }
                this.f8375Z.m7316I(c2214kM7289k);
                c2214kM7289k.m7303z(1000000000000L);
                m7249w();
            }
        }
        if (c2214kM7289k != null) {
            this.f8375Z.m7316I(c2214kM7289k);
            if (!c2214kM7289k.f8430d) {
                c2214kM7289k.f8432f = c2214kM7289k.f8432f.m57200b(j);
            } else if (c2214kM7289k.f8431e) {
                long jMo7008i = c2214kM7289k.f8427a.mo7008i(j);
                c2214kM7289k.f8427a.mo7015t(jMo7008i - this.f8369H, this.f8370L);
                j = jMo7008i;
            }
            A0(j);
            a0();
        } else {
            this.f8375Z.m7330f();
            A0(j);
        }
        m7226L(false);
        this.f8383h.mo28840i(2);
        return j;
    }

    /* renamed from: N */
    public final void m7228N(x4b x4bVar) throws qm6 {
        if (this.f8375Z.m7311B(x4bVar)) {
            C2214k c2214kM7337m = this.f8375Z.m7337m();
            c2214kM7337m.m7295q(this.f8371M.mo7104e().f31768a, this.n0.f30041a);
            u1(c2214kM7337m.f8432f.f54866a, c2214kM7337m.m7293o(), c2214kM7337m.m7294p());
            if (c2214kM7337m == this.f8375Z.m7344t()) {
                A0(c2214kM7337m.f8432f.f54867b);
                m7249w();
                jad jadVar = this.n0;
                x8b.C18076b c18076b = jadVar.f30042b;
                long j = c2214kM7337m.f8432f.f54867b;
                this.n0 = m7231Q(c18076b, j, jadVar.f30043c, j, false, 5);
            }
            a0();
        }
    }

    public final void N0(C2217n c2217n) {
        if (c2217n.m7418f() == -9223372036854775807L) {
            O0(c2217n);
            return;
        }
        if (this.n0.f30041a.m37477q()) {
            this.f8372Q.add(new d(c2217n));
            return;
        }
        d dVar = new d(c2217n);
        lmh lmhVar = this.n0.f30041a;
        if (!C0(dVar, lmhVar, lmhVar, this.v0, this.w0, this.f8386x, this.f8387y)) {
            c2217n.m7423k(false);
        } else {
            this.f8372Q.add(dVar);
            Collections.sort(this.f8372Q);
        }
    }

    /* renamed from: O */
    public final void m7229O(kad kadVar, float f2, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.o0.m7262b(1);
            }
            this.n0 = this.n0.m33453g(kadVar);
        }
        A1(kadVar.f31768a);
        for (InterfaceC2218o interfaceC2218o : this.f8376a) {
            if (interfaceC2218o != null) {
                interfaceC2218o.mo7428H(f2, kadVar.f31768a);
            }
        }
    }

    public final void O0(C2217n c2217n) {
        if (c2217n.m7415c() != this.f8385s) {
            this.f8383h.mo28834c(15, c2217n).mo28843a();
            return;
        }
        m7245s(c2217n);
        int i = this.n0.f30045e;
        if (i == 3 || i == 2) {
            this.f8383h.mo28840i(2);
        }
    }

    /* renamed from: P */
    public final void m7230P(kad kadVar, boolean z) {
        m7229O(kadVar, kadVar.f31768a, true, z);
    }

    public final void P0(final C2217n c2217n) {
        Looper looperM7415c = c2217n.m7415c();
        if (looperM7415c.getThread().isAlive()) {
            this.f8373X.mo21305b(looperM7415c, null).mo28839h(new Runnable() { // from class: o.ho6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27243a.m7208Z(c2217n);
                }
            });
        } else {
            ria.m46824h("TAG", "Trying to send message on a dead thread.");
            c2217n.m7423k(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* renamed from: Q */
    public final jad m7231Q(x8b.C18076b c18076b, long j, long j2, long j3, boolean z, int i) {
        nf8 nf8VarM40499E;
        sth sthVar;
        buh buhVar;
        this.F0 = (!this.F0 && j == this.n0.f30059s && c18076b.equals(this.n0.f30042b)) ? false : true;
        z0();
        jad jadVar = this.n0;
        sth sthVar2 = jadVar.f30048h;
        buh buhVar2 = jadVar.f30049i;
        ?? r1 = jadVar.f30050j;
        if (this.h0.m7376t()) {
            C2214k c2214kM7344t = this.f8375Z.m7344t();
            sth sthVarM7293o = c2214kM7344t == null ? sth.f45921d : c2214kM7344t.m7293o();
            buh buhVarM7294p = c2214kM7344t == null ? this.f8380e : c2214kM7344t.m7294p();
            nf8 nf8VarM7216A = m7216A(buhVarM7294p.f16842c);
            if (c2214kM7344t != null) {
                y4b y4bVar = c2214kM7344t.f8432f;
                if (y4bVar.f54868c != j2) {
                    c2214kM7344t.f8432f = y4bVar.m57199a(j2);
                }
            }
            e0();
            sthVar = sthVarM7293o;
            buhVar = buhVarM7294p;
            nf8VarM40499E = nf8VarM7216A;
        } else if (c18076b.equals(this.n0.f30042b)) {
            nf8VarM40499E = r1;
            sthVar = sthVar2;
            buhVar = buhVar2;
        } else {
            sthVar = sth.f45921d;
            buhVar = this.f8380e;
            nf8VarM40499E = nf8.m40499E();
        }
        if (z) {
            this.o0.m7264d(i);
        }
        return this.n0.m33450d(c18076b, j, j2, j3, m7222H(), sthVar, buhVar, nf8VarM40499E);
    }

    public final void Q0(long j) {
        for (InterfaceC2218o interfaceC2218o : this.f8376a) {
            if (interfaceC2218o.getStream() != null) {
                R0(interfaceC2218o, j);
            }
        }
    }

    /* renamed from: R */
    public final boolean m7232R(InterfaceC2218o interfaceC2218o, C2214k c2214k) {
        C2214k c2214kM7289k = c2214k.m7289k();
        return c2214k.f8432f.f54871f && c2214kM7289k.f8430d && ((interfaceC2218o instanceof mih) || (interfaceC2218o instanceof wdb) || interfaceC2218o.mo6873K() >= c2214kM7289k.m7292n());
    }

    public final void R0(InterfaceC2218o interfaceC2218o, long j) {
        interfaceC2218o.mo6892m();
        if (interfaceC2218o instanceof mih) {
            ((mih) interfaceC2218o).C0(j);
        }
    }

    /* renamed from: S */
    public final boolean m7233S() {
        C2214k c2214kM7345u = this.f8375Z.m7345u();
        if (!c2214kM7345u.f8430d) {
            return false;
        }
        int i = 0;
        while (true) {
            InterfaceC2218o[] interfaceC2218oArr = this.f8376a;
            if (i >= interfaceC2218oArr.length) {
                return true;
            }
            InterfaceC2218o interfaceC2218o = interfaceC2218oArr[i];
            t0f t0fVar = c2214kM7345u.f8429c[i];
            if (interfaceC2218o.getStream() != t0fVar || (t0fVar != null && !interfaceC2218o.mo6890i() && !m7232R(interfaceC2218o, c2214kM7345u))) {
                break;
            }
            i++;
        }
        return false;
    }

    public final void S0(boolean z, AtomicBoolean atomicBoolean) {
        if (this.x0 != z) {
            this.x0 = z;
            if (!z) {
                for (InterfaceC2218o interfaceC2218o : this.f8376a) {
                    if (!m7205V(interfaceC2218o) && this.f8377b.remove(interfaceC2218o)) {
                        interfaceC2218o.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void T0(kad kadVar) {
        this.f8383h.mo28842k(16);
        this.f8371M.mo7103d(kadVar);
    }

    /* renamed from: U */
    public final boolean m7234U() {
        C2214k c2214kM7337m = this.f8375Z.m7337m();
        return (c2214kM7337m == null || c2214kM7337m.m7296r() || c2214kM7337m.m7290l() == Long.MIN_VALUE) ? false : true;
    }

    public final void U0(b bVar) throws Throwable {
        this.o0.m7262b(1);
        if (bVar.f8391c != -1) {
            this.B0 = new h(new sbd(bVar.f8389a, bVar.f8390b), bVar.f8391c, bVar.f8392d);
        }
        m7227M(this.h0.m7364C(bVar.f8389a, bVar.f8390b), false);
    }

    public void V0(List list, int i, long j, crf crfVar) {
        this.f8383h.mo28834c(17, new b(list, crfVar, i, j, null)).mo28843a();
    }

    /* renamed from: W */
    public final boolean m7235W() {
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        long j = c2214kM7344t.f8432f.f54870e;
        return c2214kM7344t.f8430d && (j == -9223372036854775807L || this.n0.f30059s < j || !m1());
    }

    public final void W0(boolean z) {
        if (z == this.z0) {
            return;
        }
        this.z0 = z;
        if (z || !this.n0.f30056p) {
            return;
        }
        this.f8383h.mo28840i(2);
    }

    public final void X0(boolean z) throws qm6 {
        this.q0 = z;
        z0();
        if (!this.r0 || this.f8375Z.m7345u() == this.f8375Z.m7344t()) {
            return;
        }
        J0(true);
        m7226L(false);
    }

    public void Y0(boolean z, int i, int i2) {
        this.f8383h.mo28837f(1, z ? 1 : 0, i | (i2 << 4)).mo28843a();
    }

    public final void Z0(boolean z, int i, boolean z2, int i2) {
        this.o0.m7262b(z2 ? 1 : 0);
        this.n0 = this.n0.m33451e(z, i2, i);
        z1(false, false);
        m0(z);
        if (!m1()) {
            s1();
            x1();
            return;
        }
        int i3 = this.n0.f30045e;
        if (i3 == 3) {
            this.f8371M.m7106g();
            p1();
            this.f8383h.mo28840i(2);
        } else if (i3 == 2) {
            this.f8383h.mo28840i(2);
        }
    }

    @Override // p001o.auh.InterfaceC12254a
    /* renamed from: a */
    public void mo7236a(InterfaceC2218o interfaceC2218o) {
        this.f8383h.mo28840i(26);
    }

    public final void a0() {
        boolean zL1 = l1();
        this.u0 = zL1;
        if (zL1) {
            this.f8375Z.m7337m().m7284e(this.C0, this.f8371M.mo7104e().f31768a, this.t0);
        }
        t1();
    }

    public void a1(kad kadVar) {
        this.f8383h.mo28834c(4, kadVar).mo28843a();
    }

    @Override // p001o.auh.InterfaceC12254a
    /* renamed from: b */
    public void mo7237b() {
        this.f8383h.mo28840i(10);
    }

    public final void b0() {
        this.o0.m7263c(this.n0);
        if (this.o0.f8397a) {
            this.f8374Y.mo7265a(this.o0);
            this.o0 = new e(this.n0);
        }
    }

    public final void b1(kad kadVar) {
        T0(kadVar);
        m7230P(this.f8371M.mo7104e(), true);
    }

    @Override // androidx.media3.exoplayer.C2216m.d
    /* renamed from: c */
    public void mo7238c() {
        this.f8383h.mo28842k(2);
        this.f8383h.mo28840i(22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0074, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(long j, long j2) {
        d dVar;
        d dVar2;
        if (this.f8372Q.isEmpty() || this.n0.f30042b.m55842b()) {
            return;
        }
        if (this.F0) {
            j--;
            this.F0 = false;
        }
        jad jadVar = this.n0;
        int iMo6949b = jadVar.f30041a.mo6949b(jadVar.f30042b.f53356a);
        int iMin = Math.min(this.E0, this.f8372Q.size());
        if (iMin > 0) {
            dVar = (d) this.f8372Q.get(iMin - 1);
            while (dVar != null) {
                int i = dVar.f8394b;
                if (i <= iMo6949b && (i != iMo6949b || dVar.f8395c <= j)) {
                    break;
                }
                iMin--;
                if (iMin > 0) {
                    dVar = (d) this.f8372Q.get(iMin - 1);
                }
            }
            if (iMin < this.f8372Q.size()) {
                dVar2 = (d) this.f8372Q.get(iMin);
                while (dVar2 != null && dVar2.f8396d != null) {
                    int i2 = dVar2.f8394b;
                    if (i2 >= iMo6949b && (i2 != iMo6949b || dVar2.f8395c > j)) {
                        break;
                    }
                    iMin++;
                    if (iMin < this.f8372Q.size()) {
                        dVar2 = (d) this.f8372Q.get(iMin);
                    }
                }
                while (dVar2 != null && dVar2.f8396d != null && dVar2.f8394b == iMo6949b) {
                    long j3 = dVar2.f8395c;
                    if (j3 <= j || j3 > j2) {
                        break;
                    }
                    try {
                        O0(dVar2.f8393a);
                        if (dVar2.f8393a.m7414b() || dVar2.f8393a.m7422j()) {
                            this.f8372Q.remove(iMin);
                        } else {
                            iMin++;
                        }
                        dVar2 = iMin < this.f8372Q.size() ? (d) this.f8372Q.get(iMin) : null;
                    } catch (Throwable th) {
                        if (dVar2.f8393a.m7414b() || dVar2.f8393a.m7422j()) {
                            this.f8372Q.remove(iMin);
                        }
                        throw th;
                    }
                }
                this.E0 = iMin;
                return;
            }
            dVar2 = null;
        }
        dVar = null;
    }

    public final void c1(ExoPlayer.C2190c c2190c) {
        this.J0 = c2190c;
        this.f8375Z.m7323Q(this.n0.f30041a, c2190c);
    }

    @Override // androidx.media3.exoplayer.C2217n.a
    /* renamed from: d */
    public synchronized void mo7239d(C2217n c2217n) {
        if (!this.p0 && this.f8385s.getThread().isAlive()) {
            this.f8383h.mo28834c(14, c2217n).mo28843a();
            return;
        }
        ria.m46824h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        c2217n.m7423k(false);
    }

    public final boolean d0() {
        y4b y4bVarM7343s;
        this.f8375Z.m7313F(this.C0);
        boolean z = false;
        if (this.f8375Z.m7321O() && (y4bVarM7343s = this.f8375Z.m7343s(this.C0, this.n0)) != null) {
            C2214k c2214kM7331g = this.f8375Z.m7331g(y4bVarM7343s);
            c2214kM7331g.f8427a.mo7013q(this, y4bVarM7343s.f54867b);
            if (this.f8375Z.m7344t() == c2214kM7331g) {
                A0(y4bVarM7343s.f54867b);
            }
            m7226L(false);
            z = true;
        }
        if (this.u0) {
            this.u0 = m7234U();
            t1();
        } else {
            a0();
        }
        return z;
    }

    public void d1(int i) {
        this.f8383h.mo28837f(11, i, 0).mo28843a();
    }

    public final void e0() {
        boolean z;
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        if (c2214kM7344t != null) {
            buh buhVarM7294p = c2214kM7344t.m7294p();
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (true) {
                if (i >= this.f8376a.length) {
                    z = true;
                    break;
                }
                if (buhVarM7294p.m19842c(i)) {
                    if (this.f8376a[i].mo6888f() != 1) {
                        z = false;
                        break;
                    } else if (buhVarM7294p.f16841b[i].f36978a != 0) {
                        z3 = true;
                    }
                }
                i++;
            }
            if (z3 && z) {
                z2 = true;
            }
            W0(z2);
        }
    }

    public final void e1(int i) throws qm6 {
        this.v0 = i;
        if (!this.f8375Z.m7325S(this.n0.f30041a, i)) {
            J0(true);
        }
        m7226L(false);
    }

    @Override // p001o.x4b.InterfaceC18049a
    /* renamed from: f */
    public void mo7240f(x4b x4bVar) {
        this.f8383h.mo28834c(8, x4bVar).mo28843a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0() {
        boolean z;
        boolean z2 = false;
        while (k1()) {
            if (z2) {
                b0();
            }
            C2214k c2214k = (C2214k) op0.m42515e(this.f8375Z.m7327b());
            if (this.n0.f30042b.f53356a.equals(c2214k.f8432f.f54866a.f53356a)) {
                x8b.C18076b c18076b = this.n0.f30042b;
                if (c18076b.f53357b == -1) {
                    x8b.C18076b c18076b2 = c2214k.f8432f.f54866a;
                    z = c18076b2.f53357b == -1 && c18076b.f53360e != c18076b2.f53360e;
                }
            }
            y4b y4bVar = c2214k.f8432f;
            x8b.C18076b c18076b3 = y4bVar.f54866a;
            long j = y4bVar.f54867b;
            this.n0 = m7231Q(c18076b3, j, y4bVar.f54868c, j, !z, 0);
            z0();
            x1();
            if (this.n0.f30045e == 3) {
                p1();
            }
            m7242o();
            z2 = true;
        }
    }

    public final void f1(abf abfVar) {
        this.m0 = abfVar;
    }

    public final void g0(boolean z) {
        if (this.J0.f8122a != -9223372036854775807L) {
            if (z || !this.n0.f30041a.equals(this.K0)) {
                lmh lmhVar = this.n0.f30041a;
                this.K0 = lmhVar;
                this.f8375Z.m7348x(lmhVar);
            }
        }
    }

    public void g1(boolean z) {
        this.f8383h.mo28837f(12, z ? 1 : 0, 0).mo28843a();
    }

    public final void h0() {
        C2214k c2214kM7345u = this.f8375Z.m7345u();
        if (c2214kM7345u == null) {
            return;
        }
        int i = 0;
        if (c2214kM7345u.m7289k() != null && !this.r0) {
            if (m7233S()) {
                if (c2214kM7345u.m7289k().f8430d || this.C0 >= c2214kM7345u.m7289k().m7292n()) {
                    buh buhVarM7294p = c2214kM7345u.m7294p();
                    C2214k c2214kM7328c = this.f8375Z.m7328c();
                    buh buhVarM7294p2 = c2214kM7328c.m7294p();
                    lmh lmhVar = this.n0.f30041a;
                    y1(lmhVar, c2214kM7328c.f8432f.f54866a, lmhVar, c2214kM7345u.f8432f.f54866a, -9223372036854775807L, false);
                    if (c2214kM7328c.f8430d && c2214kM7328c.f8427a.mo7009j() != -9223372036854775807L) {
                        Q0(c2214kM7328c.m7292n());
                        if (c2214kM7328c.m7297s()) {
                            return;
                        }
                        this.f8375Z.m7316I(c2214kM7328c);
                        m7226L(false);
                        a0();
                        return;
                    }
                    for (int i2 = 0; i2 < this.f8376a.length; i2++) {
                        boolean zM19842c = buhVarM7294p.m19842c(i2);
                        boolean zM19842c2 = buhVarM7294p2.m19842c(i2);
                        if (zM19842c && !this.f8376a[i2].mo6896y()) {
                            boolean z = this.f8378c[i2].mo6888f() == -2;
                            nke nkeVar = buhVarM7294p.f16841b[i2];
                            nke nkeVar2 = buhVarM7294p2.f16841b[i2];
                            if (!zM19842c2 || !nkeVar2.equals(nkeVar) || z) {
                                R0(this.f8376a[i2], c2214kM7328c.m7292n());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!c2214kM7345u.f8432f.f54874i && !this.r0) {
            return;
        }
        while (true) {
            InterfaceC2218o[] interfaceC2218oArr = this.f8376a;
            if (i >= interfaceC2218oArr.length) {
                return;
            }
            InterfaceC2218o interfaceC2218o = interfaceC2218oArr[i];
            t0f t0fVar = c2214kM7345u.f8429c[i];
            if (t0fVar != null && interfaceC2218o.getStream() == t0fVar && interfaceC2218o.mo6890i()) {
                long j = c2214kM7345u.f8432f.f54870e;
                R0(interfaceC2218o, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : c2214kM7345u.m7291m() + c2214kM7345u.f8432f.f54870e);
            }
            i++;
        }
    }

    public final void h1(boolean z) throws qm6 {
        this.w0 = z;
        if (!this.f8375Z.m7326T(this.n0.f30041a, z)) {
            J0(true);
        }
        m7226L(false);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i;
        C2214k c2214kM7345u;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    Z0(z, i3 >> 4, true, i3 & 15);
                    break;
                case 2:
                    m7247u();
                    break;
                case 3:
                    K0((h) message.obj);
                    break;
                case 4:
                    b1((kad) message.obj);
                    break;
                case 5:
                    f1((abf) message.obj);
                    break;
                case 6:
                    r1(false, true);
                    break;
                case 7:
                    s0();
                    return true;
                case 8:
                    m7228N((x4b) message.obj);
                    break;
                case 9:
                    m7224J((x4b) message.obj);
                    break;
                case 10:
                    w0();
                    break;
                case 11:
                    e1(message.arg1);
                    break;
                case 12:
                    h1(message.arg1 != 0);
                    break;
                case 13:
                    S0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    N0((C2217n) message.obj);
                    break;
                case 15:
                    P0((C2217n) message.obj);
                    break;
                case 16:
                    m7230P((kad) message.obj, false);
                    break;
                case 17:
                    U0((b) message.obj);
                    break;
                case 18:
                    m7241n((b) message.obj, message.arg1);
                    break;
                case 19:
                    tq.m50332a(message.obj);
                    k0(null);
                    break;
                case 20:
                    u0(message.arg1, message.arg2, (crf) message.obj);
                    break;
                case 21:
                    i1((crf) message.obj);
                    break;
                case 22:
                    j0();
                    break;
                case 23:
                    X0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m7243p();
                    break;
                case 26:
                    x0();
                    break;
                case 27:
                    v1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    c1((ExoPlayer.C2190c) message.obj);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    q0();
                    break;
            }
        } catch (RuntimeException e2) {
            qm6 qm6VarM45650d = qm6.m45650d(e2, ((e2 instanceof IllegalStateException) || (e2 instanceof IllegalArgumentException)) ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : 1000);
            ria.m46820d("ExoPlayerImplInternal", "Playback error", qm6VarM45650d);
            r1(true, false);
            this.n0 = this.n0.m33452f(qm6VarM45650d);
        } catch (bh1 e3) {
            m7225K(e3, 1002);
        } catch (byc e4) {
            int i4 = e4.f16969b;
            if (i4 == 1) {
                i2 = e4.f16968a ? AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else {
                if (i4 == 4) {
                    i2 = e4.f16968a ? AuthApiStatusCodes.AUTH_API_CLIENT_ERROR : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
                }
                m7225K(e4, i);
            }
            i = i2;
            m7225K(e4, i);
        } catch (fz4 e5) {
            m7225K(e5, e5.f24270a);
        } catch (fz5.C13592a e6) {
            m7225K(e6, e6.f24271a);
        } catch (IOException e7) {
            m7225K(e7, 2000);
        } catch (qm6 e8) {
            qm6 qm6VarM45652a = e8;
            if (qm6VarM45652a.f42146s == 1 && (c2214kM7345u = this.f8375Z.m7345u()) != null) {
                qm6VarM45652a = qm6VarM45652a.m45652a(c2214kM7345u.f8432f.f54866a);
            }
            if (qm6VarM45652a.f42145Q && (this.G0 == null || (i = qm6VarM45652a.f28346a) == 5004 || i == 5003)) {
                ria.m46825i("ExoPlayerImplInternal", "Recoverable renderer error", qm6VarM45652a);
                qm6 qm6Var = this.G0;
                if (qm6Var != null) {
                    qm6Var.addSuppressed(qm6VarM45652a);
                    qm6VarM45652a = this.G0;
                } else {
                    this.G0 = qm6VarM45652a;
                }
                uw7 uw7Var = this.f8383h;
                uw7Var.mo28838g(uw7Var.mo28834c(25, qm6VarM45652a));
            } else {
                qm6 qm6Var2 = this.G0;
                if (qm6Var2 != null) {
                    qm6Var2.addSuppressed(qm6VarM45652a);
                    qm6VarM45652a = this.G0;
                }
                qm6 qm6Var3 = qm6VarM45652a;
                ria.m46820d("ExoPlayerImplInternal", "Playback error", qm6Var3);
                if (qm6Var3.f42146s == 1 && this.f8375Z.m7344t() != this.f8375Z.m7345u()) {
                    while (this.f8375Z.m7344t() != this.f8375Z.m7345u()) {
                        this.f8375Z.m7327b();
                    }
                    C2214k c2214k = (C2214k) op0.m42515e(this.f8375Z.m7344t());
                    b0();
                    y4b y4bVar = c2214k.f8432f;
                    x8b.C18076b c18076b = y4bVar.f54866a;
                    long j = y4bVar.f54867b;
                    this.n0 = m7231Q(c18076b, j, y4bVar.f54868c, j, true, 0);
                }
                r1(true, false);
                this.n0 = this.n0.m33452f(qm6Var3);
            }
        }
        b0();
        return true;
    }

    public final void i0() throws qm6 {
        C2214k c2214kM7345u = this.f8375Z.m7345u();
        if (c2214kM7345u == null || this.f8375Z.m7344t() == c2214kM7345u || c2214kM7345u.f8433g || !v0()) {
            return;
        }
        m7249w();
    }

    public final void i1(crf crfVar) throws Throwable {
        this.o0.m7262b(1);
        m7227M(this.h0.m7365D(crfVar), false);
    }

    public final void j0() throws Throwable {
        m7227M(this.h0.m7370i(), true);
    }

    public final void j1(int i) {
        jad jadVar = this.n0;
        if (jadVar.f30045e != i) {
            if (i != 2) {
                this.I0 = -9223372036854775807L;
            }
            this.n0 = jadVar.m33454h(i);
        }
    }

    public final void k0(c cVar) {
        this.o0.m7262b(1);
        throw null;
    }

    public final boolean k1() {
        C2214k c2214kM7344t;
        C2214k c2214kM7289k;
        return m1() && !this.r0 && (c2214kM7344t = this.f8375Z.m7344t()) != null && (c2214kM7289k = c2214kM7344t.m7289k()) != null && this.C0 >= c2214kM7289k.m7292n() && c2214kM7289k.f8433g;
    }

    public final void l0() {
        for (C2214k c2214kM7344t = this.f8375Z.m7344t(); c2214kM7344t != null; c2214kM7344t = c2214kM7344t.m7289k()) {
            for (ko6 ko6Var : c2214kM7344t.m7294p().f16842c) {
                if (ko6Var != null) {
                    ko6Var.mo35980j();
                }
            }
        }
    }

    public final boolean l1() {
        if (!m7234U()) {
            return false;
        }
        C2214k c2214kM7337m = this.f8375Z.m7337m();
        long jM7223I = m7223I(c2214kM7337m.m7290l());
        InterfaceC2211i.a aVar = new InterfaceC2211i.a(this.k0, this.n0.f30041a, c2214kM7337m.f8432f.f54866a, c2214kM7337m == this.f8375Z.m7344t() ? c2214kM7337m.m7277A(this.C0) : c2214kM7337m.m7277A(this.C0) - c2214kM7337m.f8432f.f54867b, jM7223I, this.f8371M.mo7104e().f31768a, this.n0.f30052l, this.s0, o1(this.n0.f30041a, c2214kM7337m.f8432f.f54866a) ? this.i0.mo6900c() : -9223372036854775807L);
        boolean zMo7091g = this.f8381f.mo7091g(aVar);
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        if (zMo7091g || !c2214kM7344t.f8430d || jM7223I >= 500000) {
            return zMo7091g;
        }
        if (this.f8369H <= 0 && !this.f8370L) {
            return zMo7091g;
        }
        c2214kM7344t.f8427a.mo7015t(this.n0.f30059s, false);
        return this.f8381f.mo7091g(aVar);
    }

    public final void m0(boolean z) {
        for (C2214k c2214kM7344t = this.f8375Z.m7344t(); c2214kM7344t != null; c2214kM7344t = c2214kM7344t.m7289k()) {
            for (ko6 ko6Var : c2214kM7344t.m7294p().f16842c) {
                if (ko6Var != null) {
                    ko6Var.mo35981n(z);
                }
            }
        }
    }

    public final boolean m1() {
        jad jadVar = this.n0;
        return jadVar.f30052l && jadVar.f30054n == 0;
    }

    /* renamed from: n */
    public final void m7241n(b bVar, int i) throws Throwable {
        this.o0.m7262b(1);
        C2216m c2216m = this.h0;
        if (i == -1) {
            i = c2216m.m7375r();
        }
        m7227M(c2216m.m7367f(i, bVar.f8389a, bVar.f8390b), false);
    }

    public final void n0() {
        for (C2214k c2214kM7344t = this.f8375Z.m7344t(); c2214kM7344t != null; c2214kM7344t = c2214kM7344t.m7289k()) {
            for (ko6 ko6Var : c2214kM7344t.m7294p().f16842c) {
                if (ko6Var != null) {
                    ko6Var.mo35982s();
                }
            }
        }
    }

    public final boolean n1(boolean z) {
        if (this.A0 == 0) {
            return m7235W();
        }
        if (!z) {
            return false;
        }
        if (!this.n0.f30047g) {
            return true;
        }
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        long jMo6900c = o1(this.n0.f30041a, c2214kM7344t.f8432f.f54866a) ? this.i0.mo6900c() : -9223372036854775807L;
        C2214k c2214kM7337m = this.f8375Z.m7337m();
        return (c2214kM7337m.m7297s() && c2214kM7337m.f8432f.f54874i) || (c2214kM7337m.f8432f.f54866a.m55842b() && !c2214kM7337m.f8430d) || this.f8381f.mo7085a(new InterfaceC2211i.a(this.k0, this.n0.f30041a, c2214kM7344t.f8432f.f54866a, c2214kM7344t.m7277A(this.C0), m7222H(), this.f8371M.mo7104e().f31768a, this.n0.f30052l, this.s0, jMo6900c));
    }

    /* renamed from: o */
    public final void m7242o() {
        buh buhVarM7294p = this.f8375Z.m7344t().m7294p();
        for (int i = 0; i < this.f8376a.length; i++) {
            if (buhVarM7294p.m19842c(i)) {
                this.f8376a[i].mo7430c();
            }
        }
    }

    @Override // p001o.lef.InterfaceC15066a
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void mo7010k(x4b x4bVar) {
        this.f8383h.mo28834c(9, x4bVar).mo28843a();
    }

    public final boolean o1(lmh lmhVar, x8b.C18076b c18076b) {
        if (c18076b.m55842b() || lmhVar.m37477q()) {
            return false;
        }
        lmhVar.m37476n(lmhVar.mo22380h(c18076b.f53356a, this.f8387y).f34059c, this.f8386x);
        if (!this.f8386x.m37504f()) {
            return false;
        }
        lmh.C15106c c15106c = this.f8386x;
        return c15106c.f34088i && c15106c.f34085f != -9223372036854775807L;
    }

    /* renamed from: p */
    public final void m7243p() throws qm6 {
        x0();
    }

    public void p0() {
        this.f8383h.mo28832a(29).mo28843a();
    }

    public final void p1() {
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        if (c2214kM7344t == null) {
            return;
        }
        buh buhVarM7294p = c2214kM7344t.m7294p();
        for (int i = 0; i < this.f8376a.length; i++) {
            if (buhVarM7294p.m19842c(i) && this.f8376a[i].getState() == 1) {
                this.f8376a[i].start();
            }
        }
    }

    @Override // androidx.media3.exoplayer.C2208f.a
    /* renamed from: q */
    public void mo7111q(kad kadVar) {
        this.f8383h.mo28834c(16, kadVar).mo28843a();
    }

    public final void q0() {
        this.o0.m7262b(1);
        y0(false, false, false, true);
        this.f8381f.mo7086b(this.k0);
        j1(this.n0.f30041a.m37477q() ? 4 : 2);
        this.h0.m7378w(this.f8382g.mo24757d());
        this.f8383h.mo28840i(2);
    }

    public void q1() {
        this.f8383h.mo28832a(6).mo28843a();
    }

    /* renamed from: r */
    public final C2214k m7244r(y4b y4bVar, long j) {
        return new C2214k(this.f8378c, j, this.f8379d, this.f8381f.mo7089e(), this.h0, y4bVar, this.f8380e);
    }

    public synchronized boolean r0() {
        if (!this.p0 && this.f8385s.getThread().isAlive()) {
            this.f8383h.mo28840i(7);
            B1(new hdg() { // from class: o.go6
                @Override // p001o.hdg
                public final Object get() {
                    return this.f25611a.m7207Y();
                }
            }, this.j0);
            return this.p0;
        }
        return true;
    }

    public final void r1(boolean z, boolean z2) {
        y0(z || !this.x0, false, true, false);
        this.o0.m7262b(z2 ? 1 : 0);
        this.f8381f.mo7093i(this.k0);
        j1(1);
    }

    /* renamed from: s */
    public final void m7245s(C2217n c2217n) {
        if (c2217n.m7422j()) {
            return;
        }
        try {
            c2217n.m7419g().mo6894u(c2217n.m7421i(), c2217n.m7417e());
        } finally {
            c2217n.m7423k(true);
        }
    }

    public final void s0() {
        try {
            y0(true, false, true, false);
            t0();
            this.f8381f.mo7090f(this.k0);
            j1(1);
            HandlerThread handlerThread = this.f8384q;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.p0 = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f8384q;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.p0 = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void s1() {
        this.f8371M.m7107h();
        for (InterfaceC2218o interfaceC2218o : this.f8376a) {
            if (m7205V(interfaceC2218o)) {
                m7251y(interfaceC2218o);
            }
        }
    }

    /* renamed from: t */
    public final void m7246t(InterfaceC2218o interfaceC2218o) {
        if (m7205V(interfaceC2218o)) {
            this.f8371M.m7100a(interfaceC2218o);
            m7251y(interfaceC2218o);
            interfaceC2218o.disable();
            this.A0--;
        }
    }

    public final void t0() {
        for (int i = 0; i < this.f8376a.length; i++) {
            this.f8378c[i].mo6889h();
            this.f8376a[i].release();
        }
    }

    public final void t1() {
        C2214k c2214kM7337m = this.f8375Z.m7337m();
        boolean z = this.u0 || (c2214kM7337m != null && c2214kM7337m.f8427a.mo7002b());
        jad jadVar = this.n0;
        if (z != jadVar.f30047g) {
            this.n0 = jadVar.m33448b(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0186  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7247u() throws qm6 {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        long jMo21304a = this.f8373X.mo21304a();
        this.f8383h.mo28842k(2);
        w1();
        int i2 = this.n0.f30045e;
        if (i2 == 1 || i2 == 4) {
            return;
        }
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        if (c2214kM7344t == null) {
            H0(jMo21304a);
            return;
        }
        gth.m29480a("doSomeWork");
        x1();
        if (c2214kM7344t.f8430d) {
            this.D0 = sqi.O0(this.f8373X.elapsedRealtime());
            c2214kM7344t.f8427a.mo7015t(this.n0.f30059s - this.f8369H, this.f8370L);
            z = true;
            z2 = true;
            int i3 = 0;
            while (true) {
                InterfaceC2218o[] interfaceC2218oArr = this.f8376a;
                if (i3 >= interfaceC2218oArr.length) {
                    break;
                }
                InterfaceC2218o interfaceC2218o = interfaceC2218oArr[i3];
                if (m7205V(interfaceC2218o)) {
                    interfaceC2218o.mo7431g(this.C0, this.D0);
                    z = z && interfaceC2218o.mo7429b();
                    boolean z4 = c2214kM7344t.f8429c[i3] != interfaceC2218o.getStream();
                    boolean z5 = z4 || (!z4 && interfaceC2218o.mo6890i()) || interfaceC2218o.isReady() || interfaceC2218o.mo7429b();
                    z2 = z2 && z5;
                    if (!z5) {
                        interfaceC2218o.mo6895v();
                    }
                }
                i3++;
            }
        } else {
            c2214kM7344t.f8427a.mo7011n();
            z = true;
            z2 = true;
        }
        long j = c2214kM7344t.f8432f.f54870e;
        boolean z6 = z && c2214kM7344t.f8430d && (j == -9223372036854775807L || j <= this.n0.f30059s);
        if (z6 && this.r0) {
            this.r0 = false;
            Z0(false, this.n0.f30054n, false, 5);
        }
        if (z6 && c2214kM7344t.f8432f.f54874i) {
            j1(4);
            s1();
        } else if (this.n0.f30045e == 2 && n1(z2)) {
            j1(3);
            this.G0 = null;
            if (m1()) {
                z1(false, false);
                this.f8371M.m7106g();
                p1();
            }
        } else if (this.n0.f30045e == 3 && (this.A0 != 0 ? !z2 : !m7235W())) {
            z1(m1(), false);
            j1(2);
            if (this.s0) {
                n0();
                this.i0.mo6901d();
            }
            s1();
        }
        if (this.n0.f30045e == 2) {
            int i4 = 0;
            while (true) {
                InterfaceC2218o[] interfaceC2218oArr2 = this.f8376a;
                if (i4 >= interfaceC2218oArr2.length) {
                    break;
                }
                if (m7205V(interfaceC2218oArr2[i4]) && this.f8376a[i4].getStream() == c2214kM7344t.f8429c[i4]) {
                    this.f8376a[i4].mo6895v();
                }
                i4++;
            }
            jad jadVar = this.n0;
            z3 = !jadVar.f30047g && jadVar.f30058r < 500000 && m7234U();
        }
        if (!z3) {
            this.I0 = -9223372036854775807L;
        } else if (this.I0 == -9223372036854775807L) {
            this.I0 = this.f8373X.elapsedRealtime();
        } else if (this.f8373X.elapsedRealtime() - this.I0 >= 4000) {
            throw new IllegalStateException("Playback stuck buffering and not loading");
        }
        boolean z7 = m1() && this.n0.f30045e == 3;
        boolean z8 = this.z0 && this.y0 && z7;
        jad jadVar2 = this.n0;
        if (jadVar2.f30056p != z8) {
            this.n0 = jadVar2.m33455i(z8);
        }
        this.y0 = false;
        if (!z8 && (i = this.n0.f30045e) != 4 && (z7 || i == 2 || (i == 3 && this.A0 != 0))) {
            H0(jMo21304a);
        }
        gth.m29481b();
    }

    public final void u0(int i, int i2, crf crfVar) throws Throwable {
        this.o0.m7262b(1);
        m7227M(this.h0.m7362A(i, i2, crfVar), false);
    }

    public final void u1(x8b.C18076b c18076b, sth sthVar, buh buhVar) {
        this.f8381f.mo7088d(this.k0, this.n0.f30041a, c18076b, this.f8376a, sthVar, buhVar.f16842c);
    }

    /* renamed from: v */
    public final void m7248v(int i, boolean z, long j) throws qm6 {
        InterfaceC2218o interfaceC2218o = this.f8376a[i];
        if (m7205V(interfaceC2218o)) {
            return;
        }
        C2214k c2214kM7345u = this.f8375Z.m7345u();
        boolean z2 = c2214kM7345u == this.f8375Z.m7344t();
        buh buhVarM7294p = c2214kM7345u.m7294p();
        nke nkeVar = buhVarM7294p.f16841b[i];
        C2181a[] c2181aArrM7203C = m7203C(buhVarM7294p.f16842c[i]);
        boolean z3 = m1() && this.n0.f30045e == 3;
        boolean z4 = !z && z3;
        this.A0++;
        this.f8377b.add(interfaceC2218o);
        interfaceC2218o.mo6869B(nkeVar, c2181aArrM7203C, c2214kM7345u.f8429c[i], this.C0, z4, z2, j, c2214kM7345u.m7291m(), c2214kM7345u.f8432f.f54866a);
        interfaceC2218o.mo6894u(11, new a());
        this.f8371M.m7101b(interfaceC2218o);
        if (z3 && z2) {
            interfaceC2218o.start();
        }
    }

    public final boolean v0() {
        C2214k c2214kM7345u = this.f8375Z.m7345u();
        buh buhVarM7294p = c2214kM7345u.m7294p();
        int i = 0;
        boolean z = false;
        while (true) {
            InterfaceC2218o[] interfaceC2218oArr = this.f8376a;
            if (i >= interfaceC2218oArr.length) {
                return !z;
            }
            InterfaceC2218o interfaceC2218o = interfaceC2218oArr[i];
            if (m7205V(interfaceC2218o)) {
                boolean z2 = interfaceC2218o.getStream() != c2214kM7345u.f8429c[i];
                if (!buhVarM7294p.m19842c(i) || z2) {
                    if (!interfaceC2218o.mo6896y()) {
                        interfaceC2218o.mo6891l(m7203C(buhVarM7294p.f16842c[i]), c2214kM7345u.f8429c[i], c2214kM7345u.m7292n(), c2214kM7345u.m7291m(), c2214kM7345u.f8432f.f54866a);
                        if (this.z0) {
                            W0(false);
                        }
                    } else if (interfaceC2218o.mo7429b()) {
                        m7246t(interfaceC2218o);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    public final void v1(int i, int i2, List list) throws Throwable {
        this.o0.m7262b(1);
        m7227M(this.h0.m7366E(i, i2, list), false);
    }

    /* renamed from: w */
    public final void m7249w() throws qm6 {
        m7250x(new boolean[this.f8376a.length], this.f8375Z.m7345u().m7292n());
    }

    public final void w0() throws qm6 {
        float f2 = this.f8371M.mo7104e().f31768a;
        C2214k c2214kM7345u = this.f8375Z.m7345u();
        buh buhVar = null;
        boolean z = true;
        for (C2214k c2214kM7344t = this.f8375Z.m7344t(); c2214kM7344t != null && c2214kM7344t.f8430d; c2214kM7344t = c2214kM7344t.m7289k()) {
            buh buhVarM7301x = c2214kM7344t.m7301x(f2, this.n0.f30041a);
            if (c2214kM7344t == this.f8375Z.m7344t()) {
                buhVar = buhVarM7301x;
            }
            if (!buhVarM7301x.m19840a(c2214kM7344t.m7294p())) {
                if (z) {
                    C2214k c2214kM7344t2 = this.f8375Z.m7344t();
                    boolean zM7316I = this.f8375Z.m7316I(c2214kM7344t2);
                    boolean[] zArr = new boolean[this.f8376a.length];
                    long jM7281b = c2214kM7344t2.m7281b((buh) op0.m42515e(buhVar), this.n0.f30059s, zM7316I, zArr);
                    jad jadVar = this.n0;
                    boolean z2 = (jadVar.f30045e == 4 || jM7281b == jadVar.f30059s) ? false : true;
                    jad jadVar2 = this.n0;
                    this.n0 = m7231Q(jadVar2.f30042b, jM7281b, jadVar2.f30043c, jadVar2.f30044d, z2, 5);
                    if (z2) {
                        A0(jM7281b);
                    }
                    boolean[] zArr2 = new boolean[this.f8376a.length];
                    int i = 0;
                    while (true) {
                        InterfaceC2218o[] interfaceC2218oArr = this.f8376a;
                        if (i >= interfaceC2218oArr.length) {
                            break;
                        }
                        InterfaceC2218o interfaceC2218o = interfaceC2218oArr[i];
                        boolean zM7205V = m7205V(interfaceC2218o);
                        zArr2[i] = zM7205V;
                        t0f t0fVar = c2214kM7344t2.f8429c[i];
                        if (zM7205V) {
                            if (t0fVar != interfaceC2218o.getStream()) {
                                m7246t(interfaceC2218o);
                            } else if (zArr[i]) {
                                interfaceC2218o.mo6875M(this.C0);
                            }
                        }
                        i++;
                    }
                    m7250x(zArr2, this.C0);
                } else {
                    this.f8375Z.m7316I(c2214kM7344t);
                    if (c2214kM7344t.f8430d) {
                        c2214kM7344t.m7280a(buhVarM7301x, Math.max(c2214kM7344t.f8432f.f54867b, c2214kM7344t.m7277A(this.C0)), false);
                    }
                }
                m7226L(true);
                if (this.n0.f30045e != 4) {
                    a0();
                    x1();
                    this.f8383h.mo28840i(2);
                    return;
                }
                return;
            }
            if (c2214kM7344t == c2214kM7345u) {
                z = false;
            }
        }
    }

    public final void w1() throws qm6 {
        if (this.n0.f30041a.m37477q() || !this.h0.m7376t()) {
            return;
        }
        boolean zD0 = d0();
        h0();
        i0();
        f0();
        g0(zD0);
    }

    /* renamed from: x */
    public final void m7250x(boolean[] zArr, long j) throws qm6 {
        C2214k c2214kM7345u = this.f8375Z.m7345u();
        buh buhVarM7294p = c2214kM7345u.m7294p();
        for (int i = 0; i < this.f8376a.length; i++) {
            if (!buhVarM7294p.m19842c(i) && this.f8377b.remove(this.f8376a[i])) {
                this.f8376a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f8376a.length; i2++) {
            if (buhVarM7294p.m19842c(i2)) {
                m7248v(i2, zArr[i2], j);
            }
        }
        c2214kM7345u.f8433g = true;
    }

    public final void x0() throws qm6 {
        w0();
        J0(true);
    }

    public final void x1() {
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        if (c2214kM7344t == null) {
            return;
        }
        long jMo7009j = c2214kM7344t.f8430d ? c2214kM7344t.f8427a.mo7009j() : -9223372036854775807L;
        if (jMo7009j != -9223372036854775807L) {
            if (!c2214kM7344t.m7297s()) {
                this.f8375Z.m7316I(c2214kM7344t);
                m7226L(false);
                a0();
            }
            A0(jMo7009j);
            if (jMo7009j != this.n0.f30059s) {
                jad jadVar = this.n0;
                this.n0 = m7231Q(jadVar.f30042b, jMo7009j, jadVar.f30043c, jMo7009j, true, 5);
            }
        } else {
            long jM7108i = this.f8371M.m7108i(c2214kM7344t != this.f8375Z.m7345u());
            this.C0 = jM7108i;
            long jM7277A = c2214kM7344t.m7277A(jM7108i);
            c0(this.n0.f30059s, jM7277A);
            if (this.f8371M.mo7110t()) {
                boolean z = !this.o0.f8400d;
                jad jadVar2 = this.n0;
                this.n0 = m7231Q(jadVar2.f30042b, jM7277A, jadVar2.f30043c, jM7277A, z, 6);
            } else {
                this.n0.m33459o(jM7277A);
            }
        }
        this.n0.f30057q = this.f8375Z.m7337m().m7288j();
        this.n0.f30058r = m7222H();
        jad jadVar3 = this.n0;
        if (jadVar3.f30052l && jadVar3.f30045e == 3 && o1(jadVar3.f30041a, jadVar3.f30042b) && this.n0.f30055o.f31768a == 1.0f) {
            float fMo6899b = this.i0.mo6899b(m7217B(), m7222H());
            if (this.f8371M.mo7104e().f31768a != fMo6899b) {
                T0(this.n0.f30055o.m35248b(fMo6899b));
                m7229O(this.n0.f30055o, this.f8371M.mo7104e().f31768a, false, false);
            }
        }
    }

    /* renamed from: y */
    public final void m7251y(InterfaceC2218o interfaceC2218o) {
        if (interfaceC2218o.getState() == 2) {
            interfaceC2218o.stop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[PHI: r5 r6 r8
      0x00a3: PHI (r5v3 o.x8b$b) = (r5v2 o.x8b$b), (r5v6 o.x8b$b) binds: [B:30:0x007b, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r6v2 long) = (r6v1 long), (r6v9 long) binds: [B:30:0x007b, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r8v3 long) = (r8v2 long), (r8v6 long) binds: [B:30:0x007b, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed A[PHI: r0
      0x00ed: PHI (r0v10 o.lmh) = (r0v9 o.lmh), (r0v9 o.lmh), (r0v15 o.lmh), (r0v15 o.lmh) binds: [B:36:0x00b2, B:38:0x00b6, B:40:0x00c7, B:42:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        lmh lmhVar;
        x8b.C18076b c18076b;
        this.f8383h.mo28842k(2);
        this.G0 = null;
        z1(false, true);
        this.f8371M.m7107h();
        this.C0 = 1000000000000L;
        for (InterfaceC2218o interfaceC2218o : this.f8376a) {
            try {
                m7246t(interfaceC2218o);
            } catch (RuntimeException | qm6 e2) {
                ria.m46820d("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z) {
            for (InterfaceC2218o interfaceC2218o2 : this.f8376a) {
                if (this.f8377b.remove(interfaceC2218o2)) {
                    try {
                        interfaceC2218o2.reset();
                    } catch (RuntimeException e3) {
                        ria.m46820d("ExoPlayerImplInternal", "Reset failed.", e3);
                    }
                }
            }
        }
        this.A0 = 0;
        jad jadVar = this.n0;
        x8b.C18076b c18076b2 = jadVar.f30042b;
        long jLongValue = jadVar.f30059s;
        long j = (this.n0.f30042b.m55842b() || m7206X(this.n0, this.f8387y)) ? this.n0.f30043c : this.n0.f30059s;
        if (z2) {
            this.B0 = null;
            Pair pairM7220F = m7220F(this.n0.f30041a);
            c18076b2 = (x8b.C18076b) pairM7220F.first;
            jLongValue = ((Long) pairM7220F.second).longValue();
            j = -9223372036854775807L;
            z5 = c18076b2.equals(this.n0.f30042b) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.f8375Z.m7330f();
        this.u0 = false;
        lmh lmhVarM48138E = this.n0.f30041a;
        if (z3 && (lmhVarM48138E instanceof sbd)) {
            lmhVarM48138E = ((sbd) lmhVarM48138E).m48138E(this.h0.m7374q());
            if (c18076b2.f53357b != -1) {
                lmhVarM48138E.mo22380h(c18076b2.f53356a, this.f8387y);
                if (lmhVarM48138E.m37476n(this.f8387y.f34059c, this.f8386x).m37504f()) {
                    lmhVar = lmhVarM48138E;
                    c18076b = new x8b.C18076b(c18076b2.f53356a, c18076b2.f53359d);
                }
            }
        } else {
            lmhVar = lmhVarM48138E;
            c18076b = c18076b2;
        }
        jad jadVar2 = this.n0;
        int i = jadVar2.f30045e;
        qm6 qm6Var = z4 ? null : jadVar2.f30046f;
        sth sthVar = z5 ? sth.f45921d : jadVar2.f30048h;
        buh buhVar = z5 ? this.f8380e : jadVar2.f30049i;
        List listM40499E = z5 ? nf8.m40499E() : jadVar2.f30050j;
        jad jadVar3 = this.n0;
        this.n0 = new jad(lmhVar, c18076b, j3, j2, i, qm6Var, false, sthVar, buhVar, listM40499E, c18076b, jadVar3.f30052l, jadVar3.f30053m, jadVar3.f30054n, jadVar3.f30055o, j2, 0L, j2, 0L, false);
        if (z3) {
            this.f8375Z.m7315H();
            this.h0.m7380y();
        }
    }

    public final void y1(lmh lmhVar, x8b.C18076b c18076b, lmh lmhVar2, x8b.C18076b c18076b2, long j, boolean z) {
        if (!o1(lmhVar, c18076b)) {
            kad kadVar = c18076b.m55842b() ? kad.f31765d : this.n0.f30055o;
            if (this.f8371M.mo7104e().equals(kadVar)) {
                return;
            }
            T0(kadVar);
            m7229O(this.n0.f30055o, kadVar.f31768a, false, false);
            return;
        }
        lmhVar.m37476n(lmhVar.mo22380h(c18076b.f53356a, this.f8387y).f34059c, this.f8386x);
        this.i0.mo6898a((s2b.C16722g) sqi.m48729h(this.f8386x.f34089j));
        if (j != -9223372036854775807L) {
            this.i0.mo6902e(m7218D(lmhVar, c18076b.f53356a, j));
            return;
        }
        if (!sqi.m48724c(!lmhVar2.m37477q() ? lmhVar2.m37476n(lmhVar2.mo22380h(c18076b2.f53356a, this.f8387y).f34059c, this.f8386x).f34080a : null, this.f8386x.f34080a) || z) {
            this.i0.mo6902e(-9223372036854775807L);
        }
    }

    /* renamed from: z */
    public void m7252z(long j) {
        this.H0 = j;
    }

    public final void z0() {
        C2214k c2214kM7344t = this.f8375Z.m7344t();
        this.r0 = c2214kM7344t != null && c2214kM7344t.f8432f.f54873h && this.q0;
    }

    public final void z1(boolean z, boolean z2) {
        this.s0 = z;
        this.t0 = (!z || z2) ? -9223372036854775807L : this.f8373X.elapsedRealtime();
    }
}
