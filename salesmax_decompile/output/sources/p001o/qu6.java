package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import p001o.oq1;

/* loaded from: classes3.dex */
public final class qu6 extends oq1.AbstractC15866d {

    /* renamed from: c */
    public final File f42424c;

    /* renamed from: d */
    public final long f42425d;

    /* renamed from: e */
    public final long f42426e;

    /* renamed from: f */
    public final boolean f42427f;

    public qu6(File file, long j, long j2) {
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        this.f42424c = file;
        this.f42425d = j;
        this.f42426e = j2;
    }

    @Override // p001o.oq1
    /* renamed from: a */
    public Long mo39989a() {
        return Long.valueOf((this.f42426e - this.f42425d) + 1);
    }

    @Override // p001o.oq1
    /* renamed from: b */
    public boolean mo39991b() {
        return this.f42427f;
    }

    @Override // p001o.oq1.AbstractC15866d
    /* renamed from: c */
    public h8f mo39993c() {
        return h69.m29834b(this.f42424c, this.f42425d, this.f42426e);
    }
}
