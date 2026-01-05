package p001o;

import java.io.Writer;

/* loaded from: classes2.dex */
public final class mja extends Writer {

    /* renamed from: a */
    public final String f35549a;

    /* renamed from: b */
    public StringBuilder f35550b = new StringBuilder(128);

    public mja(String str) {
        this.f35549a = str;
    }

    /* renamed from: a */
    public final void m39184a() {
        if (this.f35550b.length() > 0) {
            this.f35550b.toString();
            StringBuilder sb = this.f35550b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m39184a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m39184a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m39184a();
            } else {
                this.f35550b.append(c);
            }
        }
    }
}
