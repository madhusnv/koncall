package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.session.internal.influence.InfluenceChannel;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class CachedUniqueOutcome {
    private final InfluenceChannel channel;
    private final String influenceId;

    public CachedUniqueOutcome(String str, InfluenceChannel influenceChannel) {
        sq8.m48649h(str, "influenceId");
        sq8.m48649h(influenceChannel, "channel");
        this.influenceId = str;
        this.channel = influenceChannel;
    }

    public final InfluenceChannel getChannel() {
        return this.channel;
    }

    public final String getInfluenceId() {
        return this.influenceId;
    }
}
