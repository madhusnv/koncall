package jakarta.mail;

import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ int f19281a;

    /* renamed from: b */
    public final /* synthetic */ String f19282b;

    public /* synthetic */ a0(String str, int i10) {
        this.f19281a = i10;
        this.f19282b = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() throws IOException {
        switch (this.f19281a) {
            case 0:
                URL[] urlArr = null;
                try {
                    ArrayList list = Collections.list(ClassLoader.getSystemResources(this.f19282b));
                    if (list.isEmpty()) {
                        return null;
                    }
                    urlArr = new URL[list.size()];
                    list.toArray(urlArr);
                    return urlArr;
                } catch (IOException | SecurityException unused) {
                    return urlArr;
                }
            default:
                URL[] urlArr2 = null;
                try {
                    ArrayList arrayList = new ArrayList();
                    Enumeration<URL> systemResources = ClassLoader.getSystemResources(this.f19282b);
                    while (systemResources != null && systemResources.hasMoreElements()) {
                        URL urlNextElement = systemResources.nextElement();
                        if (urlNextElement != null) {
                            arrayList.add(urlNextElement);
                        }
                    }
                    if (arrayList.size() <= 0) {
                        return null;
                    }
                    urlArr2 = new URL[arrayList.size()];
                    return (URL[]) arrayList.toArray(urlArr2);
                } catch (IOException | SecurityException unused2) {
                    return urlArr2;
                }
        }
    }
}
