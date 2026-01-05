package jakarta.mail.internet;

import jakarta.mail.AbstractC3633a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.t */
/* loaded from: classes3.dex */
public final class C3671t extends AbstractC3633a {

    /* renamed from: a */
    public String f19385a;

    @Override // jakarta.mail.AbstractC3633a
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3671t)) {
            return false;
        }
        String str = ((C3671t) obj).f19385a;
        String str2 = this.f19385a;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    @Override // jakarta.mail.AbstractC3633a
    public final String getType() {
        return "news";
    }

    public final int hashCode() {
        String str = this.f19385a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // jakarta.mail.AbstractC3633a
    public final String toString() {
        return this.f19385a;
    }

    public static String toString(AbstractC3633a[] abstractC3633aArr) {
        if (abstractC3633aArr == null || abstractC3633aArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(((C3671t) abstractC3633aArr[0]).f19385a);
        int length = sb2.length();
        for (int i10 = 1; i10 < abstractC3633aArr.length; i10++) {
            sb2.append(",");
            int i11 = length + 1;
            String str = ((C3671t) abstractC3633aArr[i10]).f19385a;
            if (str.length() + i11 > 76) {
                sb2.append("\r\n\t");
                i11 = 8;
            }
            sb2.append(str);
            length = i11 + str.length();
        }
        return sb2.toString();
    }
}
