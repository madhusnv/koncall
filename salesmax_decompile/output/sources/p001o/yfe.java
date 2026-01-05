package p001o;

/* loaded from: classes.dex */
public abstract class yfe {
    public static final int $stable = 8;
    private Boolean _isCloudTelephonyEnabled;
    private Boolean _isLeadMaskingEnabled;
    private transient Long createdAt;
    private Object currentSortByValue;
    private String highLightTerm;
    private boolean isExpanded;
    private boolean messageSent;
    private Object oldSortByValue;
    private zfe sortedByDataType;
    private String sortedByField;
    private String topLnaFilter;
    private transient Long updatedAt;
    private Integer position = 0;
    private long lastItemSeenAt = Long.MAX_VALUE;
    private String taskAutocloseInDays = "";

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public final Object getCurrentSortByValue() {
        return this.currentSortByValue;
    }

    public final String getHighLightTerm() {
        return this.highLightTerm;
    }

    public final long getLastItemSeenAt() {
        return this.lastItemSeenAt;
    }

    public final boolean getMessageSent() {
        return this.messageSent;
    }

    public final Object getOldSortByValue() {
        return this.oldSortByValue;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final zfe getSortedByDataType() {
        return this.sortedByDataType;
    }

    public final String getSortedByField() {
        return this.sortedByField;
    }

    public final String getTaskAutocloseInDays() {
        return this.taskAutocloseInDays;
    }

    public final String getTopLnaFilter() {
        return this.topLnaFilter;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean isCloudTelephonyEnabled() {
        Boolean bool = this._isCloudTelephonyEnabled;
        if (bool != null) {
            sq8.m48646e(bool);
            return bool.booleanValue();
        }
        Boolean boolC0 = lpi.c0();
        this._isCloudTelephonyEnabled = boolC0;
        sq8.m48646e(boolC0);
        return boolC0.booleanValue();
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isLeadMaskingEnabled() {
        Boolean bool = this._isLeadMaskingEnabled;
        if (bool != null) {
            sq8.m48646e(bool);
            return bool.booleanValue();
        }
        Boolean boolE0 = lpi.e0();
        this._isLeadMaskingEnabled = boolE0;
        sq8.m48646e(boolE0);
        return boolE0.booleanValue();
    }

    public final boolean isNewItem() {
        if (getUpdatedAt() == null) {
            return false;
        }
        Long updatedAt = getUpdatedAt();
        sq8.m48646e(updatedAt);
        return updatedAt.longValue() > this.lastItemSeenAt;
    }

    public final void setCloudTelephonyEnabled(boolean z) {
        this._isCloudTelephonyEnabled = Boolean.valueOf(z);
    }

    public void setCreatedAt(Long l) {
        this.createdAt = l;
    }

    public final void setCurrentSortByValue(Object obj) {
        this.currentSortByValue = obj;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final void setHighLightTerm(String str) {
        this.highLightTerm = str;
    }

    public final void setLastItemSeenAt(long j) {
        this.lastItemSeenAt = j;
    }

    public final void setMessageSent(boolean z) {
        this.messageSent = z;
    }

    public final void setOldSortByValue(Object obj) {
        this.oldSortByValue = obj;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final void setSortedByDataType(zfe zfeVar) {
        this.sortedByDataType = zfeVar;
    }

    public final void setSortedByField(String str) {
        this.sortedByField = str;
    }

    public final void setTaskAutocloseInDays(String str) {
        sq8.m48649h(str, "<set-?>");
        this.taskAutocloseInDays = str;
    }

    public final void setTopLnaFilter(String str) {
        this.topLnaFilter = str;
    }

    public void setUpdatedAt(Long l) {
        this.updatedAt = l;
    }
}
