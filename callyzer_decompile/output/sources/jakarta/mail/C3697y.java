package jakarta.mail;

import java.io.IOException;
import java.security.PrivilegedExceptionAction;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.y */
/* loaded from: classes3.dex */
public final class C3697y implements PrivilegedExceptionAction {

    /* renamed from: a */
    public final /* synthetic */ int f19432a;

    /* renamed from: b */
    public final /* synthetic */ Class f19433b;

    /* renamed from: c */
    public final /* synthetic */ String f19434c;

    public /* synthetic */ C3697y(Class cls, String str, int i10) {
        this.f19432a = i10;
        this.f19433b = cls;
        this.f19434c = str;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() throws IOException {
        switch (this.f19432a) {
            case 0:
                try {
                    return this.f19433b.getResourceAsStream(this.f19434c);
                } catch (RuntimeException e2) {
                    IOException iOException = new IOException("ClassLoader.getResourceAsStream failed");
                    iOException.initCause(e2);
                    throw iOException;
                }
            default:
                return this.f19433b.getResourceAsStream(this.f19434c);
        }
    }
}
