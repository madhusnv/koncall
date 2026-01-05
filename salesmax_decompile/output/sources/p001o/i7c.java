package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class i7c extends x6c {

    /* renamed from: a */
    public final idg f28184a;

    public i7c(idg idgVar) {
        this.f28184a = idgVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        try {
            Object obj = this.f28184a.get();
            Objects.requireNonNull(obj, "The supplier returned a null ObservableSource");
            ((x8c) obj).mo55724b(m9cVar);
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, m9cVar);
        }
    }
}
