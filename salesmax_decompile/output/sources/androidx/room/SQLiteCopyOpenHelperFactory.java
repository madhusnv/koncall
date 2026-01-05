package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p001o.meg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class SQLiteCopyOpenHelperFactory implements meg.InterfaceC15303c {
    private final String mCopyFromAssetPath;
    private final File mCopyFromFile;
    private final Callable<InputStream> mCopyFromInputStream;
    private final meg.InterfaceC15303c mDelegate;

    public SQLiteCopyOpenHelperFactory(String str, File file, Callable<InputStream> callable, meg.InterfaceC15303c interfaceC15303c) {
        sq8.m48649h(interfaceC15303c, "mDelegate");
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mCopyFromInputStream = callable;
        this.mDelegate = interfaceC15303c;
    }

    @Override // p001o.meg.InterfaceC15303c
    public meg create(meg.C15302b c15302b) {
        sq8.m48649h(c15302b, "configuration");
        return new SQLiteCopyOpenHelper(c15302b.f35295a, this.mCopyFromAssetPath, this.mCopyFromFile, this.mCopyFromInputStream, c15302b.f35297c.version, this.mDelegate.create(c15302b));
    }
}
