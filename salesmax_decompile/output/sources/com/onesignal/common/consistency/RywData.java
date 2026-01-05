package com.onesignal.common.consistency;

import p001o.sq8;

/* loaded from: classes6.dex */
public final class RywData {
    private final Long rywDelay;
    private final String rywToken;

    public RywData(String str, Long l) {
        sq8.m48649h(str, "rywToken");
        this.rywToken = str;
        this.rywDelay = l;
    }

    public static /* synthetic */ RywData copy$default(RywData rywData, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rywData.rywToken;
        }
        if ((i & 2) != 0) {
            l = rywData.rywDelay;
        }
        return rywData.copy(str, l);
    }

    public final String component1() {
        return this.rywToken;
    }

    public final Long component2() {
        return this.rywDelay;
    }

    public final RywData copy(String str, Long l) {
        sq8.m48649h(str, "rywToken");
        return new RywData(str, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RywData)) {
            return false;
        }
        RywData rywData = (RywData) obj;
        return sq8.m48644c(this.rywToken, rywData.rywToken) && sq8.m48644c(this.rywDelay, rywData.rywDelay);
    }

    public final Long getRywDelay() {
        return this.rywDelay;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public int hashCode() {
        int iHashCode = this.rywToken.hashCode() * 31;
        Long l = this.rywDelay;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "RywData(rywToken=" + this.rywToken + ", rywDelay=" + this.rywDelay + ')';
    }
}
