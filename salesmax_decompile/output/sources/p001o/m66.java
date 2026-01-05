package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes2.dex */
public final class m66 extends elb {

    /* renamed from: a */
    public static final m66 f34852a = new m66();

    public m66() {
        super(null);
    }

    @Override // p001o.elb
    /* renamed from: a */
    public boolean mo25208a(blb blbVar) {
        sq8.m48649h(blbVar, TransferTable.COLUMN_KEY);
        return false;
    }

    @Override // p001o.elb
    /* renamed from: b */
    public Object mo25209b(blb blbVar) {
        sq8.m48649h(blbVar, TransferTable.COLUMN_KEY);
        throw new IllegalStateException("".toString());
    }
}
