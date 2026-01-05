package p001o;

import ai.salesmax.model.LeadFilter;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class c0i implements Function {

    /* renamed from: a */
    public final /* synthetic */ LeadFilter.Companion f17083a;

    public /* synthetic */ c0i(LeadFilter.Companion companion) {
        this.f17083a = companion;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f17083a.fromJson((String) obj);
    }
}
