package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.g */
/* loaded from: classes.dex */
public final class C1291g implements InterfaceC1298n {

    /* renamed from: a */
    public final Double f6199a;

    public C1291g(Double d2) {
        if (d2 == null) {
            this.f6199a = Double.valueOf(Double.NaN);
        } else {
            this.f6199a = d2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: a */
    public final Boolean mo3209a() {
        Double d2 = this.f6199a;
        boolean z6 = false;
        if (!Double.isNaN(d2.doubleValue()) && d2.doubleValue() != 0.0d) {
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: b */
    public final String mo3210b() throws NumberFormatException {
        Double d2 = this.f6199a;
        if (Double.isNaN(d2.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d2.doubleValue())) {
            return d2.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d2.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: c */
    public final Iterator mo3211c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: e */
    public final Double mo3212e() {
        return this.f6199a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1291g) {
            return this.f6199a.equals(((C1291g) obj).f6199a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6199a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: j */
    public final InterfaceC1298n mo3214j(String str, C0919n c0919n, ArrayList arrayList) throws NumberFormatException {
        if ("toString".equals(str)) {
            return new C1301q(mo3210b());
        }
        throw new IllegalArgumentException(mo3210b() + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: q */
    public final InterfaceC1298n mo3217q() {
        return new C1291g(this.f6199a);
    }

    public final String toString() {
        return mo3210b();
    }
}
