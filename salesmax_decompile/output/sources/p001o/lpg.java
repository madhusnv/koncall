package p001o;

import java.util.function.Consumer;
import type.SearchableEngagementFilterInput;
import type.SearchableIDFilterInput;

/* loaded from: classes.dex */
public final /* synthetic */ class lpg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SearchableEngagementFilterInput.Builder f34195a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f34195a.ownerId((SearchableIDFilterInput) obj);
    }
}
