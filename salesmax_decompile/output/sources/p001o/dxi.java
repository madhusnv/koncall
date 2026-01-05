package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;

/* loaded from: classes2.dex */
public abstract class dxi {

    /* renamed from: a */
    public final exi f20631a = new exi();

    /* renamed from: b */
    public final void m23930b(String str, AutoCloseable autoCloseable) throws Exception {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(autoCloseable, "closeable");
        exi exiVar = this.f20631a;
        if (exiVar != null) {
            exiVar.m25830d(str, autoCloseable);
        }
    }

    /* renamed from: c */
    public final void m23931c() {
        exi exiVar = this.f20631a;
        if (exiVar != null) {
            exiVar.m25831e();
        }
        mo6354e();
    }

    /* renamed from: d */
    public final AutoCloseable m23932d(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        exi exiVar = this.f20631a;
        if (exiVar != null) {
            return exiVar.m25833g(str);
        }
        return null;
    }

    /* renamed from: e */
    public void mo6354e() {
    }
}
