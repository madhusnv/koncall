package p001o;

import ai.salesmax.model.CallEngagement;
import com.amazonaws.amplify.generated.graphql.FetchLiveCallEngagementQuery;
import type.CallConnectStatus;
import type.CallDirection;

/* loaded from: classes2.dex */
public final class wf6 {

    /* renamed from: a */
    public static final wf6 f51901a = new wf6();

    /* renamed from: a */
    public final CallEngagement m54328a(FetchLiveCallEngagementQuery.Engagement engagement) {
        sq8.m48649h(engagement, "engagement");
        String strContactId = engagement.contactId();
        String strId = engagement.id();
        sq8.m48648g(strId, "id(...)");
        String strPrimaryTeamId = engagement.primaryTeamId();
        String strExternalNumber = engagement.externalNumber();
        String strUserNumber = engagement.userNumber();
        Long lValueOf = engagement.durationInMillis() != null ? Long.valueOf(r2.intValue()) : null;
        Long lValueOf2 = engagement.durationInMillis() != null ? Long.valueOf(r2.intValue()) : null;
        CallDirection callDirection = engagement.callDirection();
        String strName = callDirection != null ? callDirection.name() : null;
        CallConnectStatus callConnectStatus = engagement.callConnectStatus();
        return new CallEngagement(strId, strContactId, null, null, null, null, strPrimaryTeamId, strExternalNumber, strUserNumber, lValueOf, null, null, lValueOf2, strName, callConnectStatus != null ? callConnectStatus.name() : null, engagement.engagementType().name(), engagement.engagementStatus().name(), engagement.engagementSourceType(), engagement.engagementSource(), engagement.engagementSourceLevelTwo(), null, null, false, null, null, sq8.m48644c(engagement.engagementSourceLevelTwo(), "CLOUDTELEPHONY"), false, null, false, null, null, null, null, null, null, null, null, false, -35651584, 63, null);
    }
}
