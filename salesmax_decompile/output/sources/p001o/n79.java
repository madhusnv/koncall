package p001o;

import androidx.camera.core.InterfaceC1893c;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class n79 {

    /* renamed from: a */
    public final IncorrectJpegMetadataQuirk f36513a;

    public n79(l5e l5eVar) {
        this.f36513a = (IncorrectJpegMetadataQuirk) l5eVar.m36594b(IncorrectJpegMetadataQuirk.class);
    }

    /* renamed from: a */
    public byte[] m40204a(InterfaceC1893c interfaceC1893c) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f36513a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.m4715f(interfaceC1893c);
        }
        ByteBuffer buffer = interfaceC1893c.u1()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }
}
