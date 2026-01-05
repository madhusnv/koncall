package r6;

import androidx.datastore.preferences.protobuf.AbstractC0332w;
import androidx.datastore.preferences.protobuf.AbstractC0335z;
import androidx.datastore.preferences.protobuf.C0312g;
import androidx.datastore.preferences.protobuf.C0333x;
import androidx.datastore.preferences.protobuf.EnumC0334y;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.z0;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r6.j */
/* loaded from: classes.dex */
public final class C6481j extends AbstractC0335z {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C6481j DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile u0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C6481j c6481j = new C6481j();
        DEFAULT_INSTANCE = c6481j;
        AbstractC0335z.m1079j(C6481j.class, c6481j);
    }

    /* renamed from: D */
    public static C6479h m12464D() {
        C6481j c6481j = DEFAULT_INSTANCE;
        c6481j.getClass();
        return (C6479h) ((AbstractC0332w) c6481j.mo1080c(EnumC0334y.NEW_BUILDER));
    }

    /* renamed from: l */
    public static void m12465l(C6481j c6481j, long j6) {
        c6481j.valueCase_ = 4;
        c6481j.value_ = Long.valueOf(j6);
    }

    /* renamed from: m */
    public static void m12466m(C6481j c6481j, String str) {
        c6481j.getClass();
        c6481j.valueCase_ = 5;
        c6481j.value_ = str;
    }

    /* renamed from: n */
    public static void m12467n(C6481j c6481j, C6478g c6478g) {
        c6481j.getClass();
        c6481j.value_ = c6478g;
        c6481j.valueCase_ = 6;
    }

    /* renamed from: o */
    public static void m12468o(C6481j c6481j, double d2) {
        c6481j.valueCase_ = 7;
        c6481j.value_ = Double.valueOf(d2);
    }

    /* renamed from: p */
    public static void m12469p(C6481j c6481j, C0312g c0312g) {
        c6481j.getClass();
        c6481j.valueCase_ = 8;
        c6481j.value_ = c0312g;
    }

    /* renamed from: q */
    public static void m12470q(C6481j c6481j, boolean z6) {
        c6481j.valueCase_ = 1;
        c6481j.value_ = Boolean.valueOf(z6);
    }

    /* renamed from: r */
    public static void m12471r(C6481j c6481j, float f6) {
        c6481j.valueCase_ = 2;
        c6481j.value_ = Float.valueOf(f6);
    }

    /* renamed from: s */
    public static void m12472s(C6481j c6481j, int i10) {
        c6481j.valueCase_ = 3;
        c6481j.value_ = Integer.valueOf(i10);
    }

    /* renamed from: v */
    public static C6481j m12473v() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A */
    public final String m12474A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* renamed from: B */
    public final C6478g m12475B() {
        return this.valueCase_ == 6 ? (C6478g) this.value_ : C6478g.m12461m();
    }

    /* renamed from: C */
    public final EnumC6480i m12476C() {
        return EnumC6480i.forNumber(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0335z
    /* renamed from: c */
    public final Object mo1080c(EnumC0334y enumC0334y) {
        u0 c0333x;
        switch (AbstractC6473b.f31143a[enumC0334y.ordinal()]) {
            case 1:
                return new C6481j();
            case 2:
                return new C6479h(DEFAULT_INSTANCE);
            case 3:
                return new z0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C6478g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (C6481j.class) {
                    try {
                        c0333x = PARSER;
                        if (c0333x == null) {
                            c0333x = new C0333x();
                            PARSER = c0333x;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return c0333x;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: t */
    public final boolean m12477t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: u */
    public final C0312g m12478u() {
        return this.valueCase_ == 8 ? (C0312g) this.value_ : C0312g.f2325c;
    }

    /* renamed from: w */
    public final double m12479w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: x */
    public final float m12480x() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: y */
    public final int m12481y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: z */
    public final long m12482z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
