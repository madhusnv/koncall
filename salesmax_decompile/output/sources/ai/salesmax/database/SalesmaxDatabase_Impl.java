package ai.salesmax.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;
import p001o.dv1;
import p001o.fv1;
import p001o.gn0;
import p001o.i96;
import p001o.in0;
import p001o.k96;
import p001o.leg;
import p001o.meg;
import p001o.r83;
import p001o.s83;
import p001o.sq;
import p001o.ua6;
import p001o.uq;
import p001o.va6;
import p001o.xha;
import p001o.yha;

/* loaded from: classes.dex */
public final class SalesmaxDatabase_Impl extends SalesmaxDatabase {

    /* renamed from: d */
    public volatile i96 f310d;

    /* renamed from: e */
    public volatile r83 f311e;

    /* renamed from: f */
    public volatile ua6 f312f;

    /* renamed from: g */
    public volatile xha f313g;

    /* renamed from: h */
    public volatile sq f314h;

    /* renamed from: i */
    public volatile dv1 f315i;

    /* renamed from: j */
    public volatile gn0 f316j;

    /* renamed from: ai.salesmax.database.SalesmaxDatabase_Impl$a */
    public class C0077a extends RoomOpenHelper.Delegate {
        public C0077a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(leg legVar) {
            legVar.execSQL("CREATE TABLE IF NOT EXISTS `engagement` (`id` TEXT NOT NULL, `clientID` TEXT, `clientName` TEXT, `clientCompany` TEXT, `clientProfilePic` TEXT, `clientDesignation` TEXT, `primaryTeamId` TEXT, `clientContactNumber` TEXT, `userNumber` TEXT, `callTimeInMillis` INTEGER, `callStartTime` INTEGER, `callEndTime` INTEGER, `callDuration` INTEGER, `callDirection` TEXT, `callConnectionStatus` TEXT, `engagementType` TEXT, `status` TEXT, `engagementSourceType` TEXT, `engagementSource` TEXT, `engagementSourceLevelTwo` TEXT, `callConnectTime` INTEGER, `inFlightCall` INTEGER NOT NULL, `androidDeviceId` TEXT, `persisted` INTEGER, `recording` INTEGER, `mapping` INTEGER, `uploadedFile` TEXT, `recordingId` TEXT, `uri` TEXT, `fileName` TEXT, `filePath` TEXT, `mimeType` TEXT, `recordingDateAdded` INTEGER, `createdAt` INTEGER DEFAULT 0, `cloudProvider` TEXT, `cloudProviderNumber` TEXT, `totalCallDuration` INTEGER, `callType` TEXT, `hangupReason` TEXT, `phoneCallLogId` TEXT, PRIMARY KEY(`id`))");
            legVar.execSQL("CREATE INDEX IF NOT EXISTS `engagement_created_at` ON `engagement` (`createdAt`)");
            legVar.execSQL("CREATE TABLE IF NOT EXISTS `checkpoint` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `accountId` TEXT NOT NULL, `userId` TEXT NOT NULL, `value` INTEGER NOT NULL)");
            legVar.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `checkpoint_alt` ON `checkpoint` (`name`, `accountId`, `userId`)");
            legVar.execSQL("CREATE TABLE IF NOT EXISTS `engagement_outcome` (`id` TEXT NOT NULL, `idType` TEXT NOT NULL, `callOutcome` TEXT NOT NULL, `callOutcomeNature` TEXT NOT NULL, `callNextStep` TEXT, `callInputNotes` TEXT, `customCallOutcomeData` TEXT, `nextFollowUpOn` INTEGER, `nextFollowUpSetBy` TEXT, `nextTaskDateTimeInMillis` INTEGER NOT NULL, `transferLead` INTEGER NOT NULL, `assignment` INTEGER NOT NULL, `persisted` INTEGER NOT NULL, `assignmentType` TEXT, `assignedUserId` TEXT, `assignedTeamId` TEXT, `assignedDistributionId` TEXT, `assignOpenTasks` INTEGER NOT NULL, `assignOpenDeals` INTEGER NOT NULL, `assignChats` INTEGER NOT NULL, `submittedFormValues` TEXT, PRIMARY KEY(`id`, `idType`))");
            legVar.execSQL("CREATE TABLE IF NOT EXISTS `periodic_location` (`id` TEXT NOT NULL, `longitude` REAL NOT NULL, `latitude` REAL NOT NULL, `provider` TEXT, `createdAt` INTEGER NOT NULL, `persisted` INTEGER NOT NULL, `activityLocationId` TEXT, PRIMARY KEY(`id`))");
            legVar.execSQL("CREATE TABLE IF NOT EXISTS `activity_log` (`id` TEXT NOT NULL, `accountId` TEXT NOT NULL, `userId` TEXT NOT NULL, `activityType` TEXT NOT NULL, `activitySource` TEXT, `message` TEXT NOT NULL, `properties` TEXT NOT NULL, `activityTime` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            legVar.execSQL("CREATE TABLE IF NOT EXISTS `call_log` (`callId` TEXT NOT NULL, `number` TEXT, `phone` TEXT, `direction` TEXT, `callStartTime` INTEGER, `name` TEXT, `source` TEXT, `duration` INTEGER, `callEndTime` INTEGER, `callConnectTime` INTEGER, `callConnectStatus` TEXT, `subscriptionId` INTEGER, `isConnectedCall` INTEGER, `callStatus` TEXT, `cloudProvider` TEXT, `cloudProviderNumber` TEXT, `totalCallDuration` INTEGER, `callType` TEXT, `hangupReason` TEXT, `phoneCallLogId` TEXT, `phoneHandle` TEXT, `createdAt` INTEGER NOT NULL, `processed` INTEGER NOT NULL, PRIMARY KEY(`callId`))");
            legVar.execSQL("CREATE TABLE IF NOT EXISTS `app_version` (`id` INTEGER NOT NULL, `version` TEXT, `model` TEXT, `manufacturer` TEXT, `androidVersion` TEXT, `persisted` INTEGER, PRIMARY KEY(`id`))");
            legVar.execSQL(RoomMasterTable.CREATE_QUERY);
            legVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '285231acb76e80c8b566c45b44c23b29')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(leg legVar) {
            legVar.execSQL("DROP TABLE IF EXISTS `engagement`");
            legVar.execSQL("DROP TABLE IF EXISTS `checkpoint`");
            legVar.execSQL("DROP TABLE IF EXISTS `engagement_outcome`");
            legVar.execSQL("DROP TABLE IF EXISTS `periodic_location`");
            legVar.execSQL("DROP TABLE IF EXISTS `activity_log`");
            legVar.execSQL("DROP TABLE IF EXISTS `call_log`");
            legVar.execSQL("DROP TABLE IF EXISTS `app_version`");
            List list = ((RoomDatabase) SalesmaxDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onDestructiveMigration(legVar);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(leg legVar) {
            List list = ((RoomDatabase) SalesmaxDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onCreate(legVar);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(leg legVar) {
            ((RoomDatabase) SalesmaxDatabase_Impl.this).mDatabase = legVar;
            SalesmaxDatabase_Impl.this.internalInitInvalidationTracker(legVar);
            List list = ((RoomDatabase) SalesmaxDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onOpen(legVar);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(leg legVar) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(leg legVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            DBUtil.dropFtsSyncTriggers(legVar);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(leg legVar) {
            HashMap map = new HashMap(40);
            map.put(OutcomeConstants.OUTCOME_ID, new TableInfo.Column(OutcomeConstants.OUTCOME_ID, "TEXT", true, 1, null, 1));
            map.put("clientID", new TableInfo.Column("clientID", "TEXT", false, 0, null, 1));
            map.put("clientName", new TableInfo.Column("clientName", "TEXT", false, 0, null, 1));
            map.put("clientCompany", new TableInfo.Column("clientCompany", "TEXT", false, 0, null, 1));
            map.put("clientProfilePic", new TableInfo.Column("clientProfilePic", "TEXT", false, 0, null, 1));
            map.put("clientDesignation", new TableInfo.Column("clientDesignation", "TEXT", false, 0, null, 1));
            map.put("primaryTeamId", new TableInfo.Column("primaryTeamId", "TEXT", false, 0, null, 1));
            map.put("clientContactNumber", new TableInfo.Column("clientContactNumber", "TEXT", false, 0, null, 1));
            map.put("userNumber", new TableInfo.Column("userNumber", "TEXT", false, 0, null, 1));
            map.put("callTimeInMillis", new TableInfo.Column("callTimeInMillis", "INTEGER", false, 0, null, 1));
            map.put("callStartTime", new TableInfo.Column("callStartTime", "INTEGER", false, 0, null, 1));
            map.put("callEndTime", new TableInfo.Column("callEndTime", "INTEGER", false, 0, null, 1));
            map.put("callDuration", new TableInfo.Column("callDuration", "INTEGER", false, 0, null, 1));
            map.put("callDirection", new TableInfo.Column("callDirection", "TEXT", false, 0, null, 1));
            map.put("callConnectionStatus", new TableInfo.Column("callConnectionStatus", "TEXT", false, 0, null, 1));
            map.put("engagementType", new TableInfo.Column("engagementType", "TEXT", false, 0, null, 1));
            map.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, 1));
            map.put("engagementSourceType", new TableInfo.Column("engagementSourceType", "TEXT", false, 0, null, 1));
            map.put("engagementSource", new TableInfo.Column("engagementSource", "TEXT", false, 0, null, 1));
            map.put("engagementSourceLevelTwo", new TableInfo.Column("engagementSourceLevelTwo", "TEXT", false, 0, null, 1));
            map.put("callConnectTime", new TableInfo.Column("callConnectTime", "INTEGER", false, 0, null, 1));
            map.put("inFlightCall", new TableInfo.Column("inFlightCall", "INTEGER", true, 0, null, 1));
            map.put("androidDeviceId", new TableInfo.Column("androidDeviceId", "TEXT", false, 0, null, 1));
            map.put("persisted", new TableInfo.Column("persisted", "INTEGER", false, 0, null, 1));
            map.put("recording", new TableInfo.Column("recording", "INTEGER", false, 0, null, 1));
            map.put("mapping", new TableInfo.Column("mapping", "INTEGER", false, 0, null, 1));
            map.put("uploadedFile", new TableInfo.Column("uploadedFile", "TEXT", false, 0, null, 1));
            map.put("recordingId", new TableInfo.Column("recordingId", "TEXT", false, 0, null, 1));
            map.put("uri", new TableInfo.Column("uri", "TEXT", false, 0, null, 1));
            map.put("fileName", new TableInfo.Column("fileName", "TEXT", false, 0, null, 1));
            map.put("filePath", new TableInfo.Column("filePath", "TEXT", false, 0, null, 1));
            map.put("mimeType", new TableInfo.Column("mimeType", "TEXT", false, 0, null, 1));
            map.put("recordingDateAdded", new TableInfo.Column("recordingDateAdded", "INTEGER", false, 0, null, 1));
            map.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", false, 0, "0", 1));
            map.put("cloudProvider", new TableInfo.Column("cloudProvider", "TEXT", false, 0, null, 1));
            map.put("cloudProviderNumber", new TableInfo.Column("cloudProviderNumber", "TEXT", false, 0, null, 1));
            map.put("totalCallDuration", new TableInfo.Column("totalCallDuration", "INTEGER", false, 0, null, 1));
            map.put("callType", new TableInfo.Column("callType", "TEXT", false, 0, null, 1));
            map.put("hangupReason", new TableInfo.Column("hangupReason", "TEXT", false, 0, null, 1));
            map.put("phoneCallLogId", new TableInfo.Column("phoneCallLogId", "TEXT", false, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("engagement_created_at", false, Arrays.asList("createdAt"), Arrays.asList("ASC")));
            TableInfo tableInfo = new TableInfo("engagement", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(legVar, "engagement");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "engagement(ai.salesmax.database.dto.Engagement).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(5);
            map2.put(OutcomeConstants.OUTCOME_ID, new TableInfo.Column(OutcomeConstants.OUTCOME_ID, "INTEGER", true, 1, null, 1));
            map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map2.put("accountId", new TableInfo.Column("accountId", "TEXT", true, 0, null, 1));
            map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map2.put("value", new TableInfo.Column("value", "INTEGER", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.Index("checkpoint_alt", true, Arrays.asList("name", "accountId", "userId"), Arrays.asList("ASC", "ASC", "ASC")));
            TableInfo tableInfo3 = new TableInfo("checkpoint", map2, hashSet3, hashSet4);
            TableInfo tableInfo4 = TableInfo.read(legVar, "checkpoint");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "checkpoint(ai.salesmax.database.dto.Checkpoint).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(21);
            map3.put(OutcomeConstants.OUTCOME_ID, new TableInfo.Column(OutcomeConstants.OUTCOME_ID, "TEXT", true, 1, null, 1));
            map3.put("idType", new TableInfo.Column("idType", "TEXT", true, 2, null, 1));
            map3.put("callOutcome", new TableInfo.Column("callOutcome", "TEXT", true, 0, null, 1));
            map3.put("callOutcomeNature", new TableInfo.Column("callOutcomeNature", "TEXT", true, 0, null, 1));
            map3.put("callNextStep", new TableInfo.Column("callNextStep", "TEXT", false, 0, null, 1));
            map3.put("callInputNotes", new TableInfo.Column("callInputNotes", "TEXT", false, 0, null, 1));
            map3.put("customCallOutcomeData", new TableInfo.Column("customCallOutcomeData", "TEXT", false, 0, null, 1));
            map3.put("nextFollowUpOn", new TableInfo.Column("nextFollowUpOn", "INTEGER", false, 0, null, 1));
            map3.put("nextFollowUpSetBy", new TableInfo.Column("nextFollowUpSetBy", "TEXT", false, 0, null, 1));
            map3.put("nextTaskDateTimeInMillis", new TableInfo.Column("nextTaskDateTimeInMillis", "INTEGER", true, 0, null, 1));
            map3.put("transferLead", new TableInfo.Column("transferLead", "INTEGER", true, 0, null, 1));
            map3.put("assignment", new TableInfo.Column("assignment", "INTEGER", true, 0, null, 1));
            map3.put("persisted", new TableInfo.Column("persisted", "INTEGER", true, 0, null, 1));
            map3.put("assignmentType", new TableInfo.Column("assignmentType", "TEXT", false, 0, null, 1));
            map3.put("assignedUserId", new TableInfo.Column("assignedUserId", "TEXT", false, 0, null, 1));
            map3.put("assignedTeamId", new TableInfo.Column("assignedTeamId", "TEXT", false, 0, null, 1));
            map3.put("assignedDistributionId", new TableInfo.Column("assignedDistributionId", "TEXT", false, 0, null, 1));
            map3.put("assignOpenTasks", new TableInfo.Column("assignOpenTasks", "INTEGER", true, 0, null, 1));
            map3.put("assignOpenDeals", new TableInfo.Column("assignOpenDeals", "INTEGER", true, 0, null, 1));
            map3.put("assignChats", new TableInfo.Column("assignChats", "INTEGER", true, 0, null, 1));
            map3.put("submittedFormValues", new TableInfo.Column("submittedFormValues", "TEXT", false, 0, null, 1));
            TableInfo tableInfo5 = new TableInfo("engagement_outcome", map3, new HashSet(0), new HashSet(0));
            TableInfo tableInfo6 = TableInfo.read(legVar, "engagement_outcome");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(false, "engagement_outcome(ai.salesmax.database.dto.EngagementOutcome).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(7);
            map4.put(OutcomeConstants.OUTCOME_ID, new TableInfo.Column(OutcomeConstants.OUTCOME_ID, "TEXT", true, 1, null, 1));
            map4.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, 1));
            map4.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, 1));
            map4.put(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, new TableInfo.Column(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, "TEXT", false, 0, null, 1));
            map4.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
            map4.put("persisted", new TableInfo.Column("persisted", "INTEGER", true, 0, null, 1));
            map4.put("activityLocationId", new TableInfo.Column("activityLocationId", "TEXT", false, 0, null, 1));
            TableInfo tableInfo7 = new TableInfo("periodic_location", map4, new HashSet(0), new HashSet(0));
            TableInfo tableInfo8 = TableInfo.read(legVar, "periodic_location");
            if (!tableInfo7.equals(tableInfo8)) {
                return new RoomOpenHelper.ValidationResult(false, "periodic_location(ai.salesmax.database.dto.Location).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
            HashMap map5 = new HashMap(9);
            map5.put(OutcomeConstants.OUTCOME_ID, new TableInfo.Column(OutcomeConstants.OUTCOME_ID, "TEXT", true, 1, null, 1));
            map5.put("accountId", new TableInfo.Column("accountId", "TEXT", true, 0, null, 1));
            map5.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map5.put("activityType", new TableInfo.Column("activityType", "TEXT", true, 0, null, 1));
            map5.put("activitySource", new TableInfo.Column("activitySource", "TEXT", false, 0, null, 1));
            map5.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, new TableInfo.Column(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, "TEXT", true, 0, null, 1));
            map5.put("properties", new TableInfo.Column("properties", "TEXT", true, 0, null, 1));
            map5.put("activityTime", new TableInfo.Column("activityTime", "INTEGER", true, 0, null, 1));
            map5.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo9 = new TableInfo("activity_log", map5, new HashSet(0), new HashSet(0));
            TableInfo tableInfo10 = TableInfo.read(legVar, "activity_log");
            if (!tableInfo9.equals(tableInfo10)) {
                return new RoomOpenHelper.ValidationResult(false, "activity_log(ai.salesmax.database.dto.ActivityLog).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
            }
            HashMap map6 = new HashMap(23);
            map6.put("callId", new TableInfo.Column("callId", "TEXT", true, 1, null, 1));
            map6.put("number", new TableInfo.Column("number", "TEXT", false, 0, null, 1));
            map6.put("phone", new TableInfo.Column("phone", "TEXT", false, 0, null, 1));
            map6.put("direction", new TableInfo.Column("direction", "TEXT", false, 0, null, 1));
            map6.put("callStartTime", new TableInfo.Column("callStartTime", "INTEGER", false, 0, null, 1));
            map6.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
            map6.put("source", new TableInfo.Column("source", "TEXT", false, 0, null, 1));
            map6.put("duration", new TableInfo.Column("duration", "INTEGER", false, 0, null, 1));
            map6.put("callEndTime", new TableInfo.Column("callEndTime", "INTEGER", false, 0, null, 1));
            map6.put("callConnectTime", new TableInfo.Column("callConnectTime", "INTEGER", false, 0, null, 1));
            map6.put("callConnectStatus", new TableInfo.Column("callConnectStatus", "TEXT", false, 0, null, 1));
            map6.put("subscriptionId", new TableInfo.Column("subscriptionId", "INTEGER", false, 0, null, 1));
            map6.put("isConnectedCall", new TableInfo.Column("isConnectedCall", "INTEGER", false, 0, null, 1));
            map6.put("callStatus", new TableInfo.Column("callStatus", "TEXT", false, 0, null, 1));
            map6.put("cloudProvider", new TableInfo.Column("cloudProvider", "TEXT", false, 0, null, 1));
            map6.put("cloudProviderNumber", new TableInfo.Column("cloudProviderNumber", "TEXT", false, 0, null, 1));
            map6.put("totalCallDuration", new TableInfo.Column("totalCallDuration", "INTEGER", false, 0, null, 1));
            map6.put("callType", new TableInfo.Column("callType", "TEXT", false, 0, null, 1));
            map6.put("hangupReason", new TableInfo.Column("hangupReason", "TEXT", false, 0, null, 1));
            map6.put("phoneCallLogId", new TableInfo.Column("phoneCallLogId", "TEXT", false, 0, null, 1));
            map6.put("phoneHandle", new TableInfo.Column("phoneHandle", "TEXT", false, 0, null, 1));
            map6.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
            map6.put("processed", new TableInfo.Column("processed", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo11 = new TableInfo("call_log", map6, new HashSet(0), new HashSet(0));
            TableInfo tableInfo12 = TableInfo.read(legVar, "call_log");
            if (!tableInfo11.equals(tableInfo12)) {
                return new RoomOpenHelper.ValidationResult(false, "call_log(ai.salesmax.database.dto.CallLog).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
            }
            HashMap map7 = new HashMap(6);
            map7.put(OutcomeConstants.OUTCOME_ID, new TableInfo.Column(OutcomeConstants.OUTCOME_ID, "INTEGER", true, 1, null, 1));
            map7.put(ClientCookie.VERSION_ATTR, new TableInfo.Column(ClientCookie.VERSION_ATTR, "TEXT", false, 0, null, 1));
            map7.put("model", new TableInfo.Column("model", "TEXT", false, 0, null, 1));
            map7.put("manufacturer", new TableInfo.Column("manufacturer", "TEXT", false, 0, null, 1));
            map7.put("androidVersion", new TableInfo.Column("androidVersion", "TEXT", false, 0, null, 1));
            map7.put("persisted", new TableInfo.Column("persisted", "INTEGER", false, 0, null, 1));
            TableInfo tableInfo13 = new TableInfo("app_version", map7, new HashSet(0), new HashSet(0));
            TableInfo tableInfo14 = TableInfo.read(legVar, "app_version");
            if (tableInfo13.equals(tableInfo14)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "app_version(ai.salesmax.database.dto.AppVersion).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        leg writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `engagement`");
            writableDatabase.execSQL("DELETE FROM `checkpoint`");
            writableDatabase.execSQL("DELETE FROM `engagement_outcome`");
            writableDatabase.execSQL("DELETE FROM `periodic_location`");
            writableDatabase.execSQL("DELETE FROM `activity_log`");
            writableDatabase.execSQL("DELETE FROM `call_log`");
            writableDatabase.execSQL("DELETE FROM `app_version`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "engagement", "checkpoint", "engagement_outcome", "periodic_location", "activity_log", "call_log", "app_version");
    }

    @Override // androidx.room.RoomDatabase
    public meg createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(meg.C15302b.m38856a(databaseConfiguration.context).m38860d(databaseConfiguration.name).m38859c(new RoomOpenHelper(databaseConfiguration, new C0077a(18), "285231acb76e80c8b566c45b44c23b29", "b0a80420e565832a862747f691d0e6f4")).m38858b());
    }

    @Override // ai.salesmax.database.SalesmaxDatabase
    /* renamed from: d */
    public sq mo226d() {
        sq sqVar;
        if (this.f314h != null) {
            return this.f314h;
        }
        synchronized (this) {
            if (this.f314h == null) {
                this.f314h = new uq(this);
            }
            sqVar = this.f314h;
        }
        return sqVar;
    }

    @Override // ai.salesmax.database.SalesmaxDatabase
    /* renamed from: e */
    public gn0 mo227e() {
        gn0 gn0Var;
        if (this.f316j != null) {
            return this.f316j;
        }
        synchronized (this) {
            if (this.f316j == null) {
                this.f316j = new in0(this);
            }
            gn0Var = this.f316j;
        }
        return gn0Var;
    }

    @Override // ai.salesmax.database.SalesmaxDatabase
    /* renamed from: f */
    public dv1 mo228f() {
        dv1 dv1Var;
        if (this.f315i != null) {
            return this.f315i;
        }
        synchronized (this) {
            if (this.f315i == null) {
                this.f315i = new fv1(this);
            }
            dv1Var = this.f315i;
        }
        return dv1Var;
    }

    @Override // ai.salesmax.database.SalesmaxDatabase
    /* renamed from: g */
    public r83 mo229g() {
        r83 r83Var;
        if (this.f311e != null) {
            return this.f311e;
        }
        synchronized (this) {
            if (this.f311e == null) {
                this.f311e = new s83(this);
            }
            r83Var = this.f311e;
        }
        return r83Var;
    }

    @Override // androidx.room.RoomDatabase
    public List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(i96.class, k96.m35193o());
        map.put(r83.class, s83.m47972g());
        map.put(ua6.class, va6.m52485j());
        map.put(xha.class, yha.m57822i());
        map.put(sq.class, uq.m51915a());
        map.put(dv1.class, fv1.m27536u());
        map.put(gn0.class, in0.m32428i());
        return map;
    }

    @Override // ai.salesmax.database.SalesmaxDatabase
    /* renamed from: h */
    public i96 mo230h() {
        i96 i96Var;
        if (this.f310d != null) {
            return this.f310d;
        }
        synchronized (this) {
            if (this.f310d == null) {
                this.f310d = new k96(this);
            }
            i96Var = this.f310d;
        }
        return i96Var;
    }

    @Override // ai.salesmax.database.SalesmaxDatabase
    /* renamed from: i */
    public ua6 mo231i() {
        ua6 ua6Var;
        if (this.f312f != null) {
            return this.f312f;
        }
        synchronized (this) {
            if (this.f312f == null) {
                this.f312f = new va6(this);
            }
            ua6Var = this.f312f;
        }
        return ua6Var;
    }

    @Override // ai.salesmax.database.SalesmaxDatabase
    /* renamed from: j */
    public xha mo232j() {
        xha xhaVar;
        if (this.f313g != null) {
            return this.f313g;
        }
        synchronized (this) {
            if (this.f313g == null) {
                this.f313g = new yha(this);
            }
            xhaVar = this.f313g;
        }
        return xhaVar;
    }
}
