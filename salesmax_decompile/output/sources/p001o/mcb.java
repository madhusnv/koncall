package p001o;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes6.dex */
public final class mcb implements Closeable {

    /* renamed from: a */
    public final boolean f35177a;

    /* renamed from: b */
    public final rl1 f35178b;

    /* renamed from: c */
    public final Inflater f35179c;

    /* renamed from: d */
    public final di8 f35180d;

    public mcb(boolean z) {
        this.f35177a = z;
        rl1 rl1Var = new rl1();
        this.f35178b = rl1Var;
        Inflater inflater = new Inflater(true);
        this.f35179c = inflater;
        this.f35180d = new di8((lzf) rl1Var, inflater);
    }

    /* renamed from: a */
    public final void m38742a(rl1 rl1Var) throws DataFormatException, IOException {
        sq8.m48649h(rl1Var, "buffer");
        if (!(this.f35178b.f0() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f35177a) {
            this.f35179c.reset();
        }
        this.f35178b.p0(rl1Var);
        this.f35178b.mo29023I(65535);
        long bytesRead = this.f35179c.getBytesRead() + this.f35178b.f0();
        do {
            this.f35180d.m23225a(rl1Var, Long.MAX_VALUE);
            if (this.f35179c.getBytesRead() >= bytesRead) {
                return;
            }
        } while (!this.f35179c.finished());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35180d.close();
    }
}
