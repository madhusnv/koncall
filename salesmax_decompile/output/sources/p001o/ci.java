package p001o;

import com.amplifyframework.api.graphql.GraphQLResponse;

/* loaded from: classes.dex */
public final /* synthetic */ class ci implements ggd {

    /* renamed from: a */
    public final /* synthetic */ ni f18213a;

    public /* synthetic */ ci(ni niVar) {
        this.f18213a = niVar;
    }

    @Override // p001o.ggd
    public final boolean test(Object obj) {
        return this.f18213a.raiseIfErrorInResponse((GraphQLResponse) obj);
    }
}
