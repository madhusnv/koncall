package ai.salesmax.model;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class AutoCallConfig {
    private String actionType;
    private String adhocListType;
    private boolean autoCallMode;
    private String campaignId;
    private String campaignRunId;
    private PaginatedDataModel<LeadPlaceCall> contactIds;
    private boolean disposeAllCalls;
    private ArrayList<String> engagementIds;
    private boolean isPaused;
    private int lastActionIndex;
    private long lastCallOrMessagedBefore;
    private long lastCalledBefore;
    private int maxItemsToLoad;
    private int maxRetriesIfNotConnected;
    private long minCallRetryInterval;
    private long moveNextAutoIn;
    private boolean moveNextManually;
    private boolean openScriptByDefault;
    private List<String> playBooks;
    private String script;
    private long startTime;
    private boolean useCloudTelephony;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AutoCallConfig _instance = new AutoCallConfig(false, false, null, null, null, null, null, null, 0, 0, 0, false, null, false, null, 0, false, 0, 0, 0, 0, false, 4194303, null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final AutoCallConfig instance() {
            return AutoCallConfig._instance;
        }

        public final void resetInstance() {
            AutoCallConfig._instance.setAutoCallMode(false);
            AutoCallConfig._instance.setPaused(false);
            AutoCallConfig autoCallConfig = AutoCallConfig._instance;
            PaginatedDataModel<LeadPlaceCall> paginatedDataModelEmpty = PaginatedDataModel.empty();
            sq8.m48648g(paginatedDataModelEmpty, "empty(...)");
            autoCallConfig.setContactIds(paginatedDataModelEmpty);
            AutoCallConfig._instance.setAdhocListType("");
            AutoCallConfig._instance.setCampaignId("");
            AutoCallConfig._instance.setCampaignRunId("");
            AutoCallConfig._instance.setActionType("");
            AutoCallConfig._instance.setEngagementIds(new ArrayList<>());
            AutoCallConfig._instance.setLastCalledBefore(-1L);
            AutoCallConfig._instance.setLastCallOrMessagedBefore(-1L);
            AutoCallConfig._instance.setLastActionIndex(-1);
            AutoCallConfig._instance.setDisposeAllCalls(false);
            AutoCallConfig._instance.setScript("");
            AutoCallConfig._instance.setOpenScriptByDefault(false);
            AutoCallConfig._instance.setPlayBooks(new ArrayList());
            AutoCallConfig._instance.setMaxItemsToLoad(100);
            AutoCallConfig._instance.setMoveNextManually(false);
            AutoCallConfig._instance.setMoveNextAutoIn(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
            AutoCallConfig._instance.setMinCallRetryInterval(-1L);
            AutoCallConfig._instance.setMaxRetriesIfNotConnected(0);
            AutoCallConfig._instance.setStartTime(-1L);
        }
    }

    public AutoCallConfig() {
        this(false, false, null, null, null, null, null, null, 0L, 0L, 0, false, null, false, null, 0, false, 0L, 0L, 0, 0L, false, 4194303, null);
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final String getAdhocListType() {
        return this.adhocListType;
    }

    public final boolean getAutoCallMode() {
        return this.autoCallMode;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getCampaignRunId() {
        return this.campaignRunId;
    }

    public final PaginatedDataModel<LeadPlaceCall> getContactIds() {
        return this.contactIds;
    }

    public final boolean getDisposeAllCalls() {
        return this.disposeAllCalls;
    }

    public final ArrayList<String> getEngagementIds() {
        return this.engagementIds;
    }

    public final int getLastActionIndex() {
        return this.lastActionIndex;
    }

    public final long getLastCallOrMessagedBefore() {
        return this.lastCallOrMessagedBefore;
    }

    public final long getLastCalledBefore() {
        return this.lastCalledBefore;
    }

    public final int getMaxItemsToLoad() {
        return this.maxItemsToLoad;
    }

    public final int getMaxRetriesIfNotConnected() {
        return this.maxRetriesIfNotConnected;
    }

    public final long getMinCallRetryInterval() {
        return this.minCallRetryInterval;
    }

    public final long getMoveNextAutoIn() {
        return this.moveNextAutoIn;
    }

    public final boolean getMoveNextManually() {
        return this.moveNextManually;
    }

    public final boolean getOpenScriptByDefault() {
        return this.openScriptByDefault;
    }

    public final List<String> getPlayBooks() {
        return this.playBooks;
    }

    public final String getScript() {
        return this.script;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getUseCloudTelephony() {
        return this.useCloudTelephony;
    }

    public final boolean isPaused() {
        return this.isPaused;
    }

    public final void setActionType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.actionType = str;
    }

    public final void setAdhocListType(String str) {
        sq8.m48649h(str, "<set-?>");
        this.adhocListType = str;
    }

    public final void setAutoCallMode(boolean z) {
        this.autoCallMode = z;
    }

    public final void setCampaignId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.campaignId = str;
    }

    public final void setCampaignRunId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.campaignRunId = str;
    }

    public final void setContactIds(PaginatedDataModel<LeadPlaceCall> paginatedDataModel) {
        sq8.m48649h(paginatedDataModel, "<set-?>");
        this.contactIds = paginatedDataModel;
    }

    public final void setDisposeAllCalls(boolean z) {
        this.disposeAllCalls = z;
    }

    public final void setEngagementIds(ArrayList<String> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.engagementIds = arrayList;
    }

    public final void setLastActionIndex(int i) {
        this.lastActionIndex = i;
    }

    public final void setLastCallOrMessagedBefore(long j) {
        this.lastCallOrMessagedBefore = j;
    }

    public final void setLastCalledBefore(long j) {
        this.lastCalledBefore = j;
    }

    public final void setMaxItemsToLoad(int i) {
        this.maxItemsToLoad = i;
    }

    public final void setMaxRetriesIfNotConnected(int i) {
        this.maxRetriesIfNotConnected = i;
    }

    public final void setMinCallRetryInterval(long j) {
        this.minCallRetryInterval = j;
    }

    public final void setMoveNextAutoIn(long j) {
        this.moveNextAutoIn = j;
    }

    public final void setMoveNextManually(boolean z) {
        this.moveNextManually = z;
    }

    public final void setOpenScriptByDefault(boolean z) {
        this.openScriptByDefault = z;
    }

    public final void setPaused(boolean z) {
        this.isPaused = z;
    }

    public final void setPlayBooks(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.playBooks = list;
    }

    public final void setScript(String str) {
        sq8.m48649h(str, "<set-?>");
        this.script = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setUseCloudTelephony(boolean z) {
        this.useCloudTelephony = z;
    }

    public AutoCallConfig(boolean z, boolean z2, String str, String str2, String str3, String str4, PaginatedDataModel<LeadPlaceCall> paginatedDataModel, ArrayList<String> arrayList, long j, long j2, int i, boolean z3, String str5, boolean z4, List<String> list, int i2, boolean z5, long j3, long j4, int i3, long j5, boolean z6) {
        sq8.m48649h(str, "adhocListType");
        sq8.m48649h(str2, "campaignId");
        sq8.m48649h(str3, "campaignRunId");
        sq8.m48649h(str4, "actionType");
        sq8.m48649h(paginatedDataModel, "contactIds");
        sq8.m48649h(arrayList, "engagementIds");
        sq8.m48649h(str5, "script");
        sq8.m48649h(list, "playBooks");
        this.autoCallMode = z;
        this.isPaused = z2;
        this.adhocListType = str;
        this.campaignId = str2;
        this.campaignRunId = str3;
        this.actionType = str4;
        this.contactIds = paginatedDataModel;
        this.engagementIds = arrayList;
        this.lastCalledBefore = j;
        this.lastCallOrMessagedBefore = j2;
        this.lastActionIndex = i;
        this.disposeAllCalls = z3;
        this.script = str5;
        this.openScriptByDefault = z4;
        this.playBooks = list;
        this.maxItemsToLoad = i2;
        this.moveNextManually = z5;
        this.moveNextAutoIn = j3;
        this.minCallRetryInterval = j4;
        this.maxRetriesIfNotConnected = i3;
        this.startTime = j5;
        this.useCloudTelephony = z6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoCallConfig(boolean z, boolean z2, String str, String str2, String str3, String str4, PaginatedDataModel paginatedDataModel, ArrayList arrayList, long j, long j2, int i, boolean z3, String str5, boolean z4, List list, int i2, boolean z5, long j3, long j4, int i3, long j5, boolean z6, int i4, id5 id5Var) {
        PaginatedDataModel paginatedDataModelEmpty;
        boolean z7 = (i4 & 1) != 0 ? false : z;
        boolean z8 = (i4 & 2) != 0 ? false : z2;
        String str6 = (i4 & 4) != 0 ? "" : str;
        String str7 = (i4 & 8) != 0 ? "" : str2;
        String str8 = (i4 & 16) != 0 ? "" : str3;
        String str9 = (i4 & 32) != 0 ? "" : str4;
        if ((i4 & 64) != 0) {
            paginatedDataModelEmpty = PaginatedDataModel.empty();
            sq8.m48648g(paginatedDataModelEmpty, "empty(...)");
        } else {
            paginatedDataModelEmpty = paginatedDataModel;
        }
        this(z7, z8, str6, str7, str8, str9, paginatedDataModelEmpty, (i4 & 128) != 0 ? new ArrayList() : arrayList, (i4 & 256) != 0 ? -1L : j, (i4 & 512) != 0 ? -1L : j2, (i4 & 1024) != 0 ? -1 : i, (i4 & 2048) != 0 ? false : z3, (i4 & 4096) == 0 ? str5 : "", (i4 & 8192) != 0 ? false : z4, (i4 & Opcodes.ACC_ENUM) != 0 ? new ArrayList() : list, (i4 & 32768) != 0 ? 100 : i2, (i4 & 65536) != 0 ? false : z5, (i4 & Opcodes.ACC_DEPRECATED) != 0 ? DeviceOrientationRequest.OUTPUT_PERIOD_FAST : j3, (i4 & 262144) != 0 ? -1L : j4, (i4 & Opcodes.ASM8) != 0 ? 0 : i3, (i4 & 1048576) != 0 ? -1L : j5, (i4 & 2097152) != 0 ? false : z6);
    }
}
