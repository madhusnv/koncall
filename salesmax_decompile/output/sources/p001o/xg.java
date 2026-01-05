package p001o;

import java.util.function.Consumer;
import type.UpdateAccountMembershipInput;

/* loaded from: classes.dex */
public final /* synthetic */ class xg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ UpdateAccountMembershipInput.Builder f53717a;

    public /* synthetic */ xg(UpdateAccountMembershipInput.Builder builder) {
        this.f53717a = builder;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f53717a.designation((String) obj);
    }
}
