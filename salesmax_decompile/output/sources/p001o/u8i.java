package p001o;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class u8i {

    /* renamed from: a */
    public final List f48563a;

    /* renamed from: b */
    public final List f48564b;

    /* renamed from: c */
    public final List f48565c;

    public u8i(List list, List list2, List list3) {
        this.f48563a = list;
        this.f48564b = list2;
        this.f48565c = list3;
    }

    /* renamed from: b */
    public static u8i m51212b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        m51213c(str, arrayList, arrayList2, arrayList3);
        return new u8i(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: c */
    public static void m51213c(String str, List list, List list2, List list3) {
        String strSubstring;
        list.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(length));
                length = str.length();
            } else if (iIndexOf != length) {
                list.set(list2.size(), ((String) list.get(list2.size())) + str.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                list.set(list2.size(), ((String) list.get(list2.size())) + "$");
                length += 2;
            } else {
                list3.add("");
                int i = length + 1;
                int iIndexOf2 = str.indexOf("$", i);
                String strSubstring2 = str.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    list2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring + "d";
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            list2.add(2);
                            break;
                        case "Time":
                            list2.add(4);
                            break;
                        case "Bandwidth":
                            list2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    list3.set(list2.size() - 1, strSubstring);
                }
                list.add("");
                length = iIndexOf2 + 1;
            }
        }
    }

    /* renamed from: a */
    public String m51214a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.f48564b.size(); i2++) {
            sb.append((String) this.f48563a.get(i2));
            if (((Integer) this.f48564b.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) this.f48564b.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) this.f48565c.get(i2), Long.valueOf(j)));
            } else if (((Integer) this.f48564b.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) this.f48565c.get(i2), Integer.valueOf(i)));
            } else if (((Integer) this.f48564b.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) this.f48565c.get(i2), Long.valueOf(j2)));
            }
        }
        sb.append((String) this.f48563a.get(this.f48564b.size()));
        return sb.toString();
    }
}
