package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;

/* loaded from: classes6.dex */
public final class na extends qz6 {
    public /* synthetic */ na(File file, File file2, String str, int i, id5 id5Var) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(File file, File file2, String str) {
        super(file, file2, str);
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
    }
}
