package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.RandomAccessFile;

/* loaded from: classes6.dex */
public class jb9 extends pz6 {
    @Override // p001o.pz6
    /* renamed from: a */
    public rw6 mo24957a(wzc wzcVar) {
        sq8.m48649h(wzcVar, TransferTable.COLUMN_FILE);
        return new ib9(false, new RandomAccessFile(wzcVar.m55479t(), "r"));
    }

    @Override // p001o.pz6
    /* renamed from: b */
    public lzf mo24958b(wzc wzcVar) {
        sq8.m48649h(wzcVar, TransferTable.COLUMN_FILE);
        return uac.m51315h(wzcVar.m55479t());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
