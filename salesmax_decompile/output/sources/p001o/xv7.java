package p001o;

import androidx.media3.common.C2181a;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;
import p001o.hyh;

/* loaded from: classes2.dex */
public final class xv7 implements n46 {

    /* renamed from: l */
    public static final float[] f54327l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final adi f54328a;

    /* renamed from: b */
    public final zwc f54329b;

    /* renamed from: e */
    public final hrb f54332e;

    /* renamed from: f */
    public C18249b f54333f;

    /* renamed from: g */
    public long f54334g;

    /* renamed from: h */
    public String f54335h;

    /* renamed from: i */
    public uth f54336i;

    /* renamed from: j */
    public boolean f54337j;

    /* renamed from: c */
    public final boolean[] f54330c = new boolean[4];

    /* renamed from: d */
    public final C18248a f54331d = new C18248a(128);

    /* renamed from: k */
    public long f54338k = -9223372036854775807L;

    /* renamed from: o.xv7$a */
    public static final class C18248a {

        /* renamed from: f */
        public static final byte[] f54339f = {0, 0, 1};

        /* renamed from: a */
        public boolean f54340a;

        /* renamed from: b */
        public int f54341b;

        /* renamed from: c */
        public int f54342c;

        /* renamed from: d */
        public int f54343d;

        /* renamed from: e */
        public byte[] f54344e;

        public C18248a(int i) {
            this.f54344e = new byte[i];
        }

        /* renamed from: a */
        public void m56851a(byte[] bArr, int i, int i2) {
            if (this.f54340a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f54344e;
                int length = bArr2.length;
                int i4 = this.f54342c;
                if (length < i4 + i3) {
                    this.f54344e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f54344e, this.f54342c, i3);
                this.f54342c += i3;
            }
        }

