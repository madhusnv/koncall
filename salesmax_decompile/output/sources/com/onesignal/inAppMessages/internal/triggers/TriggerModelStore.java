package com.onesignal.inAppMessages.internal.triggers;

import com.onesignal.common.modeling.SimpleModelStore;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes6.dex */
public class TriggerModelStore extends SimpleModelStore<TriggerModel> {

    /* renamed from: com.onesignal.inAppMessages.internal.triggers.TriggerModelStore$1 */
    public static final class C117001 extends kf9 implements uk7 {
        public static final C117001 INSTANCE = new C117001();

        public C117001() {
            super(0);
        }

        @Override // p001o.uk7
        public final TriggerModel invoke() {
            return new TriggerModel();
        }
    }

    public TriggerModelStore() {
        super(C117001.INSTANCE, null, null, 6, null);
    }
}
