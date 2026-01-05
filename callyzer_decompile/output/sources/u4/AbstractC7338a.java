package u4;

import ex.InterfaceC2139c;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u4.a */
/* loaded from: classes.dex */
public abstract class AbstractC7338a {
    /* renamed from: a */
    public static String m13729a(List list, String str, InterfaceC2139c interfaceC2139c, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        if ((i10 & 32) != 0) {
            interfaceC2139c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            if (interfaceC2139c != null) {
                sb2.append((CharSequence) interfaceC2139c.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    /* renamed from: b */
    public static final void m13730b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
