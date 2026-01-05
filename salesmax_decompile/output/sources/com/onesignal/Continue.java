package com.onesignal;

import java.util.function.Consumer;
import p001o.eu5;
import p001o.n64;
import p001o.q74;
import p001o.sq8;
import p001o.vre;

/* loaded from: classes6.dex */
public final class Continue {
    public static final Continue INSTANCE = new Continue();

    private Continue() {
    }

    public static final <R> n64 none() {
        return new n64() { // from class: com.onesignal.Continue.none.1
            @Override // p001o.n64
            public q74 getContext() {
                return eu5.m25612c();
            }

            @Override // p001o.n64
            public void resumeWith(Object obj) {
            }
        };
    }

    public static final <R> n64 with(Consumer<ContinueResult<R>> consumer) {
        sq8.m48649h(consumer, "onFinished");
        return with$default(consumer, null, 2, null);
    }

    public static /* synthetic */ n64 with$default(Consumer consumer, q74 q74Var, int i, Object obj) {
        if ((i & 2) != 0) {
            q74Var = eu5.m25612c();
        }
        return with(consumer, q74Var);
    }

    public static final <R> n64 with(final Consumer<ContinueResult<R>> consumer, final q74 q74Var) {
        sq8.m48649h(consumer, "onFinished");
        sq8.m48649h(q74Var, "context");
        return new n64() { // from class: com.onesignal.Continue.with.1
            @Override // p001o.n64
            public q74 getContext() {
                return q74Var;
            }

            @Override // p001o.n64
            public void resumeWith(Object obj) {
                consumer.accept(new ContinueResult(vre.m53357h(obj), vre.m53356g(obj) ? null : obj, vre.m53354e(obj)));
            }
        };
    }
}
