package jakarta.mail.util;

import jakarta.mail.internet.InterfaceC3676y;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.util.b */
/* loaded from: classes3.dex */
public final class C3691b extends ByteArrayInputStream implements InterfaceC3676y {

    /* renamed from: a */
    public final int f19425a;

    public C3691b(byte[] bArr) {
        super(bArr);
        this.f19425a = 0;
    }

    @Override // jakarta.mail.internet.InterfaceC3676y
    public final long getPosition() {
        return ((ByteArrayInputStream) this).pos - this.f19425a;
    }

    @Override // jakarta.mail.internet.InterfaceC3676y
    public final InputStream newStream(long j6, long j10) {
        if (j6 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        int i10 = this.f19425a;
        if (j10 == -1) {
            j10 = ((ByteArrayInputStream) this).count - i10;
        }
        return new C3691b(((ByteArrayInputStream) this).buf, i10 + ((int) j6), (int) (j10 - j6));
    }

    public C3691b(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        this.f19425a = i10;
    }
}
