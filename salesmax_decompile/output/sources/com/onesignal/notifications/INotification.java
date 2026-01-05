package com.onesignal.notifications;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface INotification {

    public static final class DefaultImpls {
        public static /* synthetic */ void getBackgroundImageLayout$annotations() {
        }
    }

    List<IActionButton> getActionButtons();

    JSONObject getAdditionalData();

    int getAndroidNotificationId();

    BackgroundImageLayout getBackgroundImageLayout();

    String getBigPicture();

    String getBody();

    String getCollapseId();

    String getFromProjectNumber();

    String getGroupKey();

    String getGroupMessage();

    List<INotification> getGroupedNotifications();

    String getLargeIcon();

    String getLaunchURL();

    String getLedColor();

    int getLockScreenVisibility();

    String getNotificationId();

    int getPriority();

    String getRawPayload();

    long getSentTime();

    String getSmallIcon();

    String getSmallIconAccentColor();

    String getSound();

    String getTemplateId();

    String getTemplateName();

    String getTitle();

    int getTtl();
}
