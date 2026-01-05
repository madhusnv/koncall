package ug;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: c */
    public static final y1 f35951c = new y1(100);

    /* renamed from: a */
    public final EnumMap f35952a;

    /* renamed from: b */
    public final int f35953b;

    public y1(int i10) {
        EnumMap enumMap = new EnumMap(x1.class);
        this.f35952a = enumMap;
        x1 x1Var = x1.AD_STORAGE;
        v1 v1Var = v1.UNINITIALIZED;
        enumMap.put((EnumMap) x1Var, (x1) v1Var);
        enumMap.put((EnumMap) x1.ANALYTICS_STORAGE, (x1) v1Var);
        this.f35953b = i10;
    }

    /* renamed from: a */
    public static String m14204a(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    /* renamed from: b */
    public static y1 m14205b(int i10, Bundle bundle) {
        if (bundle == null) {
            return new y1(i10);
        }
        EnumMap enumMap = new EnumMap(x1.class);
        for (x1 x1Var : w1.STORAGE.zzb()) {
            enumMap.put((EnumMap) x1Var, (x1) m14207d(bundle.getString(x1Var.zze)));
        }
        return new y1(enumMap, i10);
    }

    /* renamed from: c */
    public static y1 m14206c(int i10, String str) {
        EnumMap enumMap = new EnumMap(x1.class);
        x1[] x1VarArrZza = w1.STORAGE.zza();
        for (int i11 = 0; i11 < x1VarArrZza.length; i11++) {
            String str2 = str == null ? "" : str;
            x1 x1Var = x1VarArrZza[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put((EnumMap) x1Var, (x1) m14208e(str2.charAt(i12)));
            } else {
                enumMap.put((EnumMap) x1Var, (x1) v1.UNINITIALIZED);
            }
        }
        return new y1(enumMap, i10);
    }

    /* renamed from: d */
    public static v1 m14207d(String str) {
        return str == null ? v1.UNINITIALIZED : str.equals("granted") ? v1.GRANTED : str.equals("denied") ? v1.DENIED : v1.UNINITIALIZED;
    }

    /* renamed from: e */
    public static v1 m14208e(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? v1.UNINITIALIZED : v1.GRANTED : v1.DENIED : v1.POLICY;
    }

    /* renamed from: h */
    public static char m14209h(v1 v1Var) {
        if (v1Var == null) {
            return '-';
        }
        int iOrdinal = v1Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* renamed from: l */
    public static boolean m14210l(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        for (x1 x1Var : w1.STORAGE.zzb()) {
            if (this.f35952a.get(x1Var) != y1Var.f35952a.get(x1Var)) {
                return false;
            }
        }
        return this.f35953b == y1Var.f35953b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m14211f() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            ug.w1 r1 = ug.w1.STORAGE
            ug.x1[] r1 = r1.zza()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f35952a
            java.lang.Object r4 = r5.get(r4)
            ug.v1 r4 = (ug.v1) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.y1.m14211f():java.lang.String");
    }

    /* renamed from: g */
    public final String m14212g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (x1 x1Var : w1.STORAGE.zza()) {
            sb2.append(m14209h((v1) this.f35952a.get(x1Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f35952a.values().iterator();
        int iHashCode = this.f35953b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((v1) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* renamed from: i */
    public final boolean m14213i(x1 x1Var) {
        return ((v1) this.f35952a.get(x1Var)) != v1.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.y1 m14214j(ug.y1 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<ug.x1> r1 = ug.x1.class
            r0.<init>(r1)
            ug.w1 r1 = ug.w1.STORAGE
            ug.x1[] r1 = r1.zzb()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f35952a
            java.lang.Object r5 = r5.get(r4)
            ug.v1 r5 = (ug.v1) r5
            java.util.EnumMap r6 = r9.f35952a
            java.lang.Object r6 = r6.get(r4)
            ug.v1 r6 = (ug.v1) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            ug.v1 r7 = ug.v1.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            ug.v1 r7 = ug.v1.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            ug.v1 r7 = ug.v1.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            ug.v1 r5 = ug.v1.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            ug.y1 r9 = new ug.y1
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.y1.m14214j(ug.y1):ug.y1");
    }

    /* renamed from: k */
    public final y1 m14215k(y1 y1Var) {
        EnumMap enumMap = new EnumMap(x1.class);
        for (x1 x1Var : w1.STORAGE.zzb()) {
            v1 v1Var = (v1) this.f35952a.get(x1Var);
            if (v1Var == v1.UNINITIALIZED) {
                v1Var = (v1) y1Var.f35952a.get(x1Var);
            }
            if (v1Var != null) {
                enumMap.put((EnumMap) x1Var, (x1) v1Var);
            }
        }
        return new y1(enumMap, this.f35953b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(m14204a(this.f35953b));
        for (x1 x1Var : w1.STORAGE.zzb()) {
            sb2.append(",");
            sb2.append(x1Var.zze);
            sb2.append("=");
            v1 v1Var = (v1) this.f35952a.get(x1Var);
            if (v1Var == null) {
                v1Var = v1.UNINITIALIZED;
            }
            sb2.append(v1Var);
        }
        return sb2.toString();
    }

    public y1(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(x1.class);
        this.f35952a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f35953b = i10;
    }
}
