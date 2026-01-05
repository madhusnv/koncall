package com.sun.mail.pop3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class AppendStream extends OutputStream {
    private long end;
    private RandomAccessFile raf;
    private final long start;

    /* renamed from: tf, reason: collision with root package name */
    private final WritableSharedFile f43925tf;

    public AppendStream(WritableSharedFile writableSharedFile) throws IOException {
        this.f43925tf = writableSharedFile;
        RandomAccessFile writableFile = writableSharedFile.getWritableFile();
        this.raf = writableFile;
        long length = writableFile.length();
        this.start = length;
        this.raf.seek(length);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.end = this.f43925tf.updateLength();
        this.raf = null;
    }

    public synchronized InputStream getInputStream() {
        return this.f43925tf.newStream(this.start, this.end);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.raf.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.raf.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.raf.write(bArr, i10, i11);
    }
}
