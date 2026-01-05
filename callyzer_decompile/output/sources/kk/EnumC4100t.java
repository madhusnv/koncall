package kk;

import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import i0.m0;
import java.io.IOException;
import java.math.BigDecimal;
import mk.AbstractC4770i;
import mk.C4772k;
import rk.C6564a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.t */
/* loaded from: classes.dex */
public abstract class EnumC4100t implements InterfaceC4101u {
    private static final /* synthetic */ EnumC4100t[] $VALUES;
    public static final EnumC4100t BIG_DECIMAL;
    public static final EnumC4100t DOUBLE;
    public static final EnumC4100t LAZILY_PARSED_NUMBER;
    public static final EnumC4100t LONG_OR_DOUBLE;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: kk.t$a */
    public enum a extends EnumC4100t {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // kk.EnumC4100t, kk.InterfaceC4101u
        public Double readNumber(C6564a c6564a) {
            return Double.valueOf(c6564a.f0());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        EnumC4100t enumC4100t = new EnumC4100t("LAZILY_PARSED_NUMBER", 1) { // from class: kk.t.b
            {
                a aVar2 = null;
            }

            @Override // kk.EnumC4100t, kk.InterfaceC4101u
            public Number readNumber(C6564a c6564a) {
                return new C4772k(c6564a.C0());
            }
        };
        LAZILY_PARSED_NUMBER = enumC4100t;
        EnumC4100t enumC4100t2 = new EnumC4100t("LONG_OR_DOUBLE", 2) { // from class: kk.t.c
            {
                a aVar2 = null;
            }

            private Number parseAsDouble(String str, C6564a c6564a) throws MalformedJsonException, NumberFormatException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!(c6564a.f31424b == EnumC4099s.LENIENT)) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c6564a.mo10022P());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e2) {
                    StringBuilder sbM7383p = m0.m7383p("Cannot parse ", str, "; at path ");
                    sbM7383p.append(c6564a.mo10022P());
                    throw new JsonParseException(sbM7383p.toString(), e2);
                }
            }

            @Override // kk.EnumC4100t, kk.InterfaceC4101u
            public Number readNumber(C6564a c6564a) throws IOException {
                String strC0 = c6564a.C0();
                if (strC0.indexOf(46) >= 0) {
                    return parseAsDouble(strC0, c6564a);
                }
                try {
                    return Long.valueOf(Long.parseLong(strC0));
                } catch (NumberFormatException unused) {
                    return parseAsDouble(strC0, c6564a);
                }
            }
        };
        LONG_OR_DOUBLE = enumC4100t2;
        EnumC4100t enumC4100t3 = new EnumC4100t("BIG_DECIMAL", 3) { // from class: kk.t.d
            {
                a aVar2 = null;
            }

            @Override // kk.EnumC4100t, kk.InterfaceC4101u
            public BigDecimal readNumber(C6564a c6564a) throws IOException {
                String strC0 = c6564a.C0();
                try {
                    return AbstractC4770i.m9697j(strC0);
                } catch (NumberFormatException e2) {
                    StringBuilder sbM7383p = m0.m7383p("Cannot parse ", strC0, "; at path ");
                    sbM7383p.append(c6564a.mo10022P());
                    throw new JsonParseException(sbM7383p.toString(), e2);
                }
            }
        };
        BIG_DECIMAL = enumC4100t3;
        $VALUES = new EnumC4100t[]{aVar, enumC4100t, enumC4100t2, enumC4100t3};
    }

    private EnumC4100t(String str, int i10) {
    }

    public static EnumC4100t valueOf(String str) {
        return (EnumC4100t) Enum.valueOf(EnumC4100t.class, str);
    }

    public static EnumC4100t[] values() {
        return (EnumC4100t[]) $VALUES.clone();
    }

    @Override // kk.InterfaceC4101u
    public abstract /* synthetic */ Number readNumber(C6564a c6564a);

    public /* synthetic */ EnumC4100t(String str, int i10, a aVar) {
        this(str, i10);
    }
}
