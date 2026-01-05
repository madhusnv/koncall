package p001o;

import java.security.PrivilegedAction;

/* loaded from: classes6.dex */
public final class aja implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ ClassLoader f14847a;

    /* renamed from: b */
    public final /* synthetic */ String f14848b;

    public aja(ClassLoader classLoader, String str) {
        this.f14847a = classLoader;
        this.f14848b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader classLoader = this.f14847a;
        return classLoader != null ? classLoader.getResourceAsStream(this.f14848b) : ClassLoader.getSystemResourceAsStream(this.f14848b);
    }
}
