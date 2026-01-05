package p001o;

import java.security.PrivilegedAction;

/* loaded from: classes6.dex */
public final class dja implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f20121a;

    /* renamed from: b */
    public final /* synthetic */ String f20122b;

    public dja(String str, String str2) {
        this.f20121a = str;
        this.f20122b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.f20121a, this.f20122b);
    }
}
