package og;

import c9.C0919n;
import com.google.android.gms.internal.measurement.AbstractC1292h;
import com.google.android.gms.internal.measurement.C1288d;
import com.google.android.gms.internal.measurement.C1290f;
import com.google.android.gms.internal.measurement.C1291g;
import com.google.android.gms.internal.measurement.C1297m;
import com.google.android.gms.internal.measurement.C1304t;
import com.google.android.gms.internal.measurement.InterfaceC1298n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class qa {
    /* renamed from: a */
    public static void m10846a(int i10, int i11) {
        String strM10870b;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM10870b = ra.m10870b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "negative size: "));
                }
                strM10870b = ra.m10870b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM10870b);
        }
    }

    /* renamed from: b */
    public static InterfaceC1298n m10847b(C1288d c1288d, C0919n c0919n, ArrayList arrayList, boolean z6) {
        InterfaceC1298n interfaceC1298nMo3299d;
        sa.m10890c(1, "reduce", arrayList);
        sa.m10892e(2, "reduce", arrayList);
        InterfaceC1298n interfaceC1298nM3666c = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) arrayList.get(0));
        if (!(interfaceC1298nM3666c instanceof AbstractC1292h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC1298nMo3299d = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) arrayList.get(1));
            if (interfaceC1298nMo3299d instanceof C1290f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c1288d.m3220t() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC1298nMo3299d = null;
        }
        AbstractC1292h abstractC1292h = (AbstractC1292h) interfaceC1298nM3666c;
        int iM3220t = c1288d.m3220t();
        int i10 = z6 ? 0 : iM3220t - 1;
        int i11 = z6 ? iM3220t - 1 : 0;
        int i12 = true == z6 ? 1 : -1;
        if (interfaceC1298nMo3299d == null) {
            interfaceC1298nMo3299d = c1288d.m3221u(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c1288d.m3223w(i10)) {
                interfaceC1298nMo3299d = abstractC1292h.mo3299d(c0919n, Arrays.asList(interfaceC1298nMo3299d, c1288d.m3221u(i10), new C1291g(Double.valueOf(i10)), c1288d));
                if (interfaceC1298nMo3299d instanceof C1290f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC1298nMo3299d;
    }

    /* renamed from: c */
    public static C1288d m10848c(C1288d c1288d, C0919n c0919n, C1297m c1297m, Boolean bool, Boolean bool2) {
        C1288d c1288d2 = new C1288d();
        Iterator itM3219s = c1288d.m3219s();
        while (itM3219s.hasNext()) {
            int iIntValue = ((Integer) itM3219s.next()).intValue();
            if (c1288d.m3223w(iIntValue)) {
                InterfaceC1298n interfaceC1298nMo3299d = c1297m.mo3299d(c0919n, Arrays.asList(c1288d.m3221u(iIntValue), new C1291g(Double.valueOf(iIntValue)), c1288d));
                if (interfaceC1298nMo3299d.mo3209a().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC1298nMo3299d.mo3209a().equals(bool2)) {
                    c1288d2.m3222v(iIntValue, interfaceC1298nMo3299d);
                }
            }
        }
        return c1288d2;
    }

    /* renamed from: d */
    public static void m10849d(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? m10851f(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? m10851f(i11, i12, "end index") : ra.m10870b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    /* renamed from: e */
    public static void m10850e(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static String m10851f(int i10, int i11, String str) {
        if (i10 < 0) {
            return ra.m10870b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return ra.m10870b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "negative size: "));
    }
}
