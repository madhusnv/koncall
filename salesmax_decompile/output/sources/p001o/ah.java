package p001o;

import java.util.function.Consumer;
import type.AuthorizationLevel;
import type.UpdateAccountMembershipInput;

/* loaded from: classes.dex */
public final /* synthetic */ class ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ UpdateAccountMembershipInput.Builder f14686a;

    public /* synthetic */ ah(UpdateAccountMembershipInput.Builder builder) {
        this.f14686a = builder;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f14686a.authorizationLevel((AuthorizationLevel) obj);
    }
}
