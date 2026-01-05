package com.onesignal.session.internal.outcomes;

import p001o.n64;

/* loaded from: classes6.dex */
public interface IOutcomeEventsController {
    Object sendOutcomeEvent(String str, n64 n64Var);

    Object sendOutcomeEventWithValue(String str, float f, n64 n64Var);

    Object sendSessionEndOutcomeEvent(long j, n64 n64Var);

    Object sendUniqueOutcomeEvent(String str, n64 n64Var);
}
