package androidx.datastore.preferences.protobuf;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import fb.AbstractC2227a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a */
    public static final char[] f2389a;

    static {
        char[] cArr = new char[80];
        f2389a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static void m1032a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f2389a, 0, i11);
            i10 -= i11;
        }
    }

    /* renamed from: b */
    public static void m1033b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m1033b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m1033b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m1032a(i10, sb2);
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
            C0312g c0312g = C0312g.f2325c;
            sb2.append(AbstractC2227a.m5930a(new C0312g(((String) obj).getBytes(b0.f2293a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C0312g) {
            sb2.append(": \"");
            sb2.append(AbstractC2227a.m5930a((C0312g) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC0335z) {
            sb2.append(" {");
            m1034c((AbstractC0335z) obj, sb2, i10 + 2);
            sb2.append("\n");
            m1032a(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        m1033b(sb2, i12, TransferTable.COLUMN_KEY, entry.getKey());
        m1033b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        m1032a(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1034c(androidx.datastore.preferences.protobuf.AbstractC0335z r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.m1034c(androidx.datastore.preferences.protobuf.z, java.lang.StringBuilder, int):void");
    }
}
