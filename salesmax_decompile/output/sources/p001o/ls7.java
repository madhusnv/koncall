package p001o;

import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public class ls7 implements loe {
    @Override // p001o.loe
    /* renamed from: a */
    public a76 mo21293a(rec recVar) {
        return a76.SOURCE;
    }

    @Override // p001o.i76
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo19552b(zne zneVar, File file, rec recVar) throws Throwable {
        try {
            fq1.m27332f(((js7) zneVar.get()).m34457c(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
