package p001o;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class p7f extends o7f {

    /* renamed from: b */
    public final Closeable f39558b;

    public p7f(Closeable closeable) {
        sq8.m48649h(closeable, "closeable");
        this.f39558b = closeable;
    }

    @Override // p001o.o7f, p001o.n7f
    /* renamed from: a */
    public boolean mo40230a() throws IOException {
        boolean zMo40230a = super.mo40230a();
        if (zMo40230a) {
            this.f39558b.close();
        }
        return zMo40230a;
    }
}
