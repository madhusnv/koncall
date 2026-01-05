package ai.salesmax.model;

import com.google.android.gms.cast.MediaTrack;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class IntegrationList {
    public static final int $stable = 8;
    private String actionText;
    private int connectionCount;
    private String description;
    private String helpArticleLink;
    private String helpVideoLink;
    private String id;
    private List<IntegrationParameters> integrationParameters;
    private String integrationTypeShort;
    private String name;

    public IntegrationList() {
        this(null, null, null, null, null, null, null, 0, null, 511, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.integrationTypeShort;
    }

    public final String component5() {
        return this.helpArticleLink;
    }

    public final String component6() {
        return this.helpVideoLink;
    }

    public final String component7() {
        return this.actionText;
    }

    public final int component8() {
        return this.connectionCount;
    }

    public final List<IntegrationParameters> component9() {
        return this.integrationParameters;
    }

    public final IntegrationList copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, List<IntegrationParameters> list) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str4, "integrationTypeShort");
        sq8.m48649h(str5, "helpArticleLink");
        sq8.m48649h(str6, "helpVideoLink");
        sq8.m48649h(str7, "actionText");
        sq8.m48649h(list, "integrationParameters");
        return new IntegrationList(str, str2, str3, str4, str5, str6, str7, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegrationList)) {
            return false;
        }
        IntegrationList integrationList = (IntegrationList) obj;
        return sq8.m48644c(this.id, integrationList.id) && sq8.m48644c(this.name, integrationList.name) && sq8.m48644c(this.description, integrationList.description) && sq8.m48644c(this.integrationTypeShort, integrationList.integrationTypeShort) && sq8.m48644c(this.helpArticleLink, integrationList.helpArticleLink) && sq8.m48644c(this.helpVideoLink, integrationList.helpVideoLink) && sq8.m48644c(this.actionText, integrationList.actionText) && this.connectionCount == integrationList.connectionCount && sq8.m48644c(this.integrationParameters, integrationList.integrationParameters);
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final int getConnectionCount() {
        return this.connectionCount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHelpArticleLink() {
        return this.helpArticleLink;
    }

    public final String getHelpVideoLink() {
        return this.helpVideoLink;
    }

    public final String getId() {
        return this.id;
    }

    public final List<IntegrationParameters> getIntegrationParameters() {
        return this.integrationParameters;
    }

    public final String getIntegrationTypeShort() {
        return this.integrationTypeShort;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.integrationTypeShort.hashCode()) * 31) + this.helpArticleLink.hashCode()) * 31) + this.helpVideoLink.hashCode()) * 31) + this.actionText.hashCode()) * 31) + Integer.hashCode(this.connectionCount)) * 31) + this.integrationParameters.hashCode();
    }

    public final void setActionText(String str) {
        sq8.m48649h(str, "<set-?>");
        this.actionText = str;
    }

    public final void setConnectionCount(int i) {
        this.connectionCount = i;
    }

    public final void setDescription(String str) {
        sq8.m48649h(str, "<set-?>");
        this.description = str;
    }

    public final void setHelpArticleLink(String str) {
        sq8.m48649h(str, "<set-?>");
        this.helpArticleLink = str;
    }

    public final void setHelpVideoLink(String str) {
        sq8.m48649h(str, "<set-?>");
        this.helpVideoLink = str;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setIntegrationParameters(List<IntegrationParameters> list) {
        sq8.m48649h(list, "<set-?>");
        this.integrationParameters = list;
    }

    public final void setIntegrationTypeShort(String str) {
        sq8.m48649h(str, "<set-?>");
        this.integrationTypeShort = str;
    }

    public final void setName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "IntegrationList(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", integrationTypeShort=" + this.integrationTypeShort + ", helpArticleLink=" + this.helpArticleLink + ", helpVideoLink=" + this.helpVideoLink + ", actionText=" + this.actionText + ", connectionCount=" + this.connectionCount + ", integrationParameters=" + this.integrationParameters + ")";
    }

    public IntegrationList(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, List<IntegrationParameters> list) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, "name");
        sq8.m48649h(str3, MediaTrack.ROLE_DESCRIPTION);
        sq8.m48649h(str4, "integrationTypeShort");
        sq8.m48649h(str5, "helpArticleLink");
        sq8.m48649h(str6, "helpVideoLink");
        sq8.m48649h(str7, "actionText");
        sq8.m48649h(list, "integrationParameters");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.integrationTypeShort = str4;
        this.helpArticleLink = str5;
        this.helpVideoLink = str6;
        this.actionText = str7;
        this.connectionCount = i;
        this.integrationParameters = list;
    }

    public /* synthetic */ IntegrationList(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, List list, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) == 0 ? str7 : "", (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? new ArrayList() : list);
    }
}
