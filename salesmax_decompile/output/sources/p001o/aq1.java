package p001o;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class aq1 implements ioe {

    /* renamed from: a */
    public final ki1 f15123a = new ki1();

    @Override // p001o.ioe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zne mo16416b(ByteBuffer byteBuffer, int i, int i2, rec recVar) {
        return this.f15123a.m35723c(ImageDecoder.createSource(byteBuffer), i, i2, recVar);
    }

    @Override // p001o.ioe
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo16415a(ByteBuffer byteBuffer, rec recVar) {
        return true;
    }
}
