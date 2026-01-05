package p001o;

import com.amplifyframework.api.graphql.GraphQLResponse;

/* loaded from: classes.dex */
public final /* synthetic */ class n98 implements ggd {

    /* renamed from: a */
    public final /* synthetic */ ja8 f36589a;

    public /* synthetic */ n98(ja8 ja8Var) {
        this.f36589a = ja8Var;
    }

    @Override // p001o.ggd
    public final boolean test(Object obj) {
        return this.f36589a.raiseIfErrorInResponse((GraphQLResponse) obj);
    }
}
