package pg;

import android.database.SQLException;
import java.math.BigDecimal;
import java.math.BigInteger;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import og.mb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a9 {
    /* renamed from: a */
    public static final void m11538a(InterfaceC4024a interfaceC4024a, String sql) {
        AbstractC4154l.m8923f(interfaceC4024a, "<this>");
        AbstractC4154l.m8923f(sql, "sql");
        InterfaceC4026c interfaceC4026cY0 = interfaceC4024a.y0(sql);
        try {
            interfaceC4026cY0.r0();
            mb.m10760a(interfaceC4026cY0, null);
        } finally {
        }
    }

    /* renamed from: b */
    public static final String m11539b(double d2) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d2));
        String plainString = (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString();
        AbstractC4154l.m8922e(plainString, "toPlainString(...)");
        return plainString;
    }

    /* renamed from: c */
    public static final void m11540c(int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i10);
        if (str != null) {
            sb2.append(", message: ".concat(str));
        }
        throw new SQLException(sb2.toString());
    }
}
