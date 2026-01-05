package p001o;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p001o.js0;
import p001o.qbg;
import p001o.zaf;

/* loaded from: classes2.dex */
public class tj7 implements tq6 {

    /* renamed from: K */
    public static final yq6 f47232K = new yq6() { // from class: o.rj7
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return tj7.m49993p();
        }
    };

    /* renamed from: L */
    public static final byte[] f47233L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: M */
    public static final C2181a f47234M = new C2181a.b().o0("application/x-emsg").m6748K();

    /* renamed from: A */
    public long f47235A;

    /* renamed from: B */
    public C17132b f47236B;

    /* renamed from: C */
    public int f47237C;

    /* renamed from: D */
    public int f47238D;

    /* renamed from: E */
    public int f47239E;

    /* renamed from: F */
    public boolean f47240F;

    /* renamed from: G */
    public vq6 f47241G;

    /* renamed from: H */
    public uth[] f47242H;

    /* renamed from: I */
    public uth[] f47243I;

    /* renamed from: J */
    public boolean f47244J;

    /* renamed from: a */
    public final qbg.InterfaceC16329a f47245a;

    /* renamed from: b */
    public final int f47246b;

    /* renamed from: c */
    public final mth f47247c;

    /* renamed from: d */
    public final List f47248d;

    /* renamed from: e */
    public final SparseArray f47249e;

    /* renamed from: f */
    public final zwc f47250f;

    /* renamed from: g */
    public final zwc f47251g;

    /* renamed from: h */
    public final zwc f47252h;

    /* renamed from: i */
    public final byte[] f47253i;

    /* renamed from: j */
    public final zwc f47254j;

    /* renamed from: k */
    public final umh f47255k;

    /* renamed from: l */
    public final kk6 f47256l;

    /* renamed from: m */
    public final zwc f47257m;

    /* renamed from: n */
    public final ArrayDeque f47258n;

    /* renamed from: o */
    public final ArrayDeque f47259o;

    /* renamed from: p */
    public final uth f47260p;

    /* renamed from: q */
    public nf8 f47261q;

    /* renamed from: r */
    public int f47262r;

    /* renamed from: s */
    public int f47263s;

    /* renamed from: t */
    public long f47264t;

    /* renamed from: u */
    public int f47265u;

    /* renamed from: v */
    public zwc f47266v;

    /* renamed from: w */
    public long f47267w;

    /* renamed from: x */
    public int f47268x;

    /* renamed from: y */
    public long f47269y;

    /* renamed from: z */
    public long f47270z;

    /* renamed from: o.tj7$a */
    public static final class C17131a {

        /* renamed from: a */
        public final long f47271a;

        /* renamed from: b */
        public final boolean f47272b;

        /* renamed from: c */
        public final int f47273c;

        public C17131a(long j, boolean z, int i) {
            this.f47271a = j;
            this.f47272b = z;
            this.f47273c = i;
        }
    }

    /* renamed from: o.tj7$b */
    public static final class C17132b {

        /* renamed from: a */
        public final uth f47274a;

        /* renamed from: d */
        public vth f47277d;

        /* renamed from: e */
        public tg5 f47278e;

        /* renamed from: f */
        public int f47279f;

        /* renamed from: g */
        public int f47280g;

        /* renamed from: h */
        public int f47281h;

        /* renamed from: i */
        public int f47282i;

        /* renamed from: l */
        public boolean f47285l;

        /* renamed from: b */
        public final oth f47275b = new oth();

        /* renamed from: c */
        public final zwc f47276c = new zwc();

        /* renamed from: j */
        public final zwc f47283j = new zwc(1);

        /* renamed from: k */
        public final zwc f47284k = new zwc();

        public C17132b(uth uthVar, vth vthVar, tg5 tg5Var) {
            this.f47274a = uthVar;
            this.f47277d = vthVar;
            this.f47278e = tg5Var;
            m50022j(vthVar, tg5Var);
        }

        /* renamed from: c */
        public int m50015c() {
            int i = !this.f47285l ? this.f47277d.f50886g[this.f47279f] : this.f47275b.f38913k[this.f47279f] ? 1 : 0;
            return m50019g() != null ? i | 1073741824 : i;
        }

        /* renamed from: d */
        public long m50016d() {
            return !this.f47285l ? this.f47277d.f50882c[this.f47279f] : this.f47275b.f38909g[this.f47281h];
        }

        /* renamed from: e */
        public long m50017e() {
            return !this.f47285l ? this.f47277d.f50885f[this.f47279f] : this.f47275b.m42684c(this.f47279f);
        }

        /* renamed from: f */
        public int m50018f() {
            return !this.f47285l ? this.f47277d.f50883d[this.f47279f] : this.f47275b.f38911i[this.f47279f];
        }

        /* renamed from: g */
        public nth m50019g() {
            if (!this.f47285l) {
                return null;
            }
            int i = ((tg5) sqi.m48729h(this.f47275b.f38903a)).f47009a;
            nth nthVarM39679a = this.f47275b.f38916n;
            if (nthVarM39679a == null) {
                nthVarM39679a = this.f47277d.f50880a.m39679a(i);
            }
            if (nthVarM39679a == null || !nthVarM39679a.f37299a) {
                return null;
            }
            return nthVarM39679a;
        }

        /* renamed from: h */
        public boolean m50020h() {
            this.f47279f++;
            if (!this.f47285l) {
                return false;
            }
            int i = this.f47280g + 1;
            this.f47280g = i;
            int[] iArr = this.f47275b.f38910h;
            int i2 = this.f47281h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f47281h = i2 + 1;
            this.f47280g = 0;
            return false;
        }

        /* renamed from: i */
        public int m50021i(int i, int i2) {
            zwc zwcVar;
            nth nthVarM50019g = m50019g();
            if (nthVarM50019g == null) {
                return 0;
            }
            int length = nthVarM50019g.f37302d;
            if (length != 0) {
                zwcVar = this.f47275b.f38917o;
            } else {
                byte[] bArr = (byte[]) sqi.m48729h(nthVarM50019g.f37303e);
                this.f47284k.m60015S(bArr, bArr.length);
                zwc zwcVar2 = this.f47284k;
                length = bArr.length;
                zwcVar = zwcVar2;
            }
            boolean zM42688g = this.f47275b.m42688g(this.f47279f);
            boolean z = zM42688g || i2 != 0;
            this.f47283j.m60024e()[0] = (byte) ((z ? 128 : 0) | length);
            this.f47283j.m60017U(0);
            this.f47274a.mo7074f(this.f47283j, 1, 1);
            this.f47274a.mo7074f(zwcVar, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zM42688g) {
                this.f47276c.m60013Q(8);
                byte[] bArrM60024e = this.f47276c.m60024e();
                bArrM60024e[0] = 0;
                bArrM60024e[1] = 1;
                bArrM60024e[2] = (byte) ((i2 >> 8) & Constants.MAX_HOST_LENGTH);
                bArrM60024e[3] = (byte) (i2 & Constants.MAX_HOST_LENGTH);
                bArrM60024e[4] = (byte) ((i >> 24) & Constants.MAX_HOST_LENGTH);
                bArrM60024e[5] = (byte) ((i >> 16) & Constants.MAX_HOST_LENGTH);
                bArrM60024e[6] = (byte) ((i >> 8) & Constants.MAX_HOST_LENGTH);
                bArrM60024e[7] = (byte) (i & Constants.MAX_HOST_LENGTH);
                this.f47274a.mo7074f(this.f47276c, 8, 1);
                return length + 1 + 8;
            }
            zwc zwcVar3 = this.f47275b.f38917o;
            int iM60010N = zwcVar3.m60010N();
            zwcVar3.m60018V(-2);
            int i3 = (iM60010N * 6) + 2;
            if (i2 != 0) {
                this.f47276c.m60013Q(i3);
                byte[] bArrM60024e2 = this.f47276c.m60024e();
                zwcVar3.m60031l(bArrM60024e2, 0, i3);
                int i4 = (((bArrM60024e2[2] & 255) << 8) | (bArrM60024e2[3] & 255)) + i2;
                bArrM60024e2[2] = (byte) ((i4 >> 8) & Constants.MAX_HOST_LENGTH);
                bArrM60024e2[3] = (byte) (i4 & Constants.MAX_HOST_LENGTH);
                zwcVar3 = this.f47276c;
            }
            this.f47274a.mo7074f(zwcVar3, i3, 1);
            return length + 1 + i3;
        }

        /* renamed from: j */
        public void m50022j(vth vthVar, tg5 tg5Var) {
            this.f47277d = vthVar;
            this.f47278e = tg5Var;
            this.f47274a.mo7072b(vthVar.f50880a.f35984f);
            m50023k();
        }

        /* renamed from: k */
        public void m50023k() {
            this.f47275b.m42687f();
            this.f47279f = 0;
            this.f47281h = 0;
            this.f47280g = 0;
            this.f47282i = 0;
            this.f47285l = false;
        }

        /* renamed from: l */
        public void m50024l(long j) {
            int i = this.f47279f;
            while (true) {
                oth othVar = this.f47275b;
                if (i >= othVar.f38908f || othVar.m42684c(i) > j) {
                    return;
                }
                if (this.f47275b.f38913k[i]) {
                    this.f47282i = i;
                }
                i++;
            }
        }

        /* renamed from: m */
        public void m50025m() {
            nth nthVarM50019g = m50019g();
            if (nthVarM50019g == null) {
                return;
            }
            zwc zwcVar = this.f47275b.f38917o;
            int i = nthVarM50019g.f37302d;
            if (i != 0) {
                zwcVar.m60018V(i);
            }
            if (this.f47275b.m42688g(this.f47279f)) {
                zwcVar.m60018V(zwcVar.m60010N() * 6);
            }
        }

        /* renamed from: n */
        public void m50026n(DrmInitData drmInitData) {
            nth nthVarM39679a = this.f47277d.f50880a.m39679a(((tg5) sqi.m48729h(this.f47275b.f38903a)).f47009a);
            this.f47274a.mo7072b(this.f47277d.f50880a.f35984f.m6707a().m6758U(drmInitData.m6683c(nthVarM39679a != null ? nthVarM39679a.f37300b : null)).m6748K());
        }
    }

    public tj7(qbg.InterfaceC16329a interfaceC16329a, int i) {
        this(interfaceC16329a, i, null, null, nf8.m40499E(), null);
    }

    /* renamed from: A */
    public static void m49974A(nth nthVar, zwc zwcVar, oth othVar) throws byc {
        int i;
        int i2 = nthVar.f37302d;
        zwcVar.m60017U(8);
        if ((js0.m34446b(zwcVar.m60036q()) & 1) == 1) {
            zwcVar.m60018V(8);
        }
        int iM60004H = zwcVar.m60004H();
        int iM60008L = zwcVar.m60008L();
        if (iM60008L > othVar.f38908f) {
            throw byc.m19921a("Saiz sample count " + iM60008L + " is greater than fragment sample count" + othVar.f38908f, null);
        }
        if (iM60004H == 0) {
            boolean[] zArr = othVar.f38915m;
            i = 0;
            for (int i3 = 0; i3 < iM60008L; i3++) {
                int iM60004H2 = zwcVar.m60004H();
                i += iM60004H2;
                zArr[i3] = iM60004H2 > i2;
            }
        } else {
            i = (iM60004H * iM60008L) + 0;
            Arrays.fill(othVar.f38915m, 0, iM60008L, iM60004H > i2);
        }
        Arrays.fill(othVar.f38915m, iM60008L, othVar.f38908f, false);
        if (i > 0) {
            othVar.m42685d(i);
        }
    }

    /* renamed from: B */
    public static void m49975B(js0.C14644a c14644a, String str, oth othVar) throws byc {
        byte[] bArr = null;
        zwc zwcVar = null;
        zwc zwcVar2 = null;
        for (int i = 0; i < c14644a.f31020c.size(); i++) {
            js0.C14645b c14645b = (js0.C14645b) c14644a.f31020c.get(i);
            zwc zwcVar3 = c14645b.f31022b;
            int i2 = c14645b.f31018a;
            if (i2 == 1935828848) {
                zwcVar3.m60017U(12);
                if (zwcVar3.m60036q() == 1936025959) {
                    zwcVar = zwcVar3;
                }
            } else if (i2 == 1936158820) {
                zwcVar3.m60017U(12);
                if (zwcVar3.m60036q() == 1936025959) {
                    zwcVar2 = zwcVar3;
                }
            }
        }
        if (zwcVar == null || zwcVar2 == null) {
            return;
        }
        zwcVar.m60017U(8);
        int iM34447c = js0.m34447c(zwcVar.m60036q());
        zwcVar.m60018V(4);
        if (iM34447c == 1) {
            zwcVar.m60018V(4);
        }
        if (zwcVar.m60036q() != 1) {
            throw byc.m19924d("Entry count in sbgp != 1 (unsupported).");
        }
        zwcVar2.m60017U(8);
        int iM34447c2 = js0.m34447c(zwcVar2.m60036q());
        zwcVar2.m60018V(4);
        if (iM34447c2 == 1) {
            if (zwcVar2.m60006J() == 0) {
                throw byc.m19924d("Variable length description in sgpd found (unsupported)");
            }
        } else if (iM34447c2 >= 2) {
            zwcVar2.m60018V(4);
        }
        if (zwcVar2.m60006J() != 1) {
            throw byc.m19924d("Entry count in sgpd != 1 (unsupported).");
        }
        zwcVar2.m60018V(1);
        int iM60004H = zwcVar2.m60004H();
        int i3 = (iM60004H & 240) >> 4;
        int i4 = iM60004H & 15;
        boolean z = zwcVar2.m60004H() == 1;
        if (z) {
            int iM60004H2 = zwcVar2.m60004H();
            byte[] bArr2 = new byte[16];
            zwcVar2.m60031l(bArr2, 0, 16);
            if (iM60004H2 == 0) {
                int iM60004H3 = zwcVar2.m60004H();
                bArr = new byte[iM60004H3];
                zwcVar2.m60031l(bArr, 0, iM60004H3);
            }
            othVar.f38914l = true;
            othVar.f38916n = new nth(z, str, iM60004H2, bArr2, i3, i4, bArr);
        }
    }

    /* renamed from: C */
    public static void m49976C(zwc zwcVar, int i, oth othVar) throws byc {
        zwcVar.m60017U(i + 8);
        int iM34446b = js0.m34446b(zwcVar.m60036q());
        if ((iM34446b & 1) != 0) {
            throw byc.m19924d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM34446b & 2) != 0;
        int iM60008L = zwcVar.m60008L();
        if (iM60008L == 0) {
            Arrays.fill(othVar.f38915m, 0, othVar.f38908f, false);
            return;
        }
        if (iM60008L == othVar.f38908f) {
            Arrays.fill(othVar.f38915m, 0, iM60008L, z);
            othVar.m42685d(zwcVar.m60020a());
            othVar.m42683b(zwcVar);
        } else {
            throw byc.m19921a("Senc sample count " + iM60008L + " is different from fragment sample count" + othVar.f38908f, null);
        }
    }

    /* renamed from: D */
    public static void m49977D(zwc zwcVar, oth othVar) throws byc {
        m49976C(zwcVar, 0, othVar);
    }

    /* renamed from: E */
    public static Pair m49978E(zwc zwcVar, long j) throws byc {
        long jM60009M;
        long jM60009M2;
        zwcVar.m60017U(8);
        int iM34447c = js0.m34447c(zwcVar.m60036q());
        zwcVar.m60018V(4);
        long jM60006J = zwcVar.m60006J();
        if (iM34447c == 0) {
            jM60009M = zwcVar.m60006J();
            jM60009M2 = zwcVar.m60006J();
        } else {
            jM60009M = zwcVar.m60009M();
            jM60009M2 = zwcVar.m60009M();
        }
        long j2 = jM60009M;
        long j3 = j + jM60009M2;
        long jA1 = sqi.a1(j2, 1000000L, jM60006J);
        zwcVar.m60018V(2);
        int iM60010N = zwcVar.m60010N();
        int[] iArr = new int[iM60010N];
        long[] jArr = new long[iM60010N];
        long[] jArr2 = new long[iM60010N];
        long[] jArr3 = new long[iM60010N];
        long j4 = jA1;
        int i = 0;
        long j5 = j2;
        while (i < iM60010N) {
            int iM60036q = zwcVar.m60036q();
            if ((iM60036q & Integer.MIN_VALUE) != 0) {
                throw byc.m19921a("Unhandled indirect reference", null);
            }
            long jM60006J2 = zwcVar.m60006J();
            iArr[i] = iM60036q & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + jM60006J2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i2 = iM60010N;
            long jA12 = sqi.a1(j6, 1000000L, jM60006J);
            jArr4[i] = jA12 - jArr5[i];
            zwcVar.m60018V(4);
            j3 += r1[i];
            i++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iM60010N = i2;
            j5 = j6;
            j4 = jA12;
        }
        return Pair.create(Long.valueOf(jA1), new n93(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: F */
    public static long m49979F(zwc zwcVar) {
        zwcVar.m60017U(8);
        return js0.m34447c(zwcVar.m60036q()) == 1 ? zwcVar.m60009M() : zwcVar.m60006J();
    }

    /* renamed from: G */
    public static C17132b m49980G(zwc zwcVar, SparseArray sparseArray, boolean z) {
        zwcVar.m60017U(8);
        int iM34446b = js0.m34446b(zwcVar.m60036q());
        C17132b c17132b = (C17132b) (z ? sparseArray.valueAt(0) : sparseArray.get(zwcVar.m60036q()));
        if (c17132b == null) {
            return null;
        }
        if ((iM34446b & 1) != 0) {
            long jM60009M = zwcVar.m60009M();
            oth othVar = c17132b.f47275b;
            othVar.f38905c = jM60009M;
            othVar.f38906d = jM60009M;
        }
        tg5 tg5Var = c17132b.f47278e;
        c17132b.f47275b.f38903a = new tg5((iM34446b & 2) != 0 ? zwcVar.m60036q() - 1 : tg5Var.f47009a, (iM34446b & 8) != 0 ? zwcVar.m60036q() : tg5Var.f47010b, (iM34446b & 16) != 0 ? zwcVar.m60036q() : tg5Var.f47011c, (iM34446b & 32) != 0 ? zwcVar.m60036q() : tg5Var.f47012d);
        return c17132b;
    }

    /* renamed from: H */
    public static void m49981H(js0.C14644a c14644a, SparseArray sparseArray, boolean z, int i, byte[] bArr) throws byc {
        C17132b c17132bM49980G = m49980G(((js0.C14645b) op0.m42515e(c14644a.m34451g(1952868452))).f31022b, sparseArray, z);
        if (c17132bM49980G == null) {
            return;
        }
        oth othVar = c17132bM49980G.f47275b;
        long j = othVar.f38919q;
        boolean z2 = othVar.f38920r;
        c17132bM49980G.m50023k();
        c17132bM49980G.f47285l = true;
        js0.C14645b c14645bM34451g = c14644a.m34451g(1952867444);
        if (c14645bM34451g == null || (i & 2) != 0) {
            othVar.f38919q = j;
            othVar.f38920r = z2;
        } else {
            othVar.f38919q = m49979F(c14645bM34451g.f31022b);
            othVar.f38920r = true;
        }
        m49984K(c14644a, c17132bM49980G, i);
        nth nthVarM39679a = c17132bM49980G.f47277d.f50880a.m39679a(((tg5) op0.m42515e(othVar.f38903a)).f47009a);
        js0.C14645b c14645bM34451g2 = c14644a.m34451g(1935763834);
        if (c14645bM34451g2 != null) {
            m49974A((nth) op0.m42515e(nthVarM39679a), c14645bM34451g2.f31022b, othVar);
        }
        js0.C14645b c14645bM34451g3 = c14644a.m34451g(1935763823);
        if (c14645bM34451g3 != null) {
            m49996z(c14645bM34451g3.f31022b, othVar);
        }
        js0.C14645b c14645bM34451g4 = c14644a.m34451g(1936027235);
        if (c14645bM34451g4 != null) {
            m49977D(c14645bM34451g4.f31022b, othVar);
        }
        m49975B(c14644a, nthVarM39679a != null ? nthVarM39679a.f37300b : null, othVar);
        int size = c14644a.f31020c.size();
        for (int i2 = 0; i2 < size; i2++) {
            js0.C14645b c14645b = (js0.C14645b) c14644a.f31020c.get(i2);
            if (c14645b.f31018a == 1970628964) {
                m49985L(c14645b.f31022b, othVar, bArr);
            }
        }
    }

    /* renamed from: I */
    public static Pair m49982I(zwc zwcVar) {
        zwcVar.m60017U(12);
        return Pair.create(Integer.valueOf(zwcVar.m60036q()), new tg5(zwcVar.m60036q() - 1, zwcVar.m60036q(), zwcVar.m60036q(), zwcVar.m60036q()));
    }

    /* renamed from: J */
    public static int m49983J(C17132b c17132b, int i, int i2, zwc zwcVar, int i3) throws byc {
        boolean z;
        int iM60036q;
        boolean z2;
        int iM60036q2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iM60036q3;
        C17132b c17132b2 = c17132b;
        zwcVar.m60017U(8);
        int iM34446b = js0.m34446b(zwcVar.m60036q());
        mth mthVar = c17132b2.f47277d.f50880a;
        oth othVar = c17132b2.f47275b;
        tg5 tg5Var = (tg5) sqi.m48729h(othVar.f38903a);
        othVar.f38910h[i] = zwcVar.m60008L();
        long[] jArr = othVar.f38909g;
        long j = othVar.f38905c;
        jArr[i] = j;
        if ((iM34446b & 1) != 0) {
            jArr[i] = j + zwcVar.m60036q();
        }
        boolean z6 = (iM34446b & 4) != 0;
        int iM60036q4 = tg5Var.f47012d;
        if (z6) {
            iM60036q4 = zwcVar.m60036q();
        }
        boolean z7 = (iM34446b & 256) != 0;
        boolean z8 = (iM34446b & 512) != 0;
        boolean z9 = (iM34446b & 1024) != 0;
        boolean z10 = (iM34446b & 2048) != 0;
        long j2 = m49992o(mthVar) ? ((long[]) sqi.m48729h(mthVar.f35987i))[0] : 0L;
        int[] iArr = othVar.f38911i;
        long[] jArr2 = othVar.f38912j;
        boolean[] zArr = othVar.f38913k;
        int i4 = iM60036q4;
        boolean z11 = mthVar.f35980b == 2 && (i2 & 1) != 0;
        int i5 = i3 + othVar.f38910h[i];
        boolean z12 = z11;
        long j3 = mthVar.f35981c;
        long j4 = othVar.f38919q;
        int i6 = i3;
        while (i6 < i5) {
            int iM49989e = m49989e(z7 ? zwcVar.m60036q() : tg5Var.f47010b);
            if (z8) {
                iM60036q = zwcVar.m60036q();
                z = z7;
            } else {
                z = z7;
                iM60036q = tg5Var.f47011c;
            }
            int iM49989e2 = m49989e(iM60036q);
            if (z9) {
                z2 = z6;
                iM60036q2 = zwcVar.m60036q();
            } else if (i6 == 0 && z6) {
                z2 = z6;
                iM60036q2 = i4;
            } else {
                z2 = z6;
                iM60036q2 = tg5Var.f47012d;
            }
            if (z10) {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                iM60036q3 = zwcVar.m60036q();
            } else {
                z3 = z10;
                z4 = z8;
                z5 = z9;
                iM60036q3 = 0;
            }
            long jA1 = sqi.a1((iM60036q3 + j4) - j2, 1000000L, j3);
            jArr2[i6] = jA1;
            if (!othVar.f38920r) {
                jArr2[i6] = jA1 + c17132b2.f47277d.f50887h;
            }
            iArr[i6] = iM49989e2;
            zArr[i6] = ((iM60036q2 >> 16) & 1) == 0 && (!z12 || i6 == 0);
            j4 += iM49989e;
            i6++;
            c17132b2 = c17132b;
            z7 = z;
            z6 = z2;
            z10 = z3;
            z8 = z4;
            z9 = z5;
        }
        othVar.f38919q = j4;
        return i5;
    }

    /* renamed from: K */
    public static void m49984K(js0.C14644a c14644a, C17132b c17132b, int i) throws byc {
        List list = c14644a.f31020c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            js0.C14645b c14645b = (js0.C14645b) list.get(i4);
            if (c14645b.f31018a == 1953658222) {
                zwc zwcVar = c14645b.f31022b;
                zwcVar.m60017U(12);
                int iM60008L = zwcVar.m60008L();
                if (iM60008L > 0) {
                    i3 += iM60008L;
                    i2++;
                }
            }
        }
        c17132b.f47281h = 0;
        c17132b.f47280g = 0;
        c17132b.f47279f = 0;
        c17132b.f47275b.m42686e(i2, i3);
        int i5 = 0;
        int iM49983J = 0;
        for (int i6 = 0; i6 < size; i6++) {
            js0.C14645b c14645b2 = (js0.C14645b) list.get(i6);
            if (c14645b2.f31018a == 1953658222) {
                iM49983J = m49983J(c17132b, i5, i, c14645b2.f31022b, iM49983J);
                i5++;
            }
        }
    }

    /* renamed from: L */
    public static void m49985L(zwc zwcVar, oth othVar, byte[] bArr) throws byc {
        zwcVar.m60017U(8);
        zwcVar.m60031l(bArr, 0, 16);
        if (Arrays.equals(bArr, f47233L)) {
            m49976C(zwcVar, 16, othVar);
        }
    }

    /* renamed from: R */
    public static boolean m49986R(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* renamed from: S */
    public static boolean m49987S(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    /* renamed from: e */
    public static int m49989e(int i) throws byc {
        if (i >= 0) {
            return i;
        }
        throw byc.m19921a("Unexpected negative value: " + i, null);
    }

    /* renamed from: j */
    public static DrmInitData m49990j(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            js0.C14645b c14645b = (js0.C14645b) list.get(i);
            if (c14645b.f31018a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrM60024e = c14645b.f31022b.m60024e();
                UUID uuidM22312f = d3e.m22312f(bArrM60024e);
                if (uuidM22312f == null) {
                    ria.m46824h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidM22312f, "video/mp4", bArrM60024e));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    /* renamed from: l */
    public static C17132b m49991l(SparseArray sparseArray) {
        int size = sparseArray.size();
        C17132b c17132b = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C17132b c17132b2 = (C17132b) sparseArray.valueAt(i);
            if ((c17132b2.f47285l || c17132b2.f47279f != c17132b2.f47277d.f50881b) && (!c17132b2.f47285l || c17132b2.f47281h != c17132b2.f47275b.f38907e)) {
                long jM50016d = c17132b2.m50016d();
                if (jM50016d < j) {
                    c17132b = c17132b2;
                    j = jM50016d;
                }
            }
        }
        return c17132b;
    }

    /* renamed from: o */
    public static boolean m49992o(mth mthVar) {
        long[] jArr;
        long[] jArr2 = mthVar.f35986h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = mthVar.f35987i) == null) {
            return false;
        }
        long j = jArr2[0];
        return j == 0 || sqi.a1(j + jArr[0], 1000000L, mthVar.f35982d) >= mthVar.f35983e;
    }

    /* renamed from: p */
    public static /* synthetic */ tq6[] m49993p() {
        return new tq6[]{new tj7(qbg.InterfaceC16329a.f41600a, 32)};
    }

    /* renamed from: x */
    public static long m49994x(zwc zwcVar) {
        zwcVar.m60017U(8);
        return js0.m34447c(zwcVar.m60036q()) == 0 ? zwcVar.m60006J() : zwcVar.m60009M();
    }

    /* renamed from: y */
    public static void m49995y(js0.C14644a c14644a, SparseArray sparseArray, boolean z, int i, byte[] bArr) throws byc {
        int size = c14644a.f31021d.size();
        for (int i2 = 0; i2 < size; i2++) {
            js0.C14644a c14644a2 = (js0.C14644a) c14644a.f31021d.get(i2);
            if (c14644a2.f31018a == 1953653094) {
                m49981H(c14644a2, sparseArray, z, i, bArr);
            }
        }
    }

    /* renamed from: z */
    public static void m49996z(zwc zwcVar, oth othVar) throws byc {
        zwcVar.m60017U(8);
        int iM60036q = zwcVar.m60036q();
        if ((js0.m34446b(iM60036q) & 1) == 1) {
            zwcVar.m60018V(8);
        }
        int iM60008L = zwcVar.m60008L();
        if (iM60008L == 1) {
            othVar.f38906d += js0.m34447c(iM60036q) == 0 ? zwcVar.m60006J() : zwcVar.m60009M();
        } else {
            throw byc.m19921a("Unexpected saio entry count: " + iM60008L, null);
        }
    }

    /* renamed from: M */
    public final void m49997M(long j) throws byc {
        while (!this.f47258n.isEmpty() && ((js0.C14644a) this.f47258n.peek()).f31019b == j) {
            m50007r((js0.C14644a) this.f47258n.pop());
        }
        m50002g();
    }

    /* renamed from: N */
    public final boolean m49998N(uq6 uq6Var) throws byc {
        if (this.f47265u == 0) {
            if (!uq6Var.mo40492f(this.f47257m.m60024e(), 0, 8, true)) {
                return false;
            }
            this.f47265u = 8;
            this.f47257m.m60017U(0);
            this.f47264t = this.f47257m.m60006J();
            this.f47263s = this.f47257m.m60036q();
        }
        long j = this.f47264t;
        if (j == 1) {
            uq6Var.readFully(this.f47257m.m60024e(), 8, 8);
            this.f47265u += 8;
            this.f47264t = this.f47257m.m60009M();
        } else if (j == 0) {
            long length = uq6Var.getLength();
            if (length == -1 && !this.f47258n.isEmpty()) {
                length = ((js0.C14644a) this.f47258n.peek()).f31019b;
            }
            if (length != -1) {
                this.f47264t = (length - uq6Var.getPosition()) + this.f47265u;
            }
        }
        if (this.f47264t < this.f47265u) {
            throw byc.m19924d("Atom size less than header length (unsupported).");
        }
        long position = uq6Var.getPosition() - this.f47265u;
        int i = this.f47263s;
        if ((i == 1836019558 || i == 1835295092) && !this.f47244J) {
            this.f47241G.mo32490r(new zaf.C18604b(this.f47270z, position));
            this.f47244J = true;
        }
        if (this.f47263s == 1836019558) {
            int size = this.f47249e.size();
            for (int i2 = 0; i2 < size; i2++) {
                oth othVar = ((C17132b) this.f47249e.valueAt(i2)).f47275b;
                othVar.f38904b = position;
                othVar.f38906d = position;
                othVar.f38905c = position;
            }
        }
        int i3 = this.f47263s;
        if (i3 == 1835295092) {
            this.f47236B = null;
            this.f47267w = position + this.f47264t;
            this.f47262r = 2;
            return true;
        }
        if (m49986R(i3)) {
            long position2 = (uq6Var.getPosition() + this.f47264t) - 8;
            this.f47258n.push(new js0.C14644a(this.f47263s, position2));
            if (this.f47264t == this.f47265u) {
                m49997M(position2);
            } else {
                m50002g();
            }
        } else if (m49987S(this.f47263s)) {
            if (this.f47265u != 8) {
                throw byc.m19924d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f47264t > 2147483647L) {
                throw byc.m19924d("Leaf atom with length > 2147483647 (unsupported).");
            }
            zwc zwcVar = new zwc((int) this.f47264t);
            System.arraycopy(this.f47257m.m60024e(), 0, zwcVar.m60024e(), 0, 8);
            this.f47266v = zwcVar;
            this.f47262r = 1;
        } else {
            if (this.f47264t > 2147483647L) {
                throw byc.m19924d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f47266v = null;
            this.f47262r = 1;
        }
        return true;
    }

    /* renamed from: O */
    public final void m49999O(uq6 uq6Var) throws byc {
        int i = ((int) this.f47264t) - this.f47265u;
        zwc zwcVar = this.f47266v;
        if (zwcVar != null) {
            uq6Var.readFully(zwcVar.m60024e(), 8, i);
            m50009t(new js0.C14645b(this.f47263s, zwcVar), uq6Var.getPosition());
        } else {
            uq6Var.mo40496k(i);
        }
        m49997M(uq6Var.getPosition());
    }

    /* renamed from: P */
    public final void m50000P(uq6 uq6Var) throws byc {
        int size = this.f47249e.size();
        long j = Long.MAX_VALUE;
        C17132b c17132b = null;
        for (int i = 0; i < size; i++) {
            oth othVar = ((C17132b) this.f47249e.valueAt(i)).f47275b;
            if (othVar.f38918p) {
                long j2 = othVar.f38906d;
                if (j2 < j) {
                    c17132b = (C17132b) this.f47249e.valueAt(i);
                    j = j2;
                }
            }
        }
        if (c17132b == null) {
            this.f47262r = 3;
            return;
        }
        int position = (int) (j - uq6Var.getPosition());
        if (position < 0) {
            throw byc.m19921a("Offset to encryption data was negative.", null);
        }
        uq6Var.mo40496k(position);
        c17132b.f47275b.m42682a(uq6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public final boolean m50001Q(uq6 uq6Var) throws byc {
        int iM52026c;
        C17132b c17132bM49991l = this.f47236B;
        Throwable th = null;
        if (c17132bM49991l == null) {
            c17132bM49991l = m49991l(this.f47249e);
            if (c17132bM49991l == null) {
                int position = (int) (this.f47267w - uq6Var.getPosition());
                if (position < 0) {
                    throw byc.m19921a("Offset to end of mdat was negative.", null);
                }
                uq6Var.mo40496k(position);
                m50002g();
                return false;
            }
            int iM50016d = (int) (c17132bM49991l.m50016d() - uq6Var.getPosition());
            if (iM50016d < 0) {
                ria.m46824h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iM50016d = 0;
            }
            uq6Var.mo40496k(iM50016d);
            this.f47236B = c17132bM49991l;
        }
        int i = 4;
        int i2 = 1;
        if (this.f47262r == 3) {
            int iM50018f = c17132bM49991l.m50018f();
            this.f47237C = iM50018f;
            if (c17132bM49991l.f47279f < c17132bM49991l.f47282i) {
                uq6Var.mo40496k(iM50018f);
                c17132bM49991l.m50025m();
                if (!c17132bM49991l.m50020h()) {
                    this.f47236B = null;
                }
                this.f47262r = 3;
                return true;
            }
            if (c17132bM49991l.f47277d.f50880a.f35985g == 1) {
                this.f47237C = iM50018f - 8;
                uq6Var.mo40496k(8);
            }
            if ("audio/ac4".equals(c17132bM49991l.f47277d.f50880a.f35984f.f7943n)) {
                this.f47238D = c17132bM49991l.m50021i(this.f47237C, 7);
                ja.m33427a(this.f47237C, this.f47254j);
                c17132bM49991l.f47274a.m52027e(this.f47254j, 7);
                this.f47238D += 7;
            } else {
                this.f47238D = c17132bM49991l.m50021i(this.f47237C, 0);
            }
            this.f47237C += this.f47238D;
            this.f47262r = 4;
            this.f47239E = 0;
        }
        mth mthVar = c17132bM49991l.f47277d.f50880a;
        uth uthVar = c17132bM49991l.f47274a;
        long jM50017e = c17132bM49991l.m50017e();
        umh umhVar = this.f47255k;
        if (umhVar != null) {
            jM50017e = umhVar.m51794a(jM50017e);
        }
        long j = jM50017e;
        if (mthVar.f35988j == 0) {
            while (true) {
                int i3 = this.f47238D;
                int i4 = this.f47237C;
                if (i3 >= i4) {
                    break;
                }
                this.f47238D += uthVar.m52026c(uq6Var, i4 - i3, false);
            }
        } else {
            byte[] bArrM60024e = this.f47251g.m60024e();
            bArrM60024e[0] = 0;
            bArrM60024e[1] = 0;
            bArrM60024e[2] = 0;
            int i5 = mthVar.f35988j;
            int i6 = i5 + 1;
            int i7 = 4 - i5;
            while (this.f47238D < this.f47237C) {
                int i8 = this.f47239E;
                if (i8 == 0) {
                    uq6Var.readFully(bArrM60024e, i7, i6);
                    this.f47251g.m60017U(0);
                    int iM60036q = this.f47251g.m60036q();
                    if (iM60036q < i2) {
                        throw byc.m19921a("Invalid NAL length", th);
                    }
                    this.f47239E = iM60036q - 1;
                    this.f47250f.m60017U(0);
                    uthVar.m52027e(this.f47250f, i);
                    uthVar.m52027e(this.f47251g, i2);
                    this.f47240F = (this.f47243I.length <= 0 || !irb.m32618g(mthVar.f35984f.f7943n, bArrM60024e[i])) ? 0 : i2;
                    this.f47238D += 5;
                    this.f47237C += i7;
                } else {
                    if (this.f47240F) {
                        this.f47252h.m60013Q(i8);
                        uq6Var.readFully(this.f47252h.m60024e(), 0, this.f47239E);
                        uthVar.m52027e(this.f47252h, this.f47239E);
                        iM52026c = this.f47239E;
                        int iM32629r = irb.m32629r(this.f47252h.m60024e(), this.f47252h.m60026g());
                        this.f47252h.m60017U("video/hevc".equals(mthVar.f35984f.f7943n) ? 1 : 0);
                        this.f47252h.m60016T(iM32629r);
                        df2.m22956a(j, this.f47252h, this.f47243I);
                    } else {
                        iM52026c = uthVar.m52026c(uq6Var, i8, false);
                    }
                    this.f47238D += iM52026c;
                    this.f47239E -= iM52026c;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int iM50015c = c17132bM49991l.m50015c();
        nth nthVarM50019g = c17132bM49991l.m50019g();
        uthVar.mo7071a(j, iM50015c, this.f47237C, 0, nthVarM50019g != null ? nthVarM50019g.f37301c : null);
        m50012w(j);
        if (!c17132bM49991l.m50020h()) {
            this.f47236B = null;
        }
        this.f47262r = 3;
        return true;
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        int size = this.f47249e.size();
        for (int i = 0; i < size; i++) {
            ((C17132b) this.f47249e.valueAt(i)).m50023k();
        }
        this.f47259o.clear();
        this.f47268x = 0;
        this.f47269y = j2;
        this.f47258n.clear();
        m50002g();
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        zxf zxfVarM18024b = ayf.m18024b(uq6Var);
        this.f47261q = zxfVarM18024b != null ? nf8.m40500F(zxfVarM18024b) : nf8.m40499E();
        return zxfVarM18024b == null;
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f47241G = (this.f47246b & 32) == 0 ? new sbg(vq6Var, this.f47245a) : vq6Var;
        m50002g();
        m50005n();
        mth mthVar = this.f47247c;
        if (mthVar != null) {
            this.f47249e.put(0, new C17132b(vq6Var.mo32487f(0, mthVar.f35980b), new vth(this.f47247c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new tg5(0, 0, 0, 0)));
            this.f47241G.mo32489p();
        }
    }

    /* renamed from: g */
    public final void m50002g() {
        this.f47262r = 0;
        this.f47265u = 0;
    }

    /* renamed from: h */
    public final tg5 m50003h(SparseArray sparseArray, int i) {
        return sparseArray.size() == 1 ? (tg5) sparseArray.valueAt(0) : (tg5) op0.m42515e((tg5) sparseArray.get(i));
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        while (true) {
            int i = this.f47262r;
            if (i != 0) {
                if (i == 1) {
                    m49999O(uq6Var);
                } else if (i == 2) {
                    m50000P(uq6Var);
                } else if (m50001Q(uq6Var)) {
                    return 0;
                }
            } else if (!m49998N(uq6Var)) {
                return -1;
            }
        }
    }

    @Override // p001o.tq6
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public nf8 mo27149i() {
        return this.f47261q;
    }

    /* renamed from: n */
    public final void m50005n() {
        int i;
        uth[] uthVarArr = new uth[2];
        this.f47242H = uthVarArr;
        uth uthVar = this.f47260p;
        int i2 = 0;
        if (uthVar != null) {
            uthVarArr[0] = uthVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f47246b & 4) != 0) {
            uthVarArr[i] = this.f47241G.mo32487f(100, 5);
            i3 = 101;
            i++;
        }
        uth[] uthVarArr2 = (uth[]) sqi.S0(this.f47242H, i);
        this.f47242H = uthVarArr2;
        for (uth uthVar2 : uthVarArr2) {
            uthVar2.mo7072b(f47234M);
        }
        this.f47243I = new uth[this.f47248d.size()];
        while (i2 < this.f47243I.length) {
            uth uthVarMo32487f = this.f47241G.mo32487f(i3, 3);
            uthVarMo32487f.mo7072b((C2181a) this.f47248d.get(i2));
            this.f47243I[i2] = uthVarMo32487f;
            i2++;
            i3++;
        }
    }

    /* renamed from: q */
    public mth m50006q(mth mthVar) {
        return mthVar;
    }

    /* renamed from: r */
    public final void m50007r(js0.C14644a c14644a) throws byc {
        int i = c14644a.f31018a;
        if (i == 1836019574) {
            m50011v(c14644a);
        } else if (i == 1836019558) {
            m50010u(c14644a);
        } else {
            if (this.f47258n.isEmpty()) {
                return;
            }
            ((js0.C14644a) this.f47258n.peek()).m34448d(c14644a);
        }
    }

    @Override // p001o.tq6
    public void release() {
    }

    /* renamed from: s */
    public final void m50008s(zwc zwcVar) {
        long jA1;
        String str;
        long jA12;
        String str2;
        long jM60006J;
        long jM51794a;
        if (this.f47242H.length == 0) {
            return;
        }
        zwcVar.m60017U(8);
        int iM34447c = js0.m34447c(zwcVar.m60036q());
        if (iM34447c == 0) {
            String str3 = (String) op0.m42515e(zwcVar.m59998B());
            String str4 = (String) op0.m42515e(zwcVar.m59998B());
            long jM60006J2 = zwcVar.m60006J();
            jA1 = sqi.a1(zwcVar.m60006J(), 1000000L, jM60006J2);
            long j = this.f47235A;
            long j2 = j != -9223372036854775807L ? j + jA1 : -9223372036854775807L;
            str = str3;
            jA12 = sqi.a1(zwcVar.m60006J(), 1000L, jM60006J2);
            str2 = str4;
            jM60006J = zwcVar.m60006J();
            jM51794a = j2;
        } else {
            if (iM34447c != 1) {
                ria.m46824h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iM34447c);
                return;
            }
            long jM60006J3 = zwcVar.m60006J();
            jM51794a = sqi.a1(zwcVar.m60009M(), 1000000L, jM60006J3);
            long jA13 = sqi.a1(zwcVar.m60006J(), 1000L, jM60006J3);
            long jM60006J4 = zwcVar.m60006J();
            str = (String) op0.m42515e(zwcVar.m59998B());
            jA12 = jA13;
            jM60006J = jM60006J4;
            str2 = (String) op0.m42515e(zwcVar.m59998B());
            jA1 = -9223372036854775807L;
        }
        byte[] bArr = new byte[zwcVar.m60020a()];
        zwcVar.m60031l(bArr, 0, zwcVar.m60020a());
        zwc zwcVar2 = new zwc(this.f47256l.m35802a(new EventMessage(str, str2, jA12, jM60006J, bArr)));
        int iM60020a = zwcVar2.m60020a();
        for (uth uthVar : this.f47242H) {
            zwcVar2.m60017U(0);
            uthVar.m52027e(zwcVar2, iM60020a);
        }
        if (jM51794a == -9223372036854775807L) {
            this.f47259o.addLast(new C17131a(jA1, true, iM60020a));
            this.f47268x += iM60020a;
            return;
        }
        if (!this.f47259o.isEmpty()) {
            this.f47259o.addLast(new C17131a(jM51794a, false, iM60020a));
            this.f47268x += iM60020a;
            return;
        }
        umh umhVar = this.f47255k;
        if (umhVar != null && !umhVar.m51800g()) {
            this.f47259o.addLast(new C17131a(jM51794a, false, iM60020a));
            this.f47268x += iM60020a;
            return;
        }
        umh umhVar2 = this.f47255k;
        if (umhVar2 != null) {
            jM51794a = umhVar2.m51794a(jM51794a);
        }
        for (uth uthVar2 : this.f47242H) {
            uthVar2.mo7071a(jM51794a, 1, iM60020a, 0, null);
        }
    }

    /* renamed from: t */
    public final void m50009t(js0.C14645b c14645b, long j) throws byc {
        if (!this.f47258n.isEmpty()) {
            ((js0.C14644a) this.f47258n.peek()).m34449e(c14645b);
            return;
        }
        int i = c14645b.f31018a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                m50008s(c14645b.f31022b);
            }
        } else {
            Pair pairM49978E = m49978E(c14645b.f31022b, j);
            this.f47235A = ((Long) pairM49978E.first).longValue();
            this.f47241G.mo32490r((zaf) pairM49978E.second);
            this.f47244J = true;
        }
    }

    /* renamed from: u */
    public final void m50010u(js0.C14644a c14644a) throws byc {
        m49995y(c14644a, this.f47249e, this.f47247c != null, this.f47246b, this.f47253i);
        DrmInitData drmInitDataM49990j = m49990j(c14644a.f31020c);
        if (drmInitDataM49990j != null) {
            int size = this.f47249e.size();
            for (int i = 0; i < size; i++) {
                ((C17132b) this.f47249e.valueAt(i)).m50026n(drmInitDataM49990j);
            }
        }
        if (this.f47269y != -9223372036854775807L) {
            int size2 = this.f47249e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C17132b) this.f47249e.valueAt(i2)).m50024l(this.f47269y);
            }
            this.f47269y = -9223372036854775807L;
        }
    }

    /* renamed from: v */
    public final void m50011v(js0.C14644a c14644a) {
        int i = 0;
        op0.m42518h(this.f47247c == null, "Unexpected moov box.");
        DrmInitData drmInitDataM49990j = m49990j(c14644a.f31020c);
        js0.C14644a c14644a2 = (js0.C14644a) op0.m42515e(c14644a.m34450f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = c14644a2.f31020c.size();
        long jM49994x = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            js0.C14645b c14645b = (js0.C14645b) c14644a2.f31020c.get(i2);
            int i3 = c14645b.f31018a;
            if (i3 == 1953654136) {
                Pair pairM49982I = m49982I(c14645b.f31022b);
                sparseArray.put(((Integer) pairM49982I.first).intValue(), (tg5) pairM49982I.second);
            } else if (i3 == 1835362404) {
                jM49994x = m49994x(c14645b.f31022b);
            }
        }
        List listM36140B = ks0.m36140B(c14644a, new gn7(), jM49994x, drmInitDataM49990j, (this.f47246b & 16) != 0, false, new ol7() { // from class: o.sj7
            @Override // p001o.ol7
            public final Object apply(Object obj) {
                return this.f45475a.m50006q((mth) obj);
            }
        });
        int size2 = listM36140B.size();
        if (this.f47249e.size() != 0) {
            op0.m42517g(this.f47249e.size() == size2);
            while (i < size2) {
                vth vthVar = (vth) listM36140B.get(i);
                mth mthVar = vthVar.f50880a;
                ((C17132b) this.f47249e.get(mthVar.f35979a)).m50022j(vthVar, m50003h(sparseArray, mthVar.f35979a));
                i++;
            }
            return;
        }
        while (i < size2) {
            vth vthVar2 = (vth) listM36140B.get(i);
            mth mthVar2 = vthVar2.f50880a;
            this.f47249e.put(mthVar2.f35979a, new C17132b(this.f47241G.mo32487f(i, mthVar2.f35980b), vthVar2, m50003h(sparseArray, mthVar2.f35979a)));
            this.f47270z = Math.max(this.f47270z, mthVar2.f35983e);
            i++;
        }
        this.f47241G.mo32489p();
    }

    /* renamed from: w */
    public final void m50012w(long j) {
        while (!this.f47259o.isEmpty()) {
            C17131a c17131a = (C17131a) this.f47259o.removeFirst();
            this.f47268x -= c17131a.f47273c;
            long jM51794a = c17131a.f47271a;
            if (c17131a.f47272b) {
                jM51794a += j;
            }
            umh umhVar = this.f47255k;
            if (umhVar != null) {
                jM51794a = umhVar.m51794a(jM51794a);
            }
            for (uth uthVar : this.f47242H) {
                uthVar.mo7071a(jM51794a, 1, c17131a.f47273c, this.f47268x, null);
            }
        }
    }

    public tj7(qbg.InterfaceC16329a interfaceC16329a, int i, umh umhVar, mth mthVar, List list, uth uthVar) {
        this.f47245a = interfaceC16329a;
        this.f47246b = i;
        this.f47255k = umhVar;
        this.f47247c = mthVar;
        this.f47248d = Collections.unmodifiableList(list);
        this.f47260p = uthVar;
        this.f47256l = new kk6();
        this.f47257m = new zwc(16);
        this.f47250f = new zwc(irb.f29113a);
        this.f47251g = new zwc(5);
        this.f47252h = new zwc();
        byte[] bArr = new byte[16];
        this.f47253i = bArr;
        this.f47254j = new zwc(bArr);
        this.f47258n = new ArrayDeque();
        this.f47259o = new ArrayDeque();
        this.f47249e = new SparseArray();
        this.f47261q = nf8.m40499E();
        this.f47270z = -9223372036854775807L;
        this.f47269y = -9223372036854775807L;
        this.f47235A = -9223372036854775807L;
        this.f47241G = vq6.f50715r;
        this.f47242H = new uth[0];
        this.f47243I = new uth[0];
    }
}
