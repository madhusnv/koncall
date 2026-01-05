package ug;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.p */
/* loaded from: classes.dex */
public final class C7445p {

    /* renamed from: f */
    public static final C7445p f35743f = new C7445p((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a */
    public final int f35744a;

    /* renamed from: b */
    public final String f35745b;

    /* renamed from: c */
    public final Boolean f35746c;

    /* renamed from: d */
    public final String f35747d;

    /* renamed from: e */
    public final EnumMap f35748e;

    public C7445p(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(x1.class);
        this.f35748e = enumMap;
        enumMap.put((EnumMap) x1.AD_USER_DATA, (x1) (bool == null ? v1.UNINITIALIZED : bool.booleanValue() ? v1.GRANTED : v1.DENIED));
        this.f35744a = i10;
        this.f35745b = m14105e();
        this.f35746c = bool2;
        this.f35747d = str;
    }

    /* renamed from: b */
    public static C7445p m14101b(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f35743f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(x1.class);
        x1[] x1VarArrZza = w1.DMA.zza();
        int length = x1VarArrZza.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put((EnumMap) x1VarArrZza[i12], (x1) y1.m14208e(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new C7445p(enumMap, i10, (Boolean) null, (String) null);
    }

    /* renamed from: c */
    public static C7445p m14102c(int i10, Bundle bundle) {
        if (bundle == null) {
            return new C7445p((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(x1.class);
        for (x1 x1Var : w1.DMA.zza()) {
            enumMap.put((EnumMap) x1Var, (x1) y1.m14207d(bundle.getString(x1Var.zze)));
        }
        return new C7445p(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* renamed from: d */
    public static Boolean m14103d(Bundle bundle) {
        v1 v1VarM14207d;
        if (bundle == null || (v1VarM14207d = y1.m14207d(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = v1VarM14207d.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: a */
    public final v1 m14104a() {
        v1 v1Var = (v1) this.f35748e.get(x1.AD_USER_DATA);
        return v1Var == null ? v1.UNINITIALIZED : v1Var;
    }

    /* renamed from: e */
    public final String m14105e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35744a);
        for (x1 x1Var : w1.DMA.zza()) {
            sb2.append(":");
            sb2.append(y1.m14209h((v1) this.f35748e.get(x1Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7445p)) {
            return false;
        }
        C7445p c7445p = (C7445p) obj;
        if (this.f35745b.equalsIgnoreCase(c7445p.f35745b) && Objects.equals(this.f35746c, c7445p.f35746c)) {
            return Objects.equals(this.f35747d, c7445p.f35747d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f35746c;
        int i10 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f35747d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f35745b.hashCode() + (i10 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(y1.m14204a(this.f35744a));
        for (x1 x1Var : w1.DMA.zza()) {
            sb2.append(",");
            sb2.append(x1Var.zze);
            sb2.append("=");
            v1 v1Var = (v1) this.f35748e.get(x1Var);
            if (v1Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = v1Var.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f35746c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f35747d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public C7445p(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(x1.class);
        this.f35748e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f35744a = i10;
        this.f35745b = m14105e();
        this.f35746c = bool;
        this.f35747d = str;
    }
}
