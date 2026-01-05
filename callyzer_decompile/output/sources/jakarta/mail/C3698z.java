package jakarta.mail;

import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.z */
/* loaded from: classes3.dex */
public final class C3698z implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ int f19435a;

    /* renamed from: b */
    public final /* synthetic */ ClassLoader f19436b;

    /* renamed from: c */
    public final /* synthetic */ String f19437c;

    public /* synthetic */ C3698z(ClassLoader classLoader, String str, int i10) {
        this.f19435a = i10;
        this.f19436b = classLoader;
        this.f19437c = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() throws IOException {
        switch (this.f19435a) {
            case 0:
                URL[] urlArr = null;
                try {
                    ArrayList list = Collections.list(this.f19436b.getResources(this.f19437c));
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
                    Enumeration<URL> resources = this.f19436b.getResources(this.f19437c);
                    while (resources != null && resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
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
