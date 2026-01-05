package p001o;

import java.math.BigDecimal;
import p001o.b99;

/* loaded from: classes5.dex */
public abstract class ao7 extends b99 {

    /* renamed from: f */
    public static final int f15065f = (b99.EnumC12329a.WRITE_NUMBERS_AS_STRINGS.getMask() | b99.EnumC12329a.ESCAPE_NON_ASCII.getMask()) | b99.EnumC12329a.STRICT_DUPLICATE_DETECTION.getMask();

    /* renamed from: b */
    public int f15066b;

    /* renamed from: c */
    public boolean f15067c;

    /* renamed from: d */
    public fb9 f15068d;

    /* renamed from: e */
    public boolean f15069e;

    public ao7(int i, i6c i6cVar) {
        this.f15066b = i;
        this.f15068d = fb9.m26379l(b99.EnumC12329a.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? i16.m31356e(this) : null);
        this.f15067c = b99.EnumC12329a.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    @Override // p001o.b99, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15069e = true;
    }

    public String f0(BigDecimal bigDecimal) throws a99 {
        if (!b99.EnumC12329a.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.f15066b)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale < -9999 || iScale > 9999) {
            m18448a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    @Override // p001o.b99
    /* renamed from: g */
    public b99 mo17557g() {
        return m18450d() != null ? this : m18451f(j0());
    }

    public ugd j0() {
        return new cg5();
    }

    public final int k0(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            m18448a("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2));
        }
        return ((i - 55296) << 10) + 65536 + (i2 - 56320);
    }

    public pa9 l0() {
        return this.f15068d;
    }

    public final boolean o0(b99.EnumC12329a enumC12329a) {
        return (enumC12329a.getMask() & this.f15066b) != 0;
    }
}
