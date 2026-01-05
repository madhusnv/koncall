package jakarta.mail.util;

import java.io.IOException;
import java.io.InputStream;
import nw.InterfaceC5156f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.util.a */
/* loaded from: classes3.dex */
public final class C3690a implements InterfaceC5156f {

    /* renamed from: a */
    public byte[] f19422a;

    /* renamed from: b */
    public int f19423b;

    /* renamed from: c */
    public String f19424c;

    @Override // nw.InterfaceC5156f
    public final String getContentType() {
        return this.f19424c;
    }

    @Override // nw.InterfaceC5156f
    public final InputStream getInputStream() throws IOException {
        byte[] bArr = this.f19422a;
        if (bArr == null) {
            throw new IOException("no data");
        }
        if (this.f19423b < 0) {
            this.f19423b = bArr.length;
        }
        return new C3691b(bArr, 0, this.f19423b);
    }

    @Override // nw.InterfaceC5156f
    public final String getName() {
        return "";
    }
}
