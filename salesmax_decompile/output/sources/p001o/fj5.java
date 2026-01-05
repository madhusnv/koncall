package p001o;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.InterfaceC2218o;
import androidx.media3.exoplayer.InterfaceC2221p;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import org.objectweb.asm.Opcodes;
import p001o.bw;
import p001o.dsa;
import p001o.fj5;
import p001o.ko6;
import p001o.nf8;
import p001o.x8b;
import p001o.yth;

/* loaded from: classes2.dex */
public class fj5 extends dsa implements InterfaceC2221p.a {

    /* renamed from: k */
    public static final mfc f23437k = mfc.m38936b(new Comparator() { // from class: o.dj5
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return fj5.m26819S((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: d */
    public final Object f23438d;

    /* renamed from: e */
    public final Context f23439e;

    /* renamed from: f */
    public final ko6.InterfaceC14893b f23440f;

    /* renamed from: g */
    public final boolean f23441g;

    /* renamed from: h */
    public C13456e f23442h;

    /* renamed from: i */
    public C13458g f23443i;

    /* renamed from: j */
    public wx0 f23444j;

    /* renamed from: o.fj5$b */
    public static final class C13453b extends AbstractC13460i implements Comparable {

        /* renamed from: H */
        public final boolean f23445H;

        /* renamed from: L */
        public final boolean f23446L;

        /* renamed from: M */
        public final int f23447M;

        /* renamed from: Q */
        public final int f23448Q;

        /* renamed from: X */
        public final boolean f23449X;

        /* renamed from: Y */
        public final int f23450Y;

        /* renamed from: Z */
        public final int f23451Z;

        /* renamed from: e */
        public final int f23452e;

        /* renamed from: f */
        public final boolean f23453f;

        /* renamed from: g */
        public final String f23454g;

        /* renamed from: h */
        public final C13456e f23455h;
        public final int h0;
        public final int i0;
        public final boolean j0;
        public final boolean k0;

        /* renamed from: q */
        public final boolean f23456q;

        /* renamed from: s */
        public final int f23457s;

        /* renamed from: x */
        public final int f23458x;

        /* renamed from: y */
        public final int f23459y;

        public C13453b(int i, qth qthVar, int i2, C13456e c13456e, int i3, boolean z, hgd hgdVar, int i4) {
            int i5;
            int iM26809G;
            int iM26809G2;
            super(i, qthVar, i2);
            this.f23455h = c13456e;
            int i6 = c13456e.s0 ? 24 : 16;
            this.f23445H = c13456e.o0 && (i4 & i6) != 0;
            this.f23454g = fj5.m26822X(this.f23499d.f7933d);
            this.f23456q = InterfaceC2221p.m7442k(i3, false);
            int i7 = 0;
            while (true) {
                int size = c13456e.f55988n.size();
                i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i7 >= size) {
                    iM26809G = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM26809G = fj5.m26809G(this.f23499d, (String) c13456e.f55988n.get(i7), false);
                    if (iM26809G > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f23458x = i7;
            this.f23457s = iM26809G;
            this.f23459y = fj5.m26812K(this.f23499d.f7935f, c13456e.f55989o);
            C2181a c2181a = this.f23499d;
            int i8 = c2181a.f7935f;
            this.f23446L = i8 == 0 || (i8 & 1) != 0;
            this.f23449X = (c2181a.f7934e & 1) != 0;
            int i9 = c2181a.f7919B;
            this.f23450Y = i9;
            this.f23451Z = c2181a.f7920C;
            int i10 = c2181a.f7938i;
            this.h0 = i10;
            this.f23453f = (i10 == -1 || i10 <= c13456e.f55991q) && (i9 == -1 || i9 <= c13456e.f55990p) && hgdVar.apply(c2181a);
            String[] strArrO0 = sqi.o0();
            int i11 = 0;
            while (true) {
                if (i11 >= strArrO0.length) {
                    iM26809G2 = 0;
                    i11 = Integer.MAX_VALUE;
                    break;
                } else {
                    iM26809G2 = fj5.m26809G(this.f23499d, strArrO0[i11], false);
                    if (iM26809G2 > 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f23447M = i11;
            this.f23448Q = iM26809G2;
            int i12 = 0;
            while (true) {
                if (i12 < c13456e.f55992r.size()) {
                    String str = this.f23499d.f7943n;
                    if (str != null && str.equals(c13456e.f55992r.get(i12))) {
                        i5 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            this.i0 = i5;
            this.j0 = InterfaceC2221p.m7441j(i3) == 128;
            this.k0 = InterfaceC2221p.m7439D(i3) == 64;
            this.f23452e = m26843h(i3, z, i6);
        }

        /* renamed from: d */
        public static int m26838d(List list, List list2) {
            return ((C13453b) Collections.max(list)).compareTo((C13453b) Collections.max(list2));
        }

        /* renamed from: g */
        public static nf8 m26839g(int i, qth qthVar, C13456e c13456e, int[] iArr, boolean z, hgd hgdVar, int i2) {
            nf8.C15566a c15566aM40508q = nf8.m40508q();
            for (int i3 = 0; i3 < qthVar.f42400a; i3++) {
                c15566aM40508q.mo32056a(new C13453b(i, qthVar, i3, c13456e, iArr[i3], z, hgdVar, i2));
            }
            return c15566aM40508q.m40520k();
        }

        @Override // p001o.fj5.AbstractC13460i
        /* renamed from: a */
        public int mo26840a() {
            return this.f23452e;
        }

        @Override // java.lang.Comparable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(C13453b c13453b) {
            mfc mfcVarMo29478e = (this.f23453f && this.f23456q) ? fj5.f23437k : fj5.f23437k.mo29478e();
            sk3 sk3VarMo48424f = sk3.m48421j().mo48425g(this.f23456q, c13453b.f23456q).mo48424f(Integer.valueOf(this.f23458x), Integer.valueOf(c13453b.f23458x), mfc.m38937c().mo29478e()).mo48422d(this.f23457s, c13453b.f23457s).mo48422d(this.f23459y, c13453b.f23459y).mo48425g(this.f23449X, c13453b.f23449X).mo48425g(this.f23446L, c13453b.f23446L).mo48424f(Integer.valueOf(this.f23447M), Integer.valueOf(c13453b.f23447M), mfc.m38937c().mo29478e()).mo48422d(this.f23448Q, c13453b.f23448Q).mo48425g(this.f23453f, c13453b.f23453f).mo48424f(Integer.valueOf(this.i0), Integer.valueOf(c13453b.i0), mfc.m38937c().mo29478e());
            if (this.f23455h.f55999y) {
                sk3VarMo48424f = sk3VarMo48424f.mo48424f(Integer.valueOf(this.h0), Integer.valueOf(c13453b.h0), fj5.f23437k.mo29478e());
            }
            sk3 sk3VarMo48424f2 = sk3VarMo48424f.mo48425g(this.j0, c13453b.j0).mo48425g(this.k0, c13453b.k0).mo48424f(Integer.valueOf(this.f23450Y), Integer.valueOf(c13453b.f23450Y), mfcVarMo29478e).mo48424f(Integer.valueOf(this.f23451Z), Integer.valueOf(c13453b.f23451Z), mfcVarMo29478e);
            if (sqi.m48724c(this.f23454g, c13453b.f23454g)) {
                sk3VarMo48424f2 = sk3VarMo48424f2.mo48424f(Integer.valueOf(this.h0), Integer.valueOf(c13453b.h0), mfcVarMo29478e);
            }
            return sk3VarMo48424f2.mo48427i();
        }

        /* renamed from: h */
        public final int m26843h(int i, boolean z, int i2) {
            if (!InterfaceC2221p.m7442k(i, this.f23455h.u0)) {
                return 0;
            }
            if (!this.f23453f && !this.f23455h.n0) {
                return 0;
            }
            C13456e c13456e = this.f23455h;
            if (c13456e.f55993s.f56005a == 2 && !fj5.m26823Y(c13456e, i, this.f23499d)) {
                return 0;
            }
            if (InterfaceC2221p.m7442k(i, false) && this.f23453f && this.f23499d.f7938i != -1) {
                C13456e c13456e2 = this.f23455h;
                if (!c13456e2.f56000z && !c13456e2.f55999y && ((c13456e2.w0 || !z) && c13456e2.f55993s.f56005a != 2 && (i & i2) != 0)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p001o.fj5.AbstractC13460i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo26841c(C13453b c13453b) {
            int i;
            String str;
            int i2;
            if ((this.f23455h.q0 || ((i2 = this.f23499d.f7919B) != -1 && i2 == c13453b.f23499d.f7919B)) && (this.f23445H || ((str = this.f23499d.f7943n) != null && TextUtils.equals(str, c13453b.f23499d.f7943n)))) {
                C13456e c13456e = this.f23455h;
                if ((c13456e.p0 || ((i = this.f23499d.f7920C) != -1 && i == c13453b.f23499d.f7920C)) && (c13456e.r0 || (this.j0 == c13453b.j0 && this.k0 == c13453b.k0))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: o.fj5$c */
    public static final class C13454c extends AbstractC13460i implements Comparable {

        /* renamed from: e */
        public final int f23460e;

        /* renamed from: f */
        public final int f23461f;

        public C13454c(int i, qth qthVar, int i2, C13456e c13456e, int i3) {
            super(i, qthVar, i2);
            this.f23460e = InterfaceC2221p.m7442k(i3, c13456e.u0) ? 1 : 0;
            this.f23461f = this.f23499d.m6709d();
        }

        /* renamed from: d */
        public static int m26845d(List list, List list2) {
            return ((C13454c) list.get(0)).compareTo((C13454c) list2.get(0));
        }

        /* renamed from: g */
        public static nf8 m26846g(int i, qth qthVar, C13456e c13456e, int[] iArr) {
            nf8.C15566a c15566aM40508q = nf8.m40508q();
            for (int i2 = 0; i2 < qthVar.f42400a; i2++) {
                c15566aM40508q.mo32056a(new C13454c(i, qthVar, i2, c13456e, iArr[i2]));
            }
            return c15566aM40508q.m40520k();
        }

        @Override // p001o.fj5.AbstractC13460i
        /* renamed from: a */
        public int mo26840a() {
            return this.f23460e;
        }

        @Override // java.lang.Comparable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(C13454c c13454c) {
            return Integer.compare(this.f23461f, c13454c.f23461f);
        }

        @Override // p001o.fj5.AbstractC13460i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean mo26841c(C13454c c13454c) {
            return false;
        }
    }

    /* renamed from: o.fj5$d */
    public static final class C13455d implements Comparable {

        /* renamed from: a */
        public final boolean f23462a;

        /* renamed from: b */
        public final boolean f23463b;

        public C13455d(C2181a c2181a, int i) {
            this.f23462a = (c2181a.f7934e & 1) != 0;
            this.f23463b = InterfaceC2221p.m7442k(i, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C13455d c13455d) {
            return sk3.m48421j().mo48425g(this.f23463b, c13455d.f23463b).mo48425g(this.f23462a, c13455d.f23462a).mo48427i();
        }
    }

    /* renamed from: o.fj5$e */
    public static final class C13456e extends yth {
        public static final C13456e A0;
        public static final C13456e B0;
        public static final String C0;
        public static final String D0;
        public static final String E0;
        public static final String F0;
        public static final String G0;
        public static final String H0;
        public static final String I0;
        public static final String J0;
        public static final String K0;
        public static final String L0;
        public static final String M0;
        public static final String N0;
        public static final String O0;
        public static final String P0;
        public static final String Q0;
        public static final String R0;
        public static final String S0;
        public static final String T0;
        public static final String U0;
        public final boolean j0;
        public final boolean k0;
        public final boolean l0;
        public final boolean m0;
        public final boolean n0;
        public final boolean o0;
        public final boolean p0;
        public final boolean q0;
        public final boolean r0;
        public final boolean s0;
        public final boolean t0;
        public final boolean u0;
        public final boolean v0;
        public final boolean w0;
        public final boolean x0;
        public final SparseArray y0;
        public final SparseBooleanArray z0;

        /* renamed from: o.fj5$e$a */
        public static final class a extends yth.C18492c {

            /* renamed from: C */
            public boolean f23464C;

            /* renamed from: D */
            public boolean f23465D;

            /* renamed from: E */
            public boolean f23466E;

            /* renamed from: F */
            public boolean f23467F;

            /* renamed from: G */
            public boolean f23468G;

            /* renamed from: H */
            public boolean f23469H;

            /* renamed from: I */
            public boolean f23470I;

            /* renamed from: J */
            public boolean f23471J;

            /* renamed from: K */
            public boolean f23472K;

            /* renamed from: L */
            public boolean f23473L;

            /* renamed from: M */
            public boolean f23474M;

            /* renamed from: N */
            public boolean f23475N;

            /* renamed from: O */
            public boolean f23476O;

            /* renamed from: P */
            public boolean f23477P;

            /* renamed from: Q */
            public boolean f23478Q;

            /* renamed from: R */
            public final SparseArray f23479R;

            /* renamed from: S */
            public final SparseBooleanArray f23480S;

            public static SparseArray f0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            @Override // p001o.yth.C18492c
            /* renamed from: d0, reason: merged with bridge method [inline-methods] */
            public C13456e mo26875C() {
                return new C13456e(this);
            }

            @Override // p001o.yth.C18492c
            /* renamed from: e0, reason: merged with bridge method [inline-methods] */
            public a mo26876D(int i) {
                super.mo26876D(i);
                return this;
            }

            public final void g0() {
                this.f23464C = true;
                this.f23465D = false;
                this.f23466E = true;
                this.f23467F = false;
                this.f23468G = true;
                this.f23469H = false;
                this.f23470I = false;
                this.f23471J = false;
                this.f23472K = false;
                this.f23473L = true;
                this.f23474M = true;
                this.f23475N = true;
                this.f23476O = false;
                this.f23477P = true;
                this.f23478Q = false;
            }

            public a h0(yth ythVar) {
                super.m58289F(ythVar);
                return this;
            }

            @Override // p001o.yth.C18492c
            /* renamed from: i0, reason: merged with bridge method [inline-methods] */
            public a mo26877G(int i) {
                super.mo26877G(i);
                return this;
            }

            @Override // p001o.yth.C18492c
            /* renamed from: j0, reason: merged with bridge method [inline-methods] */
            public a mo26878H(xth xthVar) {
                super.mo26878H(xthVar);
                return this;
            }

            @Override // p001o.yth.C18492c
            /* renamed from: k0, reason: merged with bridge method [inline-methods] */
            public a mo26879I(Context context) {
                super.mo26879I(context);
                return this;
            }

            @Override // p001o.yth.C18492c
            /* renamed from: l0, reason: merged with bridge method [inline-methods] */
            public a mo26880J(int i, boolean z) {
                super.mo26880J(i, z);
                return this;
            }

            @Override // p001o.yth.C18492c
            /* renamed from: m0, reason: merged with bridge method [inline-methods] */
            public a mo26881K(int i, int i2, boolean z) {
                super.mo26881K(i, i2, z);
                return this;
            }

            @Override // p001o.yth.C18492c
            /* renamed from: n0, reason: merged with bridge method [inline-methods] */
            public a mo26882L(Context context, boolean z) {
                super.mo26882L(context, z);
                return this;
            }

            public a() {
                this.f23479R = new SparseArray();
                this.f23480S = new SparseBooleanArray();
                g0();
            }

            public a(Context context) {
                super(context);
                this.f23479R = new SparseArray();
                this.f23480S = new SparseBooleanArray();
                g0();
            }

            public a(C13456e c13456e) {
                super(c13456e);
                this.f23464C = c13456e.j0;
                this.f23465D = c13456e.k0;
                this.f23466E = c13456e.l0;
                this.f23467F = c13456e.m0;
                this.f23468G = c13456e.n0;
                this.f23469H = c13456e.o0;
                this.f23470I = c13456e.p0;
                this.f23471J = c13456e.q0;
                this.f23472K = c13456e.r0;
                this.f23473L = c13456e.s0;
                this.f23474M = c13456e.t0;
                this.f23475N = c13456e.u0;
                this.f23476O = c13456e.v0;
                this.f23477P = c13456e.w0;
                this.f23478Q = c13456e.x0;
                this.f23479R = f0(c13456e.y0);
                this.f23480S = c13456e.z0.clone();
            }
        }

        static {
            C13456e c13456eMo26875C = new a().mo26875C();
            A0 = c13456eMo26875C;
            B0 = c13456eMo26875C;
            C0 = sqi.B0(1000);
            D0 = sqi.B0(1001);
            E0 = sqi.B0(1002);
            F0 = sqi.B0(1003);
            G0 = sqi.B0(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            H0 = sqi.B0(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
            I0 = sqi.B0(1006);
            J0 = sqi.B0(1007);
            K0 = sqi.B0(1008);
            L0 = sqi.B0(1009);
            M0 = sqi.B0(1010);
            N0 = sqi.B0(1011);
            O0 = sqi.B0(1012);
            P0 = sqi.B0(1013);
            Q0 = sqi.B0(1014);
            R0 = sqi.B0(1015);
            S0 = sqi.B0(1016);
            T0 = sqi.B0(1017);
            U0 = sqi.B0(1018);
        }

        /* renamed from: d */
        public static boolean m26852d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public static boolean m26853e(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !m26854f((Map) sparseArray.valueAt(i), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public static boolean m26854f(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                sth sthVar = (sth) entry.getKey();
                if (!map2.containsKey(sthVar) || !sqi.m48724c(entry.getValue(), map2.get(sthVar))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: h */
        public static C13456e m26855h(Context context) {
            return new a(context).mo26875C();
        }

        @Override // p001o.yth
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C13456e.class != obj.getClass()) {
                return false;
            }
            C13456e c13456e = (C13456e) obj;
            return super.equals(c13456e) && this.j0 == c13456e.j0 && this.k0 == c13456e.k0 && this.l0 == c13456e.l0 && this.m0 == c13456e.m0 && this.n0 == c13456e.n0 && this.o0 == c13456e.o0 && this.p0 == c13456e.p0 && this.q0 == c13456e.q0 && this.r0 == c13456e.r0 && this.s0 == c13456e.s0 && this.t0 == c13456e.t0 && this.u0 == c13456e.u0 && this.v0 == c13456e.v0 && this.w0 == c13456e.w0 && this.x0 == c13456e.x0 && m26852d(this.z0, c13456e.z0) && m26853e(this.y0, c13456e.y0);
        }

        @Override // p001o.yth
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a mo26856a() {
            return new a();
        }

        @Override // p001o.yth
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.j0 ? 1 : 0)) * 31) + (this.k0 ? 1 : 0)) * 31) + (this.l0 ? 1 : 0)) * 31) + (this.m0 ? 1 : 0)) * 31) + (this.n0 ? 1 : 0)) * 31) + (this.o0 ? 1 : 0)) * 31) + (this.p0 ? 1 : 0)) * 31) + (this.q0 ? 1 : 0)) * 31) + (this.r0 ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.u0 ? 1 : 0)) * 31) + (this.v0 ? 1 : 0)) * 31) + (this.w0 ? 1 : 0)) * 31) + (this.x0 ? 1 : 0);
        }

        /* renamed from: i */
        public boolean m26858i(int i) {
            return this.z0.get(i);
        }

        /* renamed from: j */
        public C13457f m26859j(int i, sth sthVar) {
            Map map = (Map) this.y0.get(i);
            if (map == null) {
                return null;
            }
            tq.m50332a(map.get(sthVar));
            return null;
        }

        /* renamed from: k */
        public boolean m26860k(int i, sth sthVar) {
            Map map = (Map) this.y0.get(i);
            return map != null && map.containsKey(sthVar);
        }

        public C13456e(a aVar) {
            super(aVar);
            this.j0 = aVar.f23464C;
            this.k0 = aVar.f23465D;
            this.l0 = aVar.f23466E;
            this.m0 = aVar.f23467F;
            this.n0 = aVar.f23468G;
            this.o0 = aVar.f23469H;
            this.p0 = aVar.f23470I;
            this.q0 = aVar.f23471J;
            this.r0 = aVar.f23472K;
            this.s0 = aVar.f23473L;
            this.t0 = aVar.f23474M;
            this.u0 = aVar.f23475N;
            this.v0 = aVar.f23476O;
            this.w0 = aVar.f23477P;
            this.x0 = aVar.f23478Q;
            this.y0 = aVar.f23479R;
            this.z0 = aVar.f23480S;
        }
    }

    /* renamed from: o.fj5$f */
    public static final class C13457f {
    }

    /* renamed from: o.fj5$g */
    public static class C13458g {

        /* renamed from: a */
        public final Spatializer f23481a;

        /* renamed from: b */
        public final boolean f23482b;

        /* renamed from: c */
        public Handler f23483c;

        /* renamed from: d */
        public Spatializer$OnSpatializerStateChangedListener f23484d;

        /* renamed from: o.fj5$g$a */
        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a */
            public final /* synthetic */ fj5 f23485a;

            public a(fj5 fj5Var) {
                this.f23485a = fj5Var;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.f23485a.m26836V();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.f23485a.m26836V();
            }
        }

        public C13458g(Spatializer spatializer) {
            this.f23481a = spatializer;
            this.f23482b = spatializer.getImmersiveAudioLevel() != 0;
        }

        /* renamed from: g */
        public static C13458g m26883g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new C13458g(audioManager.getSpatializer());
        }

        /* renamed from: a */
        public boolean m26884a(wx0 wx0Var, C2181a c2181a) throws IllegalArgumentException {
            int iM48708M = sqi.m48708M(("audio/eac3-joc".equals(c2181a.f7943n) && c2181a.f7919B == 16) ? 12 : c2181a.f7919B);
            if (iM48708M == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM48708M);
            int i = c2181a.f7920C;
            if (i != -1) {
                channelMask.setSampleRate(i);
            }
            return this.f23481a.canBeSpatialized(wx0Var.m55314a().f52822a, channelMask.build());
        }

        /* renamed from: b */
        public void m26885b(fj5 fj5Var, Looper looper) {
            if (this.f23484d == null && this.f23483c == null) {
                this.f23484d = new a(fj5Var);
                Handler handler = new Handler(looper);
                this.f23483c = handler;
                Spatializer spatializer = this.f23481a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new rb5(handler), this.f23484d);
            }
        }

        /* renamed from: c */
        public boolean m26886c() {
            return this.f23481a.isAvailable();
        }

        /* renamed from: d */
        public boolean m26887d() {
            return this.f23481a.isEnabled();
        }

        /* renamed from: e */
        public boolean m26888e() {
            return this.f23482b;
        }

        /* renamed from: f */
        public void m26889f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f23484d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f23483c == null) {
                return;
            }
            this.f23481a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) sqi.m48729h(this.f23483c)).removeCallbacksAndMessages(null);
            this.f23483c = null;
            this.f23484d = null;
        }
    }

    /* renamed from: o.fj5$h */
    public static final class C13459h extends AbstractC13460i implements Comparable {

        /* renamed from: H */
        public final boolean f23487H;

        /* renamed from: e */
        public final int f23488e;

        /* renamed from: f */
        public final boolean f23489f;

        /* renamed from: g */
        public final boolean f23490g;

        /* renamed from: h */
        public final boolean f23491h;

        /* renamed from: q */
        public final int f23492q;

        /* renamed from: s */
        public final int f23493s;

        /* renamed from: x */
        public final int f23494x;

        /* renamed from: y */
        public final int f23495y;

        public C13459h(int i, qth qthVar, int i2, C13456e c13456e, int i3, String str) {
            int iM26809G;
            super(i, qthVar, i2);
            int i4 = 0;
            this.f23489f = InterfaceC2221p.m7442k(i3, false);
            int i5 = this.f23499d.f7934e & (~c13456e.f55996v);
            this.f23490g = (i5 & 1) != 0;
            this.f23491h = (i5 & 2) != 0;
            nf8 nf8VarM40500F = c13456e.f55994t.isEmpty() ? nf8.m40500F("") : c13456e.f55994t;
            int i6 = 0;
            while (true) {
                if (i6 >= nf8VarM40500F.size()) {
                    i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    iM26809G = 0;
                    break;
                } else {
                    iM26809G = fj5.m26809G(this.f23499d, (String) nf8VarM40500F.get(i6), c13456e.f55997w);
                    if (iM26809G > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f23492q = i6;
            this.f23493s = iM26809G;
            int iM26812K = fj5.m26812K(this.f23499d.f7935f, c13456e.f55995u);
            this.f23494x = iM26812K;
            this.f23487H = (this.f23499d.f7935f & 1088) != 0;
            int iM26809G2 = fj5.m26809G(this.f23499d, str, fj5.m26822X(str) == null);
            this.f23495y = iM26809G2;
            boolean z = iM26809G > 0 || (c13456e.f55994t.isEmpty() && iM26812K > 0) || this.f23490g || (this.f23491h && iM26809G2 > 0);
            if (InterfaceC2221p.m7442k(i3, c13456e.u0) && z) {
                i4 = 1;
            }
            this.f23488e = i4;
        }

        /* renamed from: d */
        public static int m26890d(List list, List list2) {
            return ((C13459h) list.get(0)).compareTo((C13459h) list2.get(0));
        }

        /* renamed from: g */
        public static nf8 m26891g(int i, qth qthVar, C13456e c13456e, int[] iArr, String str) {
            nf8.C15566a c15566aM40508q = nf8.m40508q();
            for (int i2 = 0; i2 < qthVar.f42400a; i2++) {
                c15566aM40508q.mo32056a(new C13459h(i, qthVar, i2, c13456e, iArr[i2], str));
            }
            return c15566aM40508q.m40520k();
        }

        @Override // p001o.fj5.AbstractC13460i
        /* renamed from: a */
        public int mo26840a() {
            return this.f23488e;
        }

        @Override // java.lang.Comparable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(C13459h c13459h) {
            sk3 sk3VarMo48422d = sk3.m48421j().mo48425g(this.f23489f, c13459h.f23489f).mo48424f(Integer.valueOf(this.f23492q), Integer.valueOf(c13459h.f23492q), mfc.m38937c().mo29478e()).mo48422d(this.f23493s, c13459h.f23493s).mo48422d(this.f23494x, c13459h.f23494x).mo48425g(this.f23490g, c13459h.f23490g).mo48424f(Boolean.valueOf(this.f23491h), Boolean.valueOf(c13459h.f23491h), this.f23493s == 0 ? mfc.m38937c() : mfc.m38937c().mo29478e()).mo48422d(this.f23495y, c13459h.f23495y);
            if (this.f23494x == 0) {
                sk3VarMo48422d = sk3VarMo48422d.mo48426h(this.f23487H, c13459h.f23487H);
            }
            return sk3VarMo48422d.mo48427i();
        }

        @Override // p001o.fj5.AbstractC13460i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean mo26841c(C13459h c13459h) {
            return false;
        }
    }

    /* renamed from: o.fj5$i */
    public static abstract class AbstractC13460i {

        /* renamed from: a */
        public final int f23496a;

        /* renamed from: b */
        public final qth f23497b;

        /* renamed from: c */
        public final int f23498c;

        /* renamed from: d */
        public final C2181a f23499d;

        /* renamed from: o.fj5$i$a */
        public interface a {
            /* renamed from: a */
            List mo19231a(int i, qth qthVar, int[] iArr);
        }

        public AbstractC13460i(int i, qth qthVar, int i2) {
            this.f23496a = i;
            this.f23497b = qthVar;
            this.f23498c = i2;
            this.f23499d = qthVar.m45839a(i2);
        }

        /* renamed from: a */
        public abstract int mo26840a();

        /* renamed from: c */
        public abstract boolean mo26841c(AbstractC13460i abstractC13460i);
    }

    /* renamed from: o.fj5$j */
    public static final class C13461j extends AbstractC13460i {

        /* renamed from: H */
        public final int f23500H;

        /* renamed from: L */
        public final boolean f23501L;

        /* renamed from: M */
        public final boolean f23502M;

        /* renamed from: Q */
        public final int f23503Q;

        /* renamed from: X */
        public final boolean f23504X;

        /* renamed from: Y */
        public final boolean f23505Y;

        /* renamed from: Z */
        public final int f23506Z;

        /* renamed from: e */
        public final boolean f23507e;

        /* renamed from: f */
        public final C13456e f23508f;

        /* renamed from: g */
        public final boolean f23509g;

        /* renamed from: h */
        public final boolean f23510h;

        /* renamed from: q */
        public final boolean f23511q;

        /* renamed from: s */
        public final int f23512s;

        /* renamed from: x */
        public final int f23513x;

        /* renamed from: y */
        public final int f23514y;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C13461j(int i, qth qthVar, int i2, C13456e c13456e, int i3, int i4, boolean z) {
            boolean z2;
            boolean z3;
            C2181a c2181a;
            int i5;
            int i6;
            int i7;
            C2181a c2181a2;
            int i8;
            int i9;
            int i10;
            super(i, qthVar, i2);
            this.f23508f = c13456e;
            int i11 = c13456e.l0 ? 24 : 16;
            this.f23502M = c13456e.k0 && (i4 & i11) != 0;
            if (!z || (((i8 = (c2181a2 = this.f23499d).f7949t) != -1 && i8 > c13456e.f55975a) || ((i9 = c2181a2.f7950u) != -1 && i9 > c13456e.f55976b))) {
                z2 = false;
            } else {
                float f = c2181a2.f7951v;
                if ((f == -1.0f || f <= c13456e.f55977c) && ((i10 = c2181a2.f7938i) == -1 || i10 <= c13456e.f55978d)) {
                    z2 = true;
                }
            }
            this.f23507e = z2;
            if (!z || (((i5 = (c2181a = this.f23499d).f7949t) != -1 && i5 < c13456e.f55979e) || ((i6 = c2181a.f7950u) != -1 && i6 < c13456e.f55980f))) {
                z3 = false;
            } else {
                float f2 = c2181a.f7951v;
                if ((f2 == -1.0f || f2 >= c13456e.f55981g) && ((i7 = c2181a.f7938i) == -1 || i7 >= c13456e.f55982h)) {
                    z3 = true;
                }
            }
            this.f23509g = z3;
            this.f23510h = InterfaceC2221p.m7442k(i3, false);
            C2181a c2181a3 = this.f23499d;
            float f3 = c2181a3.f7951v;
            this.f23511q = f3 != -1.0f && f3 >= 10.0f;
            this.f23512s = c2181a3.f7938i;
            this.f23513x = c2181a3.m6709d();
            this.f23500H = fj5.m26812K(this.f23499d.f7935f, c13456e.f55987m);
            int i12 = this.f23499d.f7935f;
            this.f23501L = i12 == 0 || (i12 & 1) != 0;
            int i13 = 0;
            while (true) {
                if (i13 >= c13456e.f55986l.size()) {
                    i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    break;
                }
                String str = this.f23499d.f7943n;
                if (str != null && str.equals(c13456e.f55986l.get(i13))) {
                    break;
                } else {
                    i13++;
                }
            }
            this.f23514y = i13;
            this.f23504X = InterfaceC2221p.m7441j(i3) == 128;
            this.f23505Y = InterfaceC2221p.m7439D(i3) == 64;
            this.f23506Z = fj5.m26813L(this.f23499d.f7943n);
            this.f23503Q = m26900n(i3, i11);
        }

        /* renamed from: g */
        public static int m26896g(C13461j c13461j, C13461j c13461j2) {
            sk3 sk3VarMo48425g = sk3.m48421j().mo48425g(c13461j.f23510h, c13461j2.f23510h).mo48422d(c13461j.f23500H, c13461j2.f23500H).mo48425g(c13461j.f23501L, c13461j2.f23501L).mo48425g(c13461j.f23511q, c13461j2.f23511q).mo48425g(c13461j.f23507e, c13461j2.f23507e).mo48425g(c13461j.f23509g, c13461j2.f23509g).mo48424f(Integer.valueOf(c13461j.f23514y), Integer.valueOf(c13461j2.f23514y), mfc.m38937c().mo29478e()).mo48425g(c13461j.f23504X, c13461j2.f23504X).mo48425g(c13461j.f23505Y, c13461j2.f23505Y);
            if (c13461j.f23504X && c13461j.f23505Y) {
                sk3VarMo48425g = sk3VarMo48425g.mo48422d(c13461j.f23506Z, c13461j2.f23506Z);
            }
            return sk3VarMo48425g.mo48427i();
        }

        /* renamed from: h */
        public static int m26897h(C13461j c13461j, C13461j c13461j2) {
            mfc mfcVarMo29478e = (c13461j.f23507e && c13461j.f23510h) ? fj5.f23437k : fj5.f23437k.mo29478e();
            sk3 sk3VarM48421j = sk3.m48421j();
            if (c13461j.f23508f.f55999y) {
                sk3VarM48421j = sk3VarM48421j.mo48424f(Integer.valueOf(c13461j.f23512s), Integer.valueOf(c13461j2.f23512s), fj5.f23437k.mo29478e());
            }
            return sk3VarM48421j.mo48424f(Integer.valueOf(c13461j.f23513x), Integer.valueOf(c13461j2.f23513x), mfcVarMo29478e).mo48424f(Integer.valueOf(c13461j.f23512s), Integer.valueOf(c13461j2.f23512s), mfcVarMo29478e).mo48427i();
        }

        /* renamed from: j */
        public static int m26898j(List list, List list2) {
            return sk3.m48421j().mo48424f((C13461j) Collections.max(list, new Comparator() { // from class: o.nj5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return fj5.C13461j.m26896g((fj5.C13461j) obj, (fj5.C13461j) obj2);
                }
            }), (C13461j) Collections.max(list2, new Comparator() { // from class: o.nj5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return fj5.C13461j.m26896g((fj5.C13461j) obj, (fj5.C13461j) obj2);
                }
            }), new Comparator() { // from class: o.nj5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return fj5.C13461j.m26896g((fj5.C13461j) obj, (fj5.C13461j) obj2);
                }
            }).mo48422d(list.size(), list2.size()).mo48424f((C13461j) Collections.max(list, new Comparator() { // from class: o.oj5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return fj5.C13461j.m26897h((fj5.C13461j) obj, (fj5.C13461j) obj2);
                }
            }), (C13461j) Collections.max(list2, new Comparator() { // from class: o.oj5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return fj5.C13461j.m26897h((fj5.C13461j) obj, (fj5.C13461j) obj2);
                }
            }), new Comparator() { // from class: o.oj5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return fj5.C13461j.m26897h((fj5.C13461j) obj, (fj5.C13461j) obj2);
                }
            }).mo48427i();
        }

        /* renamed from: m */
        public static nf8 m26899m(int i, qth qthVar, C13456e c13456e, int[] iArr, int i2) {
            int iM26810H = fj5.m26810H(qthVar, c13456e.f55983i, c13456e.f55984j, c13456e.f55985k);
            nf8.C15566a c15566aM40508q = nf8.m40508q();
            for (int i3 = 0; i3 < qthVar.f42400a; i3++) {
                int iM6709d = qthVar.m45839a(i3).m6709d();
                c15566aM40508q.mo32056a(new C13461j(i, qthVar, i3, c13456e, iArr[i3], i2, iM26810H == Integer.MAX_VALUE || (iM6709d != -1 && iM6709d <= iM26810H)));
            }
            return c15566aM40508q.m40520k();
        }

        @Override // p001o.fj5.AbstractC13460i
        /* renamed from: a */
        public int mo26840a() {
            return this.f23503Q;
        }

        /* renamed from: n */
        public final int m26900n(int i, int i2) {
            if ((this.f23499d.f7935f & Opcodes.ACC_ENUM) != 0 || !InterfaceC2221p.m7442k(i, this.f23508f.u0)) {
                return 0;
            }
            if (!this.f23507e && !this.f23508f.j0) {
                return 0;
            }
            if (InterfaceC2221p.m7442k(i, false) && this.f23509g && this.f23507e && this.f23499d.f7938i != -1) {
                C13456e c13456e = this.f23508f;
                if (!c13456e.f56000z && !c13456e.f55999y && (i & i2) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p001o.fj5.AbstractC13460i
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mo26841c(C13461j c13461j) {
            return (this.f23502M || sqi.m48724c(this.f23499d.f7943n, c13461j.f23499d.f7943n)) && (this.f23508f.m0 || (this.f23504X == c13461j.f23504X && this.f23505Y == c13461j.f23505Y));
        }
    }

    public fj5(Context context) {
        this(context, new bw.C12513b());
    }

    /* renamed from: D */
    public static void m26806D(dsa.C13025a c13025a, C13456e c13456e, ko6.C14892a[] c14892aArr) {
        int iM23758d = c13025a.m23758d();
        for (int i = 0; i < iM23758d; i++) {
            sth sthVarM23760f = c13025a.m23760f(i);
            if (c13456e.m26860k(i, sthVarM23760f)) {
                c13456e.m26859j(i, sthVarM23760f);
                c14892aArr[i] = null;
            }
        }
    }

    /* renamed from: E */
    public static void m26807E(dsa.C13025a c13025a, yth ythVar, ko6.C14892a[] c14892aArr) {
        int iM23758d = c13025a.m23758d();
        HashMap map = new HashMap();
        for (int i = 0; i < iM23758d; i++) {
            m26808F(c13025a.m23760f(i), ythVar, map);
        }
        m26808F(c13025a.m23762h(), ythVar, map);
        for (int i2 = 0; i2 < iM23758d; i2++) {
            xth xthVar = (xth) map.get(Integer.valueOf(c13025a.m23759e(i2)));
            if (xthVar != null) {
                c14892aArr[i2] = (xthVar.f54292b.isEmpty() || c13025a.m23760f(i2).m48916d(xthVar.f54291a) == -1) ? null : new ko6.C14892a(xthVar.f54291a, br8.m19646m(xthVar.f54292b));
            }
        }
    }

    /* renamed from: F */
    public static void m26808F(sth sthVar, yth ythVar, Map map) {
        xth xthVar;
        for (int i = 0; i < sthVar.f45923a; i++) {
            xth xthVar2 = (xth) ythVar.f55973A.get(sthVar.m48914b(i));
            if (xthVar2 != null && ((xthVar = (xth) map.get(Integer.valueOf(xthVar2.m56834a()))) == null || (xthVar.f54292b.isEmpty() && !xthVar2.f54292b.isEmpty()))) {
                map.put(Integer.valueOf(xthVar2.m56834a()), xthVar2);
            }
        }
    }

    /* renamed from: G */
    public static int m26809G(C2181a c2181a, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c2181a.f7933d)) {
            return 4;
        }
        String strM26822X = m26822X(str);
        String strM26822X2 = m26822X(c2181a.f7933d);
        if (strM26822X2 == null || strM26822X == null) {
            return (z && strM26822X2 == null) ? 1 : 0;
        }
        if (strM26822X2.startsWith(strM26822X) || strM26822X.startsWith(strM26822X2)) {
            return 3;
        }
        return sqi.j1(strM26822X2, "-")[0].equals(sqi.j1(strM26822X, "-")[0]) ? 2 : 0;
    }

    /* renamed from: H */
    public static int m26810H(qth qthVar, int i, int i2, boolean z) {
        int i3;
        int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i5 = 0; i5 < qthVar.f42400a; i5++) {
                C2181a c2181aM45839a = qthVar.m45839a(i5);
                int i6 = c2181aM45839a.f7949t;
                if (i6 > 0 && (i3 = c2181aM45839a.f7950u) > 0) {
                    Point pointM26811I = m26811I(z, i, i2, i6, i3);
                    int i7 = c2181aM45839a.f7949t;
                    int i8 = c2181aM45839a.f7950u;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (pointM26811I.x * 0.98f)) && i8 >= ((int) (pointM26811I.y * 0.98f)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Point m26811I(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            if ((i3 > i4) == (i > i2)) {
                i2 = i;
                i = i2;
            }
        }
        int i5 = i3 * i;
        int i6 = i4 * i2;
        return i5 >= i6 ? new Point(i2, sqi.m48731j(i6, i3)) : new Point(sqi.m48731j(i5, i4), i);
    }

    /* renamed from: K */
    public static int m26812K(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* renamed from: L */
    public static int m26813L(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: N */
    public static boolean m26814N(C2181a c2181a) {
        String str = c2181a.f7943n;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ List m26815O(C13456e c13456e, boolean z, int[] iArr, int i, qth qthVar, int[] iArr2) {
        return C13453b.m26839g(i, qthVar, c13456e, iArr2, z, new hgd() { // from class: o.ej5
            @Override // p001o.hgd
            public final boolean apply(Object obj) {
                return this.f21753a.m26835M((C2181a) obj);
            }
        }, iArr[i]);
    }

    /* renamed from: P */
    public static /* synthetic */ List m26816P(C13456e c13456e, int i, qth qthVar, int[] iArr) {
        return C13454c.m26846g(i, qthVar, c13456e, iArr);
    }

    /* renamed from: Q */
    public static /* synthetic */ List m26817Q(C13456e c13456e, String str, int i, qth qthVar, int[] iArr) {
        return C13459h.m26891g(i, qthVar, c13456e, iArr, str);
    }

    /* renamed from: R */
    public static /* synthetic */ List m26818R(C13456e c13456e, int[] iArr, int i, qth qthVar, int[] iArr2) {
        return C13461j.m26899m(i, qthVar, c13456e, iArr2, iArr[i]);
    }

    /* renamed from: S */
    public static /* synthetic */ int m26819S(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* renamed from: T */
    public static void m26820T(C13456e c13456e, dsa.C13025a c13025a, int[][][] iArr, nke[] nkeVarArr, ko6[] ko6VarArr) {
        boolean z;
        int i = -1;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= c13025a.m23758d()) {
                z = false;
                break;
            }
            int iM23759e = c13025a.m23759e(i2);
            ko6 ko6Var = ko6VarArr[i2];
            if (iM23759e != 1 && ko6Var != null) {
                z = true;
                break;
            }
            if (iM23759e == 1 && ko6Var != null && ko6Var.length() == 1) {
                if (m26823Y(c13456e, iArr[i2][c13025a.m23760f(i2).m48916d(ko6Var.mo22953m())][ko6Var.mo22950f(0)], ko6Var.mo22955q())) {
                    i3++;
                    i = i2;
                }
            }
            i2++;
        }
        if (z || i3 != 1) {
            return;
        }
        int i4 = c13456e.f55993s.f56006b ? 1 : 2;
        nke nkeVar = nkeVarArr[i];
        if (nkeVar != null && nkeVar.f36979b) {
            z2 = true;
        }
        nkeVarArr[i] = new nke(i4, z2);
    }

    /* renamed from: U */
    public static void m26821U(dsa.C13025a c13025a, int[][][] iArr, nke[] nkeVarArr, ko6[] ko6VarArr) {
        boolean z;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < c13025a.m23758d(); i3++) {
            int iM23759e = c13025a.m23759e(i3);
            ko6 ko6Var = ko6VarArr[i3];
            if ((iM23759e == 1 || iM23759e == 2) && ko6Var != null && m26824Z(iArr[i3], c13025a.m23760f(i3), ko6Var)) {
                if (iM23759e == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
        }
        z = true;
        if (z && ((i2 == -1 || i == -1) ? false : true)) {
            nke nkeVar = new nke(0, true);
            nkeVarArr[i2] = nkeVar;
            nkeVarArr[i] = nkeVar;
        }
    }

    /* renamed from: X */
    public static String m26822X(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: Y */
    public static boolean m26823Y(C13456e c13456e, int i, C2181a c2181a) {
        if (InterfaceC2221p.m7448w(i) == 0) {
            return false;
        }
        if (c13456e.f55993s.f56007c && (InterfaceC2221p.m7448w(i) & 2048) == 0) {
            return false;
        }
        if (c13456e.f55993s.f56006b) {
            return !(c2181a.f7922E != 0 || c2181a.f7923F != 0) || ((InterfaceC2221p.m7448w(i) & 1024) != 0);
        }
        return true;
    }

    /* renamed from: Z */
    public static boolean m26824Z(int[][] iArr, sth sthVar, ko6 ko6Var) {
        if (ko6Var == null) {
            return false;
        }
        int iM48916d = sthVar.m48916d(ko6Var.mo22953m());
        for (int i = 0; i < ko6Var.length(); i++) {
            if (InterfaceC2221p.m7445p(iArr[iM48916d][ko6Var.mo22950f(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.auh
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public C13456e mo17851c() {
        C13456e c13456e;
        synchronized (this.f23438d) {
            c13456e = this.f23442h;
        }
        return c13456e;
    }

    /* renamed from: M */
    public final boolean m26835M(C2181a c2181a) {
        boolean z;
        C13458g c13458g;
        C13458g c13458g2;
        synchronized (this.f23438d) {
            z = !this.f23442h.t0 || this.f23441g || c2181a.f7919B <= 2 || (m26814N(c2181a) && (sqi.f45790a < 32 || (c13458g2 = this.f23443i) == null || !c13458g2.m26888e())) || (sqi.f45790a >= 32 && (c13458g = this.f23443i) != null && c13458g.m26888e() && this.f23443i.m26886c() && this.f23443i.m26887d() && this.f23443i.m26884a(this.f23444j, c2181a));
        }
        return z;
    }

    /* renamed from: V */
    public final void m26836V() {
        boolean z;
        C13458g c13458g;
        synchronized (this.f23438d) {
            z = this.f23442h.t0 && !this.f23441g && sqi.f45790a >= 32 && (c13458g = this.f23443i) != null && c13458g.m26888e();
        }
        if (z) {
            m17854f();
        }
    }

    /* renamed from: W */
    public final void m26837W(InterfaceC2218o interfaceC2218o) {
        boolean z;
        synchronized (this.f23438d) {
            z = this.f23442h.x0;
        }
        if (z) {
            m17855g(interfaceC2218o);
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC2221p.a
    /* renamed from: a */
    public void mo7450a(InterfaceC2218o interfaceC2218o) {
        m26837W(interfaceC2218o);
    }

    public ko6.C14892a[] a0(dsa.C13025a c13025a, int[][][] iArr, int[] iArr2, C13456e c13456e) {
        int iM23758d = c13025a.m23758d();
        ko6.C14892a[] c14892aArr = new ko6.C14892a[iM23758d];
        Pair pairG0 = g0(c13025a, iArr, iArr2, c13456e);
        String str = null;
        Pair pairC0 = (c13456e.f55998x || pairG0 == null) ? c0(c13025a, iArr, c13456e) : null;
        if (pairC0 != null) {
            c14892aArr[((Integer) pairC0.second).intValue()] = (ko6.C14892a) pairC0.first;
        } else if (pairG0 != null) {
            c14892aArr[((Integer) pairG0.second).intValue()] = (ko6.C14892a) pairG0.first;
        }
        Pair pairB0 = b0(c13025a, iArr, iArr2, c13456e);
        if (pairB0 != null) {
            c14892aArr[((Integer) pairB0.second).intValue()] = (ko6.C14892a) pairB0.first;
        }
        if (pairB0 != null) {
            Object obj = pairB0.first;
            str = ((ko6.C14892a) obj).f32501a.m45839a(((ko6.C14892a) obj).f32502b[0]).f7933d;
        }
        Pair pairE0 = e0(c13025a, iArr, c13456e, str);
        if (pairE0 != null) {
            c14892aArr[((Integer) pairE0.second).intValue()] = (ko6.C14892a) pairE0.first;
        }
        for (int i = 0; i < iM23758d; i++) {
            int iM23759e = c13025a.m23759e(i);
            if (iM23759e != 2 && iM23759e != 1 && iM23759e != 3 && iM23759e != 4) {
                c14892aArr[i] = d0(iM23759e, c13025a.m23760f(i), iArr[i], c13456e);
            }
        }
        return c14892aArr;
    }

    public Pair b0(dsa.C13025a c13025a, int[][][] iArr, final int[] iArr2, final C13456e c13456e) {
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i < c13025a.m23758d()) {
                if (2 == c13025a.m23759e(i) && c13025a.m23760f(i).f45923a > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return f0(1, c13025a, iArr, new AbstractC13460i.a() { // from class: o.vi5
            @Override // p001o.fj5.AbstractC13460i.a
            /* renamed from: a */
            public final List mo19231a(int i2, qth qthVar, int[] iArr3) {
                return this.f50403a.m26815O(c13456e, z, iArr2, i2, qthVar, iArr3);
            }
        }, new Comparator() { // from class: o.wi5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return fj5.C13453b.m26838d((List) obj, (List) obj2);
            }
        });
    }

    public Pair c0(dsa.C13025a c13025a, int[][][] iArr, final C13456e c13456e) {
        if (c13456e.f55993s.f56005a == 2) {
            return null;
        }
        return f0(4, c13025a, iArr, new AbstractC13460i.a() { // from class: o.bj5
            @Override // p001o.fj5.AbstractC13460i.a
            /* renamed from: a */
            public final List mo19231a(int i, qth qthVar, int[] iArr2) {
                return fj5.m26816P(c13456e, i, qthVar, iArr2);
            }
        }, new Comparator() { // from class: o.cj5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return fj5.C13454c.m26845d((List) obj, (List) obj2);
            }
        });
    }

    @Override // p001o.auh
    /* renamed from: d */
    public InterfaceC2221p.a mo17852d() {
        return this;
    }

    public ko6.C14892a d0(int i, sth sthVar, int[][] iArr, C13456e c13456e) {
        if (c13456e.f55993s.f56005a == 2) {
            return null;
        }
        int i2 = 0;
        qth qthVar = null;
        C13455d c13455d = null;
        for (int i3 = 0; i3 < sthVar.f45923a; i3++) {
            qth qthVarM48914b = sthVar.m48914b(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < qthVarM48914b.f42400a; i4++) {
                if (InterfaceC2221p.m7442k(iArr2[i4], c13456e.u0)) {
                    C13455d c13455d2 = new C13455d(qthVarM48914b.m45839a(i4), iArr2[i4]);
                    if (c13455d == null || c13455d2.compareTo(c13455d) > 0) {
                        qthVar = qthVarM48914b;
                        i2 = i4;
                        c13455d = c13455d2;
                    }
                }
            }
        }
        if (qthVar == null) {
            return null;
        }
        return new ko6.C14892a(qthVar, i2);
    }

    public Pair e0(dsa.C13025a c13025a, int[][][] iArr, final C13456e c13456e, final String str) {
        if (c13456e.f55993s.f56005a == 2) {
            return null;
        }
        return f0(3, c13025a, iArr, new AbstractC13460i.a() { // from class: o.zi5
            @Override // p001o.fj5.AbstractC13460i.a
            /* renamed from: a */
            public final List mo19231a(int i, qth qthVar, int[] iArr2) {
                return fj5.m26817Q(c13456e, str, i, qthVar, iArr2);
            }
        }, new Comparator() { // from class: o.aj5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return fj5.C13459h.m26890d((List) obj, (List) obj2);
            }
        });
    }

    public final Pair f0(int i, dsa.C13025a c13025a, int[][][] iArr, AbstractC13460i.a aVar, Comparator comparator) {
        int i2;
        RandomAccess randomAccessM40500F;
        dsa.C13025a c13025a2 = c13025a;
        ArrayList arrayList = new ArrayList();
        int iM23758d = c13025a.m23758d();
        int i3 = 0;
        while (i3 < iM23758d) {
            if (i == c13025a2.m23759e(i3)) {
                sth sthVarM23760f = c13025a2.m23760f(i3);
                for (int i4 = 0; i4 < sthVarM23760f.f45923a; i4++) {
                    qth qthVarM48914b = sthVarM23760f.m48914b(i4);
                    List listMo19231a = aVar.mo19231a(i3, qthVarM48914b, iArr[i3][i4]);
                    boolean[] zArr = new boolean[qthVarM48914b.f42400a];
                    int i5 = 0;
                    while (i5 < qthVarM48914b.f42400a) {
                        AbstractC13460i abstractC13460i = (AbstractC13460i) listMo19231a.get(i5);
                        int iMo26840a = abstractC13460i.mo26840a();
                        if (zArr[i5] || iMo26840a == 0) {
                            i2 = iM23758d;
                        } else {
                            if (iMo26840a == 1) {
                                randomAccessM40500F = nf8.m40500F(abstractC13460i);
                                i2 = iM23758d;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC13460i);
                                int i6 = i5 + 1;
                                while (i6 < qthVarM48914b.f42400a) {
                                    AbstractC13460i abstractC13460i2 = (AbstractC13460i) listMo19231a.get(i6);
                                    int i7 = iM23758d;
                                    if (abstractC13460i2.mo26840a() == 2 && abstractC13460i.mo26841c(abstractC13460i2)) {
                                        arrayList2.add(abstractC13460i2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    iM23758d = i7;
                                }
                                i2 = iM23758d;
                                randomAccessM40500F = arrayList2;
                            }
                            arrayList.add(randomAccessM40500F);
                        }
                        i5++;
                        iM23758d = i2;
                    }
                }
            }
            i3++;
            c13025a2 = c13025a;
            iM23758d = iM23758d;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((AbstractC13460i) list.get(i8)).f23498c;
        }
        AbstractC13460i abstractC13460i3 = (AbstractC13460i) list.get(0);
        return Pair.create(new ko6.C14892a(abstractC13460i3.f23497b, iArr2), Integer.valueOf(abstractC13460i3.f23496a));
    }

    public Pair g0(dsa.C13025a c13025a, int[][][] iArr, final int[] iArr2, final C13456e c13456e) {
        if (c13456e.f55993s.f56005a == 2) {
            return null;
        }
        return f0(2, c13025a, iArr, new AbstractC13460i.a() { // from class: o.xi5
            @Override // p001o.fj5.AbstractC13460i.a
            /* renamed from: a */
            public final List mo19231a(int i, qth qthVar, int[] iArr3) {
                return fj5.m26818R(c13456e, iArr2, i, qthVar, iArr3);
            }
        }, new Comparator() { // from class: o.yi5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return fj5.C13461j.m26898j((List) obj, (List) obj2);
            }
        });
    }

    @Override // p001o.auh
    /* renamed from: h */
    public boolean mo17856h() {
        return true;
    }

    public final void h0(C13456e c13456e) {
        boolean z;
        op0.m42515e(c13456e);
        synchronized (this.f23438d) {
            z = !this.f23442h.equals(c13456e);
            this.f23442h = c13456e;
        }
        if (z) {
            if (c13456e.t0 && this.f23439e == null) {
                ria.m46824h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            m17854f();
        }
    }

    @Override // p001o.auh
    /* renamed from: j */
    public void mo17858j() {
        C13458g c13458g;
        synchronized (this.f23438d) {
            if (sqi.f45790a >= 32 && (c13458g = this.f23443i) != null) {
                c13458g.m26889f();
            }
        }
        super.mo17858j();
    }

    @Override // p001o.auh
    /* renamed from: l */
    public void mo17860l(wx0 wx0Var) {
        boolean z;
        synchronized (this.f23438d) {
            z = !this.f23444j.equals(wx0Var);
            this.f23444j = wx0Var;
        }
        if (z) {
            m26836V();
        }
    }

    @Override // p001o.auh
    /* renamed from: m */
    public void mo17861m(yth ythVar) {
        if (ythVar instanceof C13456e) {
            h0((C13456e) ythVar);
        }
        h0(new C13456e.a().h0(ythVar).mo26875C());
    }

    @Override // p001o.dsa
    /* renamed from: q */
    public final Pair mo23754q(dsa.C13025a c13025a, int[][][] iArr, int[] iArr2, x8b.C18076b c18076b, lmh lmhVar) {
        C13456e c13456e;
        C13458g c13458g;
        synchronized (this.f23438d) {
            c13456e = this.f23442h;
            if (c13456e.t0 && sqi.f45790a >= 32 && (c13458g = this.f23443i) != null) {
                c13458g.m26885b(this, (Looper) op0.m42519i(Looper.myLooper()));
            }
        }
        int iM23758d = c13025a.m23758d();
        ko6.C14892a[] c14892aArrA0 = a0(c13025a, iArr, iArr2, c13456e);
        m26807E(c13025a, c13456e, c14892aArrA0);
        m26806D(c13025a, c13456e, c14892aArrA0);
        for (int i = 0; i < iM23758d; i++) {
            int iM23759e = c13025a.m23759e(i);
            if (c13456e.m26858i(i) || c13456e.f55974B.contains(Integer.valueOf(iM23759e))) {
                c14892aArrA0[i] = null;
            }
        }
        ko6[] ko6VarArrMo19895a = this.f23440f.mo19895a(c14892aArrA0, m17850b(), c18076b, lmhVar);
        nke[] nkeVarArr = new nke[iM23758d];
        for (int i2 = 0; i2 < iM23758d; i2++) {
            boolean z = true;
            if ((c13456e.m26858i(i2) || c13456e.f55974B.contains(Integer.valueOf(c13025a.m23759e(i2)))) || (c13025a.m23759e(i2) != -2 && ko6VarArrMo19895a[i2] == null)) {
                z = false;
            }
            nkeVarArr[i2] = z ? nke.f36977c : null;
        }
        if (c13456e.v0) {
            m26821U(c13025a, iArr, nkeVarArr, ko6VarArrMo19895a);
        }
        if (c13456e.f55993s.f56005a != 0) {
            m26820T(c13456e, c13025a, iArr, nkeVarArr, ko6VarArrMo19895a);
        }
        return Pair.create(nkeVarArr, ko6VarArrMo19895a);
    }

    public fj5(Context context, ko6.InterfaceC14893b interfaceC14893b) {
        this(context, C13456e.m26855h(context), interfaceC14893b);
    }

    public fj5(Context context, yth ythVar, ko6.InterfaceC14893b interfaceC14893b) {
        this(ythVar, interfaceC14893b, context);
    }

    public fj5(yth ythVar, ko6.InterfaceC14893b interfaceC14893b, Context context) {
        this.f23438d = new Object();
        this.f23439e = context != null ? context.getApplicationContext() : null;
        this.f23440f = interfaceC14893b;
        if (ythVar instanceof C13456e) {
            this.f23442h = (C13456e) ythVar;
        } else {
            this.f23442h = (context == null ? C13456e.A0 : C13456e.m26855h(context)).mo26856a().h0(ythVar).mo26875C();
        }
        this.f23444j = wx0.f52810g;
        boolean z = context != null && sqi.J0(context);
        this.f23441g = z;
        if (!z && context != null && sqi.f45790a >= 32) {
            this.f23443i = C13458g.m26883g(context);
        }
        if (this.f23442h.t0 && context == null) {
            ria.m46824h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
