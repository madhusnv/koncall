package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.session.internal.influence.Influence;
import java.util.List;
import p001o.n64;

/* loaded from: classes6.dex */
public interface IOutcomeEventsRepository {
    Object cleanCachedUniqueOutcomeEventNotifications(n64 n64Var);

    Object deleteOldOutcomeEvent(OutcomeEventParams outcomeEventParams, n64 n64Var);

    Object getAllEventsToSend(n64 n64Var);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<Influence> list, n64 n64Var);

    Object saveOutcomeEvent(OutcomeEventParams outcomeEventParams, n64 n64Var);

    Object saveUniqueOutcomeEventParams(OutcomeEventParams outcomeEventParams, n64 n64Var);
}
