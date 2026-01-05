package com.onesignal.inAppMessages.internal.repositories.impl;

import android.content.ContentValues;
import com.onesignal.common.JSONUtils;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.InAppMessageRedisplayStats;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import com.onesignal.inAppMessages.internal.repositories.IInAppRepository;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.objectweb.asm.TypeReference;
import p001o.eu5;
import p001o.h84;
import p001o.id5;
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
public final class InAppRepository implements IInAppRepository {
    public static final Companion Companion = new Companion(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final IDatabaseProvider _databaseProvider;
    private final IInAppPreferencesController _prefs;
    private final ITime _time;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$cleanCachedInAppMessages$2", m36648f = "InAppRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$cleanCachedInAppMessages$2 */
    public static final class C116962 extends jgg implements nl7 {
        int label;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$cleanCachedInAppMessages$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                if (iCursor.getCount() == 0) {
                    Logging.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                    return;
                }
                if (iCursor.moveToFirst()) {
                    do {
                        String string = iCursor.getString("message_id");
                        String string2 = iCursor.getString(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS);
                        this.$oldMessageIds.add(string);
                        this.$oldClickedClickIds.addAll(JSONUtils.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                    } while (iCursor.moveToNext());
                }
            }
        }

        public C116962(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return InAppRepository.this.new C116962(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            String[] strArr = {"message_id", OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - InAppRepository.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            try {
                linkedHashSet = linkedHashSet4;
                linkedHashSet2 = linkedHashSet3;
                try {
                    IDatabase.DefaultImpls.query$default(InAppRepository.this._databaseProvider.getOs(), OneSignalDbContract.InAppMessageTable.TABLE_NAME, strArr, "last_display < ?", strArr2, null, null, null, null, new AnonymousClass1(linkedHashSet3, linkedHashSet4), 240, null);
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                    InAppRepository.this._databaseProvider.getOs().delete(OneSignalDbContract.InAppMessageTable.TABLE_NAME, "last_display < ?", strArr2);
                    InAppRepository.this._prefs.cleanInAppMessageIds(linkedHashSet2);
                    InAppRepository.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet);
                    return y3i.f54824a;
                }
            } catch (JSONException e2) {
                e = e2;
                linkedHashSet = linkedHashSet4;
                linkedHashSet2 = linkedHashSet3;
            }
            InAppRepository.this._databaseProvider.getOs().delete(OneSignalDbContract.InAppMessageTable.TABLE_NAME, "last_display < ?", strArr2);
            InAppRepository.this._prefs.cleanInAppMessageIds(linkedHashSet2);
            InAppRepository.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116962) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository", m36648f = "InAppRepository.kt", m36649l = {TypeReference.NEW}, m36650m = "listInAppMessages")
    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$listInAppMessages$1 */
    public static final class C116971 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116971(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppRepository.this.listInAppMessages(this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$listInAppMessages$2", m36648f = "InAppRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$listInAppMessages$2 */
    public static final class C116982 extends jgg implements nl7 {
        final /* synthetic */ List<InAppMessage> $inAppMessages;
        int label;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$listInAppMessages$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ List<InAppMessage> $inAppMessages;
            final /* synthetic */ InAppRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InAppRepository inAppRepository, List<InAppMessage> list) {
                super(1);
                this.this$0 = inAppRepository;
                this.$inAppMessages = list;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                if (iCursor.moveToFirst()) {
                    do {
                        this.$inAppMessages.add(new InAppMessage(iCursor.getString("message_id"), JSONUtils.INSTANCE.newStringSetFromJSONArray(new JSONArray(iCursor.getString(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS))), iCursor.getInt(OneSignalDbContract.InAppMessageTable.COLUMN_DISPLAYED_IN_SESSION) == 1, new InAppMessageRedisplayStats(iCursor.getInt(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_DISPLAY_QUANTITY), iCursor.getLong(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_LAST_DISPLAY), this.this$0._time), this.this$0._time));
                    } while (iCursor.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116982(List<InAppMessage> list, n64 n64Var) {
            super(2, n64Var);
            this.$inAppMessages = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return InAppRepository.this.new C116982(this.$inAppMessages, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            try {
                IDatabase.DefaultImpls.query$default(InAppRepository.this._databaseProvider.getOs(), OneSignalDbContract.InAppMessageTable.TABLE_NAME, null, null, null, null, null, null, null, new AnonymousClass1(InAppRepository.this, this.$inAppMessages), 254, null);
            } catch (JSONException e) {
                Logging.error("Generating JSONArray from iam click ids:JSON Failed.", e);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116982) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$saveInAppMessage$2", m36648f = "InAppRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository$saveInAppMessage$2 */
    public static final class C116992 extends jgg implements nl7 {
        final /* synthetic */ InAppMessage $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116992(ContentValues contentValues, InAppMessage inAppMessage, n64 n64Var) {
            super(2, n64Var);
            this.$values = contentValues;
            this.$inAppMessage = inAppMessage;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return InAppRepository.this.new C116992(this.$values, this.$inAppMessage, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            if (InAppRepository.this._databaseProvider.getOs().update(OneSignalDbContract.InAppMessageTable.TABLE_NAME, this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                InAppRepository.this._databaseProvider.getOs().insert(OneSignalDbContract.InAppMessageTable.TABLE_NAME, null, this.$values);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116992) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public InAppRepository(IDatabaseProvider iDatabaseProvider, ITime iTime, IInAppPreferencesController iInAppPreferencesController) {
        sq8.m48649h(iDatabaseProvider, "_databaseProvider");
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(iInAppPreferencesController, "_prefs");
        this._databaseProvider = iDatabaseProvider;
        this._time = iTime;
        this._prefs = iInAppPreferencesController;
    }

    @Override // com.onesignal.inAppMessages.internal.repositories.IInAppRepository
    public Object cleanCachedInAppMessages(n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C116962(null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.repositories.IInAppRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(n64 n64Var) {
        C116971 c116971;
        if (n64Var instanceof C116971) {
            c116971 = (C116971) n64Var;
            int i = c116971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116971.label = i - Integer.MIN_VALUE;
            } else {
                c116971 = new C116971(n64Var);
            }
        }
        Object obj = c116971.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116971.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) c116971.L$0;
            wre.m54934b(obj);
            return list;
        }
        wre.m54934b(obj);
        ArrayList arrayList = new ArrayList();
        z74 z74VarM25611b = eu5.m25611b();
        C116982 c116982 = new C116982(arrayList, null);
        c116971.L$0 = arrayList;
        c116971.label = 1;
        return pm1.m43867g(z74VarM25611b, c116982, c116971) == objM51918f ? objM51918f : arrayList;
    }

    @Override // com.onesignal.inAppMessages.internal.repositories.IInAppRepository
    public Object saveInAppMessage(InAppMessage inAppMessage, n64 n64Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", inAppMessage.getMessageId());
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_DISPLAY_QUANTITY, ml1.m39304d(inAppMessage.getRedisplayStats().getDisplayQuantity()));
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_LAST_DISPLAY, ml1.m39305e(inAppMessage.getRedisplayStats().getLastDisplayTime()));
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS, inAppMessage.getClickedClickIds().toString());
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_DISPLAYED_IN_SESSION, ml1.m39301a(inAppMessage.isDisplayedInSession()));
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C116992(contentValues, inAppMessage, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }
}
