package androidx.work.impl;

import android.content.Context;
import java.io.File;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class Api21Impl {
    public static final Api21Impl INSTANCE = new Api21Impl();

    private Api21Impl() {
    }

    public final File getNoBackupFilesDir(Context context) {
        sq8.m48649h(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        sq8.m48648g(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
