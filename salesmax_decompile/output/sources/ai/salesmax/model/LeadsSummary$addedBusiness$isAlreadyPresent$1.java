package ai.salesmax.model;

import java.util.Locale;
import java.util.Objects;
import p001o.f9g;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$addedBusiness$isAlreadyPresent$1 extends kf9 implements xk7 {
    final /* synthetic */ BusinessSummary $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadsSummary$addedBusiness$isAlreadyPresent$1(BusinessSummary businessSummary) {
        super(1);
        this.$value = businessSummary;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    @Override // p001o.xk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(LeadsBusiness leadsBusiness) {
        boolean z;
        String companyName;
        String string;
        String companyId = leadsBusiness.getCompanyId();
        BusinessSummary businessSummary = this.$value;
        String lowerCase = null;
        if (!Objects.equals(companyId, businessSummary != null ? businessSummary.getCompanyId() : null)) {
            String string2 = f9g.Z0(leadsBusiness.getCompanyName()).toString();
            Locale locale = Locale.ROOT;
            String lowerCase2 = string2.toLowerCase(locale);
            sq8.m48648g(lowerCase2, "toLowerCase(...)");
            BusinessSummary businessSummary2 = this.$value;
            if (businessSummary2 != null && (companyName = businessSummary2.getCompanyName()) != null && (string = f9g.Z0(companyName).toString()) != null) {
                lowerCase = string.toLowerCase(locale);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
            }
            z = Objects.equals(lowerCase2, lowerCase);
        }
        return Boolean.valueOf(z);
    }
}
