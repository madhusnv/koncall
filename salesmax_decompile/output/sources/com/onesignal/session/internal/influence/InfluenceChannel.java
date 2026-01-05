package com.onesignal.session.internal.influence;

import com.amazonaws.regions.ServiceAbbreviations;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public enum InfluenceChannel {
    IAM(ServiceAbbreviations.IAM),
    NOTIFICATION(OneSignalDbContract.NotificationTable.TABLE_NAME);

    public static final Companion Companion = new Companion(null);
    private final String nameValue;

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
        public final InfluenceChannel fromString(String str) {
            InfluenceChannel influenceChannel;
            if (str != null) {
                InfluenceChannel[] influenceChannelArrValues = InfluenceChannel.values();
                int length = influenceChannelArrValues.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        influenceChannel = influenceChannelArrValues[length];
                        if (influenceChannel.equalsName(str)) {
                            break;
                        }
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                    influenceChannel = null;
                    if (influenceChannel != null) {
                        return influenceChannel;
                    }
                } else {
                    influenceChannel = null;
                    if (influenceChannel != null) {
                    }
                }
            }
            return InfluenceChannel.NOTIFICATION;
        }
    }

    InfluenceChannel(String str) {
        this.nameValue = str;
    }

    public static final InfluenceChannel fromString(String str) {
        return Companion.fromString(str);
    }

    public final boolean equalsName(String str) {
        sq8.m48649h(str, "otherName");
        return sq8.m48644c(this.nameValue, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }
}
