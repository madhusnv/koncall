package p001o;

import java.io.Serializable;
import java.util.function.Function;

/* loaded from: classes6.dex */
public final /* synthetic */ class il7 implements ll7, Serializable {

    /* renamed from: a */
    public final /* synthetic */ ll7 f28812a;

    /* renamed from: b */
    public final /* synthetic */ Function f28813b;

    public /* synthetic */ il7(ll7 ll7Var, Function function) {
        this.f28812a = ll7Var;
        this.f28813b = function;
    }

    @Override // p001o.ll7, java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return this.f28812a.m37426n(this.f28813b, obj, obj2);
    }
}
