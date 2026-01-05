package p001o;

import androidx.media3.common.C2181a;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.EOFException;
import java.util.Arrays;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class zb0 implements tq6 {

    /* renamed from: r */
    public static final int[] f56871r;

    /* renamed from: u */
    public static final int f56874u;

    /* renamed from: a */
    public final byte[] f56875a;

    /* renamed from: b */
    public final int f56876b;

    /* renamed from: c */
    public boolean f56877c;

    /* renamed from: d */
    public long f56878d;

    /* renamed from: e */
    public int f56879e;

    /* renamed from: f */
    public int f56880f;

    /* renamed from: g */
    public boolean f56881g;

    /* renamed from: h */
    public long f56882h;

    /* renamed from: i */
    public int f56883i;

    /* renamed from: j */
    public int f56884j;

    /* renamed from: k */
    public long f56885k;

    /* renamed from: l */
    public vq6 f56886l;

    /* renamed from: m */
    public uth f56887m;

    /* renamed from: n */
    public zaf f56888n;

    /* renamed from: o */
    public boolean f56889o;

    /* renamed from: p */
    public static final yq6 f56869p = new yq6() { // from class: o.yb0
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return zb0.m59097o();
        }
    };

    /* renamed from: q */
    public static final int[] f56870q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    public static final byte[] f56872s = sqi.t0("#!AMR\n");

    /* renamed from: t */
    public static final byte[] f56873t = sqi.t0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f56871r = iArr;
        f56874u = iArr[8];
    }

    public zb0() {
        this(0);
    }

    /* renamed from: g */
    public static int m59096g(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    /* renamed from: o */
    public static /* synthetic */ tq6[] m59097o() {
        return new tq6[]{new zb0()};
    }

    /* renamed from: r */
    public static boolean m59098r(uq6 uq6Var, byte[] bArr) {
        uq6Var.mo40490c();
        byte[] bArr2 = new byte[bArr.length];
        uq6Var.mo40498m(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        this.f56878d = 0L;
        this.f56879e = 0;
        this.f56880f = 0;
        if (j != 0) {
            zaf zafVar = this.f56888n;
            if (zafVar instanceof pt3) {
                this.f56885k = ((pt3) zafVar).m44138c(j);
                return;
            }
        }
        this.f56885k = 0L;
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        return m59108t(uq6Var);
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f56886l = vq6Var;
        this.f56887m = vq6Var.mo32487f(0, 1);
        vq6Var.mo32489p();
    }

    /* renamed from: e */
    public final void m59099e() {
        op0.m42519i(this.f56887m);
        sqi.m48729h(this.f56886l);
    }

    /* renamed from: h */
    public final zaf m59100h(long j, boolean z) {
        return new pt3(j, this.f56882h, m59096g(this.f56883i, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT), this.f56883i, z);
    }

    /* renamed from: j */
    public final int m59101j(int i) throws byc {
        if (m59103m(i)) {
            return this.f56877c ? f56871r[i] : f56870q[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f56877c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw byc.m19921a(sb.toString(), null);
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        m59099e();
        if (uq6Var.getPosition() == 0 && !m59108t(uq6Var)) {
            throw byc.m19921a("Could not find AMR header.", null);
        }
        m59105p();
        int iM59109u = m59109u(uq6Var);
        m59106q(uq6Var.getLength(), iM59109u);
        return iM59109u;
    }

    /* renamed from: l */
    public final boolean m59102l(int i) {
        return !this.f56877c && (i < 12 || i > 14);
    }

    /* renamed from: m */
    public final boolean m59103m(int i) {
        return i >= 0 && i <= 15 && (m59104n(i) || m59102l(i));
    }

    /* renamed from: n */
    public final boolean m59104n(int i) {
        return this.f56877c && (i < 10 || i > 13);
    }

    /* renamed from: p */
    public final void m59105p() {
        if (this.f56889o) {
            return;
        }
        this.f56889o = true;
        boolean z = this.f56877c;
        this.f56887m.mo7072b(new C2181a.b().o0(z ? "audio/amr-wb" : "audio/3gpp").f0(f56874u).m6751N(1).p0(z ? 16000 : 8000).m6748K());
    }

    /* renamed from: q */
    public final void m59106q(long j, int i) {
        int i2;
        if (this.f56881g) {
            return;
        }
        int i3 = this.f56876b;
        if ((i3 & 1) == 0 || j == -1 || !((i2 = this.f56883i) == -1 || i2 == this.f56879e)) {
            zaf.C18604b c18604b = new zaf.C18604b(-9223372036854775807L);
            this.f56888n = c18604b;
            this.f56886l.mo32490r(c18604b);
            this.f56881g = true;
            return;
        }
        if (this.f56884j >= 20 || i == -1) {
            zaf zafVarM59100h = m59100h(j, (i3 & 2) != 0);
            this.f56888n = zafVarM59100h;
            this.f56886l.mo32490r(zafVarM59100h);
            this.f56881g = true;
        }
    }

    @Override // p001o.tq6
    public void release() {
    }

    /* renamed from: s */
    public final int m59107s(uq6 uq6Var) throws byc {
        uq6Var.mo40490c();
        uq6Var.mo40498m(this.f56875a, 0, 1);
        byte b = this.f56875a[0];
        if ((b & 131) <= 0) {
            return m59101j((b >> 3) & 15);
        }
        throw byc.m19921a("Invalid padding bits for frame header " + ((int) b), null);
    }

    /* renamed from: t */
    public final boolean m59108t(uq6 uq6Var) {
        byte[] bArr = f56872s;
        if (m59098r(uq6Var, bArr)) {
            this.f56877c = false;
            uq6Var.mo40496k(bArr.length);
            return true;
        }
        byte[] bArr2 = f56873t;
        if (!m59098r(uq6Var, bArr2)) {
            return false;
        }
        this.f56877c = true;
        uq6Var.mo40496k(bArr2.length);
        return true;
    }

    /* renamed from: u */
    public final int m59109u(uq6 uq6Var) throws byc {
        if (this.f56880f == 0) {
            try {
                int iM59107s = m59107s(uq6Var);
                this.f56879e = iM59107s;
                this.f56880f = iM59107s;
                if (this.f56883i == -1) {
                    this.f56882h = uq6Var.getPosition();
                    this.f56883i = this.f56879e;
                }
                if (this.f56883i == this.f56879e) {
                    this.f56884j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iM52026c = this.f56887m.m52026c(uq6Var, this.f56880f, true);
        if (iM52026c == -1) {
            return -1;
        }
        int i = this.f56880f - iM52026c;
        this.f56880f = i;
        if (i > 0) {
            return 0;
        }
        this.f56887m.mo7071a(this.f56885k + this.f56878d, 1, this.f56879e, 0, null);
        this.f56878d += DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
        return 0;
    }

    public zb0(int i) {
        this.f56876b = (i & 2) != 0 ? i | 1 : i;
        this.f56875a = new byte[1];
        this.f56883i = -1;
    }
}
