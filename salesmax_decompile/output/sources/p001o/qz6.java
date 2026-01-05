package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class qz6 extends IOException {

    /* renamed from: a */
    public final File f42644a;

    /* renamed from: b */
    public final File f42645b;

    /* renamed from: c */
    public final String f42646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz6(File file, File file2, String str) {
        super(bl6.m19319b(file, file2, str));
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        this.f42644a = file;
        this.f42645b = file2;
        this.f42646c = str;
    }
}
