package p001o;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class z28 extends IOException {

    /* renamed from: a */
    public final int f56435a;

    public z28(int i) {
        this("Http request failed", i);
    }

    public z28(String str, int i) {
        this(str, i, null);
    }

    public z28(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
        this.f56435a = i;
    }
}
