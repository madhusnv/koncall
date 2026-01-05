package p001o;

import java.io.EOFException;

/* loaded from: classes6.dex */
public class dj6 extends EOFException {
    public dj6() {
    }

    public dj6(String str) {
        super(str);
    }

    public dj6(Throwable th) {
        initCause(th);
    }
}
