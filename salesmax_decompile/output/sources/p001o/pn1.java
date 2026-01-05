package p001o;

import com.amplifyframework.datastore.generated.model.AccountType;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.List;

/* loaded from: classes.dex */
public final class pn1 {

    /* renamed from: a */
    public String f40281a;

    /* renamed from: b */
    public String f40282b;

    /* renamed from: c */
    public AuthorizationLevel f40283c;

    /* renamed from: d */
    public final List f40284d;

    /* renamed from: e */
    public final t2h f40285e;

    /* renamed from: f */
    public final AccountType f40286f;

    public pn1(String str, String str2, AuthorizationLevel authorizationLevel, List list, t2h t2hVar, AccountType accountType) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(list, "teams");
        this.f40281a = str;
        this.f40282b = str2;
        this.f40283c = authorizationLevel;
        this.f40284d = list;
        this.f40285e = t2hVar;
        this.f40286f = accountType;
    }

    /* renamed from: a */
    public final AccountType m43900a() {
        return this.f40286f;
    }

    /* renamed from: b */
    public final String m43901b() {
        return this.f40281a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn1)) {
            return false;
        }
        pn1 pn1Var = (pn1) obj;
        return sq8.m48644c(this.f40281a, pn1Var.f40281a) && sq8.m48644c(this.f40282b, pn1Var.f40282b) && this.f40283c == pn1Var.f40283c && sq8.m48644c(this.f40284d, pn1Var.f40284d) && sq8.m48644c(this.f40285e, pn1Var.f40285e) && this.f40286f == pn1Var.f40286f;
    }

    public int hashCode() {
        int iHashCode = this.f40281a.hashCode() * 31;
        String str = this.f40282b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AuthorizationLevel authorizationLevel = this.f40283c;
        int iHashCode3 = (((iHashCode2 + (authorizationLevel == null ? 0 : authorizationLevel.hashCode())) * 31) + this.f40284d.hashCode()) * 31;
        t2h t2hVar = this.f40285e;
        int iHashCode4 = (iHashCode3 + (t2hVar == null ? 0 : t2hVar.hashCode())) * 31;
        AccountType accountType = this.f40286f;
        return iHashCode4 + (accountType != null ? accountType.hashCode() : 0);
    }

    public String toString() {
        return "Business(id=" + this.f40281a + ", name=" + this.f40282b + ", authorizationLevel=" + this.f40283c + ", teams=" + this.f40284d + ", defaultTeam=" + this.f40285e + ", businessType=" + this.f40286f + ")";
    }
}
