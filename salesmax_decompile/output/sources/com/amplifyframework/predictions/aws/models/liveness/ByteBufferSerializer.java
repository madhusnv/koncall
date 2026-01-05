package com.amplifyframework.predictions.aws.models.liveness;

import android.util.Base64;
import java.nio.ByteBuffer;
import p001o.dc9;
import p001o.h76;
import p001o.sq8;
import p001o.uef;
import p001o.vhd;
import p001o.w75;
import p001o.yef;

/* loaded from: classes5.dex */
final class ByteBufferSerializer implements dc9 {
    public static final ByteBufferSerializer INSTANCE = new ByteBufferSerializer();
    private static final uef descriptor = yef.m57704a("ByteBuffer", vhd.C17587i.f50350a);

    private ByteBufferSerializer() {
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return descriptor;
    }

    @Override // p001o.bn5
    public ByteBuffer deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(Base64.decode(w75Var.mo17215B(), 2));
        sq8.m48648g(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    @Override // p001o.iff
    public void serialize(h76 h76Var, ByteBuffer byteBuffer) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(byteBuffer, "value");
        byteBuffer.mark();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        byteBuffer.reset();
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        sq8.m48648g(strEncodeToString, "encodeToString(...)");
        h76Var.mo29875F(strEncodeToString);
    }
}
