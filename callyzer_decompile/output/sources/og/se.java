package og;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import rw.AbstractC6663m;
import s4.C6749e;
import s4.C6758n;
import t4.AbstractC7041b;
import t4.InterfaceC7040a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class se {
    /* renamed from: a */
    public static final C6749e m10913a(Context context) {
        float f6 = context.getResources().getConfiguration().fontScale;
        float f10 = context.getResources().getDisplayMetrics().density;
        InterfaceC7040a interfaceC7040aM13326a = AbstractC7041b.m13326a(f6);
        if (interfaceC7040aM13326a == null) {
            interfaceC7040aM13326a = new C6758n(f6);
        }
        return new C6749e(f10, f6, interfaceC7040aM13326a);
    }

    /* renamed from: b */
    public static final int m10914b(InterfaceC4026c interfaceC4026c, String str) {
        AbstractC4154l.m8923f(interfaceC4026c, "<this>");
        int iM10915c = m10915c(interfaceC4026c, str);
        if (iM10915c >= 0) {
            return iM10915c;
        }
        int iM10915c2 = m10915c(interfaceC4026c, "`" + str + '`');
        if (iM10915c2 >= 0) {
            return iM10915c2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = interfaceC4026c.getColumnCount();
        String strConcat = ".".concat(str);
        String strM14328h = p020v.a1.m14328h('`', ".", str);
        for (int i10 = 0; i10 < columnCount; i10++) {
            String columnName = interfaceC4026c.getColumnName(i10);
            if (columnName.length() >= str.length() + 2 && (AbstractC5185w.m10129k(columnName, strConcat, false) || (columnName.charAt(0) == '`' && AbstractC5185w.m10129k(columnName, strM14328h, false)))) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static final int m10915c(InterfaceC4026c interfaceC4026c, String name) {
        AbstractC4154l.m8923f(interfaceC4026c, "<this>");
        AbstractC4154l.m8923f(name, "name");
        int columnCount = interfaceC4026c.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (name.equals(interfaceC4026c.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static final int m10916d(InterfaceC4026c stmt, String str) {
        AbstractC4154l.m8923f(stmt, "stmt");
        int iM10914b = m10914b(stmt, str);
        if (iM10914b >= 0) {
            return iM10914b;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(stmt.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + AbstractC6663m.m12748L(arrayList, null, null, null, null, 63) + ']');
    }
}
