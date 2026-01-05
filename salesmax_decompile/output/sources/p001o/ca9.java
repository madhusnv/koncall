package p001o;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class ca9 implements Closeable {

    /* renamed from: a */
    public int f17652a;

    /* renamed from: o.ca9$a */
    public enum EnumC12600a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        EnumC12600a(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (EnumC12600a enumC12600a : values()) {
                if (enumC12600a.enabledByDefault()) {
                    mask |= enumC12600a.getMask();
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

    public ca9(int i) {
        this.f17652a = i;
    }

    /* renamed from: C */
    public abstract String mo20614C();

    /* renamed from: D */
    public boolean m20615D(EnumC12600a enumC12600a) {
        return enumC12600a.enabledIn(this.f17652a);
    }

    /* renamed from: H */
    public abstract ya9 mo20616H();

    /* renamed from: J */
    public abstract ca9 mo20617J();

    /* renamed from: a */
    public ba9 m20618a(String str) {
        return new ba9(this, str).m18506c(null);
    }

    /* renamed from: c */
    public abstract BigInteger mo20619c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    /* renamed from: d */
    public byte m20620d() throws dj8 {
        int iMo20627s = mo20627s();
        if (iMo20627s < -128 || iMo20627s > 255) {
            throw new dj8(this, String.format("Numeric value (%s) out of range of Java byte", mo20614C()), ya9.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) iMo20627s;
    }

    /* renamed from: f */
    public abstract s99 mo20621f();

    /* renamed from: g */
    public abstract String mo20622g();

    /* renamed from: h */
    public abstract ya9 mo20623h();

    /* renamed from: k */
    public abstract BigDecimal mo20624k();

    /* renamed from: o */
    public abstract double mo20625o();

    /* renamed from: r */
    public abstract float mo20626r();

    /* renamed from: s */
    public abstract int mo20627s();

    /* renamed from: t */
    public abstract long mo20628t();

    /* renamed from: u */
    public short m20629u() throws dj8 {
        int iMo20627s = mo20627s();
        if (iMo20627s < -32768 || iMo20627s > 32767) {
            throw new dj8(this, String.format("Numeric value (%s) out of range of Java short", mo20614C()), ya9.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) iMo20627s;
    }
}
