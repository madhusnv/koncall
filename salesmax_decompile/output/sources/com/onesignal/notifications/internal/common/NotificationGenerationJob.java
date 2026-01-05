package com.onesignal.notifications.internal.common;

import android.net.Uri;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.notifications.internal.Notification;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import java.security.SecureRandom;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationGenerationJob {
    private boolean isNotificationToDisplay;
    private boolean isRestoring;
    private JSONObject jsonPayload;
    private final Notification notification;
    private Integer orgFlags;
    private Uri orgSound;
    private CharSequence overriddenBodyFromExtender;
    private Integer overriddenFlags;
    private Uri overriddenSound;
    private CharSequence overriddenTitleFromExtender;
    private Long shownTimeStamp;

    public NotificationGenerationJob(Notification notification, JSONObject jSONObject) {
        sq8.m48649h(notification, "inNotification");
        sq8.m48649h(jSONObject, "jsonPayload");
        this.jsonPayload = jSONObject;
        this.notification = setAndroidNotificationId(notification);
    }

    private final Notification setAndroidNotificationId(Notification notification) {
        if (notification != null && !notification.hasNotificationId()) {
            notification.setAndroidNotificationId(new SecureRandom().nextInt());
        }
        return notification;
    }

    public final JSONObject getAdditionalData() {
        Notification notification = this.notification;
        sq8.m48646e(notification);
        JSONObject additionalData = notification.getAdditionalData();
        return additionalData == null ? new JSONObject() : additionalData;
    }

    public final int getAndroidId() {
        Notification notification = this.notification;
        sq8.m48646e(notification);
        return notification.getAndroidNotificationId();
    }

    public final String getApiNotificationId() {
        String notificationIdFromFCMJson = NotificationHelper.INSTANCE.getNotificationIdFromFCMJson(this.jsonPayload);
        return notificationIdFromFCMJson == null ? "" : notificationIdFromFCMJson;
    }

    public final CharSequence getBody() {
        CharSequence charSequence = this.overriddenBodyFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        Notification notification = this.notification;
        sq8.m48646e(notification);
        return notification.getBody();
    }

    public final JSONObject getJsonPayload() {
        return this.jsonPayload;
    }

    public final Notification getNotification() {
        return this.notification;
    }

    public final Integer getOrgFlags() {
        return this.orgFlags;
    }

    public final Uri getOrgSound() {
        return this.orgSound;
    }

    public final CharSequence getOverriddenBodyFromExtender() {
        return this.overriddenBodyFromExtender;
    }

    public final Integer getOverriddenFlags() {
        return this.overriddenFlags;
    }

    public final Uri getOverriddenSound() {
        return this.overriddenSound;
    }

    public final CharSequence getOverriddenTitleFromExtender() {
        return this.overriddenTitleFromExtender;
    }

    public final Long getShownTimeStamp() {
        return this.shownTimeStamp;
    }

    public final CharSequence getTitle() {
        CharSequence charSequence = this.overriddenTitleFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        Notification notification = this.notification;
        sq8.m48646e(notification);
        return notification.getTitle();
    }

    public final boolean hasExtender() {
        Notification notification = this.notification;
        sq8.m48646e(notification);
        return notification.getNotificationExtender() != null;
    }

    public final boolean isNotificationToDisplay() {
        return this.isNotificationToDisplay;
    }

    public final boolean isRestoring() {
        return this.isRestoring;
    }

    public final void setJsonPayload(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "<set-?>");
        this.jsonPayload = jSONObject;
    }

    public final void setNotificationToDisplay(boolean z) {
        this.isNotificationToDisplay = z;
    }

    public final void setOrgFlags(Integer num) {
        this.orgFlags = num;
    }

    public final void setOrgSound(Uri uri) {
        this.orgSound = uri;
    }

    public final void setOverriddenBodyFromExtender(CharSequence charSequence) {
        this.overriddenBodyFromExtender = charSequence;
    }

    public final void setOverriddenFlags(Integer num) {
        this.overriddenFlags = num;
    }

    public final void setOverriddenSound(Uri uri) {
        this.overriddenSound = uri;
    }

    public final void setOverriddenTitleFromExtender(CharSequence charSequence) {
        this.overriddenTitleFromExtender = charSequence;
    }

    public final void setRestoring(boolean z) {
        this.isRestoring = z;
    }

    public final void setShownTimeStamp(Long l) {
        this.shownTimeStamp = l;
    }

    public String toString() {
        return "NotificationGenerationJob{jsonPayload=" + this.jsonPayload + ", isRestoring=" + this.isRestoring + ", isNotificationToDisplay=" + this.isNotificationToDisplay + ", shownTimeStamp=" + this.shownTimeStamp + ", overriddenBodyFromExtender=" + ((Object) this.overriddenBodyFromExtender) + ", overriddenTitleFromExtender=" + ((Object) this.overriddenTitleFromExtender) + ", overriddenSound=" + this.overriddenSound + ", overriddenFlags=" + this.overriddenFlags + ", orgFlags=" + this.orgFlags + ", orgSound=" + this.orgSound + ", notification=" + this.notification + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationGenerationJob(JSONObject jSONObject, ITime iTime) {
        this(new Notification(jSONObject, iTime), jSONObject);
        sq8.m48649h(jSONObject, "jsonPayload");
        sq8.m48649h(iTime, InfluenceConstants.TIME);
    }
}
