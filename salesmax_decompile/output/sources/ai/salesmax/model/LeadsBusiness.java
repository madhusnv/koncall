package ai.salesmax.model;

import ai.salesmax.model.LeadsBusiness;
import com.amplifyframework.datastore.generated.model.Business;
import com.amplifyframework.datastore.generated.model.BusinessDetail;
import com.amplifyframework.datastore.generated.model.ContactBusinessMembership;
import java.util.Optional;
import java.util.function.Function;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsBusiness {
    public static final int $stable = 8;
    private BusinessDetail businessDetail;
    private ContactBusinessMembership businessMembership;

    /* JADX WARN: Multi-variable type inference failed */
    public LeadsBusiness() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_companyId_$lambda$1(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_companyName_$lambda$0(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_industry_$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public final BusinessDetail getBusinessDetail() {
        return this.businessDetail;
    }

    public final ContactBusinessMembership getBusinessMembership() {
        return this.businessMembership;
    }

    public final String getCompanyId() {
        String id;
        BusinessDetail businessDetail = this.businessDetail;
        if (businessDetail != null && (id = businessDetail.getId()) != null) {
            return id;
        }
        Optional optionalOfNullable = Optional.ofNullable(this.businessMembership.getBusiness());
        final LeadsBusiness$companyId$1 leadsBusiness$companyId$1 = LeadsBusiness$companyId$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.vz9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsBusiness._get_companyId_$lambda$1(leadsBusiness$companyId$1, obj);
            }
        }).orElse(null);
    }

    public final String getCompanyName() {
        BusinessDetail businessDetail = this.businessDetail;
        String name = businessDetail != null ? businessDetail.getName() : null;
        if (name != null) {
            return name;
        }
        Optional optionalOfNullable = Optional.ofNullable(this.businessMembership.getBusiness());
        final LeadsBusiness$companyName$1 leadsBusiness$companyName$1 = LeadsBusiness$companyName$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.uz9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsBusiness._get_companyName_$lambda$0(leadsBusiness$companyName$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getIndustry() {
        String industry;
        BusinessDetail businessDetail = this.businessDetail;
        if (businessDetail != null && (industry = businessDetail.getIndustry()) != null) {
            return industry;
        }
        Optional optionalOfNullable = Optional.ofNullable(this.businessMembership.getBusiness());
        final LeadsBusiness$industry$1 leadsBusiness$industry$1 = LeadsBusiness$industry$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.tz9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return LeadsBusiness._get_industry_$lambda$2(leadsBusiness$industry$1, obj);
            }
        }).orElse(null);
    }

    public final void setBusinessDetail(BusinessDetail businessDetail) {
        this.businessDetail = businessDetail;
    }

    public final void setBusinessMembership(ContactBusinessMembership contactBusinessMembership) {
        sq8.m48649h(contactBusinessMembership, "<set-?>");
        this.businessMembership = contactBusinessMembership;
    }

    public final BusinessSummary toBusinessSummary() {
        Business business = this.businessMembership.getBusiness();
        sq8.m48648g(business, "getBusiness(...)");
        return new BusinessSummary(business);
    }

    public LeadsBusiness(ContactBusinessMembership contactBusinessMembership, BusinessDetail businessDetail) {
        sq8.m48649h(contactBusinessMembership, "businessMembership");
        this.businessMembership = contactBusinessMembership;
        this.businessDetail = businessDetail;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LeadsBusiness(ContactBusinessMembership contactBusinessMembership, BusinessDetail businessDetail, int i, id5 id5Var) {
        if ((i & 1) != 0) {
            contactBusinessMembership = ContactBusinessMembership.justId("");
            sq8.m48648g(contactBusinessMembership, "justId(...)");
        }
        this(contactBusinessMembership, (i & 2) != 0 ? null : businessDetail);
    }
}
