package p001o;

import p001o.cxe;

/* loaded from: classes3.dex */
public final class qxe implements pb8 {

    /* renamed from: a */
    public final cxe.C12766c f42592a;

    public qxe(cxe.C12766c c12766c) {
        sq8.m48649h(c12766c, "config");
        this.f42592a = c12766c;
    }

    @Override // p001o.pb8
    /* renamed from: a */
    public nb8 mo19908a(String str) {
        sq8.m48649h(str, "schemeId");
        int iHashCode = str.hashCode();
        if (iHashCode != -872954133) {
            if (iHashCode != -826192891) {
                if (iHashCode == 157824252 && str.equals("aws.auth#sigv4a")) {
                    return this.f42592a.m21983h();
                }
            } else if (str.equals("aws.auth#sigv4")) {
                return this.f42592a.m21983h();
            }
        } else if (str.equals("aws.auth#sigv4s3express")) {
            return this.f42592a.m21990o();
        }
        throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(str)) + " not configured for client").toString());
    }
}
