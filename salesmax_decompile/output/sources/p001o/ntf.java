package p001o;

import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class ntf implements gdb {
    @Override // p001o.gdb
    /* renamed from: a */
    public final Metadata mo28502a(mdb mdbVar) {
        ByteBuffer byteBuffer = (ByteBuffer) op0.m42515e(mdbVar.f14282d);
        op0.m42511a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo33901b(mdbVar, byteBuffer);
    }

    /* renamed from: b */
    public abstract Metadata mo33901b(mdb mdbVar, ByteBuffer byteBuffer);
}
