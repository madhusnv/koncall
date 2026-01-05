package p001o;

import java.io.File;
import p001o.ot5;

/* loaded from: classes5.dex */
public abstract class ut5 implements ot5.InterfaceC15889a {

    /* renamed from: a */
    public final long f49461a;

    /* renamed from: b */
    public final InterfaceC17445a f49462b;

    /* renamed from: o.ut5$a */
    public interface InterfaceC17445a {
        /* renamed from: a */
        File mo19496a();
    }

    public ut5(InterfaceC17445a interfaceC17445a, long j) {
        this.f49461a = j;
        this.f49462b = interfaceC17445a;
    }

    @Override // p001o.ot5.InterfaceC15889a
    public ot5 build() {
        File fileMo19496a = this.f49462b.mo19496a();
        if (fileMo19496a == null) {
            return null;
        }
        if (fileMo19496a.isDirectory() || fileMo19496a.mkdirs()) {
            return vt5.m53400c(fileMo19496a, this.f49461a);
        }
        return null;
    }
}
