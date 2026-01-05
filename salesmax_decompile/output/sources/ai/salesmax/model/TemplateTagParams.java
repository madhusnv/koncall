package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.User;
import java.util.Optional;
import p001o.id5;
import p001o.mii;
import p001o.sq8;
import p001o.uni;

/* loaded from: classes.dex */
public final class TemplateTagParams {
    private final Account account;
    private final Leads lead;
    private final LeadsUser user;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final TemplateTagParams defaultInstanceForCurrentUser(Leads leads) {
            mii miiVarSB = uni.kC().SB();
            User userM39171u = miiVarSB.m39171u();
            sq8.m48648g(userM39171u, "getUser(...)");
            Optional optionalM39158h = miiVarSB.m39158h();
            sq8.m48648g(optionalM39158h, "getAccountMembership(...)");
            return new TemplateTagParams(leads, new LeadsUser(userM39171u, optionalM39158h, null, null, 12, null), uni.kC().SB().m39156f());
        }
    }

    public TemplateTagParams(Leads leads, LeadsUser leadsUser, Account account) {
        this.lead = leads;
        this.user = leadsUser;
        this.account = account;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Leads getLead() {
        return this.lead;
    }

    public final LeadsUser getUser() {
        return this.user;
    }
}
