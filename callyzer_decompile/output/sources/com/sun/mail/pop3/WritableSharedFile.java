package com.sun.mail.pop3;

import jakarta.mail.util.C3693d;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class WritableSharedFile extends C3693d {

    /* renamed from: af, reason: collision with root package name */
    private AppendStream f43928af;
    private RandomAccessFile raf;

    public WritableSharedFile(File file) {
        super(file);
        try {
            this.raf = new RandomAccessFile(file, "rw");
        } catch (IOException unused) {
            super.close();
        }
    }

    @Override // jakarta.mail.util.C3693d, java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            this.raf.close();
        }
    }

    public synchronized AppendStream getAppendStream() {
        AppendStream appendStream;
        if (this.f43928af != null) {
            throw new IOException("POP3 file cache only supports single threaded access");
        }
        appendStream = new AppendStream(this);
        this.f43928af = appendStream;
        return appendStream;
    }

    public RandomAccessFile getWritableFile() {
        return this.raf;
    }

    public synchronized long updateLength() {
        long length;
        length = this.f44379in.length();
        this.datalen = length;
        this.f43928af = null;
        return length;
    }
}
