package rk;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kk.C4083c;
import kk.EnumC4099s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rk.c */
/* loaded from: classes.dex */
public class C6566c implements Closeable, Flushable {

    /* renamed from: m */
    public static final Pattern f31439m = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: n */
    public static final String[] f31440n = new String[128];

    /* renamed from: p */
    public static final String[] f31441p;

    /* renamed from: a */
    public final Writer f31442a;

    /* renamed from: b */
    public int[] f31443b;

    /* renamed from: c */
    public int f31444c;

    /* renamed from: d */
    public C4083c f31445d;

    /* renamed from: e */
    public String f31446e;

    /* renamed from: f */
    public String f31447f;

    /* renamed from: g */
    public boolean f31448g;

    /* renamed from: h */
    public EnumC4099s f31449h;

    /* renamed from: j */
    public boolean f31450j;

    /* renamed from: k */
    public String f31451k;

    /* renamed from: l */
    public boolean f31452l;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f31440n[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f31440n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f31441p = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C6566c(Writer writer) {
        int[] iArr = new int[32];
        this.f31443b = iArr;
        this.f31444c = 0;
        if (iArr.length == 0) {
            this.f31443b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f31443b;
        int i10 = this.f31444c;
        this.f31444c = i10 + 1;
        iArr2[i10] = 6;
        this.f31449h = EnumC4099s.LEGACY_STRICT;
        this.f31452l = true;
        Objects.requireNonNull(writer, "out == null");
        this.f31442a = writer;
        m12584R(C4083c.f20961d);
    }

    /* renamed from: A */
    public void mo10028A(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f31451k != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM12583P = m12583P();
        if (iM12583P != 3 && iM12583P != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f31451k = str;
    }

    public final void A0() throws IOException {
        if (this.f31451k != null) {
            int iM12583P = m12583P();
            if (iM12583P == 5) {
                this.f31442a.write(this.f31447f);
            } else if (iM12583P != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m12582H();
            this.f31443b[this.f31444c - 1] = 4;
            m12586U(this.f31451k);
            this.f31451k = null;
        }
    }

    /* renamed from: H */
    public final void m12582H() throws IOException {
        if (this.f31448g) {
            return;
        }
        String str = this.f31445d.f20962a;
        Writer writer = this.f31442a;
        writer.write(str);
        int i10 = this.f31444c;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f31445d.f20963b);
        }
    }

    /* renamed from: J */
    public C6566c mo10029J() throws IOException {
        if (this.f31451k != null) {
            if (!this.f31452l) {
                this.f31451k = null;
                return this;
            }
            A0();
        }
        m12587h();
        this.f31442a.write("null");
        return this;
    }

    /* renamed from: P */
    public final int m12583P() {
        int i10 = this.f31444c;
        if (i10 != 0) {
            return this.f31443b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: R */
    public final void m12584R(C4083c c4083c) {
        Objects.requireNonNull(c4083c);
        this.f31445d = c4083c;
        this.f31447f = ",";
        if (c4083c.f20964c) {
            this.f31446e = ": ";
            if (c4083c.f20962a.isEmpty()) {
                this.f31447f = ", ";
            }
        } else {
            this.f31446e = ":";
        }
        this.f31448g = this.f31445d.f20962a.isEmpty() && this.f31445d.f20963b.isEmpty();
    }

    /* renamed from: S */
    public final void m12585S(EnumC4099s enumC4099s) {
        Objects.requireNonNull(enumC4099s);
        this.f31449h = enumC4099s;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12586U(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f31450j
            if (r0 == 0) goto L7
            java.lang.String[] r0 = rk.C6566c.f31441p
            goto L9
        L7:
            java.lang.String[] r0 = rk.C6566c.f31440n
        L9:
            java.io.Writer r1 = r8.f31442a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.C6566c.m12586U(java.lang.String):void");
    }

    public void a0(double d2) throws IOException {
        A0();
        if (this.f31449h == EnumC4099s.LENIENT || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            m12587h();
            this.f31442a.append((CharSequence) Double.toString(d2));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31442a.close();
        int i10 = this.f31444c;
        if (i10 > 1 || (i10 == 1 && this.f31443b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f31444c = 0;
    }

    public void f0(long j6) throws IOException {
        A0();
        m12587h();
        this.f31442a.write(Long.toString(j6));
    }

    public void flush() throws IOException {
        if (this.f31444c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f31442a.flush();
    }

    /* renamed from: h */
    public final void m12587h() throws IOException {
        int iM12583P = m12583P();
        if (iM12583P == 1) {
            this.f31443b[this.f31444c - 1] = 2;
            m12582H();
            return;
        }
        Writer writer = this.f31442a;
        if (iM12583P == 2) {
            writer.append((CharSequence) this.f31447f);
            m12582H();
        } else {
            if (iM12583P == 4) {
                writer.append((CharSequence) this.f31446e);
                this.f31443b[this.f31444c - 1] = 5;
                return;
            }
            if (iM12583P != 6) {
                if (iM12583P != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f31449h != EnumC4099s.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f31443b[this.f31444c - 1] = 7;
        }
    }

    /* renamed from: j */
    public void mo10030j() throws IOException {
        A0();
        m12587h();
        int i10 = this.f31444c;
        int[] iArr = this.f31443b;
        if (i10 == iArr.length) {
            this.f31443b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f31443b;
        int i11 = this.f31444c;
        this.f31444c = i11 + 1;
        iArr2[i11] = 1;
        this.f31442a.write(91);
    }

    /* renamed from: n */
    public void mo10031n() throws IOException {
        A0();
        m12587h();
        int i10 = this.f31444c;
        int[] iArr = this.f31443b;
        if (i10 == iArr.length) {
            this.f31443b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f31443b;
        int i11 = this.f31444c;
        this.f31444c = i11 + 1;
        iArr2[i11] = 3;
        this.f31442a.write(123);
    }

    public void o0(Boolean bool) throws IOException {
        if (bool == null) {
            mo10029J();
            return;
        }
        A0();
        m12587h();
        this.f31442a.write(bool.booleanValue() ? "true" : "false");
    }

    public void t0(Number number) throws IOException {
        if (number == null) {
            mo10029J();
            return;
        }
        A0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f31449h != EnumC4099s.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f31439m.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m12587h();
        this.f31442a.append((CharSequence) string);
    }

    /* renamed from: u */
    public final void m12588u(int i10, int i11, char c2) throws IOException {
        int iM12583P = m12583P();
        if (iM12583P != i11 && iM12583P != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f31451k != null) {
            throw new IllegalStateException("Dangling name: " + this.f31451k);
        }
        this.f31444c--;
        if (iM12583P == i11) {
            m12582H();
        }
        this.f31442a.write(c2);
    }

    public void v0(String str) throws IOException {
        if (str == null) {
            mo10029J();
            return;
        }
        A0();
        m12587h();
        m12586U(str);
    }

    /* renamed from: w */
    public void mo10032w() throws IOException {
        m12588u(1, 2, ']');
    }

    public void w0(boolean z6) throws IOException {
        A0();
        m12587h();
        this.f31442a.write(z6 ? "true" : "false");
    }

    /* renamed from: z */
    public void mo10033z() throws IOException {
        m12588u(3, 5, '}');
    }
}
