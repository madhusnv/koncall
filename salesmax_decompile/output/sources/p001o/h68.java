package p001o;

import android.content.Context;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface h68 {
    static /* synthetic */ x6c E9(boolean z, Context context) {
        return fia.f23398f.m26768a().m26760f(context, z);
    }

    static /* synthetic */ x6c Yg(boolean z, Context context) {
        return fia.f23398f.m26768a().m26760f(context, z);
    }

    default x6c Jh(final boolean z) {
        return (x6c) getContext().map(new Function() { // from class: o.g68
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return h68.E9(z, (Context) obj);
            }
        }).orElse(x6c.c0(Optional.empty()));
    }

    default Optional getContext() {
        return Optional.empty();
    }

    default x6c pa(Long l, final boolean z) {
        return (x6c) getContext().map(new Function() { // from class: o.f68
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return h68.Yg(z, (Context) obj);
            }
        }).orElse(x6c.c0(Optional.empty()));
    }
}
