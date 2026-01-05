package com.sun.mail.pop3;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class TempFile {
    private File file;

    /* renamed from: sf, reason: collision with root package name */
    private WritableSharedFile f43927sf;

    public TempFile(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("pop3.", ".mbox", file);
        this.file = fileCreateTempFile;
        fileCreateTempFile.deleteOnExit();
        this.f43927sf = new WritableSharedFile(this.file);
    }

    public void close() {
        try {
            this.f43927sf.close();
        } catch (IOException unused) {
        }
        this.file.delete();
    }

    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public AppendStream getAppendStream() {
        return this.f43927sf.getAppendStream();
    }
}
