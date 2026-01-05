package sb;

import a2.AbstractC0030c;
import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sb.e */
/* loaded from: classes.dex */
public final class C6778e implements InterfaceC6777d {

    /* renamed from: a */
    public final String f32239a;

    /* renamed from: b */
    public final String f32240b;

    /* renamed from: c */
    public final String f32241c;

    /* renamed from: d */
    public final C7126c f32242d;

    /* renamed from: e */
    public final InterfaceC2004b f32243e;

    public C6778e(String accessKeyId, String secretAccessKey, String str, C7126c c7126c, InterfaceC2004b interfaceC2004b) {
        AbstractC4154l.m8923f(accessKeyId, "accessKeyId");
        AbstractC4154l.m8923f(secretAccessKey, "secretAccessKey");
        this.f32239a = accessKeyId;
        this.f32240b = secretAccessKey;
        this.f32241c = str;
        this.f32242d = c7126c;
        this.f32243e = interfaceC2004b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6778e)) {
            return false;
        }
        C6778e c6778e = (C6778e) obj;
        return AbstractC4154l.m8918a(this.f32239a, c6778e.f32239a) && AbstractC4154l.m8918a(this.f32240b, c6778e.f32240b) && AbstractC4154l.m8918a(this.f32241c, c6778e.f32241c) && AbstractC4154l.m8918a(this.f32242d, c6778e.f32242d) && AbstractC4154l.m8918a(this.f32243e, c6778e.f32243e);
    }

    @Override // vc.InterfaceC7698a
    public final InterfaceC2004b getAttributes() {
        return this.f32243e;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.f32239a.hashCode() * 31, 31, this.f32240b);
        String str = this.f32241c;
        int iHashCode = (iM113d + (str == null ? 0 : str.hashCode())) * 31;
        C7126c c7126c = this.f32242d;
        return this.f32243e.hashCode() + ((iHashCode + (c7126c != null ? c7126c.f34346a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CredentialsImpl(accessKeyId=" + this.f32239a + ", secretAccessKey=" + this.f32240b + ", sessionToken=" + this.f32241c + ", expiration=" + this.f32242d + ", attributes=" + this.f32243e + ')';
    }
}
