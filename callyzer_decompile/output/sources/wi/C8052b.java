package wi;

import java.io.File;
import zi.b0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.b */
/* loaded from: classes.dex */
public final class C8052b {

    /* renamed from: a */
    public final b0 f38570a;

    /* renamed from: b */
    public final String f38571b;

    /* renamed from: c */
    public final File f38572c;

    public C8052b(b0 b0Var, String str, File file) {
        this.f38570a = b0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f38571b = str;
        this.f38572c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8052b)) {
            return false;
        }
        C8052b c8052b = (C8052b) obj;
        return this.f38570a.equals(c8052b.f38570a) && this.f38571b.equals(c8052b.f38571b) && this.f38572c.equals(c8052b.f38572c);
    }

    public final int hashCode() {
        return ((((this.f38570a.hashCode() ^ 1000003) * 1000003) ^ this.f38571b.hashCode()) * 1000003) ^ this.f38572c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f38570a + ", sessionId=" + this.f38571b + ", reportFile=" + this.f38572c + "}";
    }
}
