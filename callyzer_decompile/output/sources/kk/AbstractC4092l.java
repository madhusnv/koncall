package kk;

import java.io.IOException;
import java.io.StringWriter;
import nk.C5091n;
import nk.m1;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.l */
/* loaded from: classes.dex */
public abstract class AbstractC4092l {
    /* renamed from: a */
    public int mo8867a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public final C4094n m8870b() {
        if (this instanceof C4094n) {
            return (C4094n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: c */
    public String mo8868c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C6566c c6566c = new C6566c(stringWriter);
            c6566c.m12585S(EnumC4099s.LENIENT);
            m1.f24967z.getClass();
            C5091n.m10020f(c6566c, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
