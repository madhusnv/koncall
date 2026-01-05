package p001o;

import com.amazonaws.amplify.generated.graphql.SearchEngagementsQuery;
import java.util.function.Consumer;
import type.SearchableEngagementFilterInput;

/* loaded from: classes.dex */
public final /* synthetic */ class vnc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SearchEngagementsQuery.Builder f50597a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f50597a.filter((SearchableEngagementFilterInput) obj);
    }
}
