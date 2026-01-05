package p001o;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public abstract class p68 extends el1 {

    /* renamed from: a */
    public static final byte[] f39394a = {13, 10};

    /* renamed from: b */
    public static int f39395b = Opcodes.ACC_ENUM;

    /* renamed from: c */
    public static C15964b f39396c;

    /* renamed from: d */
    public static C15963a f39397d;

    /* renamed from: e */
    public static C15965c f39398e;

    /* renamed from: o.p68$a */
    public static class C15963a extends InputStream {
        public C15963a() {
        }

        @Override // java.io.InputStream
        public int read() {
            return -1;
        }
    }

    /* renamed from: o.p68$b */
    public static class C15964b extends OutputStream {
        public C15964b() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
        }
    }

    /* renamed from: o.p68$c */
    public static class C15965c extends Writer {
        public C15965c() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i) {
        }

        @Override // java.io.Writer
        public void write(String str) {
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
        }
    }

    static {
        f39396c = new C15964b();
        f39397d = new C15963a();
        f39398e = new C15965c();
    }

    /* renamed from: A */
    public static Writer m42998A() {
        return f39398e;
    }
}
