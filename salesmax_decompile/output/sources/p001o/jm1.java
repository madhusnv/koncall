package p001o;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class jm1 extends v6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm1(im1 im1Var) {
        super(im1Var);
        sq8.m48649h(im1Var, "source");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return m52350a().isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        sq8.m48649h(byteBuffer, "dst");
        return m52350a().read(byteBuffer);
    }
}
