package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class mla extends jla {

    /* renamed from: a */
    public final long f35645a;

    /* renamed from: b */
    public final long f35646b;

    /* renamed from: c */
    public boolean f35647c;

    /* renamed from: d */
    public long f35648d;

    public mla(long j, long j2, long j3) {
        this.f35645a = j3;
        this.f35646b = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f35647c = z;
        this.f35648d = z ? j : j2;
    }

    @Override // p001o.jla
    /* renamed from: a */
    public long mo34006a() {
        long j = this.f35648d;
        if (j != this.f35646b) {
            this.f35648d = this.f35645a + j;
        } else {
            if (!this.f35647c) {
                throw new NoSuchElementException();
            }
            this.f35647c = false;
        }
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35647c;
    }
}
