package ai.salesmax.ui.service;

import ai.salesmax.model.ChatMessageSummary;
import ai.salesmax.model.ChatMessages;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.amplifyframework.datastore.generated.model.ChatMessage;
import com.google.gson.Gson;
import com.onesignal.OneSignal;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.internal.common.NotificationConstants;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import p001o.gie;
import p001o.gu3;
import p001o.i33;
import p001o.ja8;
import p001o.ppd;
import p001o.wi0;

/* loaded from: classes.dex */
public class ReplyBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m2660h(String str, Integer num, NotificationManager notificationManager) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating Notification with id : ");
            sb.append(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Updating Notification with androidNotificationId : ");
            sb2.append(num);
            OneSignal.getNotifications().mo68777removeNotification(num.intValue());
            notificationManager.cancel(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m2661i(final String str, final Integer num, final NotificationManager notificationManager) {
        new Handler().postDelayed(new Runnable() { // from class: o.cle
            @Override // java.lang.Runnable
            public final void run() {
                this.f18296a.m2660h(str, num, notificationManager);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m2662j(Context context, final String str, final Integer num, ChatMessageSummary chatMessageSummary) {
        final NotificationManager notificationManager = (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.ble
            @Override // java.lang.Runnable
            public final void run() {
                this.f16482a.m2661i(str, num, notificationManager);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m2663k(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m2664l(final Context context, final String str, final Integer num, ChatMessages chatMessages) {
        i33.F1(chatMessages.toChatMessageSummary(null)).v0(new gu3() { // from class: o.xke
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f53876a.m2662j(context, str, num, (ChatMessageSummary) obj);
            }
        }, new gu3() { // from class: o.yke
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f55639a.m2663k((Throwable) obj);
            }
        });
    }

    /* renamed from: f */
    public final ChatMessages m2665f(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String name = wi0.m54444J().m39171u().getName();
        ChatMessages chatMessagesM2666g = m2666g(str);
        String string = UUID.randomUUID().toString();
        ChatMessages chatMessages = new ChatMessages();
        chatMessages.setId(string);
        chatMessages.setChannelId(chatMessagesM2666g.getChannelId());
        chatMessages.setContactId(chatMessagesM2666g.getContactId());
        chatMessages.setRecipientExternalId(chatMessagesM2666g.getRecipientExternalId());
        chatMessages.setRecipientExternalIdType(chatMessagesM2666g.getRecipientExternalIdType());
        chatMessages.setMessageText(str2);
        chatMessages.setMessageType("text");
        chatMessages.setMessageUserName(name);
        chatMessages.setSentByMe(Boolean.TRUE);
        chatMessages.setInbound(Boolean.FALSE);
        if (chatMessagesM2666g.getMessageCategory() == null) {
            chatMessages.setMessageCategory("external");
        } else {
            chatMessages.setMessageCategory(chatMessagesM2666g.getMessageCategory());
        }
        chatMessages.setMessagePlatform(chatMessagesM2666g.getMessagePlatform());
        chatMessages.setMessageTime(System.currentTimeMillis());
        chatMessages.setReplyingToMessage(chatMessagesM2666g);
        return chatMessages;
    }

    /* renamed from: g */
    public final ChatMessages m2666g(String str) {
        Gson gson = ja8.f30035c;
        Map map = (Map) gson.fromJson(str, Map.class);
        final ChatMessages chatMessages = new ChatMessageSummary((ChatMessage) gson.fromJson(str, ChatMessage.class)).toChatMessages();
        Optional map2 = Optional.ofNullable(map.get("contactId")).map(new ppd());
        Objects.requireNonNull(chatMessages);
        map2.ifPresent(new Consumer() { // from class: o.zke
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                chatMessages.setContactId((String) obj);
            }
        });
        Optional.ofNullable(map.get("channelId")).map(new ppd()).ifPresent(new Consumer() { // from class: o.ale
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                chatMessages.setChannelId((String) obj);
            }
        });
        return chatMessages;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        Bundle bundleM28796j = gie.m28796j(intent);
        if (bundleM28796j != null) {
            String string = bundleM28796j.getString("key_text_reply");
            String stringExtra = intent.getStringExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            final String stringExtra2 = intent.getStringExtra("notificationId");
            final Integer numValueOf = Integer.valueOf(intent.getIntExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, -1));
            String.format("replyText: %s ", string);
            String.format("notificationId: %s ", stringExtra2);
            String.format("androidNotificationId: %s ", numValueOf);
            String.format("message string: %s ", stringExtra);
            Optional.ofNullable(m2665f(stringExtra, string)).ifPresent(new Consumer() { // from class: o.wke
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f52270a.m2664l(context, stringExtra2, numValueOf, (ChatMessages) obj);
                }
            });
        }
    }
}
