package com.onesignal.location.internal;

import com.onesignal.core.internal.minification.KeepStub;
import com.onesignal.location.ILocationManager;
import p001o.id5;
import p001o.n64;

@KeepStub
/* loaded from: classes6.dex */
public final class MisconfiguredLocationManager implements ILocationManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");
        }
    }

    @Override // com.onesignal.location.ILocationManager
    public boolean isShared() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.location.ILocationManager
    public Object requestPermission(n64 n64Var) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.location.ILocationManager
    public void setShared(boolean z) throws Exception {
        throw Companion.getEXCEPTION();
    }
}
