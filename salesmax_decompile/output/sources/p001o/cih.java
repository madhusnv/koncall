package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class cih {
    /* renamed from: a */
    public static final String m21307a(String str, Integer num) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (num != null) {
            num.intValue();
            sb.append(" on line " + num + '.');
        }
        sb.append(" See https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html for file format details.");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public static final boolean m21308b(String str) {
        sq8.m48649h(str, "<this>");
        for (int i = 0; i < str.length(); i++) {
            if (ph2.m43653c(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final hwc m21309c(String str) {
        sq8.m48649h(str, "<this>");
        List listC0 = f9g.C0(str, new char[]{'='}, false, 2, 2, null);
        return vyh.m53620a(f9g.Z0((String) listC0.get(0)).toString(), f9g.Z0((String) listC0.get(1)).toString());
    }

    /* renamed from: d */
    public static final List m21310d(String str, int i) {
        sq8.m48649h(str, "<this>");
        List listD0 = f9g.D0(f9g.Z0(str).toString(), new String[]{" ", "\t"}, false, i, 2, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD0) {
            if (!f9g.d0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(f9g.Z0((String) it.next()).toString());
        }
        return arrayList2;
    }

    /* renamed from: e */
    public static final String m21311e(String str) {
        sq8.m48649h(str, "<this>");
        return m21312f(m21312f(str, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER), ";");
    }

    /* renamed from: f */
    public static final String m21312f(String str, String str2) {
        return (String) f9g.D0(str, new String[]{str2}, false, 2, 2, null).get(0);
    }

    /* renamed from: g */
    public static final String m21313g(String str) {
        sq8.m48649h(str, "<this>");
        return m21312f(m21312f(str, " #"), " ;");
    }
}
