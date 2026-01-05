package net.schmizz.sshj.common;

import com.sun.mail.util.AbstractC1452a;
import java.io.IOException;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class SSHException extends IOException {

    /* renamed from: b */
    public static final C5033m f24772b = new C5033m();

    /* renamed from: a */
    public final EnumC5023c f24773a;

    public SSHException(EnumC5023c enumC5023c, String str, Throwable th2) {
        super(str);
        this.f24773a = enumC5023c;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        if (getCause() == null || getCause().getMessage() == null) {
            return null;
        }
        return getCause().getMessage();
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        String name = getClass().getName();
        EnumC5023c enumC5023c = EnumC5023c.UNKNOWN;
        EnumC5023c enumC5023c2 = this.f24773a;
        if (enumC5023c2 != enumC5023c) {
            str = "[" + enumC5023c2 + "] ";
        } else {
            str = "";
        }
        String message = getMessage() != null ? getMessage() : "";
        return a1.m14335o(AbstractC1452a.m4568o(name), (str.isEmpty() && message.isEmpty()) ? "" : ": ", str, message);
    }

    public SSHException(String str) {
        this(EnumC5023c.UNKNOWN, str, null);
    }

    public SSHException(Throwable th2) {
        this(EnumC5023c.UNKNOWN, null, th2);
    }
}
