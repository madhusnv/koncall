package pg;

import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import rw.AbstractC6664n;
import zc.C8931h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ba {
    /* renamed from: a */
    public static final void m11553a(eb.i3 i3Var, String name, String value) {
        AbstractC4154l.m8923f(i3Var, "<this>");
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        ArrayList arrayList = i3Var.f9339a;
        arrayList.add(name);
        arrayList.add(AbstractC5178p.g0(value).toString());
    }

    /* renamed from: b */
    public static final void m11554b(String name) {
        AbstractC4154l.m8923f(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = name.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                og.d2.m10599b(16);
                String string = Integer.toString(cCharAt, 16);
                AbstractC4154l.m8922e(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                AbstractC1452a.m4551B(sb2, string, " at ", i10, " in header name: ");
                sb2.append(name);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    /* renamed from: c */
    public static final void m11555c(String value, String name) {
        AbstractC4154l.m8923f(value, "value");
        AbstractC4154l.m8923f(name, "name");
        int length = value.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                og.d2.m10599b(16);
                String string = Integer.toString(cCharAt, 16);
                AbstractC4154l.m8922e(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                AbstractC1452a.m4551B(sb2, string, " at ", i10, " in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(AbstractC4297c.m9006j(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    /* renamed from: d */
    public static final boolean m11556d(String str) {
        int length = str.length();
        if (1 <= length && length < 5) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < 'g') || ('A' <= cCharAt && cCharAt < 'G'))) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m11557e(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 64 && Character.isLetterOrDigit(str.charAt(0))) {
            String strM10090A = AbstractC5178p.m10090A(1, str);
            for (int i10 = 0; i10 < strM10090A.length(); i10++) {
                char cCharAt = strM10090A.charAt(i10);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '-') {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final C8931h m11558f(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        int i10 = 0;
        List listM10111V = AbstractC5178p.m10111V(str, new char[]{'.'}, 0, 6);
        if (listM10111V.size() != 4) {
            return null;
        }
        if (!listM10111V.isEmpty()) {
            Iterator it = listM10111V.iterator();
            while (it.hasNext()) {
                Integer numM10140v = AbstractC5185w.m10140v((String) it.next());
                int iIntValue = numM10140v != null ? numM10140v.intValue() : -1;
                if (iIntValue < 0 || iIntValue >= 256) {
                    return null;
                }
            }
        }
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM10111V, 10));
        Iterator it2 = listM10111V.iterator();
        while (it2.hasNext()) {
            arrayList.add(Byte.valueOf(og.fa.m10643b((String) it2.next())));
        }
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            bArr[i10] = ((Number) obj).byteValue();
            i10++;
        }
        return new C8931h(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final zc.C8934k m11559g(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.ba.m11559g(java.lang.String):zc.k");
    }
}
