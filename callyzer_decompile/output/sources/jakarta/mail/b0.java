package jakarta.mail;

import java.net.URL;
import java.security.PrivilegedExceptionAction;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 implements PrivilegedExceptionAction {

    /* renamed from: a */
    public final /* synthetic */ int f19283a;

    /* renamed from: b */
    public final /* synthetic */ URL f19284b;

    public /* synthetic */ b0(URL url, int i10) {
        this.f19283a = i10;
        this.f19284b = url;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        switch (this.f19283a) {
        }
        return this.f19284b.openStream();
    }
}
