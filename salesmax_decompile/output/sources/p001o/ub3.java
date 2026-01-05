package p001o;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class ub3 {
    /* renamed from: a */
    public static final void m51325a(Object obj) throws IOException {
        sq8.m48649h(obj, "<this>");
        if (obj instanceof Closeable) {
            ((Closeable) obj).close();
        }
    }
}
