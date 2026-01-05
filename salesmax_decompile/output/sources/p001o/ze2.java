package p001o;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import p001o.cd4;
import p001o.ze2;

/* loaded from: classes2.dex */
public final class ze2 extends bf2 {

    /* renamed from: h */
    public final zwc f57049h = new zwc();

    /* renamed from: i */
    public final ywc f57050i = new ywc();

    /* renamed from: j */
    public int f57051j = -1;

    /* renamed from: k */
    public final boolean f57052k;

    /* renamed from: l */
    public final int f57053l;

    /* renamed from: m */
    public final C18623b[] f57054m;

    /* renamed from: n */
    public C18623b f57055n;

    /* renamed from: o */
    public List f57056o;

    /* renamed from: p */
    public List f57057p;

    /* renamed from: q */
    public C18624c f57058q;

    /* renamed from: r */
    public int f57059r;

    /* renamed from: o.ze2$a */
    public static final class C18622a {

        /* renamed from: c */
        public static final Comparator f57060c = new Comparator() { // from class: o.ye2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ze2.C18622a.m59305c((ze2.C18622a) obj, (ze2.C18622a) obj2);
            }
        };

        /* renamed from: a */
        public final cd4 f57061a;

        /* renamed from: b */
        public final int f57062b;

        public C18622a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            cd4.C12641b c12641bM20932n = new cd4.C12641b().m20933o(charSequence).m20934p(alignment).m20926h(f, i).m20927i(i2).m20929k(f2).m20930l(i3).m20932n(f3);
            if (z) {
                c12641bM20932n.m20937s(i4);
            }
            this.f57061a = c12641bM20932n.m20919a();
            this.f57062b = i5;
        }

        /* renamed from: c */
        public static /* synthetic */ int m59305c(C18622a c18622a, C18622a c18622a2) {
            return Integer.compare(c18622a2.f57062b, c18622a.f57062b);
        }
    }

    /* renamed from: o.ze2$b */
    public static final class C18623b {

        /* renamed from: A */
        public static final int[] f57063A;

        /* renamed from: B */
        public static final boolean[] f57064B;

        /* renamed from: C */
        public static final int[] f57065C;

        /* renamed from: D */
        public static final int[] f57066D;

        /* renamed from: E */
        public static final int[] f57067E;

        /* renamed from: F */
        public static final int[] f57068F;

        /* renamed from: v */
        public static final int f57069v = m59307h(2, 2, 2, 0);

        /* renamed from: w */
        public static final int f57070w;

        /* renamed from: x */
        public static final int f57071x;

        /* renamed from: y */
        public static final int[] f57072y;

        /* renamed from: z */
        public static final int[] f57073z;

        /* renamed from: a */
        public final List f57074a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f57075b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f57076c;

        /* renamed from: d */
        public boolean f57077d;

        /* renamed from: e */
        public int f57078e;

        /* renamed from: f */
        public boolean f57079f;

        /* renamed from: g */
        public int f57080g;

        /* renamed from: h */
        public int f57081h;

        /* renamed from: i */
        public int f57082i;

        /* renamed from: j */
        public int f57083j;

        /* renamed from: k */
        public int f57084k;

        /* renamed from: l */
        public int f57085l;

        /* renamed from: m */
        public int f57086m;

        /* renamed from: n */
        public int f57087n;

        /* renamed from: o */
        public int f57088o;

        /* renamed from: p */
        public int f57089p;

        /* renamed from: q */
        public int f57090q;

        /* renamed from: r */
        public int f57091r;

        /* renamed from: s */
        public int f57092s;

        /* renamed from: t */
        public int f57093t;

        /* renamed from: u */
        public int f57094u;

        static {
            int iM59307h = m59307h(0, 0, 0, 0);
            f57070w = iM59307h;
            int iM59307h2 = m59307h(0, 0, 0, 3);
            f57071x = iM59307h2;
            f57072y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f57073z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f57063A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f57064B = new boolean[]{false, false, false, true, true, true, false};
            f57065C = new int[]{iM59307h, iM59307h2, iM59307h, iM59307h, iM59307h2, iM59307h, iM59307h};
            f57066D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f57067E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f57068F = new int[]{iM59307h, iM59307h, iM59307h, iM59307h, iM59307h, iM59307h2, iM59307h2};
        }

        public C18623b() {
            m59317l();
        }

        /* renamed from: g */
        public static int m59306g(int i, int i2, int i3) {
            return m59307h(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m59307h(int i, int i2, int i3, int i4) {
            int i5;
            op0.m42513c(i, 0, 4);
            op0.m42513c(i2, 0, 4);
            op0.m42513c(i3, 0, 4);
            op0.m42513c(i4, 0, 4);
            if (i4 == 0 || i4 == 1) {
                i5 = 255;
            } else if (i4 == 2) {
                i5 = Opcodes.LAND;
            } else if (i4 == 3) {
                i5 = 0;
            }
            return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        /* renamed from: a */
        public void m59308a(char c) {
            if (c != '\n') {
                this.f57075b.append(c);
                return;
            }
            this.f57074a.add(m59311d());
            this.f57075b.clear();
            if (this.f57088o != -1) {
                this.f57088o = 0;
            }
            if (this.f57089p != -1) {
                this.f57089p = 0;
            }
            if (this.f57090q != -1) {
                this.f57090q = 0;
            }
            if (this.f57092s != -1) {
                this.f57092s = 0;
            }
            while (true) {
                if (this.f57074a.size() < this.f57083j && this.f57074a.size() < 15) {
                    this.f57094u = this.f57074a.size();
                    return;
                }
                this.f57074a.remove(0);
            }
        }

        /* renamed from: b */
        public void m59309b() {
            int length = this.f57075b.length();
            if (length > 0) {
                this.f57075b.delete(length - 1, length);
            }
        }

        /* renamed from: c */
        public C18622a m59310c() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (m59315j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.f57074a.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f57074a.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) m59311d());
            int i2 = this.f57084k;
            if (i2 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f57084k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f57079f) {
                f = this.f57081h / 99.0f;
                f2 = this.f57080g / 99.0f;
            } else {
                f = this.f57081h / 209.0f;
                f2 = this.f57080g / 74.0f;
            }
            float f3 = (f * 0.9f) + 0.05f;
            float f4 = (f2 * 0.9f) + 0.05f;
            int i3 = this.f57082i;
            return new C18622a(spannableStringBuilder, alignment2, f4, 0, i3 / 3 == 0 ? 0 : i3 / 3 == 1 ? 1 : 2, f3, i3 % 3 == 0 ? 0 : i3 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f57087n != f57070w, this.f57087n, this.f57078e);
        }

        /* renamed from: d */
        public SpannableString m59311d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f57075b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f57088o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f57088o, length, 33);
                }
                if (this.f57089p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f57089p, length, 33);
                }
                if (this.f57090q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f57091r), this.f57090q, length, 33);
                }
                if (this.f57092s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f57093t), this.f57092s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void m59312e() {
            this.f57074a.clear();
            this.f57075b.clear();
            this.f57088o = -1;
            this.f57089p = -1;
            this.f57090q = -1;
            this.f57092s = -1;
            this.f57094u = 0;
        }

        /* renamed from: f */
        public void m59313f(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f57076c = true;
            this.f57077d = z;
            this.f57078e = i;
            this.f57079f = z2;
            this.f57080g = i2;
            this.f57081h = i3;
            this.f57082i = i5;
            int i8 = i4 + 1;
            if (this.f57083j != i8) {
                this.f57083j = i8;
                while (true) {
                    if (this.f57074a.size() < this.f57083j && this.f57074a.size() < 15) {
                        break;
                    } else {
                        this.f57074a.remove(0);
                    }
                }
            }
            if (i6 != 0 && this.f57085l != i6) {
                this.f57085l = i6;
                int i9 = i6 - 1;
                m59322q(f57065C[i9], f57071x, f57064B[i9], 0, f57073z[i9], f57063A[i9], f57072y[i9]);
            }
            if (i7 == 0 || this.f57086m == i7) {
                return;
            }
            this.f57086m = i7;
            int i10 = i7 - 1;
            m59318m(0, 1, 1, false, false, f57067E[i10], f57066D[i10]);
            m59319n(f57069v, f57068F[i10], f57070w);
        }

        /* renamed from: i */
        public boolean m59314i() {
            return this.f57076c;
        }

        /* renamed from: j */
        public boolean m59315j() {
            return !m59314i() || (this.f57074a.isEmpty() && this.f57075b.length() == 0);
        }

        /* renamed from: k */
        public boolean m59316k() {
            return this.f57077d;
        }

        /* renamed from: l */
        public void m59317l() {
            m59312e();
            this.f57076c = false;
            this.f57077d = false;
            this.f57078e = 4;
            this.f57079f = false;
            this.f57080g = 0;
            this.f57081h = 0;
            this.f57082i = 0;
            this.f57083j = 15;
            this.f57084k = 0;
            this.f57085l = 0;
            this.f57086m = 0;
            int i = f57070w;
            this.f57087n = i;
            this.f57091r = f57069v;
            this.f57093t = i;
        }

        /* renamed from: m */
        public void m59318m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f57088o != -1) {
                if (!z) {
                    this.f57075b.setSpan(new StyleSpan(2), this.f57088o, this.f57075b.length(), 33);
                    this.f57088o = -1;
                }
            } else if (z) {
                this.f57088o = this.f57075b.length();
            }
            if (this.f57089p == -1) {
                if (z2) {
                    this.f57089p = this.f57075b.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f57075b.setSpan(new UnderlineSpan(), this.f57089p, this.f57075b.length(), 33);
                this.f57089p = -1;
            }
        }

        /* renamed from: n */
        public void m59319n(int i, int i2, int i3) {
            if (this.f57090q != -1 && this.f57091r != i) {
                this.f57075b.setSpan(new ForegroundColorSpan(this.f57091r), this.f57090q, this.f57075b.length(), 33);
            }
            if (i != f57069v) {
                this.f57090q = this.f57075b.length();
                this.f57091r = i;
            }
            if (this.f57092s != -1 && this.f57093t != i2) {
                this.f57075b.setSpan(new BackgroundColorSpan(this.f57093t), this.f57092s, this.f57075b.length(), 33);
            }
            if (i2 != f57070w) {
                this.f57092s = this.f57075b.length();
                this.f57093t = i2;
            }
        }

        /* renamed from: o */
        public void m59320o(int i, int i2) {
            if (this.f57094u != i) {
                m59308a('\n');
            }
            this.f57094u = i;
        }

        /* renamed from: p */
        public void m59321p(boolean z) {
            this.f57077d = z;
        }

        /* renamed from: q */
        public void m59322q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f57087n = i;
            this.f57084k = i6;
        }
    }

    /* renamed from: o.ze2$c */
    public static final class C18624c {

        /* renamed from: a */
        public final int f57095a;

        /* renamed from: b */
        public final int f57096b;

        /* renamed from: c */
        public final byte[] f57097c;

        /* renamed from: d */
        public int f57098d = 0;

        public C18624c(int i, int i2) {
            this.f57095a = i;
            this.f57096b = i2;
            this.f57097c = new byte[(i2 * 2) - 1];
        }
    }

    public ze2(int i, List list) {
        this.f57053l = i == -1 ? 1 : i;
        this.f57052k = list != null && hf3.m30325h(list);
        this.f57054m = new C18623b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f57054m[i2] = new C18623b();
        }
        this.f57055n = this.f57054m[0];
    }

    /* renamed from: A */
    public final void m59286A(int i) {
        if (i == 160) {
            this.f57055n.m59308a((char) 13252);
            return;
        }
        ria.m46824h("Cea708Decoder", "Invalid G3 character: " + i);
        this.f57055n.m59308a('_');
    }

    /* renamed from: B */
    public final void m59287B() {
        this.f57055n.m59318m(this.f57050i.m58444h(4), this.f57050i.m58444h(2), this.f57050i.m58444h(2), this.f57050i.m58443g(), this.f57050i.m58443g(), this.f57050i.m58444h(3), this.f57050i.m58444h(3));
    }

    /* renamed from: C */
    public final void m59288C() {
        int iM59307h = C18623b.m59307h(this.f57050i.m58444h(2), this.f57050i.m58444h(2), this.f57050i.m58444h(2), this.f57050i.m58444h(2));
        int iM59307h2 = C18623b.m59307h(this.f57050i.m58444h(2), this.f57050i.m58444h(2), this.f57050i.m58444h(2), this.f57050i.m58444h(2));
        this.f57050i.m58454r(2);
        this.f57055n.m59319n(iM59307h, iM59307h2, C18623b.m59306g(this.f57050i.m58444h(2), this.f57050i.m58444h(2), this.f57050i.m58444h(2)));
    }

    /* renamed from: D */
    public final void m59289D() {
        this.f57050i.m58454r(4);
        int iM58444h = this.f57050i.m58444h(4);
        this.f57050i.m58454r(2);
        this.f57055n.m59320o(iM58444h, this.f57050i.m58444h(6));
    }

    /* renamed from: E */
    public final void m59290E() {
        int iM59307h = C18623b.m59307h(this.f57050i.m58444h(2), this.f57050i.m58444h(2), this.f57050i.m58444h(2), this.f57050i.m58444h(2));
        int iM58444h = this.f57050i.m58444h(2);
        int iM59306g = C18623b.m59306g(this.f57050i.m58444h(2), this.f57050i.m58444h(2), this.f57050i.m58444h(2));
        if (this.f57050i.m58443g()) {
            iM58444h |= 4;
        }
        boolean zM58443g = this.f57050i.m58443g();
        int iM58444h2 = this.f57050i.m58444h(2);
        int iM58444h3 = this.f57050i.m58444h(2);
        int iM58444h4 = this.f57050i.m58444h(2);
        this.f57050i.m58454r(8);
        this.f57055n.m59322q(iM59307h, iM59306g, zM58443g, iM58444h, iM58444h2, iM58444h3, iM58444h4);
    }

    /* renamed from: F */
    public final void m59291F() {
        C18624c c18624c = this.f57058q;
        if (c18624c.f57098d != (c18624c.f57096b * 2) - 1) {
            ria.m46818b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f57058q.f57096b * 2) - 1) + ", but current index is " + this.f57058q.f57098d + " (sequence number " + this.f57058q.f57095a + ");");
        }
        ywc ywcVar = this.f57050i;
        C18624c c18624c2 = this.f57058q;
        ywcVar.m58451o(c18624c2.f57097c, c18624c2.f57098d);
        boolean z = false;
        while (true) {
            if (this.f57050i.m58438b() <= 0) {
                break;
            }
            int iM58444h = this.f57050i.m58444h(3);
            int iM58444h2 = this.f57050i.m58444h(5);
            if (iM58444h == 7) {
                this.f57050i.m58454r(2);
                iM58444h = this.f57050i.m58444h(6);
                if (iM58444h < 7) {
                    ria.m46824h("Cea708Decoder", "Invalid extended service number: " + iM58444h);
                }
            }
            if (iM58444h2 == 0) {
                if (iM58444h != 0) {
                    ria.m46824h("Cea708Decoder", "serviceNumber is non-zero (" + iM58444h + ") when blockSize is 0");
                }
            } else if (iM58444h != this.f57053l) {
                this.f57050i.m58455s(iM58444h2);
            } else {
                int iM58441e = this.f57050i.m58441e() + (iM58444h2 * 8);
                while (this.f57050i.m58441e() < iM58441e) {
                    int iM58444h3 = this.f57050i.m58444h(8);
                    if (iM58444h3 == 16) {
                        int iM58444h4 = this.f57050i.m58444h(8);
                        if (iM58444h4 <= 31) {
                            m59297u(iM58444h4);
                        } else {
                            if (iM58444h4 <= 127) {
                                m59302z(iM58444h4);
                            } else if (iM58444h4 <= 159) {
                                m59298v(iM58444h4);
                            } else if (iM58444h4 <= 255) {
                                m59286A(iM58444h4);
                            } else {
                                ria.m46824h("Cea708Decoder", "Invalid extended command: " + iM58444h4);
                            }
                            z = true;
                        }
                    } else if (iM58444h3 <= 31) {
                        m59295s(iM58444h3);
                    } else {
                        if (iM58444h3 <= 127) {
                            m59300x(iM58444h3);
                        } else if (iM58444h3 <= 159) {
                            m59296t(iM58444h3);
                        } else if (iM58444h3 <= 255) {
                            m59301y(iM58444h3);
                        } else {
                            ria.m46824h("Cea708Decoder", "Invalid base command: " + iM58444h3);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.f57056o = m59294r();
        }
    }

    /* renamed from: G */
    public final void m59292G() {
        for (int i = 0; i < 8; i++) {
            this.f57054m[i].m59317l();
        }
    }

    @Override // p001o.bf2, p001o.hbg
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo18814b(long j) {
        super.mo18814b(j);
    }

    @Override // p001o.bf2, p001o.x75
    public void flush() {
        super.flush();
        this.f57056o = null;
        this.f57057p = null;
        this.f57059r = 0;
        this.f57055n = this.f57054m[0];
        m59292G();
        this.f57058q = null;
    }

    @Override // p001o.bf2
    /* renamed from: g */
    public gbg mo18818g() {
        List list = this.f57056o;
        this.f57057p = list;
        return new cf2((List) op0.m42515e(list));
    }

    @Override // p001o.bf2
    /* renamed from: h */
    public void mo18819h(mbg mbgVar) {
        ByteBuffer byteBuffer = (ByteBuffer) op0.m42515e(mbgVar.f14282d);
        this.f57049h.m60015S(byteBuffer.array(), byteBuffer.limit());
        while (this.f57049h.m60020a() >= 3) {
            int iM60004H = this.f57049h.m60004H() & 7;
            int i = iM60004H & 3;
            boolean z = (iM60004H & 4) == 4;
            byte bM60004H = (byte) this.f57049h.m60004H();
            byte bM60004H2 = (byte) this.f57049h.m60004H();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m59293q();
                        int i2 = (bM60004H & 192) >> 6;
                        int i3 = this.f57051j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m59292G();
                            ria.m46824h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f57051j + " current=" + i2);
                        }
                        this.f57051j = i2;
                        int i4 = bM60004H & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C18624c c18624c = new C18624c(i2, i4);
                        this.f57058q = c18624c;
                        byte[] bArr = c18624c.f57097c;
                        int i5 = c18624c.f57098d;
                        c18624c.f57098d = i5 + 1;
                        bArr[i5] = bM60004H2;
                    } else {
                        op0.m42511a(i == 2);
                        C18624c c18624c2 = this.f57058q;
                        if (c18624c2 == null) {
                            ria.m46819c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c18624c2.f57097c;
                            int i6 = c18624c2.f57098d;
                            int i7 = i6 + 1;
                            bArr2[i6] = bM60004H;
                            c18624c2.f57098d = i7 + 1;
                            bArr2[i7] = bM60004H2;
                        }
                    }
                    C18624c c18624c3 = this.f57058q;
                    if (c18624c3.f57098d == (c18624c3.f57096b * 2) - 1) {
                        m59293q();
                    }
                }
            }
        }
    }

    @Override // p001o.bf2
    /* renamed from: i */
    public /* bridge */ /* synthetic */ mbg mo18817e() {
        return super.mo18817e();
    }

    @Override // p001o.bf2
    /* renamed from: j */
    public /* bridge */ /* synthetic */ nbg mo16896a() {
        return super.mo16896a();
    }

    @Override // p001o.bf2
    /* renamed from: m */
    public boolean mo18824m() {
        return this.f57056o != this.f57057p;
    }

    @Override // p001o.bf2
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void mo18815c(mbg mbgVar) {
        super.mo18815c(mbgVar);
    }

    /* renamed from: q */
    public final void m59293q() {
        if (this.f57058q == null) {
            return;
        }
        m59291F();
        this.f57058q = null;
    }

    /* renamed from: r */
    public final List m59294r() {
        C18622a c18622aM59310c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f57054m[i].m59315j() && this.f57054m[i].m59316k() && (c18622aM59310c = this.f57054m[i].m59310c()) != null) {
                arrayList.add(c18622aM59310c);
            }
        }
        Collections.sort(arrayList, C18622a.f57060c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C18622a) arrayList.get(i2)).f57061a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // p001o.bf2, p001o.x75
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    /* renamed from: s */
    public final void m59295s(int i) {
        if (i != 0) {
            if (i == 3) {
                this.f57056o = m59294r();
            }
            if (i == 8) {
                this.f57055n.m59309b();
                return;
            }
            switch (i) {
                case 12:
                    m59292G();
                    break;
                case 13:
                    this.f57055n.m59308a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        ria.m46824h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f57050i.m58454r(8);
                        break;
                    } else if (i >= 24 && i <= 31) {
                        ria.m46824h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f57050i.m58454r(16);
                        break;
                    } else {
                        ria.m46824h("Cea708Decoder", "Invalid C0 command: " + i);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: t */
    public final void m59296t(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case Opcodes.LOR /* 129 */:
            case 130:
            case Opcodes.LXOR /* 131 */:
            case Opcodes.IINC /* 132 */:
            case Opcodes.I2L /* 133 */:
            case Opcodes.I2F /* 134 */:
            case Opcodes.I2D /* 135 */:
                int i3 = i - 128;
                if (this.f57059r != i3) {
                    this.f57059r = i3;
                    this.f57055n = this.f57054m[i3];
                    break;
                }
                break;
            case Opcodes.L2I /* 136 */:
                while (i2 <= 8) {
                    if (this.f57050i.m58443g()) {
                        this.f57054m[8 - i2].m59312e();
                    }
                    i2++;
                }
                break;
            case Opcodes.L2F /* 137 */:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f57050i.m58443g()) {
                        this.f57054m[8 - i4].m59321p(true);
                    }
                }
                break;
            case Opcodes.L2D /* 138 */:
                while (i2 <= 8) {
                    if (this.f57050i.m58443g()) {
                        this.f57054m[8 - i2].m59321p(false);
                    }
                    i2++;
                }
                break;
            case Opcodes.F2I /* 139 */:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f57050i.m58443g()) {
                        this.f57054m[8 - i5].m59321p(!r0.m59316k());
                    }
                }
                break;
            case Opcodes.F2L /* 140 */:
                while (i2 <= 8) {
                    if (this.f57050i.m58443g()) {
                        this.f57054m[8 - i2].m59317l();
                    }
                    i2++;
                }
                break;
            case Opcodes.F2D /* 141 */:
                this.f57050i.m58454r(8);
                break;
            case Opcodes.D2I /* 142 */:
                break;
            case Opcodes.D2L /* 143 */:
                m59292G();
                break;
            case Opcodes.D2F /* 144 */:
                if (this.f57055n.m59314i()) {
                    m59287B();
                    break;
                } else {
                    this.f57050i.m58454r(16);
                    break;
                }
            case Opcodes.I2B /* 145 */:
                if (this.f57055n.m59314i()) {
                    m59288C();
                    break;
                } else {
                    this.f57050i.m58454r(24);
                    break;
                }
            case Opcodes.I2C /* 146 */:
                if (this.f57055n.m59314i()) {
                    m59289D();
                    break;
                } else {
                    this.f57050i.m58454r(16);
                    break;
                }
            case Opcodes.I2S /* 147 */:
            case Opcodes.LCMP /* 148 */:
            case Opcodes.FCMPL /* 149 */:
            case Opcodes.FCMPG /* 150 */:
            default:
                ria.m46824h("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case Opcodes.DCMPL /* 151 */:
                if (this.f57055n.m59314i()) {
                    m59290E();
                    break;
                } else {
                    this.f57050i.m58454r(32);
                    break;
                }
            case Opcodes.DCMPG /* 152 */:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case Opcodes.IF_ICMPEQ /* 159 */:
                int i6 = i - 152;
                m59299w(i6);
                if (this.f57059r != i6) {
                    this.f57059r = i6;
                    this.f57055n = this.f57054m[i6];
                    break;
                }
                break;
        }
    }

    /* renamed from: u */
    public final void m59297u(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.f57050i.m58454r(8);
        } else if (i <= 23) {
            this.f57050i.m58454r(16);
        } else if (i <= 31) {
            this.f57050i.m58454r(24);
        }
    }

    /* renamed from: v */
    public final void m59298v(int i) {
        if (i <= 135) {
            this.f57050i.m58454r(32);
            return;
        }
        if (i <= 143) {
            this.f57050i.m58454r(40);
        } else if (i <= 159) {
            this.f57050i.m58454r(2);
            this.f57050i.m58454r(this.f57050i.m58444h(6) * 8);
        }
    }

    /* renamed from: w */
    public final void m59299w(int i) {
        C18623b c18623b = this.f57054m[i];
        this.f57050i.m58454r(2);
        boolean zM58443g = this.f57050i.m58443g();
        this.f57050i.m58454r(2);
        int iM58444h = this.f57050i.m58444h(3);
        boolean zM58443g2 = this.f57050i.m58443g();
        int iM58444h2 = this.f57050i.m58444h(7);
        int iM58444h3 = this.f57050i.m58444h(8);
        int iM58444h4 = this.f57050i.m58444h(4);
        int iM58444h5 = this.f57050i.m58444h(4);
        this.f57050i.m58454r(2);
        this.f57050i.m58454r(6);
        this.f57050i.m58454r(2);
        c18623b.m59313f(zM58443g, iM58444h, zM58443g2, iM58444h2, iM58444h3, iM58444h5, iM58444h4, this.f57050i.m58444h(3), this.f57050i.m58444h(3));
    }

    /* renamed from: x */
    public final void m59300x(int i) {
        if (i == 127) {
            this.f57055n.m59308a((char) 9835);
        } else {
            this.f57055n.m59308a((char) (i & Constants.MAX_HOST_LENGTH));
        }
    }

    /* renamed from: y */
    public final void m59301y(int i) {
        this.f57055n.m59308a((char) (i & Constants.MAX_HOST_LENGTH));
    }

    /* renamed from: z */
    public final void m59302z(int i) {
        if (i == 32) {
            this.f57055n.m59308a(TokenParser.SP);
        }
        if (i == 33) {
            this.f57055n.m59308a((char) 160);
            return;
        }
        if (i == 37) {
            this.f57055n.m59308a((char) 8230);
            return;
        }
        if (i == 42) {
            this.f57055n.m59308a((char) 352);
            return;
        }
        if (i == 44) {
            this.f57055n.m59308a((char) 338);
            return;
        }
        if (i == 63) {
            this.f57055n.m59308a((char) 376);
            return;
        }
        if (i == 57) {
            this.f57055n.m59308a((char) 8482);
            return;
        }
        if (i == 58) {
            this.f57055n.m59308a((char) 353);
            return;
        }
        if (i == 60) {
            this.f57055n.m59308a((char) 339);
            return;
        }
        if (i == 61) {
            this.f57055n.m59308a((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.f57055n.m59308a((char) 9608);
                break;
            case 49:
                this.f57055n.m59308a((char) 8216);
                break;
            case 50:
                this.f57055n.m59308a((char) 8217);
                break;
            case 51:
                this.f57055n.m59308a((char) 8220);
                break;
            case 52:
                this.f57055n.m59308a((char) 8221);
                break;
            case 53:
                this.f57055n.m59308a((char) 8226);
                break;
            default:
                switch (i) {
                    case Opcodes.FNEG /* 118 */:
                        this.f57055n.m59308a((char) 8539);
                        break;
                    case Opcodes.DNEG /* 119 */:
                        this.f57055n.m59308a((char) 8540);
                        break;
                    case 120:
                        this.f57055n.m59308a((char) 8541);
                        break;
                    case Opcodes.LSHL /* 121 */:
                        this.f57055n.m59308a((char) 8542);
                        break;
                    case 122:
                        this.f57055n.m59308a((char) 9474);
                        break;
                    case Opcodes.LSHR /* 123 */:
                        this.f57055n.m59308a((char) 9488);
                        break;
                    case 124:
                        this.f57055n.m59308a((char) 9492);
                        break;
                    case Opcodes.LUSHR /* 125 */:
                        this.f57055n.m59308a((char) 9472);
                        break;
                    case 126:
                        this.f57055n.m59308a((char) 9496);
                        break;
                    case Opcodes.LAND /* 127 */:
                        this.f57055n.m59308a((char) 9484);
                        break;
                    default:
                        ria.m46824h("Cea708Decoder", "Invalid G2 character: " + i);
                        break;
                }
        }
    }
}
