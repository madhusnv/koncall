package p001o;

import android.util.Pair;
import androidx.media3.common.C2181a;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;
import p001o.hyh;

/* loaded from: classes2.dex */
public final class wv7 implements n46 {

    /* renamed from: q */
    public static final double[] f52734q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f52735a;

    /* renamed from: b */
    public uth f52736b;

    /* renamed from: c */
    public final adi f52737c;

    /* renamed from: d */
    public final zwc f52738d;

    /* renamed from: e */
    public final hrb f52739e;

    /* renamed from: f */
    public final boolean[] f52740f;

    /* renamed from: g */
    public final C17970a f52741g;

    /* renamed from: h */
    public long f52742h;

    /* renamed from: i */
    public boolean f52743i;

    /* renamed from: j */
    public boolean f52744j;

    /* renamed from: k */
    public long f52745k;

    /* renamed from: l */
    public long f52746l;

    /* renamed from: m */
    public long f52747m;

    /* renamed from: n */
    public long f52748n;

    /* renamed from: o */
    public boolean f52749o;

    /* renamed from: p */
    public boolean f52750p;

    /* renamed from: o.wv7$a */
    public static final class C17970a {

        /* renamed from: e */
        public static final byte[] f52751e = {0, 0, 1};

        /* renamed from: a */
        public boolean f52752a;

        /* renamed from: b */
        public int f52753b;

        /* renamed from: c */
        public int f52754c;

        /* renamed from: d */
        public byte[] f52755d;

        public C17970a(int i) {
            this.f52755d = new byte[i];
        }

        /* renamed from: a */
        public void m55080a(byte[] bArr, int i, int i2) {
            if (this.f52752a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f52755d;
                int length = bArr2.length;
                int i4 = this.f52753b;
                if (length < i4 + i3) {
                    this.f52755d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f52755d, this.f52753b, i3);
                this.f52753b += i3;
            }
        }

        /* renamed from: b */
        public boolean m55081b(int i, int i2) {
            if (this.f52752a) {
                int i3 = this.f52753b - i2;
                this.f52753b = i3;
                if (this.f52754c != 0 || i != 181) {
                    this.f52752a = false;
                    return true;
                }
                this.f52754c = i3;
            } else if (i == 179) {
                this.f52752a = true;
            }
            byte[] bArr = f52751e;
            m55080a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m55082c() {
            this.f52752a = false;
            this.f52753b = 0;
            this.f52754c = 0;
        }
    }

