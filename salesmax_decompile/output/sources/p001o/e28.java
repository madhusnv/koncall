package p001o;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/* loaded from: classes6.dex */
public class e28 extends PrintWriter {

    /* renamed from: a */
    public final /* synthetic */ f28 f20827a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e28(f28 f28Var, Writer writer) {
        super(writer);
        this.f20827a = f28Var;
    }

    @Override // java.io.PrintWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((PrintWriter) this).out.close();
        } catch (IOException e) {
            tia.m49922d(e);
            setError();
        }
    }
}
