package qz;

import java.io.IOException;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.r */
/* loaded from: classes3.dex */
public abstract class AbstractC6400r {
    /* renamed from: a */
    public static int m12394a(int i10, int i11, int i12) throws IOException {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(AbstractC5601a.m11235f("PROTOCOL_ERROR padding ", i12, i10, " > remaining length "));
    }
}
