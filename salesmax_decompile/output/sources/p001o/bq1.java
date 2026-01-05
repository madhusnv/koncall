package p001o;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class bq1 implements i76 {
    @Override // p001o.i76
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo19552b(ByteBuffer byteBuffer, File file, rec recVar) throws Throwable {
        try {
            fq1.m27332f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
