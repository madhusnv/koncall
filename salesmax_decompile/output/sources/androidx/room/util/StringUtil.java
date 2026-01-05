package androidx.room.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.f9g;
import p001o.kh3;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class StringUtil {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final void appendPlaceholders(StringBuilder sb, int i) {
        sq8.m48649h(sb, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    public static final String joinIntoString(List<Integer> list) {
        if (list != null) {
            return kh3.p0(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    public static final List<Integer> splitToIntList(String str) {
        List listC0;
        Integer numValueOf;
        if (str == null || (listC0 = f9g.C0(str, new char[]{','}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listC0.iterator();
        while (it.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }
}
