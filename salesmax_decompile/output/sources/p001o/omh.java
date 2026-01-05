package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class omh extends CancellationException {

    /* renamed from: a */
    public final transient p69 f38602a;

    public omh(String str, p69 p69Var) {
        super(str);
        this.f38602a = p69Var;
    }

    public omh(String str) {
        this(str, null);
    }
}
