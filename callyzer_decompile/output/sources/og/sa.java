package og;

import c9.C0919n;
import com.google.android.gms.internal.measurement.C1288d;
import com.google.android.gms.internal.measurement.C1289e;
import com.google.android.gms.internal.measurement.C1291g;
import com.google.android.gms.internal.measurement.C1295k;
import com.google.android.gms.internal.measurement.C1296l;
import com.google.android.gms.internal.measurement.C1301q;
import com.google.android.gms.internal.measurement.C1302r;
import com.google.android.gms.internal.measurement.EnumC1307w;
import com.google.android.gms.internal.measurement.InterfaceC1298n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class sa {
    /* renamed from: a */
    public static void m10888a(int i10, String str, List list) {
        if (list.size() == i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i10 + " parameters found " + list.size());
    }

    /* renamed from: b */
    public static int m10889b(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iM10925a = ta.m10925a(obj);
        int i13 = iM10925a & i10;
        int iM10891d = m10891d(i13, obj3);
        if (iM10891d != 0) {
            int i14 = ~i10;
            int i15 = iM10925a & i14;
            int i16 = -1;
            while (true) {
                i11 = iM10891d - 1;
                int i17 = iArr[i11];
                i12 = i17 & i10;
                if ((i17 & i14) != i15 || !pa.m10818e(obj, objArr[i11]) || (objArr2 != null && !pa.m10818e(obj2, objArr2[i11]))) {
                    if (i12 == 0) {
                        break;
                    }
                    i16 = i11;
                    iM10891d = i12;
                } else {
                    break;
                }
            }
            if (i16 == -1) {
                m10896i(i13, obj3, i12);
                return i11;
            }
            iArr[i16] = (iArr[i16] & i14) | (i12 & i10);
            return i11;
        }
        return -1;
    }

    /* renamed from: c */
    public static void m10890c(int i10, String str, List list) {
        if (list.size() >= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i10 + " parameters found " + list.size());
    }

    /* renamed from: d */
    public static int m10891d(int i10, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    /* renamed from: e */
    public static void m10892e(int i10, String str, ArrayList arrayList) {
        if (arrayList.size() <= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i10 + " parameters found " + arrayList.size());
    }

    /* renamed from: f */
    public static Object m10893f(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    /* renamed from: g */
    public static boolean m10894g(InterfaceC1298n interfaceC1298n) {
        if (interfaceC1298n == null) {
            return false;
        }
        Double dMo3212e = interfaceC1298n.mo3212e();
        return !dMo3212e.isNaN() && dMo3212e.doubleValue() >= 0.0d && dMo3212e.equals(Double.valueOf(Math.floor(dMo3212e.doubleValue())));
    }

    /* renamed from: h */
    public static EnumC1307w m10895h(String str) {
        EnumC1307w enumC1307wZza = null;
        if (str != null && !str.isEmpty()) {
            enumC1307wZza = EnumC1307w.zza(Integer.parseInt(str));
        }
        if (enumC1307wZza != null) {
            return enumC1307wZza;
        }
        throw new IllegalArgumentException(i0.m0.m7378k("Unsupported commandId ", str));
    }

    /* renamed from: i */
    public static void m10896i(int i10, Object obj, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    /* renamed from: j */
    public static boolean m10897j(InterfaceC1298n interfaceC1298n, InterfaceC1298n interfaceC1298n2) {
        if (!interfaceC1298n.getClass().equals(interfaceC1298n2.getClass())) {
            return false;
        }
        if ((interfaceC1298n instanceof C1302r) || (interfaceC1298n instanceof C1296l)) {
            return true;
        }
        if (!(interfaceC1298n instanceof C1291g)) {
            return interfaceC1298n instanceof C1301q ? interfaceC1298n.mo3210b().equals(interfaceC1298n2.mo3210b()) : interfaceC1298n instanceof C1289e ? interfaceC1298n.mo3209a().equals(interfaceC1298n2.mo3209a()) : interfaceC1298n == interfaceC1298n2;
        }
        if (Double.isNaN(interfaceC1298n.mo3212e().doubleValue()) || Double.isNaN(interfaceC1298n2.mo3212e().doubleValue())) {
            return false;
        }
        return interfaceC1298n.mo3212e().equals(interfaceC1298n2.mo3212e());
    }

    /* renamed from: k */
    public static int m10898k(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        return (int) (((d2 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d2))) % 4.294967296E9d);
    }

    /* renamed from: l */
    public static double m10899l(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == 0.0d) {
            return d2;
        }
        return (d2 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d2));
    }

    /* renamed from: m */
    public static Object m10900m(InterfaceC1298n interfaceC1298n) {
        if (InterfaceC1298n.f6310o.equals(interfaceC1298n)) {
            return null;
        }
        if (InterfaceC1298n.f6309i.equals(interfaceC1298n)) {
            return "";
        }
        if (interfaceC1298n instanceof C1295k) {
            return m10901n((C1295k) interfaceC1298n);
        }
        if (!(interfaceC1298n instanceof C1288d)) {
            return !interfaceC1298n.mo3212e().isNaN() ? interfaceC1298n.mo3212e() : interfaceC1298n.mo3210b();
        }
        ArrayList arrayList = new ArrayList();
        C1288d c1288d = (C1288d) interfaceC1298n;
        int i10 = 0;
        while (i10 < c1288d.m3220t()) {
            if (i10 >= c1288d.m3220t()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
                sb2.append("Out of bounds index: ");
                sb2.append(i10);
                throw new NoSuchElementException(sb2.toString());
            }
            int i11 = i10 + 1;
            Object objM10900m = m10900m(c1288d.m3221u(i10));
            if (objM10900m != null) {
                arrayList.add(objM10900m);
            }
            i10 = i11;
        }
        return arrayList;
    }

    /* renamed from: n */
    public static HashMap m10901n(C1295k c1295k) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(c1295k.f6262a.keySet());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            Object objM10900m = m10900m(c1295k.mo3213h(str));
            if (objM10900m != null) {
                map.put(str, objM10900m);
            }
        }
        return map;
    }

    /* renamed from: o */
    public static void m10902o(C0919n c0919n) {
        int iM10898k = m10898k(c0919n.m2667m("runtime.counter").mo3212e().doubleValue() + 1.0d);
        if (iM10898k > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c0919n.m2664j("runtime.counter", new C1291g(Double.valueOf(iM10898k)));
    }
}
