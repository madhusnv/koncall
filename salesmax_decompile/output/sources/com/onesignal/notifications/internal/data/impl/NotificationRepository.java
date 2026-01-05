package com.onesignal.notifications.internal.data.impl;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaError;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.ICursor;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.badges.IBadgeCountUpdater;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationQueryHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.limiting.INotificationLimitManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.objectweb.asm.Opcodes;
import p001o.dge;
import p001o.eu5;
import p001o.gge;
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
public final class NotificationRepository implements INotificationRepository {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final IApplicationService _applicationService;
    private final IBadgeCountUpdater _badgeCountUpdater;
    private final IDatabaseProvider _databaseProvider;
    private final INotificationQueryHelper _queryHelper;
    private final ITime _time;
    public static final Companion Companion = new Companion(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, "notification_id", OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA, OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return NotificationRepository.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$clearOldestOverLimitFallback$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$clearOldestOverLimitFallback$2 */
    public static final class C117412 extends jgg implements nl7 {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ NotificationRepository this$0;

        /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$clearOldestOverLimitFallback$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ NotificationRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(int i, int i2, NotificationRepository notificationRepository) {
                super(1);
                this.$maxNumberOfNotificationsInt = i;
                this.$notificationsToMakeRoomFor = i2;
                this.this$0 = notificationRepository;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                int count = (iCursor.getCount() - this.$maxNumberOfNotificationsInt) + this.$notificationsToMakeRoomFor;
                if (count < 1) {
                    return;
                }
                while (iCursor.moveToNext()) {
                    this.this$0.internalMarkAsDismissed(iCursor.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID));
                    count--;
                    if (count <= 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117412(int i, NotificationRepository notificationRepository, int i2, n64 n64Var) {
            super(2, n64Var);
            this.$maxNumberOfNotificationsInt = i;
            this.this$0 = notificationRepository;
            this.$notificationsToMakeRoomFor = i2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C117412(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            String strValueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                IDatabase.DefaultImpls.query$default(this.this$0._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", strValueOf + this.$notificationsToMakeRoomFor, new AnonymousClass1(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                Logging.error("Error clearing oldest notifications over limit! ", th);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117412) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$createNotification$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$createNotification$2 */
    public static final class C117422 extends jgg implements nl7 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $body;
        final /* synthetic */ String $collapseKey;
        final /* synthetic */ long $expireTime;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $id;
        final /* synthetic */ boolean $isOpened;
        final /* synthetic */ String $jsonPayload;
        final /* synthetic */ boolean $shouldDismissIdenticals;
        final /* synthetic */ String $title;
        int label;
        final /* synthetic */ NotificationRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117422(String str, boolean z, int i, NotificationRepository notificationRepository, String str2, String str3, boolean z2, String str4, String str5, long j, String str6, n64 n64Var) {
            super(2, n64Var);
            this.$id = str;
            this.$shouldDismissIdenticals = z;
            this.$androidId = i;
            this.this$0 = notificationRepository;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z2;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j;
            this.$jsonPayload = str6;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C117422(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            Logging.debug$default("Saving Notification id=" + this.$id, null, 2, null);
            try {
                int i = 1;
                if (this.$shouldDismissIdenticals) {
                    String str = "android_notification_id = " + this.$androidId;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, ml1.m39304d(1));
                    this.this$0._databaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, str, null);
                    this.this$0._badgeCountUpdater.update();
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("notification_id", this.$id);
                String str2 = this.$groupId;
                if (str2 != null) {
                    contentValues2.put("group_id", str2);
                }
                String str3 = this.$collapseKey;
                if (str3 != null) {
                    contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_COLLAPSE_ID, str3);
                }
                if (!this.$isOpened) {
                    i = 0;
                }
                contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, ml1.m39304d(i));
                if (!this.$isOpened) {
                    contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, ml1.m39304d(this.$androidId));
                }
                String str4 = this.$title;
                if (str4 != null) {
                    contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, str4);
                }
                String str5 = this.$body;
                if (str5 != null) {
                    contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, str5);
                }
                contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_EXPIRE_TIME, ml1.m39305e(this.$expireTime));
                contentValues2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA, this.$jsonPayload);
                this.this$0._databaseProvider.getOs().insertOrThrow(OneSignalDbContract.NotificationTable.TABLE_NAME, null, contentValues2);
                Logging.debug$default("Notification saved values: " + contentValues2, null, 2, null);
                if (!this.$isOpened) {
                    this.this$0._badgeCountUpdater.update();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117422) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$createSummaryNotification$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$createSummaryNotification$2 */
    public static final class C117432 extends jgg implements nl7 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ NotificationRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117432(int i, String str, NotificationRepository notificationRepository, n64 n64Var) {
            super(2, n64Var);
            this.$androidId = i;
            this.$groupId = str;
            this.this$0 = notificationRepository;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C117432(this.$androidId, this.$groupId, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, ml1.m39304d(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_IS_SUMMARY, ml1.m39304d(1));
            this.this$0._databaseProvider.getOs().insertOrThrow(OneSignalDbContract.NotificationTable.TABLE_NAME, null, contentValues);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117432) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$deleteExpiredNotifications$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$deleteExpiredNotifications$2 */
    public static final class C117442 extends jgg implements nl7 {
        int label;

        public C117442(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationRepository.this.new C117442(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            String strValueOf = String.valueOf((NotificationRepository.this._time.getCurrentTimeMillis() / 1000) - NotificationRepository.NOTIFICATION_CACHE_DATA_LIFETIME);
            sq8.m48648g(strValueOf, "valueOf(\n               …FETIME,\n                )");
            NotificationRepository.this._databaseProvider.getOs().delete(OneSignalDbContract.NotificationTable.TABLE_NAME, "created_time < ?", new String[]{strValueOf});
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117442) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", m36648f = "NotificationRepository.kt", m36649l = {Opcodes.IF_ICMPGE}, m36650m = "doesNotificationExist")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$doesNotificationExist$1 */
    public static final class C117451 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117451(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationRepository.this.doesNotificationExist(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$doesNotificationExist$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$doesNotificationExist$2 */
    public static final class C117462 extends jgg implements nl7 {
        final /* synthetic */ String $id;
        final /* synthetic */ dge $result;
        int label;
        final /* synthetic */ NotificationRepository this$0;

        /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$doesNotificationExist$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ String $id;
            final /* synthetic */ dge $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, dge dgeVar) {
                super(1);
                this.$id = str;
                this.$result = dgeVar;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                if (iCursor.moveToFirst()) {
                    Logging.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.f19803a = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117462(String str, NotificationRepository notificationRepository, dge dgeVar, n64 n64Var) {
            super(2, n64Var);
            this.$id = str;
            this.this$0 = notificationRepository;
            this.$result = dgeVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C117462(this.$id, this.this$0, this.$result, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            String str = this.$id;
            sq8.m48646e(str);
            IDatabase os = this.this$0._databaseProvider.getOs();
            IDatabase.DefaultImpls.query$default(os, OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{"notification_id"}, "notification_id = ?", new String[]{str}, null, null, null, null, new AnonymousClass1(this.$id, this.$result), 240, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117462) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", m36648f = "NotificationRepository.kt", m36649l = {515}, m36650m = "getAndroidIdForGroup")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdForGroup$1 */
    public static final class C117471 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117471(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationRepository.this.getAndroidIdForGroup(null, false, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdForGroup$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdForGroup$2 */
    public static final class C117482 extends jgg implements nl7 {
        final /* synthetic */ gge $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ gge $whereStr;
        int label;

        /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdForGroup$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ gge $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(gge ggeVar) {
                super(1);
                this.$recentId = ggeVar;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                boolean zMoveToFirst = iCursor.moveToFirst();
                this.$recentId.f25106a = !zMoveToFirst ? null : Integer.valueOf(iCursor.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117482(gge ggeVar, String[] strArr, gge ggeVar2, n64 n64Var) {
            super(2, n64Var);
            this.$whereStr = ggeVar;
            this.$whereArgs = strArr;
            this.$recentId = ggeVar2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationRepository.this.new C117482(this.$whereStr, this.$whereArgs, this.$recentId, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            IDatabase.DefaultImpls.query$default(NotificationRepository.this._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID}, (String) this.$whereStr.f25106a, this.$whereArgs, null, null, "created_time DESC", "1", new AnonymousClass1(this.$recentId), 48, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117482) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", m36648f = "NotificationRepository.kt", m36649l = {381}, m36650m = "getAndroidIdFromCollapseKey")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdFromCollapseKey$1 */
    public static final class C117491 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117491(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationRepository.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdFromCollapseKey$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdFromCollapseKey$2 */
    public static final class C117502 extends jgg implements nl7 {
        final /* synthetic */ gge $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getAndroidIdFromCollapseKey$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ gge $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(gge ggeVar) {
                super(1);
                this.$androidId = ggeVar;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                if (iCursor.moveToFirst()) {
                    this.$androidId.f25106a = Integer.valueOf(iCursor.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117502(String str, gge ggeVar, n64 n64Var) {
            super(2, n64Var);
            this.$collapseKey = str;
            this.$androidId = ggeVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationRepository.this.new C117502(this.$collapseKey, this.$androidId, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            IDatabase.DefaultImpls.query$default(NotificationRepository.this._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new AnonymousClass1(this.$androidId), 240, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117502) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", m36648f = "NotificationRepository.kt", m36649l = {361}, m36650m = "getGroupId")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getGroupId$1 */
    public static final class C117511 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117511(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationRepository.this.getGroupId(0, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$getGroupId$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getGroupId$2 */
    public static final class C117522 extends jgg implements nl7 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ gge $groupId;
        int label;

        /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$getGroupId$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ gge $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(gge ggeVar) {
                super(1);
                this.$groupId = ggeVar;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                if (iCursor.moveToFirst()) {
                    this.$groupId.f25106a = iCursor.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117522(int i, gge ggeVar, n64 n64Var) {
            super(2, n64Var);
            this.$androidId = i;
            this.$groupId = ggeVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationRepository.this.new C117522(this.$androidId, this.$groupId, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            IDatabase.DefaultImpls.query$default(NotificationRepository.this._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new AnonymousClass1(this.$groupId), 248, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117522) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", m36648f = "NotificationRepository.kt", m36649l = {440}, m36650m = "listNotificationsForGroup")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForGroup$1 */
    public static final class C117531 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117531(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationRepository.this.listNotificationsForGroup(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForGroup$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForGroup$2 */
    public static final class C117542 extends jgg implements nl7 {
        final /* synthetic */ List<INotificationRepository.NotificationData> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ NotificationRepository this$0;

        /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForGroup$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ List<INotificationRepository.NotificationData> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<INotificationRepository.NotificationData> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
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
                        try {
                            String optString = iCursor.getOptString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
                            String optString2 = iCursor.getOptString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                            this.$listOfNotifications.add(new INotificationRepository.NotificationData(iCursor.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID), iCursor.getString("notification_id"), iCursor.getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA), iCursor.getLong(OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME), optString, optString2));
                        } catch (JSONException unused) {
                            Logging.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (iCursor.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117542(String str, NotificationRepository notificationRepository, List<INotificationRepository.NotificationData> list, n64 n64Var) {
            super(2, n64Var);
            this.$summaryGroup = str;
            this.this$0 = notificationRepository;
            this.$listOfNotifications = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C117542(this.$summaryGroup, this.this$0, this.$listOfNotifications, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            IDatabase.DefaultImpls.query$default(this.this$0._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, NotificationRepository.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new AnonymousClass1(this.$listOfNotifications, this.$summaryGroup), Opcodes.ARETURN, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117542) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", m36648f = "NotificationRepository.kt", m36649l = {541}, m36650m = "listNotificationsForOutstanding")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForOutstanding$1 */
    public static final class C117551 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117551(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationRepository.this.listNotificationsForOutstanding(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForOutstanding$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForOutstanding$2 */
    public static final class C117562 extends jgg implements nl7 {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<INotificationRepository.NotificationData> $listOfNotifications;
        int label;

        /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$listNotificationsForOutstanding$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ List<INotificationRepository.NotificationData> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<INotificationRepository.NotificationData> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                while (iCursor.moveToNext()) {
                    String optString = iCursor.getOptString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
                    String optString2 = iCursor.getOptString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                    String string = iCursor.getString("notification_id");
                    this.$listOfNotifications.add(new INotificationRepository.NotificationData(iCursor.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID), string, iCursor.getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA), iCursor.getLong(OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117562(List<Integer> list, List<INotificationRepository.NotificationData> list2, n64 n64Var) {
            super(2, n64Var);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationRepository.this.new C117562(this.$excludeAndroidIds, this.$listOfNotifications, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            StringBuilder sbRecentUninteractedWithNotificationsWhere = NotificationRepository.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                sbRecentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                sbRecentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                sbRecentUninteractedWithNotificationsWhere.append(")");
            }
            IDatabase.DefaultImpls.query$default(NotificationRepository.this._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, NotificationRepository.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), sbRecentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(INotificationLimitManager.Constants.INSTANCE.getMaxNumberOfNotifications()), new AnonymousClass1(this.$listOfNotifications), 56, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117562) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsConsumed$2", m36648f = "NotificationRepository.kt", m36649l = {MediaError.DetailedErrorCode.DASH_NO_INIT}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsConsumed$2 */
    public static final class C117572 extends jgg implements nl7 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ NotificationRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117572(String str, boolean z, boolean z2, NotificationRepository notificationRepository, int i, n64 n64Var) {
            super(2, n64Var);
            this.$summaryGroup = str;
            this.$dismissed = z;
            this.$clearGroupOnSummaryClick = z2;
            this.this$0 = notificationRepository;
            this.$androidId = i;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C117572(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            String[] strArr;
            String str2;
            boolean z;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                String str3 = this.$summaryGroup;
                String[] strArr2 = null;
                if (str3 != null) {
                    boolean zM48644c = sq8.m48644c(str3, NotificationHelper.GROUPLESS_SUMMARY_KEY);
                    if (zM48644c) {
                        str2 = "group_id IS NULL";
                    } else {
                        strArr2 = new String[]{this.$summaryGroup};
                        str2 = "group_id = ?";
                    }
                    String str4 = str2;
                    String[] strArr3 = strArr2;
                    str = str4;
                    if (this.$dismissed || this.$clearGroupOnSummaryClick) {
                        strArr = strArr3;
                    } else {
                        NotificationRepository notificationRepository = this.this$0;
                        String str5 = this.$summaryGroup;
                        this.L$0 = str;
                        this.Z$0 = zM48644c;
                        this.label = 1;
                        Object androidIdForGroup = notificationRepository.getAndroidIdForGroup(str5, false, this);
                        if (androidIdForGroup == objM51918f) {
                            return objM51918f;
                        }
                        z = zM48644c;
                        obj = androidIdForGroup;
                    }
                } else {
                    str = "android_notification_id = " + this.$androidId;
                    strArr = null;
                }
                ContentValues contentValues = new ContentValues();
                if (this.$dismissed) {
                    contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, ml1.m39304d(1));
                } else {
                    contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, ml1.m39304d(1));
                }
                this.this$0._databaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, str, strArr);
                this.this$0._badgeCountUpdater.update();
                return y3i.f54824a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            str = (String) this.L$0;
            wre.m54934b(obj);
            String strValueOf = String.valueOf(obj);
            str = str + " AND android_notification_id = ?";
            strArr = z ? new String[]{strValueOf} : new String[]{this.$summaryGroup, strValueOf};
            ContentValues contentValues2 = new ContentValues();
            if (this.$dismissed) {
            }
            this.this$0._databaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues2, str, strArr);
            this.this$0._badgeCountUpdater.update();
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117572) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository", m36648f = "NotificationRepository.kt", m36649l = {Opcodes.LAND}, m36650m = "markAsDismissed")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissed$1 */
    public static final class C117581 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117581(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationRepository.this.markAsDismissed(0, this);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissed$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissed$2 */
    public static final class C117592 extends jgg implements nl7 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ dge $didDismiss;
        int label;
        final /* synthetic */ NotificationRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117592(dge dgeVar, NotificationRepository notificationRepository, int i, n64 n64Var) {
            super(2, n64Var);
            this.$didDismiss = dgeVar;
            this.this$0 = notificationRepository;
            this.$androidId = i;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C117592(this.$didDismiss, this.this$0, this.$androidId, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            this.$didDismiss.f19803a = this.this$0.internalMarkAsDismissed(this.$androidId);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117592) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForGroup$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForGroup$2 */
    public static final class C117602 extends jgg implements nl7 {
        final /* synthetic */ String $group;
        int label;

        /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForGroup$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ICursor) obj);
                return y3i.f54824a;
            }

            public final void invoke(ICursor iCursor) {
                sq8.m48649h(iCursor, "it");
                while (iCursor.moveToNext()) {
                    int i = iCursor.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID);
                    if (i != -1) {
                        this.$notificationManager.cancel(i);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117602(String str, n64 n64Var) {
            super(2, n64Var);
            this.$group = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationRepository.this.new C117602(this.$group, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            NotificationManager notificationManager = NotificationHelper.INSTANCE.getNotificationManager(NotificationRepository.this._applicationService.getAppContext());
            String[] strArr = {OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID};
            String[] strArr2 = {this.$group};
            IDatabase.DefaultImpls.query$default(NotificationRepository.this._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, strArr, "group_id = ? AND dismissed = 0 AND opened = 0", strArr2, null, null, null, null, new AnonymousClass1(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, ml1.m39304d(1));
            NotificationRepository.this._databaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr2);
            NotificationRepository.this._badgeCountUpdater.update();
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117602) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForOutstanding$2", m36648f = "NotificationRepository.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForOutstanding$2 */
    public static final class C117612 extends jgg implements nl7 {
        int label;

        /* renamed from: com.onesignal.notifications.internal.data.impl.NotificationRepository$markAsDismissedForOutstanding$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends kf9 implements xk7 {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
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
                        this.$notificationManager.cancel(iCursor.getInt(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID));
                    } while (iCursor.moveToNext());
                }
            }
        }

        public C117612(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return NotificationRepository.this.new C117612(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            NotificationManager notificationManager = NotificationHelper.INSTANCE.getNotificationManager(NotificationRepository.this._applicationService.getAppContext());
            IDatabase.DefaultImpls.query$default(NotificationRepository.this._databaseProvider.getOs(), OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new AnonymousClass1(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, ml1.m39304d(1));
            NotificationRepository.this._databaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, "opened = 0", null);
            NotificationRepository.this._badgeCountUpdater.updateCount(0);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117612) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public NotificationRepository(IApplicationService iApplicationService, INotificationQueryHelper iNotificationQueryHelper, IDatabaseProvider iDatabaseProvider, ITime iTime, IBadgeCountUpdater iBadgeCountUpdater) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iNotificationQueryHelper, "_queryHelper");
        sq8.m48649h(iDatabaseProvider, "_databaseProvider");
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(iBadgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = iApplicationService;
        this._queryHelper = iNotificationQueryHelper;
        this._databaseProvider = iDatabaseProvider;
        this._time = iTime;
        this._badgeCountUpdater = iBadgeCountUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i) {
        Context appContext = this._applicationService.getAppContext();
        String str = "android_notification_id = " + i + " AND opened = 0 AND dismissed = 0";
        ContentValues contentValues = new ContentValues();
        contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, (Integer) 1);
        boolean z = this._databaseProvider.getOs().update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, str, null) > 0;
        this._badgeCountUpdater.update();
        NotificationHelper.INSTANCE.getNotificationManager(appContext).cancel(i);
        return z;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object clearOldestOverLimitFallback(int i, int i2, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C117412(i2, this, i, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object createNotification(String str, String str2, String str3, boolean z, boolean z2, int i, String str4, String str5, long j, String str6, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C117422(str, z, i, this, str2, str3, z2, str4, str5, j, str6, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object createSummaryNotification(int i, String str, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C117432(i, str, this, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object deleteExpiredNotifications(n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C117442(null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, n64 n64Var) {
        C117451 c117451;
        dge dgeVar;
        if (n64Var instanceof C117451) {
            c117451 = (C117451) n64Var;
            int i = c117451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117451.label = i - Integer.MIN_VALUE;
            } else {
                c117451 = new C117451(n64Var);
            }
        }
        Object obj = c117451.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117451.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (str == null || sq8.m48644c("", str)) {
                return ml1.m39301a(false);
            }
            dge dgeVar2 = new dge();
            z74 z74VarM25611b = eu5.m25611b();
            C117462 c117462 = new C117462(str, this, dgeVar2, null);
            c117451.L$0 = dgeVar2;
            c117451.label = 1;
            if (pm1.m43867g(z74VarM25611b, c117462, c117451) == objM51918f) {
                return objM51918f;
            }
            dgeVar = dgeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dgeVar = (dge) c117451.L$0;
            wre.m54934b(obj);
        }
        return ml1.m39301a(dgeVar.f19803a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z, n64 n64Var) {
        C117471 c117471;
        gge ggeVar;
        if (n64Var instanceof C117471) {
            c117471 = (C117471) n64Var;
            int i = c117471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117471.label = i - Integer.MIN_VALUE;
            } else {
                c117471 = new C117471(n64Var);
            }
        }
        Object obj = c117471.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117471.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            gge ggeVar2 = new gge();
            boolean zM48644c = sq8.m48644c(str, NotificationHelper.GROUPLESS_SUMMARY_KEY);
            gge ggeVar3 = new gge();
            ggeVar3.f25106a = zM48644c ? "group_id IS NULL" : "group_id = ?";
            ggeVar3.f25106a = ((String) ggeVar3.f25106a) + " AND dismissed = 0 AND opened = 0 AND ";
            StringBuilder sb = new StringBuilder();
            sb.append((String) ggeVar3.f25106a);
            sb.append(z ? "is_summary = 1" : "is_summary = 0");
            ggeVar3.f25106a = sb.toString();
            String[] strArr = zM48644c ? null : new String[]{str};
            z74 z74VarM25611b = eu5.m25611b();
            C117482 c117482 = new C117482(ggeVar3, strArr, ggeVar2, null);
            c117471.L$0 = ggeVar2;
            c117471.label = 1;
            if (pm1.m43867g(z74VarM25611b, c117482, c117471) == objM51918f) {
                return objM51918f;
            }
            ggeVar = ggeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ggeVar = (gge) c117471.L$0;
            wre.m54934b(obj);
        }
        return ggeVar.f25106a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, n64 n64Var) {
        C117491 c117491;
        gge ggeVar;
        if (n64Var instanceof C117491) {
            c117491 = (C117491) n64Var;
            int i = c117491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117491.label = i - Integer.MIN_VALUE;
            } else {
                c117491 = new C117491(n64Var);
            }
        }
        Object obj = c117491.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117491.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            gge ggeVar2 = new gge();
            z74 z74VarM25611b = eu5.m25611b();
            C117502 c117502 = new C117502(str, ggeVar2, null);
            c117491.L$0 = ggeVar2;
            c117491.label = 1;
            if (pm1.m43867g(z74VarM25611b, c117502, c117491) == objM51918f) {
                return objM51918f;
            }
            ggeVar = ggeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ggeVar = (gge) c117491.L$0;
            wre.m54934b(obj);
        }
        return ggeVar.f25106a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i, n64 n64Var) {
        C117511 c117511;
        gge ggeVar;
        if (n64Var instanceof C117511) {
            c117511 = (C117511) n64Var;
            int i2 = c117511.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c117511.label = i2 - Integer.MIN_VALUE;
            } else {
                c117511 = new C117511(n64Var);
            }
        }
        Object obj = c117511.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c117511.label;
        if (i3 == 0) {
            wre.m54934b(obj);
            gge ggeVar2 = new gge();
            z74 z74VarM25611b = eu5.m25611b();
            C117522 c117522 = new C117522(i, ggeVar2, null);
            c117511.L$0 = ggeVar2;
            c117511.label = 1;
            if (pm1.m43867g(z74VarM25611b, c117522, c117511) == objM51918f) {
                return objM51918f;
            }
            ggeVar = ggeVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ggeVar = (gge) c117511.L$0;
            wre.m54934b(obj);
        }
        return ggeVar.f25106a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, n64 n64Var) {
        C117531 c117531;
        if (n64Var instanceof C117531) {
            c117531 = (C117531) n64Var;
            int i = c117531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117531.label = i - Integer.MIN_VALUE;
            } else {
                c117531 = new C117531(n64Var);
            }
        }
        Object obj = c117531.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117531.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) c117531.L$0;
            wre.m54934b(obj);
            return list;
        }
        wre.m54934b(obj);
        ArrayList arrayList = new ArrayList();
        z74 z74VarM25611b = eu5.m25611b();
        C117542 c117542 = new C117542(str, this, arrayList, null);
        c117531.L$0 = arrayList;
        c117531.label = 1;
        return pm1.m43867g(z74VarM25611b, c117542, c117531) == objM51918f ? objM51918f : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, n64 n64Var) {
        C117551 c117551;
        if (n64Var instanceof C117551) {
            c117551 = (C117551) n64Var;
            int i = c117551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117551.label = i - Integer.MIN_VALUE;
            } else {
                c117551 = new C117551(n64Var);
            }
        }
        Object obj = c117551.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117551.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) c117551.L$0;
            wre.m54934b(obj);
            return list2;
        }
        wre.m54934b(obj);
        ArrayList arrayList = new ArrayList();
        z74 z74VarM25611b = eu5.m25611b();
        C117562 c117562 = new C117562(list, arrayList, null);
        c117551.L$0 = arrayList;
        c117551.label = 1;
        return pm1.m43867g(z74VarM25611b, c117562, c117551) == objM51918f ? objM51918f : arrayList;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object markAsConsumed(int i, boolean z, String str, boolean z2, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C117572(str, z, z2, this, i, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i, n64 n64Var) {
        C117581 c117581;
        dge dgeVar;
        if (n64Var instanceof C117581) {
            c117581 = (C117581) n64Var;
            int i2 = c117581.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c117581.label = i2 - Integer.MIN_VALUE;
            } else {
                c117581 = new C117581(n64Var);
            }
        }
        Object obj = c117581.result;
        Object objM51918f = uq8.m51918f();
        int i3 = c117581.label;
        if (i3 == 0) {
            wre.m54934b(obj);
            dge dgeVar2 = new dge();
            z74 z74VarM25611b = eu5.m25611b();
            C117592 c117592 = new C117592(dgeVar2, this, i, null);
            c117581.L$0 = dgeVar2;
            c117581.label = 1;
            if (pm1.m43867g(z74VarM25611b, c117592, c117581) == objM51918f) {
                return objM51918f;
            }
            dgeVar = dgeVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dgeVar = (dge) c117581.L$0;
            wre.m54934b(obj);
        }
        return ml1.m39301a(dgeVar.f19803a);
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object markAsDismissedForGroup(String str, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C117602(str, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    @Override // com.onesignal.notifications.internal.data.INotificationRepository
    public Object markAsDismissedForOutstanding(n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25611b(), new C117612(null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }
}
