package jakarta.mail.internet;

import jakarta.mail.InterfaceC3685q;
import java.util.Enumeration;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.p */
/* loaded from: classes3.dex */
public interface InterfaceC3667p extends InterfaceC3685q {
    String getEncoding();

    String getHeader(String str, String str2);

    Enumeration getNonMatchingHeaderLines(String[] strArr);

    void setText(String str, String str2);
}
