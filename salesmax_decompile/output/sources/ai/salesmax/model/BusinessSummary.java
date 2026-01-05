package ai.salesmax.model;

import ai.salesmax.model.BusinessSummary;
import com.amplifyframework.datastore.generated.model.Business;
import java.util.Optional;
import java.util.function.Function;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class BusinessSummary {
    private Business business;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Business newInstance() {
            Business businessBuild = Business.builder().accountId("").name("").id("").website(null).build();
            sq8.m48646e(businessBuild);
            return businessBuild;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BusinessSummary() {
        this(null, 1, 0 == true ? 1 : 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_priority_$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_website_$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    public final Business getBusiness() {
        return this.business;
    }

    public final String getCompanyId() {
        Optional optionalOfNullable = Optional.ofNullable(this.business);
        final BusinessSummary$companyId$1 businessSummary$companyId$1 = BusinessSummary$companyId$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.ro1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BusinessSummary._get_companyId_$lambda$1(businessSummary$companyId$1, obj);
            }
        }).orElse(null);
    }

    public final String getCompanyName() {
        Optional optionalOfNullable = Optional.ofNullable(this.business);
        final BusinessSummary$companyName$1 businessSummary$companyName$1 = BusinessSummary$companyName$1.INSTANCE;
        Object objOrElse = optionalOfNullable.map(new Function() { // from class: o.uo1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BusinessSummary._get_companyName_$lambda$0(businessSummary$companyName$1, obj);
            }
        }).orElse("");
        sq8.m48648g(objOrElse, "orElse(...)");
        return (String) objOrElse;
    }

    public final String getIndustry() {
        Optional optionalOfNullable = Optional.ofNullable(this.business);
        final BusinessSummary$industry$1 businessSummary$industry$1 = BusinessSummary$industry$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.to1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BusinessSummary._get_industry_$lambda$2(businessSummary$industry$1, obj);
            }
        }).orElse(null);
    }

    public final String getPriority() {
        Optional optionalOfNullable = Optional.ofNullable(this.business);
        final BusinessSummary$priority$1 businessSummary$priority$1 = BusinessSummary$priority$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.qo1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BusinessSummary._get_priority_$lambda$4(businessSummary$priority$1, obj);
            }
        }).orElse(null);
    }

    public final Object getProperty(String str) {
        return null;
    }

    public final String getWebsite() {
        Optional optionalOfNullable = Optional.ofNullable(this.business);
        final BusinessSummary$website$1 businessSummary$website$1 = BusinessSummary$website$1.INSTANCE;
        return (String) optionalOfNullable.map(new Function() { // from class: o.so1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BusinessSummary._get_website_$lambda$3(businessSummary$website$1, obj);
            }
        }).orElse(null);
    }

    public final void setBusiness(Business business) {
        sq8.m48649h(business, "<set-?>");
        this.business = business;
    }

    public final void setCompanyId(String str) {
        Business businessBuild = this.business.copyOfBuilder().id(str).build();
        sq8.m48648g(businessBuild, "build(...)");
        this.business = businessBuild;
    }

    public final void setCompanyName(String str) {
        sq8.m48649h(str, "value");
        Business businessBuild = this.business.copyOfBuilder().name(str).build();
        sq8.m48648g(businessBuild, "build(...)");
        this.business = businessBuild;
    }

    public final void setIndustry(String str) {
        Business businessBuild = this.business.copyOfBuilder().industry(str).build();
        sq8.m48648g(businessBuild, "build(...)");
        this.business = businessBuild;
    }

    public final void setPriority(String str) {
        if (str != null) {
            Business businessBuild = this.business.copyOfBuilder().priority(str).build();
            sq8.m48648g(businessBuild, "build(...)");
            this.business = businessBuild;
        }
    }

    public final void setProperty(String str, Object obj) {
    }

    public final void setWebsite(String str) {
        Business businessBuild = this.business.copyOfBuilder().website(str).build();
        sq8.m48648g(businessBuild, "build(...)");
        this.business = businessBuild;
    }

    public final BusinessInfo toBusinessInfo() {
        return new BusinessInfo(getCompanyId(), getIndustry(), getWebsite(), getCompanyName(), getPriority());
    }

    public BusinessSummary(Business business) {
        sq8.m48649h(business, "business");
        this.business = business;
    }

    public /* synthetic */ BusinessSummary(Business business, int i, id5 id5Var) {
        this((i & 1) != 0 ? Companion.newInstance() : business);
    }
}
