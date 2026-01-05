package com.google.android.gms.internal.measurement;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import og.xa;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a6 {

    /* renamed from: a */
    public static final char[] f6063a;

    static {
        char[] cArr = new char[80];
        f6063a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static void m3129a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m3129a(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m3129a(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m3131c(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            z4 z4Var = z4.f6468c;
            sb2.append(xa.m11038a(new z4(((String) obj).getBytes(p5.f6342a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof z4) {
            sb2.append(": \"");
            sb2.append(xa.m11038a((z4) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof i5) {
            sb2.append(" {");
            m3130b((i5) obj, sb2, i10 + 2);
            sb2.append("\n");
            m3131c(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m3129a(sb2, i12, TransferTable.COLUMN_KEY, entry.getKey());
        m3129a(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        m3131c(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3130b(com.google.android.gms.internal.measurement.i5 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.a6.m3130b(com.google.android.gms.internal.measurement.i5, java.lang.StringBuilder, int):void");
    }

    /* renamed from: c */
    public static void m3131c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f6063a, 0, i11);
            i10 -= i11;
        }
    }
}
