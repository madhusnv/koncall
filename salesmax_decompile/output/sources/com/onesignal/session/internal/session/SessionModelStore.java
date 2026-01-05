package com.onesignal.session.internal.session;

import com.onesignal.common.modeling.SimpleModelStore;
import com.onesignal.common.modeling.SingletonModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import p001o.kf9;
import p001o.sq8;
import p001o.uk7;

/* loaded from: classes6.dex */
public class SessionModelStore extends SingletonModelStore<SessionModel> {

    /* renamed from: com.onesignal.session.internal.session.SessionModelStore$1 */
    public static final class C118461 extends kf9 implements uk7 {
        public static final C118461 INSTANCE = new C118461();

        public C118461() {
            super(0);
        }

        @Override // p001o.uk7
        public final SessionModel invoke() {
            return new SessionModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionModelStore(IPreferencesService iPreferencesService) {
        super(new SimpleModelStore(C118461.INSTANCE, OutcomeEventsTable.COLUMN_NAME_SESSION, iPreferencesService));
        sq8.m48649h(iPreferencesService, "prefs");
    }
}
