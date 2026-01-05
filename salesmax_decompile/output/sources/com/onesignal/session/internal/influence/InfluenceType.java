package com.onesignal.session.internal.influence;

import p001o.e9g;
import p001o.id5;

/* loaded from: classes6.dex */
public enum InfluenceType {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InfluenceType fromString(String str) {
            InfluenceType influenceType;
            if (str != null) {
                InfluenceType[] influenceTypeArrValues = InfluenceType.values();
                int length = influenceTypeArrValues.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        influenceType = influenceTypeArrValues[length];
                        if (e9g.m24606x(influenceType.name(), str, true)) {
                            break;
                        }
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                    influenceType = null;
                    if (influenceType != null) {
                        return influenceType;
                    }
                } else {
                    influenceType = null;
                    if (influenceType != null) {
                    }
                }
            }
            return InfluenceType.UNATTRIBUTED;
        }
    }

    public static final InfluenceType fromString(String str) {
        return Companion.fromString(str);
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }
}
