package p001o;

import com.amazonaws.amplify.generated.graphql.SearchEngagementsQuery;
import java.util.function.Consumer;
import type.SearchableEngagementSortInput;

/* loaded from: classes.dex */
public final /* synthetic */ class wnc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SearchEngagementsQuery.Builder f52396a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f52396a.sort((SearchableEngagementSortInput) obj);
    }
}
