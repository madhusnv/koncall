package p001o;

import java.io.Closeable;
import java.io.Flushable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class b99 implements Closeable, Flushable {

    /* renamed from: a */
    public ugd f15796a;

    /* renamed from: o.b99$a */
    public enum EnumC12329a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        EnumC12329a(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (EnumC12329a enumC12329a : values()) {
                if (enumC12329a.enabledByDefault()) {
                    mask |= enumC12329a.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    /* renamed from: C */
    public abstract void mo18437C(int i);

    /* renamed from: D */
    public abstract void mo18438D(long j);

    /* renamed from: H */
    public abstract void mo18439H(String str);

    /* renamed from: J */
    public abstract void mo18440J(BigDecimal bigDecimal);

    /* renamed from: K */
    public abstract void mo18441K(BigInteger bigInteger);

    /* renamed from: O */
    public abstract void mo18442O(char c);

    /* renamed from: Q */
    public abstract void mo18443Q(String str);

    /* renamed from: S */
    public abstract void mo18444S(eff effVar);

    /* renamed from: T */
    public abstract void mo18445T(char[] cArr, int i, int i2);

    /* renamed from: X */
    public abstract void mo18446X();

    /* renamed from: Y */
    public abstract void mo18447Y();

    /* renamed from: a */
    public void m18448a(String str) throws a99 {
        throw new a99(str, this);
    }

    /* renamed from: c */
    public final void m18449c() {
        uti.m52028a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    /* renamed from: d */
    public ugd m18450d() {
        return this.f15796a;
    }

    public abstract void d0(String str);

    /* renamed from: f */
    public b99 m18451f(ugd ugdVar) {
        this.f15796a = ugdVar;
        return this;
    }

    @Override // java.io.Flushable
    public abstract void flush();

    /* renamed from: g */
    public abstract b99 mo17557g();

    /* renamed from: h */
    public abstract void mo18452h(boolean z);

    /* renamed from: k */
    public abstract void mo18453k();

    /* renamed from: o */
    public abstract void mo18454o();

    /* renamed from: r */
    public abstract void mo18455r(String str);

    /* renamed from: s */
    public abstract void mo18456s();

    /* renamed from: t */
    public abstract void mo18457t(double d);

    /* renamed from: u */
    public abstract void mo18458u(float f);
}
