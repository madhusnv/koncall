package p001o;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class pj8 implements ioe {

    /* renamed from: a */
    public final ki1 f40168a = new ki1();

    @Override // p001o.ioe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zne mo16416b(InputStream inputStream, int i, int i2, rec recVar) {
        return this.f40168a.m35723c(ImageDecoder.createSource(fq1.m27328b(inputStream)), i, i2, recVar);
    }

    @Override // p001o.ioe
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo16415a(InputStream inputStream, rec recVar) {
        return true;
    }
}
