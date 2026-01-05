package p001o;

import java.util.function.Consumer;
import type.SearchableEngagementFilterInput;
import type.SearchableIDFilterInput;

/* loaded from: classes.dex */
public final /* synthetic */ class npg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SearchableEngagementFilterInput.Builder f37141a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37141a.primaryTeamId((SearchableIDFilterInput) obj);
    }
}
