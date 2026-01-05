package p001o;

import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.rx.RxAmplify;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public class f58 {

    /* renamed from: a */
    public static final f58 f22753a = new f58();

    /* renamed from: a */
    public static f58 m26169a() {
        return f22753a;
    }

    /* renamed from: b */
    public su5 m26170b(HubChannel hubChannel, ggd ggdVar, final Function function, final Consumer consumer, final Consumer consumer2, final Runnable runnable) {
        x6c x6cVarM55027y = RxAmplify.Hub.on(hubChannel).m55726d(ggdVar).m55027y();
        Objects.requireNonNull(function);
        x6c x6cVarM55717M = x6cVarM55027y.m55717M(new rl7() { // from class: o.b58
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (x8c) function.apply((Boolean) obj);
            }
        });
        Objects.requireNonNull(consumer);
        gu3 gu3Var = new gu3() { // from class: o.c58
            @Override // p001o.gu3
            public final void accept(Object obj) {
                consumer.accept(obj);
            }
        };
        Objects.requireNonNull(consumer2);
        gu3 gu3Var2 = new gu3() { // from class: o.d58
            @Override // p001o.gu3
            public final void accept(Object obj) {
                consumer2.accept((Throwable) obj);
            }
        };
        Objects.requireNonNull(runnable);
        return x6cVarM55717M.w0(gu3Var, gu3Var2, new jm() { // from class: o.e58
            @Override // p001o.jm
            public final void run() {
                runnable.run();
            }
        });
    }
}
