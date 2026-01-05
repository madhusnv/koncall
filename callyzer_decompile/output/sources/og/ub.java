package og;

import d3.C1565s;
import j3.C3551e;
import j3.C3552f;
import j3.C3557k;
import j3.C3560n;
import j3.C3561o;
import j3.C3568v;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ub {

    /* renamed from: a */
    public static C3552f f26830a;

    /* renamed from: a */
    public static final C3552f m10969a() {
        C3552f c3552f = f26830a;
        if (c3552f != null) {
            return c3552f;
        }
        C3551e c3551e = new C3551e("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = j3.h0.f19025a;
        d3.n0 n0Var = new d3.n0(C1565s.f7809b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C3561o(9.0f, 16.17f));
        arrayList.add(new C3560n(4.83f, 12.0f));
        arrayList.add(new C3568v(-1.42f, 1.41f));
        arrayList.add(new C3560n(9.0f, 19.0f));
        arrayList.add(new C3560n(21.0f, 7.0f));
        arrayList.add(new C3568v(-1.41f, -1.41f));
        arrayList.add(C3557k.f19059c);
        C3551e.m8090a(c3551e, arrayList, n0Var);
        C3552f c3552fM8091b = c3551e.m8091b();
        f26830a = c3552fM8091b;
        return c3552fM8091b;
    }

    /* renamed from: b */
    public static String m10970b(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder sbM7383p = i0.m0.m7383p("<", str2, " threw ");
                    sbM7383p.append(e2.getClass().getName());
                    sbM7383p.append(">");
                    string = sbM7383p.toString();
                }
            }
            objArr[i11] = string;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
