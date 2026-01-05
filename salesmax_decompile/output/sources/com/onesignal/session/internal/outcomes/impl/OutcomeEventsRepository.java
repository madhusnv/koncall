package com.onesignal.session.internal.outcomes.impl;

import android.content.ContentValues;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.influence.Influence;
import com.onesignal.session.internal.influence.InfluenceChannel;
import com.onesignal.session.internal.influence.InfluenceType;
import com.onesignal.session.internal.outcomes.migrations.RemoveZeroSessionTimeRecords;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import p001o.eu5;
import p001o.gge;
import p001o.h84;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.pm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;
import p001o.z74;

/* loaded from: classes6.dex */
public final class OutcomeEventsRepository implements IOutcomeEventsRepository {
    private final IDatabaseProvider _databaseProvider;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfluenceType.values().length];
            iArr[InfluenceType.DIRECT.ordinal()] = 1;
            iArr[InfluenceType.INDIRECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2", m36648f = "OutcomeEventsRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$cleanCachedUniqueOutcomeEventNotifications$2 */
    public static final class C118372 extends jgg implements nl7 {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ OutcomeEventsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118372(String str, String str2, OutcomeEventsRepository outcomeEventsRepository, n64 n64Var) {
            super(2, n64Var);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = outcomeEventsRepository;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C118372(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            StringBuilder sb = new StringBuilder();
            sb.append("NOT EXISTS(SELECT NULL FROM ");
            sb.append(this.$notificationTableName);
            sb.append(" n WHERE n.");
            sb.append(this.$notificationIdColumnName);
            sb.append(" = channel_influence_id AND channel_type = \"");
            String string = InfluenceChannel.NOTIFICATION.toString();
            Locale locale = Locale.ROOT;
            sq8.m48648g(locale, "ROOT");
            String lowerCase = string.toLowerCase(locale);
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("\")");
            this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", sb.toString(), null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118372) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$deleteOldOutcomeEvent$2", m36648f = "OutcomeEventsRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$deleteOldOutcomeEvent$2 */
    public static final class C118382 extends jgg implements nl7 {
        final /* synthetic */ OutcomeEventParams $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118382(OutcomeEventParams outcomeEventParams, n64 n64Var) {
            super(2, n64Var);
            this.$event = outcomeEventParams;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return OutcomeEventsRepository.this.new C118382(this.$event, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            OutcomeEventsRepository.this._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118382) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository", m36648f = "OutcomeEventsRepository.kt", m36649l = {104}, m36650m = "getAllEventsToSend")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getAllEventsToSend$1 */
    public static final class C118391 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C118391(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OutcomeEventsRepository.this.getAllEventsToSend(this);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getAllEventsToSend$2", m36648f = "OutcomeEventsRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getAllEventsToSend$2 */
    public static final class C118402 extends jgg implements nl7 {
        final /* synthetic */ List<OutcomeEventParams> $events;
        int label;

        /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getAllEventsToSend$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ List<OutcomeEventParams> $events;
            final /* synthetic */ OutcomeEventsRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OutcomeEventsRepository outcomeEventsRepository, List<OutcomeEventParams> list) {
                super(1);
                this.this$0 = outcomeEventsRepository;
                this.$events = list;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "cursor");
                if (iCursor.moveToFirst()) {
                    do {
                        String string = iCursor.getString(OutcomeEventsTable.COLUMN_NAME_NOTIFICATION_INFLUENCE_TYPE);
                        InfluenceType.Companion companion = InfluenceType.Companion;
                        InfluenceType influenceTypeFromString = companion.fromString(string);
                        InfluenceType influenceTypeFromString2 = companion.fromString(iCursor.getString(OutcomeEventsTable.COLUMN_NAME_IAM_INFLUENCE_TYPE));
                        String optString = iCursor.getOptString("notification_ids");
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = iCursor.getOptString(OutcomeEventsTable.COLUMN_NAME_IAM_IDS);
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = iCursor.getString("name");
                        float f = iCursor.getFloat("weight");
                        long j = iCursor.getLong("timestamp");
                        long j2 = iCursor.getLong("session_time");
                        try {
                            OutcomeSourceBody outcomeSourceBody = new OutcomeSourceBody(null, null, 3, null);
                            OutcomeSourceBody outcomeSourceBody2 = new OutcomeSourceBody(null, null, 3, null);
                            OutcomeSource notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(influenceTypeFromString, outcomeSourceBody, outcomeSourceBody2, optString);
                            this.this$0.getIAMInfluenceSource(influenceTypeFromString2, outcomeSourceBody, outcomeSourceBody2, str, notificationInfluenceSource);
                            if (notificationInfluenceSource == null) {
                                notificationInfluenceSource = new OutcomeSource(null, null);
                            }
                            this.$events.add(new OutcomeEventParams(string2, notificationInfluenceSource, f, j2, j));
                        } catch (JSONException e) {
                            Logging.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e);
                        }
                    } while (iCursor.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118402(List<OutcomeEventParams> list, n64 n64Var) {
            super(2, n64Var);
            this.$events = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return OutcomeEventsRepository.this.new C118402(this.$events, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            RemoveZeroSessionTimeRecords.INSTANCE.run(OutcomeEventsRepository.this._databaseProvider);
            IDatabase.DefaultImpls.query$default(OutcomeEventsRepository.this._databaseProvider.getOs(), "outcome", null, null, null, null, null, null, null, new AnonymousClass1(OutcomeEventsRepository.this, this.$events), 254, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118402) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository", m36648f = "OutcomeEventsRepository.kt", m36649l = {286}, m36650m = "getNotCachedUniqueInfluencesForOutcome")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1 */
    public static final class C118411 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C118411(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OutcomeEventsRepository.this.getNotCachedUniqueInfluencesForOutcome(null, null, this);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2", m36648f = "OutcomeEventsRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2 */
    public static final class C118422 extends jgg implements nl7 {
        final /* synthetic */ List<Influence> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<Influence> $uniqueInfluences;
        int label;
        final /* synthetic */ OutcomeEventsRepository this$0;

        /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                if (iCursor.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118422(List<Influence> list, String str, OutcomeEventsRepository outcomeEventsRepository, List<Influence> list2, n64 n64Var) {
            super(2, n64Var);
            this.$influences = list;
            this.$name = str;
            this.this$0 = outcomeEventsRepository;
            this.$uniqueInfluences = list2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C118422(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws JSONException {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                for (Influence influence : this.$influences) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray ids = influence.getIds();
                    if (ids != null) {
                        int length = ids.length();
                        for (int i = 0; i < length; i++) {
                            String string = ids.getString(i);
                            IDatabase.DefaultImpls.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, influence.getInfluenceChannel().toString(), this.$name}, null, null, null, "1", new AnonymousClass1(jSONArray, string), 112, null);
                        }
                        if (jSONArray.length() > 0) {
                            Influence influenceCopy = influence.copy();
                            influenceCopy.setIds(jSONArray);
                            this.$uniqueInfluences.add(influenceCopy);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118422) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$saveOutcomeEvent$2", m36648f = "OutcomeEventsRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$saveOutcomeEvent$2 */
    public static final class C118432 extends jgg implements nl7 {
        final /* synthetic */ OutcomeEventParams $eventParams;
        int label;
        final /* synthetic */ OutcomeEventsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118432(OutcomeEventParams outcomeEventParams, OutcomeEventsRepository outcomeEventsRepository, n64 n64Var) {
            super(2, n64Var);
            this.$eventParams = outcomeEventParams;
            this.this$0 = outcomeEventsRepository;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C118432(this.$eventParams, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            OutcomeSourceBody indirectBody;
            OutcomeSourceBody directBody;
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            gge ggeVar = new gge();
            ggeVar.f25106a = new JSONArray();
            gge ggeVar2 = new gge();
            ggeVar2.f25106a = new JSONArray();
            gge ggeVar3 = new gge();
            InfluenceType influenceType = InfluenceType.UNATTRIBUTED;
            ggeVar3.f25106a = influenceType;
            gge ggeVar4 = new gge();
            ggeVar4.f25106a = influenceType;
            OutcomeSource outcomeSource = this.$eventParams.getOutcomeSource();
            if (outcomeSource != null && (directBody = outcomeSource.getDirectBody()) != null) {
                JSONArray notificationIds = directBody.getNotificationIds();
                if (notificationIds != null && notificationIds.length() > 0) {
                    ggeVar3.f25106a = InfluenceType.DIRECT;
                    ggeVar.f25106a = notificationIds;
                }
                JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
                if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                    ggeVar4.f25106a = InfluenceType.DIRECT;
                    ggeVar2.f25106a = inAppMessagesIds;
                }
            }
            OutcomeSource outcomeSource2 = this.$eventParams.getOutcomeSource();
            if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
                JSONArray notificationIds2 = indirectBody.getNotificationIds();
                if (notificationIds2 != null && notificationIds2.length() > 0) {
                    ggeVar3.f25106a = InfluenceType.INDIRECT;
                    ggeVar.f25106a = notificationIds2;
                }
                JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                    ggeVar4.f25106a = InfluenceType.INDIRECT;
                    ggeVar2.f25106a = inAppMessagesIds2;
                }
            }
            ContentValues contentValues = new ContentValues();
            OutcomeEventParams outcomeEventParams = this.$eventParams;
            contentValues.put("notification_ids", ((JSONArray) ggeVar.f25106a).toString());
            contentValues.put(OutcomeEventsTable.COLUMN_NAME_IAM_IDS, ((JSONArray) ggeVar2.f25106a).toString());
            String string = ((InfluenceType) ggeVar3.f25106a).toString();
            Locale locale = Locale.ROOT;
            sq8.m48648g(locale, "ROOT");
            String lowerCase = string.toLowerCase(locale);
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            contentValues.put(OutcomeEventsTable.COLUMN_NAME_NOTIFICATION_INFLUENCE_TYPE, lowerCase);
            String string2 = ((InfluenceType) ggeVar4.f25106a).toString();
            sq8.m48648g(locale, "ROOT");
            String lowerCase2 = string2.toLowerCase(locale);
            sq8.m48648g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            contentValues.put(OutcomeEventsTable.COLUMN_NAME_IAM_INFLUENCE_TYPE, lowerCase2);
            contentValues.put("name", outcomeEventParams.getOutcomeId());
            contentValues.put("weight", ml1.m39303c(outcomeEventParams.getWeight()));
            contentValues.put("timestamp", ml1.m39305e(outcomeEventParams.getTimestamp()));
            contentValues.put("session_time", ml1.m39305e(outcomeEventParams.getSessionTime()));
            this.this$0._databaseProvider.getOs().insert("outcome", null, contentValues);
            return contentValues;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118432) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$saveUniqueOutcomeEventParams$2", m36648f = "OutcomeEventsRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository$saveUniqueOutcomeEventParams$2 */
    public static final class C118442 extends jgg implements nl7 {
        final /* synthetic */ OutcomeEventParams $eventParams;
        int label;
        final /* synthetic */ OutcomeEventsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118442(OutcomeEventParams outcomeEventParams, OutcomeEventsRepository outcomeEventsRepository, n64 n64Var) {
            super(2, n64Var);
            this.$eventParams = outcomeEventParams;
            this.this$0 = outcomeEventsRepository;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C118442(this.$eventParams, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws JSONException {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            String outcomeId = this.$eventParams.getOutcomeId();
            ArrayList<CachedUniqueOutcome> arrayList = new ArrayList();
            OutcomeSource outcomeSource = this.$eventParams.getOutcomeSource();
            OutcomeSourceBody directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
            OutcomeSource outcomeSource2 = this.$eventParams.getOutcomeSource();
            OutcomeSourceBody indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
            this.this$0.addIdsToListFromSource(arrayList, directBody);
            this.this$0.addIdsToListFromSource(arrayList, indirectBody);
            for (CachedUniqueOutcome cachedUniqueOutcome : arrayList) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", cachedUniqueOutcome.getInfluenceId());
                contentValues.put("channel_type", cachedUniqueOutcome.getChannel().toString());
                contentValues.put("name", outcomeId);
                this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C118442) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public OutcomeEventsRepository(IDatabaseProvider iDatabaseProvider) {
        sq8.m48649h(iDatabaseProvider, "_databaseProvider");
        this._databaseProvider = iDatabaseProvider;
    }

    private final void addIdToListFromChannel(List<CachedUniqueOutcome> list, JSONArray jSONArray, InfluenceChannel influenceChannel) throws JSONException {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    sq8.m48648g(string, "influenceId");
                    list.add(new CachedUniqueOutcome(string, influenceChannel));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<CachedUniqueOutcome> list, OutcomeSourceBody outcomeSourceBody) throws JSONException {
        if (outcomeSourceBody != null) {
            JSONArray inAppMessagesIds = outcomeSourceBody.getInAppMessagesIds();
            JSONArray notificationIds = outcomeSourceBody.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, InfluenceChannel.IAM);
            addIdToListFromChannel(list, notificationIds, InfluenceChannel.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutcomeSource getIAMInfluenceSource(InfluenceType influenceType, OutcomeSourceBody outcomeSourceBody, OutcomeSourceBody outcomeSourceBody2, String str, OutcomeSource outcomeSource) {
        OutcomeSource directBody;
        OutcomeSource indirectBody;
        int i = WhenMappings.$EnumSwitchMapping$0[influenceType.ordinal()];
        if (i == 1) {
            outcomeSourceBody.setInAppMessagesIds(new JSONArray(str));
            return (outcomeSource == null || (directBody = outcomeSource.setDirectBody(outcomeSourceBody)) == null) ? new OutcomeSource(outcomeSourceBody, null) : directBody;
        }
        if (i != 2) {
            return outcomeSource;
        }
        outcomeSourceBody2.setInAppMessagesIds(new JSONArray(str));
        return (outcomeSource == null || (indirectBody = outcomeSource.setIndirectBody(outcomeSourceBody2)) == null) ? new OutcomeSource(null, outcomeSourceBody2) : indirectBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutcomeSource getNotificationInfluenceSource(InfluenceType influenceType, OutcomeSourceBody outcomeSourceBody, OutcomeSourceBody outcomeSourceBody2, String str) {
        OutcomeSource outcomeSource;
        int i = WhenMappings.$EnumSwitchMapping$0[influenceType.ordinal()];
        if (i == 1) {
            outcomeSourceBody.setNotificationIds(new JSONArray(str));
            outcomeSource = new OutcomeSource(outcomeSourceBody, null);
        } else {
            if (i != 2) {
                return null;
            }
            outcomeSourceBody2.setNotificationIds(new JSONArray(str));
            outcomeSource = new OutcomeSource(null, outcomeSourceBody2);
        }
        return outcomeSource;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object cleanCachedUniqueOutcomeEventNotifications(n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C118372(OneSignalDbContract.NotificationTable.TABLE_NAME, "notification_id", this, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object deleteOldOutcomeEvent(OutcomeEventParams outcomeEventParams, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C118382(outcomeEventParams, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAllEventsToSend(n64 n64Var) {
        C118391 c118391;
        if (n64Var instanceof C118391) {
            c118391 = (C118391) n64Var;
            int i = c118391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118391.label = i - Integer.MIN_VALUE;
            } else {
                c118391 = new C118391(n64Var);
            }
        }
        Object obj = c118391.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118391.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) c118391.L$0;
            wre.m54934b(obj);
            return list;
        }
        wre.m54934b(obj);
        ArrayList arrayList = new ArrayList();
        z74 z74VarM25611b = eu5.m25611b();
        C118402 c118402 = new C118402(arrayList, null);
        c118391.L$0 = arrayList;
        c118391.label = 1;
        return pm1.m43867g(z74VarM25611b, c118402, c118391) == objM51918f ? objM51918f : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<Influence> list, n64 n64Var) {
        C118411 c118411;
        if (n64Var instanceof C118411) {
            c118411 = (C118411) n64Var;
            int i = c118411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c118411.label = i - Integer.MIN_VALUE;
            } else {
                c118411 = new C118411(n64Var);
            }
        }
        Object obj = c118411.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c118411.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) c118411.L$0;
            wre.m54934b(obj);
            return list2;
        }
        wre.m54934b(obj);
        ArrayList arrayList = new ArrayList();
        z74 z74VarM25611b = eu5.m25611b();
        C118422 c118422 = new C118422(list, str, this, arrayList, null);
        c118411.L$0 = arrayList;
        c118411.label = 1;
        return pm1.m43867g(z74VarM25611b, c118422, c118411) == objM51918f ? objM51918f : arrayList;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object saveOutcomeEvent(OutcomeEventParams outcomeEventParams, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C118432(outcomeEventParams, this, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsRepository
    public Object saveUniqueOutcomeEventParams(OutcomeEventParams outcomeEventParams, n64 n64Var) {
        Logging.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + outcomeEventParams + ')', null, 2, null);
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C118442(outcomeEventParams, this, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }
}
