package p001o;

import ai.salesmax.model.WebInitiatedCallEvent;
import android.content.Context;
import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import com.amplifyframework.datastore.generated.model.CallDirection;

/* loaded from: classes.dex */
public final class pe extends rg6 {
    @Override // p001o.rg6
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo43496b(AccountMemberActivity accountMemberActivity, Context context) {
        sq8.m48649h(accountMemberActivity, "entity");
        sq8.m48649h(context, "context");
        if (e9g.m24606x("PLACE_CALL", accountMemberActivity.getInCall(), true)) {
            Long lM16645F = a81.m16645F(accountMemberActivity.getInCallRequestedAt());
            hv1 hv1VarM31195a = hv1.f27574f.m31195a();
            String callPlacementId = accountMemberActivity.getCallPlacementId();
            sq8.m48648g(callPlacementId, "getCallPlacementId(...)");
            String inCallWithContactNumber = accountMemberActivity.getInCallWithContactNumber();
            sq8.m48648g(inCallWithContactNumber, "getInCallWithContactNumber(...)");
            String inCallWithContactId = accountMemberActivity.getInCallWithContactId();
            sq8.m48648g(inCallWithContactId, "getInCallWithContactId(...)");
            String inCallWithContactName = accountMemberActivity.getInCallWithContactName();
            sq8.m48648g(inCallWithContactName, "getInCallWithContactName(...)");
            hv1VarM31195a.m31187s(new WebInitiatedCallEvent(callPlacementId, inCallWithContactNumber, inCallWithContactId, inCallWithContactName, lM16645F, CallDirection.OUTGOING.name(), context));
        }
    }
}