        /* renamed from: b */
        public boolean m56852b(int i, int i2) {
            int i3 = this.f54341b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.f54342c -= i2;
                                this.f54340a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            ria.m46824h("H263Reader", "Unexpected start code value");
                            m56853c();
                        } else {
                            this.f54343d = this.f54342c;
                            this.f54341b = 4;
                        }
                    } else if (i > 31) {
                        ria.m46824h("H263Reader", "Unexpected start code value");
                        m56853c();
                    } else {
                        this.f54341b = 3;
                    }
                } else if (i != 181) {
                    ria.m46824h("H263Reader", "Unexpected start code value");
                    m56853c();
                } else {
                    this.f54341b = 2;
                }
            } else if (i == 176) {
                this.f54341b = 1;
                this.f54340a = true;
            }
            byte[] bArr = f54339f;
            m56851a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m56853c() {
            this.f54340a = false;
            this.f54342c = 0;
            this.f54341b = 0;
        }
    }

    /* renamed from: o.xv7$b */
    public static final class C18249b {

        /* renamed from: a */
        public final uth f54345a;

        /* renamed from: b */
        public boolean f54346b;

        /* renamed from: c */
        public boolean f54347c;

        /* renamed from: d */
        public boolean f54348d;

        /* renamed from: e */
        public int f54349e;

        /* renamed from: f */
        public int f54350f;

        /* renamed from: g */
        public long f54351g;

        /* renamed from: h */
        public long f54352h;

        public C18249b(uth uthVar) {
            this.f54345a = uthVar;
        }

        /* renamed from: a */
        public void m56854a(byte[] bArr, int i, int i2) {
            if (this.f54347c) {
                int i3 = this.f54350f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f54350f = i3 + (i2 - i);
                } else {
                    this.f54348d = ((bArr[i4] & 192) >> 6) == 0;
                    this.f54347c = false;
                }
            }
        }

        /* renamed from: b */
        public void m56855b(long j, int i, boolean z) {
            op0.m42517g(this.f54352h != -9223372036854775807L);
            if (this.f54349e == 182 && z && this.f54346b) {
                this.f54345a.mo7071a(this.f54352h, this.f54348d ? 1 : 0, (int) (j - this.f54351g), i, null);
            }
            if (this.f54349e != 179) {
                this.f54351g = j;
            }
        }

        /* renamed from: c */
        public void m56856c(int i, long j) {
            this.f54349e = i;
            this.f54348d = false;
            this.f54346b = i == 182 || i == 179;
            this.f54347c = i == 182;
            this.f54350f = 0;
            this.f54352h = j;
        }

        /* renamed from: d */
        public void m56857d() {
            this.f54346b = false;
            this.f54347c = false;
            this.f54348d = false;
            this.f54349e = -1;
        }
    }

    public xv7(adi adiVar) {
        this.f54328a = adiVar;
        if (adiVar != null) {
            this.f54332e = new hrb(Opcodes.GETSTATIC, 128);
            this.f54329b = new zwc();
        } else {
            this.f54332e = null;
            this.f54329b = null;
        }
    }

    /* renamed from: f */
    public static C2181a m56850f(C18248a c18248a, int i, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(c18248a.f54344e, c18248a.f54342c);
        ywc ywcVar = new ywc(bArrCopyOf);
        ywcVar.m58455s(i);
        ywcVar.m58455s(4);
        ywcVar.m58453q();
        ywcVar.m58454r(8);
        if (ywcVar.m58443g()) {
            ywcVar.m58454r(4);
            ywcVar.m58454r(3);
        }
        int iM58444h = ywcVar.m58444h(4);
        float f = 1.0f;
        if (iM58444h == 15) {
            int iM58444h2 = ywcVar.m58444h(8);
            int iM58444h3 = ywcVar.m58444h(8);
            if (iM58444h3 == 0) {
                ria.m46824h("H263Reader", "Invalid aspect ratio");
            } else {
                f = iM58444h2 / iM58444h3;
            }
        } else {
            float[] fArr = f54327l;
            if (iM58444h < fArr.length) {
                f = fArr[iM58444h];
            } else {
                ria.m46824h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (ywcVar.m58443g()) {
            ywcVar.m58454r(2);
            ywcVar.m58454r(1);
            if (ywcVar.m58443g()) {
                ywcVar.m58454r(15);
                ywcVar.m58453q();
                ywcVar.m58454r(15);
                ywcVar.m58453q();
                ywcVar.m58454r(15);
                ywcVar.m58453q();
                ywcVar.m58454r(3);
                ywcVar.m58454r(11);
                ywcVar.m58453q();
                ywcVar.m58454r(15);
                ywcVar.m58453q();
            }
        }
        if (ywcVar.m58444h(2) != 0) {
            ria.m46824h("H263Reader", "Unhandled video object layer shape");
        }
        ywcVar.m58453q();
        int iM58444h4 = ywcVar.m58444h(16);
        ywcVar.m58453q();
        if (ywcVar.m58443g()) {
            if (iM58444h4 == 0) {
                ria.m46824h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = iM58444h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                ywcVar.m58454r(i2);
            }
        }
        ywcVar.m58453q();
        int iM58444h5 = ywcVar.m58444h(13);
        ywcVar.m58453q();
        int iM58444h6 = ywcVar.m58444h(13);
        ywcVar.m58453q();
        ywcVar.m58453q();
        return new C2181a.b().a0(str).o0("video/mp4v-es").v0(iM58444h5).m6762Y(iM58444h6).k0(f).b0(Collections.singletonList(bArrCopyOf)).m6748K();
    }

    @Override // p001o.n46
    /* renamed from: a */
    public void mo24646a(zwc zwcVar) {
        op0.m42519i(this.f54333f);
        op0.m42519i(this.f54336i);
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        byte[] bArrM60024e = zwcVar.m60024e();
        this.f54334g += zwcVar.m60020a();
        this.f54336i.m52027e(zwcVar, zwcVar.m60020a());
        while (true) {
            int iM32614c = irb.m32614c(bArrM60024e, iM60025f, iM60026g, this.f54330c);
            if (iM32614c == iM60026g) {
                break;
            }
            int i = iM32614c + 3;
            int i2 = zwcVar.m60024e()[i] & 255;
            int i3 = iM32614c - iM60025f;
            int i4 = 0;
            if (!this.f54337j) {
                if (i3 > 0) {
                    this.f54331d.m56851a(bArrM60024e, iM60025f, iM32614c);
                }
                if (this.f54331d.m56852b(i2, i3 < 0 ? -i3 : 0)) {
                    uth uthVar = this.f54336i;
                    C18248a c18248a = this.f54331d;
                    uthVar.mo7072b(m56850f(c18248a, c18248a.f54343d, (String) op0.m42515e(this.f54335h)));
                    this.f54337j = true;
                }
            }
            this.f54333f.m56854a(bArrM60024e, iM60025f, iM32614c);
            hrb hrbVar = this.f54332e;
            if (hrbVar != null) {
                if (i3 > 0) {
                    hrbVar.m31014a(bArrM60024e, iM60025f, iM32614c);
                } else {
                    i4 = -i3;
                }
                if (this.f54332e.m31015b(i4)) {
                    hrb hrbVar2 = this.f54332e;
                    ((zwc) sqi.m48729h(this.f54329b)).m60015S(this.f54332e.f27397d, irb.m32629r(hrbVar2.f27397d, hrbVar2.f27398e));
                    ((adi) sqi.m48729h(this.f54328a)).m16933a(this.f54338k, this.f54329b);
                }
                if (i2 == 178 && zwcVar.m60024e()[iM32614c + 2] == 1) {
                    this.f54332e.m31018e(i2);
                }
            }
            int i5 = iM60026g - iM32614c;
            this.f54333f.m56855b(this.f54334g - i5, i5, this.f54337j);
            this.f54333f.m56856c(i2, this.f54338k);
            iM60025f = i;
        }
        if (!this.f54337j) {
            this.f54331d.m56851a(bArrM60024e, iM60025f, iM60026g);
        }
        this.f54333f.m56854a(bArrM60024e, iM60025f, iM60026g);
        hrb hrbVar3 = this.f54332e;
        if (hrbVar3 != null) {
            hrbVar3.m31014a(bArrM60024e, iM60025f, iM60026g);
        }
    }

    @Override // p001o.n46
    /* renamed from: b */
    public void mo24647b() {
        irb.m32612a(this.f54330c);
        this.f54331d.m56853c();
        C18249b c18249b = this.f54333f;
        if (c18249b != null) {
            c18249b.m56857d();
        }
        hrb hrbVar = this.f54332e;
        if (hrbVar != null) {
            hrbVar.m31017d();
        }
        this.f54334g = 0L;
        this.f54338k = -9223372036854775807L;
    }

    @Override // p001o.n46
    /* renamed from: c */
    public void mo24648c(boolean z) {
        op0.m42519i(this.f54333f);
        if (z) {
            this.f54333f.m56855b(this.f54334g, 0, this.f54337j);
            this.f54333f.m56857d();
        }
    }

    @Override // p001o.n46
    /* renamed from: d */
    public void mo24649d(vq6 vq6Var, hyh.C14129d c14129d) {
        c14129d.m31294a();
        this.f54335h = c14129d.m31295b();
        uth uthVarMo32487f = vq6Var.mo32487f(c14129d.m31296c(), 2);
        this.f54336i = uthVarMo32487f;
        this.f54333f = new C18249b(uthVarMo32487f);
        adi adiVar = this.f54328a;
        if (adiVar != null) {
            adiVar.m16934b(vq6Var, c14129d);
        }
    }

    @Override // p001o.n46
    /* renamed from: e */
    public void mo24650e(long j, int i) {
        this.f54338k = j;
    }
}
