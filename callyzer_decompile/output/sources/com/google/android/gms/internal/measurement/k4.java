package com.google.android.gms.internal.measurement;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import d3.AbstractC1571y;
import java.util.logging.Level;
import java.util.logging.Logger;
import w2.InterfaceC7879r;
import xh.AbstractC8377b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class k4 {

    /* renamed from: a */
    public static volatile AbstractC8377b f6264a;

    /* renamed from: a */
    public static InterfaceC7879r m3470a(InterfaceC7879r interfaceC7879r, float f6, d3.l0 l0Var, int i10) {
        if ((i10 & 2) != 0) {
            l0Var = d3.h0.f7748a;
        }
        d3.l0 l0Var2 = l0Var;
        boolean z6 = Float.compare(f6, (float) 0) > 0;
        long j6 = AbstractC1571y.f7823a;
        return (Float.compare(f6, (float) 0) > 0 || z6) ? interfaceC7879r.mo14852e(new ShadowGraphicsLayerElement(f6, l0Var2, z6, j6, j6)) : interfaceC7879r;
    }

    /* renamed from: b */
    public static String m3471b(Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM14333m;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strM14333m = "null";
            } else {
                try {
                    strM14333m = obj.toString();
                } catch (Exception e2) {
                    String strM7379l = i0.m0.m7379l(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM7379l), (Throwable) e2);
                    strM14333m = p020v.a1.m14333m("<", strM7379l, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i11] = strM14333m;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + 29);
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = "expected a non-null reference".indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) "expected a non-null reference", i12, iIndexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb2.append((CharSequence) "expected a non-null reference", i12, 29);
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
