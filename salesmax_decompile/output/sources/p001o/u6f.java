package p001o;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public interface u6f extends f8f, WritableByteChannel {

    /* renamed from: o.u6f$a */
    public static final class C17307a {
        /* renamed from: a */
        public static /* synthetic */ void m51044a(u6f u6fVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length - i;
            }
            u6fVar.write(bArr, i, i2);
        }

        /* renamed from: b */
        public static /* synthetic */ void m51045b(u6f u6fVar, String str, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeUtf8");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = str.length();
            }
            u6fVar.mo49491i(str, i, i2);
        }
    }

    long B0(h8f h8fVar);

    /* renamed from: b */
    void mo49488b();

    t6f getBuffer();

    /* renamed from: i */
    void mo49491i(String str, int i, int i2);

    void write(byte[] bArr, int i, int i2);
}
