package p001o;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class dxh implements Closeable {

    /* renamed from: o.dxh$a */
    public interface InterfaceC13057a {
        /* renamed from: a */
        InterfaceC13057a mo23929a(Context context);

        dxh build();
    }

    /* renamed from: a */
    public abstract nk6 mo23927a();

    /* renamed from: c */
    public abstract cxh mo23928c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo23927a().close();
    }
}
