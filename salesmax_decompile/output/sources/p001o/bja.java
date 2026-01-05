package p001o;

import java.io.IOException;
import java.security.PrivilegedAction;

/* loaded from: classes6.dex */
public final class bja implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ ClassLoader f16438a;

    /* renamed from: b */
    public final /* synthetic */ String f16439b;

    public bja(ClassLoader classLoader, String str) {
        this.f16438a = classLoader;
        this.f16439b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        try {
            ClassLoader classLoader = this.f16438a;
            return classLoader != null ? classLoader.getResources(this.f16439b) : ClassLoader.getSystemResources(this.f16439b);
        } catch (IOException e) {
            if (eja.m25152t()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.f16439b);
                stringBuffer.append(":");
                stringBuffer.append(e.getMessage());
                eja.m25154v(stringBuffer.toString());
            }
            return null;
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }
}
