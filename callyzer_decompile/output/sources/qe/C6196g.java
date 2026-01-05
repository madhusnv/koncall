package qe;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qe.g */
/* loaded from: classes.dex */
public final class C6196g {

    /* renamed from: a */
    public final long f30172a;

    /* renamed from: b */
    public final EnumC6195f f30173b;

    /* renamed from: c */
    public final String f30174c;

    public C6196g(long j6, EnumC6195f enumC6195f, String str) {
        this.f30172a = j6;
        this.f30173b = enumC6195f;
        this.f30174c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Log{sessionId=");
        sb2.append(this.f30172a);
        sb2.append(", level=");
        sb2.append(this.f30173b);
        sb2.append(", message='");
        return AbstractC1452a.m4564k(sb2, this.f30174c, "'}");
    }
}
