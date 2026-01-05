package p001o;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class b7g extends IOException {

    /* renamed from: a */
    public final fj6 f15658a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7g(fj6 fj6Var) {
        super("stream was reset: " + fj6Var);
        sq8.m48649h(fj6Var, "errorCode");
        this.f15658a = fj6Var;
    }
}
