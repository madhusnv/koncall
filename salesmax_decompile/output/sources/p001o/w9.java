package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes3.dex */
public abstract class w9 implements dth {

    /* renamed from: a */
    public final rzf f51634a = rzf.f44340a.m47363a();

    @Override // p001o.dth
    public rzf A2() {
        return this.f51634a;
    }

    @Override // p001o.dth
    public void Z0(vzf vzfVar) {
        sq8.m48649h(vzfVar, "status");
    }

    @Override // p001o.dth, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p001o.dth
    /* renamed from: p */
    public void mo23814p(kx0 kx0Var, Object obj) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
    }
}