    public wv7() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m55079f(C17970a c17970a, String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        byte[] bArrCopyOf = Arrays.copyOf(c17970a.f52755d, c17970a.f52753b);
        int i3 = bArrCopyOf[4] & 255;
        int i4 = bArrCopyOf[5] & 255;
        int i5 = (i3 << 4) | (i4 >> 4);
        int i6 = ((i4 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i7 = (bArrCopyOf[7] & 240) >> 4;
        if (i7 == 2) {
            f = i6 * 4;
            i = i5 * 3;
        } else if (i7 == 3) {
            f = i6 * 16;
            i = i5 * 9;
        } else {
            if (i7 != 4) {
                f2 = 1.0f;
                C2181a c2181aM6748K = new C2181a.b().a0(str).o0("video/mpeg2").v0(i5).m6762Y(i6).k0(f2).b0(Collections.singletonList(bArrCopyOf)).m6748K();
                i2 = (bArrCopyOf[7] & 15) - 1;
                if (i2 < 0) {
                    double[] dArr = f52734q;
                    if (i2 < dArr.length) {
                        double d = dArr[i2];
                        byte b = bArrCopyOf[c17970a.f52754c + 9];
                        int i8 = (b & 96) >> 5;
                        if (i8 != (b & 31)) {
                            d *= (i8 + 1.0d) / (r8 + 1);
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                }
                return Pair.create(c2181aM6748K, Long.valueOf(j));
            }
            f = i6 * Opcodes.LSHL;
            i = i5 * 100;
        }
        f2 = f / i;
        C2181a c2181aM6748K2 = new C2181a.b().a0(str).o0("video/mpeg2").v0(i5).m6762Y(i6).k0(f2).b0(Collections.singletonList(bArrCopyOf)).m6748K();
        i2 = (bArrCopyOf[7] & 15) - 1;
        if (i2 < 0) {
        }
        return Pair.create(c2181aM6748K2, Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    @Override // p001o.n46
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo24646a(zwc zwcVar) {
        int i;
        long j;
        boolean z;
        int i2;
        op0.m42519i(this.f52736b);
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        byte[] bArrM60024e = zwcVar.m60024e();
        this.f52742h += zwcVar.m60020a();
        this.f52736b.m52027e(zwcVar, zwcVar.m60020a());
        while (true) {
            int iM32614c = irb.m32614c(bArrM60024e, iM60025f, iM60026g, this.f52740f);
            if (iM32614c == iM60026g) {
                break;
            }
            int i3 = iM32614c + 3;
            int i4 = zwcVar.m60024e()[i3] & 255;
            int i5 = iM32614c - iM60025f;
            if (!this.f52744j) {
                if (i5 > 0) {
                    this.f52741g.m55080a(bArrM60024e, iM60025f, iM32614c);
                }
                if (this.f52741g.m55081b(i4, i5 < 0 ? -i5 : 0)) {
                    Pair pairM55079f = m55079f(this.f52741g, (String) op0.m42515e(this.f52735a));
                    this.f52736b.mo7072b((C2181a) pairM55079f.first);
                    this.f52745k = ((Long) pairM55079f.second).longValue();
                    this.f52744j = true;
                }
            }
            hrb hrbVar = this.f52739e;
            if (hrbVar != null) {
                if (i5 > 0) {
                    hrbVar.m31014a(bArrM60024e, iM60025f, iM32614c);
                    i2 = 0;
                } else {
                    i2 = -i5;
                }
                if (this.f52739e.m31015b(i2)) {
                    hrb hrbVar2 = this.f52739e;
                    ((zwc) sqi.m48729h(this.f52738d)).m60015S(this.f52739e.f27397d, irb.m32629r(hrbVar2.f27397d, hrbVar2.f27398e));
                    ((adi) sqi.m48729h(this.f52737c)).m16933a(this.f52748n, this.f52738d);
                }
                if (i4 == 178 && zwcVar.m60024e()[iM32614c + 2] == 1) {
                    this.f52739e.m31018e(i4);
                }
            }
            if (i4 == 0 || i4 == 179) {
                int i6 = iM60026g - iM32614c;
                if (this.f52750p && this.f52744j) {
                    long j2 = this.f52748n;
                    if (j2 != -9223372036854775807L) {
                        i = i4;
                        this.f52736b.mo7071a(j2, this.f52749o ? 1 : 0, ((int) (this.f52742h - this.f52747m)) - i6, i6, null);
                    }
                    if (this.f52743i) {
                        this.f52747m = this.f52742h - i6;
                        j = this.f52746l;
                        if (j == -9223372036854775807L) {
                        }
                        this.f52748n = j;
                        this.f52749o = false;
                        this.f52746l = -9223372036854775807L;
                        z = true;
                        this.f52743i = true;
                        this.f52750p = i == 0 ? z : false;
                    }
                } else {
                    i = i4;
                    if (this.f52743i || this.f52750p) {
                        this.f52747m = this.f52742h - i6;
                        j = this.f52746l;
                        if (j == -9223372036854775807L) {
                            long j3 = this.f52748n;
                            j = j3 != -9223372036854775807L ? j3 + this.f52745k : -9223372036854775807L;
                        }
                        this.f52748n = j;
                        this.f52749o = false;
                        this.f52746l = -9223372036854775807L;
                        z = true;
                        this.f52743i = true;
                    } else {
                        z = true;
                    }
                    this.f52750p = i == 0 ? z : false;
                }
            } else if (i4 == 184) {
                this.f52749o = true;
            }
            iM60025f = i3;
        }
        if (!this.f52744j) {
            this.f52741g.m55080a(bArrM60024e, iM60025f, iM60026g);
        }
        hrb hrbVar3 = this.f52739e;
        if (hrbVar3 != null) {
            hrbVar3.m31014a(bArrM60024e, iM60025f, iM60026g);
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        irb.m32612a(this.f52740f);
        this.f52741g.m55082c();
        hrb hrbVar = this.f52739e;
        if (hrbVar != null) {
            hrbVar.m31017d();
        }
        this.f52742h = 0L;
        this.f52743i = false;
        this.f52746l = -9223372036854775807L;
        this.f52748n = -9223372036854775807L;
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
        op0.m42519i(this.f52736b);
        if (z) {
            boolean z2 = this.f52749o;
            this.f52736b.mo7071a(this.f52748n, z2 ? 1 : 0, (int) (this.f52742h - this.f52747m), 0, null);
        }
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f52735a = c14129d.m31295b();
        this.f52736b = vq6Var.mo32487f(c14129d.m31296c(), 2);
        adi adiVar = this.f52737c;
        if (adiVar != null) {
            adiVar.m16934b(vq6Var, c14129d);
        }
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f52746l = j;
    }

    public wv7(adi adiVar) {
        this.f52737c = adiVar;
        this.f52740f = new boolean[4];
        this.f52741g = new C17970a(128);
        if (adiVar != null) {
            this.f52739e = new hrb(Opcodes.GETSTATIC, 128);
            this.f52738d = new zwc();
        } else {
            this.f52739e = null;
            this.f52738d = null;
        }
        this.f52746l = -9223372036854775807L;
        this.f52748n = -9223372036854775807L;
    }
}
