package ai.salesmax.model;

import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.datastore.generated.model.Account;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import p001o.ch3;
import p001o.dh3;
import p001o.e9g;
import p001o.id5;
import p001o.kf9;
import p001o.kh3;
import p001o.ryh;
import p001o.sq8;
import p001o.u91;
import p001o.uyh;
import p001o.wi0;
import p001o.x6c;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class TemplateTag {
    private static List<TemplateTag> _allCompatibleTemplateTags;
    private static List<TemplateTag> _allTemplateTags;
    private xk7 expr;
    private String relatedObject;
    private String value;
    private String viewValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: ai.salesmax.model.TemplateTag$1 */
    public static final class C02521 extends kf9 implements xk7 {
        public static final C02521 INSTANCE = new C02521();

        public C02521() {
            super(1);
        }

        public final void invoke(TemplateTagParams templateTagParams) {
            sq8.m48649h(templateTagParams, "it");
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TemplateTagParams) obj);
            return y3i.f54824a;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List _tags$default(Companion companion, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                ryh ryhVarOf = uyh.of("{{", "}}");
                sq8.m48648g(ryhVarOf, "of(...)");
                list = ch3.m21242g(ryhVarOf);
            }
            return companion._tags(list);
        }

        public final List<TemplateTag> _tags(List<ryh> list) {
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                ryh ryhVarOf = uyh.of(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
                sq8.m48648g(ryhVarOf, "of(...)");
                ryh ryhVarOf2 = uyh.of("{{", "}}");
                sq8.m48648g(ryhVarOf2, "of(...)");
                list = ch3.m21242g(ryhVarOf, ryhVarOf2);
            }
            for (ryh ryhVar : list) {
                String str = (String) ryhVar.f44265a;
                String str2 = (String) ryhVar.f44266b;
                arrayList.add(new TemplateTag(str + "lead_name" + str2, "Name", "Contact", TemplateTag$Companion$_tags$1$tag$1.INSTANCE));
                arrayList.add(new TemplateTag(str + "lead_first_name" + str2, "First Name", "Contact", TemplateTag$Companion$_tags$1$1.INSTANCE));
                arrayList.add(new TemplateTag(str + "lead_last_name" + str2, "First Name", "Contact", TemplateTag$Companion$_tags$1$2.INSTANCE));
                arrayList.add(new TemplateTag(str + "greeting_of_day" + str2, "Day Greeting", "Contact", TemplateTag$Companion$_tags$1$3.INSTANCE));
                arrayList.add(new TemplateTag(str + "lead_salutation" + str2, "Salutation", "Contact", TemplateTag$Companion$_tags$1$4.INSTANCE));
                arrayList.add(new TemplateTag(str + "lead_last_call_time" + str2, "Last Call Time", "Contact", TemplateTag$Companion$_tags$1$5.INSTANCE));
                arrayList.add(new TemplateTag(str + "lead_last_email_time" + str2, "Last Email Time", "Contact", TemplateTag$Companion$_tags$1$6.INSTANCE));
                arrayList.add(new TemplateTag(str + "lead_business_name" + str2, "Business Name", "Contact", TemplateTag$Companion$_tags$1$7.INSTANCE));
                arrayList.add(new TemplateTag(str + "my_name" + str2, "My Name", "User", TemplateTag$Companion$_tags$1$8.INSTANCE));
                arrayList.add(new TemplateTag(str + "my_designation" + str2, "My Designation", "User", TemplateTag$Companion$_tags$1$9.INSTANCE));
                arrayList.add(new TemplateTag(str + "my_signature" + str2, "My Signature", "User", TemplateTag$Companion$_tags$1$10.INSTANCE));
                arrayList.add(new TemplateTag(str + "my_number" + str2, "My Number", "User", TemplateTag$Companion$_tags$1$11.INSTANCE));
                arrayList.add(new TemplateTag(str + "my_email" + str2, "My Email", "User", TemplateTag$Companion$_tags$1$12.INSTANCE));
                arrayList.add(new TemplateTag(str + "my_business_name" + str2, "My Business", "User", TemplateTag$Companion$_tags$1$13.INSTANCE));
                arrayList.add(new TemplateTag(str + "my_business_address" + str2, "My Business Address", "User", TemplateTag$Companion$_tags$1$14.INSTANCE));
            }
            return arrayList;
        }

        public final List<TemplateTag> allCompatibleTemplateTags() {
            if (get_allCompatibleTemplateTags() == null) {
                set_allCompatibleTemplateTags(_tags(null));
            }
            List<TemplateTag> list = get_allCompatibleTemplateTags();
            sq8.m48646e(list);
            return list;
        }

        public final List<TemplateTag> allTemplateTags() {
            if (get_allTemplateTags() == null) {
                set_allTemplateTags(_tags$default(this, null, 1, null));
            }
            List<TemplateTag> list = get_allTemplateTags();
            sq8.m48646e(list);
            return list;
        }

        public final List<TemplateTag> get_allCompatibleTemplateTags() {
            return TemplateTag._allCompatibleTemplateTags;
        }

        public final List<TemplateTag> get_allTemplateTags() {
            return TemplateTag._allTemplateTags;
        }

        public final x6c reformatTextWithTags(List<String> list, TemplateTagParams templateTagParams) {
            x6c x6cVarOz;
            List<String> businessIds;
            sq8.m48649h(list, "texts");
            sq8.m48649h(templateTagParams, OutcomeEventsTable.COLUMN_NAME_PARAMS);
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                x6cVarOz = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                String strM24593G = str;
                for (TemplateTag templateTag : TemplateTag.Companion.allCompatibleTemplateTags()) {
                    Object objEval = templateTag.eval(templateTagParams);
                    String value = templateTag.getValue();
                    String string = objEval != null ? objEval.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    strM24593G = e9g.m24593G(strM24593G, value, string, false, 4, null);
                }
                arrayList.add(strM24593G);
            }
            u91 u91VarM54458X = wi0.m54458X();
            if (u91VarM54458X != null) {
                Leads lead = templateTagParams.getLead();
                Optional optionalOfNullable = Optional.ofNullable(lead != null ? lead.getContactID() : null);
                Leads lead2 = templateTagParams.getLead();
                Optional optionalOfNullable2 = Optional.ofNullable((lead2 == null || (businessIds = lead2.getBusinessIds()) == null) ? null : (String) kh3.h0(businessIds));
                LeadsUser user = templateTagParams.getUser();
                Optional optionalOfNullable3 = Optional.ofNullable(user != null ? user.getId() : null);
                Account account = templateTagParams.getAccount();
                Optional optionalOfNullable4 = Optional.ofNullable(account != null ? account.getId() : null);
                LeadsUser user2 = templateTagParams.getUser();
                x6cVarOz = u91VarM54458X.Oz(arrayList, optionalOfNullable, optionalOfNullable2, optionalOfNullable3, optionalOfNullable4, Optional.ofNullable(user2 != null ? user2.getAccountMembershipId() : null), Optional.empty());
            }
            if (x6cVarOz != null) {
                return x6cVarOz;
            }
            x6c x6cVarC0 = x6c.c0(arrayList);
            sq8.m48648g(x6cVarC0, "just(...)");
            return x6cVarC0;
        }

        public final void set_allCompatibleTemplateTags(List<TemplateTag> list) {
            TemplateTag._allCompatibleTemplateTags = list;
        }

        public final void set_allTemplateTags(List<TemplateTag> list) {
            TemplateTag._allTemplateTags = list;
        }
    }

    public TemplateTag() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TemplateTag copy$default(TemplateTag templateTag, String str, String str2, String str3, xk7 xk7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = templateTag.value;
        }
        if ((i & 2) != 0) {
            str2 = templateTag.viewValue;
        }
        if ((i & 4) != 0) {
            str3 = templateTag.relatedObject;
        }
        if ((i & 8) != 0) {
            xk7Var = templateTag.expr;
        }
        return templateTag.copy(str, str2, str3, xk7Var);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.viewValue;
    }

    public final String component3() {
        return this.relatedObject;
    }

    public final xk7 component4() {
        return this.expr;
    }

    public final TemplateTag copy(String str, String str2, String str3, xk7 xk7Var) {
        sq8.m48649h(str, "value");
        sq8.m48649h(str2, "viewValue");
        sq8.m48649h(str3, "relatedObject");
        sq8.m48649h(xk7Var, "expr");
        return new TemplateTag(str, str2, str3, xk7Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateTag)) {
            return false;
        }
        TemplateTag templateTag = (TemplateTag) obj;
        return sq8.m48644c(this.value, templateTag.value) && sq8.m48644c(this.viewValue, templateTag.viewValue) && sq8.m48644c(this.relatedObject, templateTag.relatedObject) && sq8.m48644c(this.expr, templateTag.expr);
    }

    public final Object eval(TemplateTagParams templateTagParams) {
        sq8.m48649h(templateTagParams, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        return this.expr.invoke(templateTagParams);
    }

    public final xk7 getExpr() {
        return this.expr;
    }

    public final String getRelatedObject() {
        return this.relatedObject;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getViewValue() {
        return this.viewValue;
    }

    public int hashCode() {
        return (((((this.value.hashCode() * 31) + this.viewValue.hashCode()) * 31) + this.relatedObject.hashCode()) * 31) + this.expr.hashCode();
    }

    public final void setExpr(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "<set-?>");
        this.expr = xk7Var;
    }

    public final void setRelatedObject(String str) {
        sq8.m48649h(str, "<set-?>");
        this.relatedObject = str;
    }

    public final void setValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.value = str;
    }

    public final void setViewValue(String str) {
        sq8.m48649h(str, "<set-?>");
        this.viewValue = str;
    }

    public String toString() {
        return "TemplateTag(value=" + this.value + ", viewValue=" + this.viewValue + ", relatedObject=" + this.relatedObject + ", expr=" + this.expr + ")";
    }

    public TemplateTag(String str, String str2, String str3, xk7 xk7Var) {
        sq8.m48649h(str, "value");
        sq8.m48649h(str2, "viewValue");
        sq8.m48649h(str3, "relatedObject");
        sq8.m48649h(xk7Var, "expr");
        this.value = str;
        this.viewValue = str2;
        this.relatedObject = str3;
        this.expr = xk7Var;
    }

    public /* synthetic */ TemplateTag(String str, String str2, String str3, xk7 xk7Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? C02521.INSTANCE : xk7Var);
    }
}
