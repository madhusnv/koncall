package nk;

import com.google.gson.stream.MalformedJsonException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kk.C4090j;
import kk.C4093m;
import kk.C4094n;
import kk.C4095o;
import kk.EnumC4099s;
import mk.C4774m;
import rk.C6564a;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.q */
/* loaded from: classes.dex */
public final class C5094q extends C6564a {

    /* renamed from: x */
    public static final C5092o f24970x = new C5092o();

    /* renamed from: y */
    public static final Object f24971y = new Object();

    /* renamed from: s */
    public Object[] f24972s;

    /* renamed from: t */
    public int f24973t;

    /* renamed from: v */
    public String[] f24974v;

    /* renamed from: w */
    public int[] f24975w;

    @Override // rk.C6564a
    public final void A0() {
        O0(EnumC6565b.NULL);
        T0();
        int i10 = this.f24973t;
        if (i10 > 0) {
            int[] iArr = this.f24975w;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // rk.C6564a
    public final String C0() {
        EnumC6565b enumC6565bE0 = E0();
        EnumC6565b enumC6565b = EnumC6565b.STRING;
        if (enumC6565bE0 != enumC6565b && enumC6565bE0 != EnumC6565b.NUMBER) {
            throw new IllegalStateException("Expected " + enumC6565b + " but was " + enumC6565bE0 + Q0());
        }
        String strMo8868c = ((C4095o) T0()).mo8868c();
        int i10 = this.f24973t;
        if (i10 > 0) {
            int[] iArr = this.f24975w;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return strMo8868c;
    }

    @Override // rk.C6564a
    public final EnumC6565b E0() {
        if (this.f24973t == 0) {
            return EnumC6565b.END_DOCUMENT;
        }
        Object objS0 = S0();
        if (objS0 instanceof Iterator) {
            boolean z6 = this.f24972s[this.f24973t - 2] instanceof C4094n;
            Iterator it = (Iterator) objS0;
            if (!it.hasNext()) {
                return z6 ? EnumC6565b.END_OBJECT : EnumC6565b.END_ARRAY;
            }
            if (z6) {
                return EnumC6565b.NAME;
            }
            U0(it.next());
            return E0();
        }
        if (objS0 instanceof C4094n) {
            return EnumC6565b.BEGIN_OBJECT;
        }
        if (objS0 instanceof C4090j) {
            return EnumC6565b.BEGIN_ARRAY;
        }
        if (objS0 instanceof C4095o) {
            Serializable serializable = ((C4095o) objS0).f20999a;
            if (serializable instanceof String) {
                return EnumC6565b.STRING;
            }
            if (serializable instanceof Boolean) {
                return EnumC6565b.BOOLEAN;
            }
            if (serializable instanceof Number) {
                return EnumC6565b.NUMBER;
            }
            throw new AssertionError();
        }
        if (objS0 instanceof C4093m) {
            return EnumC6565b.NULL;
        }
        if (objS0 == f24971y) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objS0.getClass().getName() + " is not supported");
    }

    @Override // rk.C6564a
    /* renamed from: H */
    public final String mo10021H() {
        return P0(false);
    }

    @Override // rk.C6564a
    public final void L0() {
        int i10 = AbstractC5093p.f24969a[E0().ordinal()];
        if (i10 == 1) {
            R0(true);
            return;
        }
        if (i10 == 2) {
            mo10026w();
            return;
        }
        if (i10 == 3) {
            mo10027z();
            return;
        }
        if (i10 != 4) {
            T0();
            int i11 = this.f24973t;
            if (i11 > 0) {
                int[] iArr = this.f24975w;
                int i12 = i11 - 1;
                iArr[i12] = iArr[i12] + 1;
            }
        }
    }

    public final void O0(EnumC6565b enumC6565b) {
        if (E0() == enumC6565b) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC6565b + " but was " + E0() + Q0());
    }

    @Override // rk.C6564a
    /* renamed from: P */
    public final String mo10022P() {
        return P0(true);
    }

    public final String P0(boolean z6) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f24973t;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f24972s;
            Object obj = objArr[i10];
            if (obj instanceof C4090j) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    int i12 = this.f24975w[i10];
                    if (z6 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
            } else if ((obj instanceof C4094n) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f24974v[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    public final String Q0() {
        return " at path " + P0(false);
    }

    @Override // rk.C6564a
    /* renamed from: R */
    public final boolean mo10023R() {
        EnumC6565b enumC6565bE0 = E0();
        return (enumC6565bE0 == EnumC6565b.END_OBJECT || enumC6565bE0 == EnumC6565b.END_ARRAY || enumC6565bE0 == EnumC6565b.END_DOCUMENT) ? false : true;
    }

    public final String R0(boolean z6) {
        O0(EnumC6565b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) S0()).next();
        String str = (String) entry.getKey();
        this.f24974v[this.f24973t - 1] = z6 ? "<skipped>" : str;
        U0(entry.getValue());
        return str;
    }

    public final Object S0() {
        return this.f24972s[this.f24973t - 1];
    }

    public final Object T0() {
        Object[] objArr = this.f24972s;
        int i10 = this.f24973t - 1;
        this.f24973t = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void U0(Object obj) {
        int i10 = this.f24973t;
        Object[] objArr = this.f24972s;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f24972s = Arrays.copyOf(objArr, i11);
            this.f24975w = Arrays.copyOf(this.f24975w, i11);
            this.f24974v = (String[]) Arrays.copyOf(this.f24974v, i11);
        }
        Object[] objArr2 = this.f24972s;
        int i12 = this.f24973t;
        this.f24973t = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // rk.C6564a
    public final boolean a0() {
        O0(EnumC6565b.BOOLEAN);
        boolean zM8873g = ((C4095o) T0()).m8873g();
        int i10 = this.f24973t;
        if (i10 > 0) {
            int[] iArr = this.f24975w;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zM8873g;
    }

    @Override // rk.C6564a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24972s = new Object[]{f24971y};
        this.f24973t = 1;
    }

    @Override // rk.C6564a
    public final double f0() throws MalformedJsonException {
        EnumC6565b enumC6565bE0 = E0();
        EnumC6565b enumC6565b = EnumC6565b.NUMBER;
        if (enumC6565bE0 != enumC6565b && enumC6565bE0 != EnumC6565b.STRING) {
            throw new IllegalStateException("Expected " + enumC6565b + " but was " + enumC6565bE0 + Q0());
        }
        double dM8874h = ((C4095o) S0()).m8874h();
        if (this.f31424b != EnumC4099s.LENIENT && (Double.isNaN(dM8874h) || Double.isInfinite(dM8874h))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dM8874h);
        }
        T0();
        int i10 = this.f24973t;
        if (i10 > 0) {
            int[] iArr = this.f24975w;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dM8874h;
    }

    @Override // rk.C6564a
    /* renamed from: h */
    public final void mo10024h() {
        O0(EnumC6565b.BEGIN_ARRAY);
        U0(((C4090j) S0()).f20996a.iterator());
        this.f24975w[this.f24973t - 1] = 0;
    }

    @Override // rk.C6564a
    /* renamed from: j */
    public final void mo10025j() {
        O0(EnumC6565b.BEGIN_OBJECT);
        U0(((C4774m) ((C4094n) S0()).f20998a.entrySet()).iterator());
    }

    @Override // rk.C6564a
    public final int o0() {
        EnumC6565b enumC6565bE0 = E0();
        EnumC6565b enumC6565b = EnumC6565b.NUMBER;
        if (enumC6565bE0 != enumC6565b && enumC6565bE0 != EnumC6565b.STRING) {
            throw new IllegalStateException("Expected " + enumC6565b + " but was " + enumC6565bE0 + Q0());
        }
        int iMo8867a = ((C4095o) S0()).mo8867a();
        T0();
        int i10 = this.f24973t;
        if (i10 > 0) {
            int[] iArr = this.f24975w;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iMo8867a;
    }

    @Override // rk.C6564a
    public final long t0() {
        EnumC6565b enumC6565bE0 = E0();
        EnumC6565b enumC6565b = EnumC6565b.NUMBER;
        if (enumC6565bE0 != enumC6565b && enumC6565bE0 != EnumC6565b.STRING) {
            throw new IllegalStateException("Expected " + enumC6565b + " but was " + enumC6565bE0 + Q0());
        }
        C4095o c4095o = (C4095o) S0();
        long jLongValue = c4095o.f20999a instanceof Number ? c4095o.m8875j().longValue() : Long.parseLong(c4095o.mo8868c());
        T0();
        int i10 = this.f24973t;
        if (i10 > 0) {
            int[] iArr = this.f24975w;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jLongValue;
    }

    @Override // rk.C6564a
    public final String toString() {
        return C5094q.class.getSimpleName() + Q0();
    }

    @Override // rk.C6564a
    public final String v0() {
        return R0(false);
    }

    @Override // rk.C6564a
    /* renamed from: w */
    public final void mo10026w() {
        O0(EnumC6565b.END_ARRAY);
        T0();
        T0();
        int i10 = this.f24973t;
        if (i10 > 0) {
            int[] iArr = this.f24975w;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // rk.C6564a
    /* renamed from: z */
    public final void mo10027z() {
        O0(EnumC6565b.END_OBJECT);
        this.f24974v[this.f24973t - 1] = null;
        T0();
        T0();
        int i10 = this.f24973t;
        if (i10 > 0) {
            int[] iArr = this.f24975w;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }
}
