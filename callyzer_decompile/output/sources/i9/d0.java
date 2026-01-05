package i9;

import a2.AbstractC0030c;
import ec.C2011i;
import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;
import td.C7126c;
import vc.InterfaceC7698a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 implements InterfaceC7698a {

    /* renamed from: a */
    public final String f17144a;

    /* renamed from: b */
    public final C7126c f17145b;

    /* renamed from: c */
    public final String f17146c;

    /* renamed from: d */
    public final String f17147d;

    /* renamed from: e */
    public final String f17148e;

    /* renamed from: f */
    public final C7126c f17149f;

    /* renamed from: g */
    public final String f17150g;

    /* renamed from: h */
    public final String f17151h;

    /* renamed from: i */
    public final C2011i f17152i;

    public d0(String token, C7126c c7126c, String str, String str2, String str3, C7126c c7126c2, String str4, String str5) {
        AbstractC4154l.m8923f(token, "token");
        this.f17144a = token;
        this.f17145b = c7126c;
        this.f17146c = str;
        this.f17147d = str2;
        this.f17148e = str3;
        this.f17149f = c7126c2;
        this.f17150g = str4;
        this.f17151h = str5;
        this.f17152i = C2011i.f9543a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return AbstractC4154l.m8918a(this.f17144a, d0Var.f17144a) && AbstractC4154l.m8918a(this.f17145b, d0Var.f17145b) && AbstractC4154l.m8918a(this.f17146c, d0Var.f17146c) && AbstractC4154l.m8918a(this.f17147d, d0Var.f17147d) && AbstractC4154l.m8918a(this.f17148e, d0Var.f17148e) && AbstractC4154l.m8918a(this.f17149f, d0Var.f17149f) && AbstractC4154l.m8918a(this.f17150g, d0Var.f17150g) && AbstractC4154l.m8918a(this.f17151h, d0Var.f17151h);
    }

    @Override // vc.InterfaceC7698a
    public final InterfaceC2004b getAttributes() {
        return this.f17152i;
    }

    public final int hashCode() {
        int iHashCode = (this.f17145b.f34346a.hashCode() + (this.f17144a.hashCode() * 31)) * 31;
        String str = this.f17146c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17147d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17148e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C7126c c7126c = this.f17149f;
        int iHashCode5 = (iHashCode4 + (c7126c == null ? 0 : c7126c.f34346a.hashCode())) * 31;
        String str4 = this.f17150g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17151h;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SsoToken(token=");
        sb2.append(this.f17144a);
        sb2.append(", expiration=");
        sb2.append(this.f17145b);
        sb2.append(", refreshToken=");
        sb2.append(this.f17146c);
        sb2.append(", clientId=");
        sb2.append(this.f17147d);
        sb2.append(", clientSecret=");
        sb2.append(this.f17148e);
        sb2.append(", registrationExpiresAt=");
        sb2.append(this.f17149f);
        sb2.append(", region=");
        sb2.append(this.f17150g);
        sb2.append(", startUrl=");
        return AbstractC0030c.m123n(sb2, this.f17151h, ')');
    }
}
