package p001o;

import java.security.PrivilegedAction;

/* loaded from: classes6.dex */
public final class zia implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f57255a;

    /* renamed from: b */
    public final /* synthetic */ ClassLoader f57256b;

    public zia(String str, ClassLoader classLoader) {
        this.f57255a = str;
        this.f57256b = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return eja.m25135c(this.f57255a, this.f57256b);
    }
}
