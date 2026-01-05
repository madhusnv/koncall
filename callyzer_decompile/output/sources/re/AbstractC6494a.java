package re;

import al.C0174b;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l4.d0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: re.a */
/* loaded from: classes.dex */
public abstract class AbstractC6494a {

    /* renamed from: e */
    public static C0174b f31196e;

    /* renamed from: a */
    public static final Set f31192a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    public static final Set f31193b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final Set f31194c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    public static final Set f31195d = Collections.synchronizedSet(new HashSet());

    /* renamed from: f */
    public static final boolean f31197f = true;

    /* renamed from: a */
    public static void m12500a(StringBuilder sb2, String str, int i10, StackTraceElement stackTraceElement, String str2) {
        if (i10 > 0) {
            if (f31196e == null) {
                throw new IllegalArgumentException("Stack trace element serializer not initialized.");
            }
            sb2.append(str2);
            if (i10 == 1) {
                f31196e.getClass();
                sb2.append(C0174b.m390b(stackTraceElement));
            } else {
                f31196e.getClass();
                sb2.append(String.format("%s%s ... %d more", "", str, Integer.valueOf(i10 - 1)));
            }
        }
    }

    /* renamed from: b */
    public static String m12501b(C6495b c6495b, String str, boolean z6, boolean z10, Set set, Set set2, Set set3, boolean z11) {
        String str2;
        String str3;
        String str4;
        StringBuilder sb2 = new StringBuilder();
        if (c6495b == null) {
            return "";
        }
        String str5 = c6495b.f31198a;
        d0[] d0VarArr = c6495b.f31202e;
        String str6 = c6495b.f31200c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = d0VarArr.length;
        int i10 = 0;
        while (true) {
            str2 = null;
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = (StackTraceElement) d0VarArr[i10].f21881b;
            String className = stackTraceElement.getClassName();
            if (className != null && className.trim().length() != 0) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str4 = null;
                        break;
                    }
                    str4 = (String) it.next();
                    if (className.startsWith(str4)) {
                        break;
                    }
                }
                if (str4 != null) {
                    arrayList.addAll(arrayList2);
                    arrayList.add(stackTraceElement);
                } else {
                    Iterator it2 = set3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str7 = (String) it2.next();
                        if (className.startsWith(str7)) {
                            str2 = str7;
                            break;
                        }
                    }
                    if (str2 == null) {
                        arrayList2.add(stackTraceElement);
                    }
                }
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
        if (str5 != null) {
            str5.trim().length();
        }
        if (z6) {
            sb2.append(System.lineSeparator());
            sb2.append(str);
            sb2.append("Caused by: ");
        } else if (z10) {
            sb2.append(System.lineSeparator());
            sb2.append(str);
            sb2.append("Suppressed: ");
        }
        sb2.append(str6);
        if (str5 != null && str5.trim().length() != 0) {
            sb2.append(": ");
            sb2.append(str5);
        }
        int i11 = 0;
        String str8 = null;
        StackTraceElement stackTraceElement2 = null;
        for (StackTraceElement stackTraceElement3 : stackTraceElementArr) {
            String className2 = stackTraceElement3.getClassName();
            Iterator it3 = set2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    str3 = null;
                    break;
                }
                str3 = (String) it3.next();
                if (className2.startsWith(str3)) {
                    break;
                }
            }
            if (str3 == null) {
                m12500a(sb2, str8, i11, stackTraceElement2, str);
                sb2.append(System.lineSeparator());
                sb2.append(str);
                sb2.append("\tat ");
                if (f31196e == null) {
                    throw new IllegalArgumentException("Stack trace element serializer not initialized.");
                }
                sb2.append(str);
                f31196e.getClass();
                sb2.append(C0174b.m390b(stackTraceElement3));
                i11 = 0;
                str8 = null;
            } else if (str3.equals(str8)) {
                i11++;
            } else {
                m12500a(sb2, str8, i11, stackTraceElement2, str);
                sb2.append(System.lineSeparator());
                sb2.append(str);
                sb2.append("\tat ");
                i11 = 1;
                stackTraceElement2 = stackTraceElement3;
                str8 = str3;
            }
        }
        m12500a(sb2, str8, i11, stackTraceElement2, str);
        C6495b[] c6495bArr = c6495b.f31201d;
        if (c6495bArr != null && c6495bArr.length > 0 && z11) {
            for (C6495b c6495b2 : c6495bArr) {
                sb2.append(m12501b(c6495b2, AbstractC1452a.m4561h(str, "\t"), false, true, set, set2, set3, z11));
            }
        }
        C6495b c6495b3 = c6495b.f31199b;
        if (c6495b3 != null) {
            Iterator it4 = f31195d.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                String str9 = (String) it4.next();
                if (str6.startsWith(str9)) {
                    str2 = str9;
                    break;
                }
            }
            if (str2 == null) {
                sb2.append(m12501b(c6495b3, str, true, false, set, set2, set3, z11));
            }
        }
        return sb2.toString();
    }
}
