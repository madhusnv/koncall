package p001o;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class hm1 extends u6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm1(gm1 gm1Var) {
        super(gm1Var);
        sq8.m48649h(gm1Var, "sink");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return m50961a().isOpen();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        sq8.m48649h(byteBuffer, "src");
        return m50961a().write(byteBuffer);
    }
}
