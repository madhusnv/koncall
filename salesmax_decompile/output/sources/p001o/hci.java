package p001o;

import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.amplifyframework.datastore.generated.model.AddedSourceType;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.datastore.generated.model.UserRegistrationStatus;
import com.amplifyframework.datastore.generated.model.UserStatus;
import com.google.android.gms.cast.MediaError;
import p001o.tji;

/* loaded from: classes.dex */
public abstract class hci {

    /* renamed from: a */
    public static User f26667a = User.builder().addedSourceType(AddedSourceType.ADMIN_ADDED).name("Unknown").registeredNumber("").userRegistrationStatus(UserRegistrationStatus.CONFIRMED).build();

    /* renamed from: b */
    public static AccountMembership f26668b;

    static {
        AccountMembership.MapRegisteredMobileNumberToAccountStep mapRegisteredMobileNumberToAccountStepUserAccountStatus = AccountMembership.builder().userId(MediaError.ERROR_TYPE_ERROR).authorizationLevel(AuthorizationLevel.MEMBER).userAccountStatus(UserStatus.ACTIVE);
        Boolean bool = Boolean.FALSE;
        f26668b = mapRegisteredMobileNumberToAccountStepUserAccountStatus.mapRegisteredMobileNumberToAccount(bool).mapSecondaryMobileNumberToAccount(bool).account(Account.justId(MediaError.ERROR_TYPE_ERROR)).build();
    }

    /* renamed from: e */
    public static void m30244e(final String str) {
        uni.LB().v0(new gu3() { // from class: o.cci
            @Override // p001o.gu3
            public final void accept(Object obj) {
                hci.m30246g((uni) obj);
            }
        }, new gu3() { // from class: o.dci
            @Override // p001o.gu3
            public final void accept(Object obj) {
                hci.m30247h(str, (Throwable) obj);
            }
        });
    }

    /* renamed from: f */
    public static void m30245f(final String str, final String str2) {
        uni.LB().v0(new gu3() { // from class: o.eci
            @Override // p001o.gu3
            public final void accept(Object obj) {
                hci.m30248i(str, (uni) obj);
            }
        }, new gu3() { // from class: o.fci
            @Override // p001o.gu3
            public final void accept(Object obj) {
                hci.m30249j(str2, (Throwable) obj);
            }
        });
    }

    /* renamed from: g */
    public static /* synthetic */ void m30246g(uni uniVar) {
        tji.f47295d.m50080a().m50076J();
        uniVar.JD();
    }

    /* renamed from: h */
    public static /* synthetic */ void m30247h(String str, Throwable th) {
        String.format("Not able to refresh on receiving membership update on id: %s", str);
    }

    /* renamed from: i */
    public static /* synthetic */ void m30248i(String str, uni uniVar) {
        tji.C17133a c17133a = tji.f47295d;
        c17133a.m50080a().h0(str);
        c17133a.m50080a().d0(uniVar.TB().Eo());
        uniVar.JD();
    }

    /* renamed from: j */
    public static /* synthetic */ void m30249j(String str, Throwable th) {
        String.format("Not able to refresh on receiving membership update on id: %s", str);
    }
}
