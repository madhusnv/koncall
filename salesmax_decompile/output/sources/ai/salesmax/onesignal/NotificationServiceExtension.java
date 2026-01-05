package ai.salesmax.onesignal;

import ai.salesmax.MainActivity;
import ai.salesmax.onesignal.NotificationServiceExtension;
import ai.salesmax.ui.service.ReplyBroadcastReceiver;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import com.google.android.gms.cast.MediaError;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.IDisplayableMutableNotification;
import com.onesignal.notifications.INotificationReceivedEvent;
import com.onesignal.notifications.INotificationServiceExtension;
import com.onesignal.notifications.internal.common.NotificationConstants;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.ayh;
import p001o.gie;
import p001o.i3c;
import p001o.j3c;
import p001o.ja8;
import p001o.k6d;
import p001o.o2c;
import p001o.o83;
import p001o.oh3;
import p001o.pe;
import p001o.r3c;
import p001o.rg6;
import p001o.t3c;
import p001o.u3c;
import p001o.w7e;
import p001o.xgh;

/* loaded from: classes.dex */
public class NotificationServiceExtension implements INotificationServiceExtension {
    private static final String LOG_TAG = "NotificationServiceExtension";
    private static final List<rg6> listeners = t3c.m49220a(new Object[]{new pe()});

    private IconCompat generateLetterIcon(String str, String str2, Context context) {
        xgh xghVarMo56295b = xgh.m56281a().mo56295b((str == null || str.isEmpty()) ? "?" : str.substring(0, 1).toUpperCase(), oh3.f38348d.m42239b(str2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        xghVarMo56295b.draw(new Canvas(bitmapCreateBitmap));
        return IconCompat.m5854e(bitmapCreateBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyListeners$7(rg6 rg6Var, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception in notifying to listener: ");
        sb.append(rg6Var.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyListeners$8(final String str, final Context context, final rg6 rg6Var) {
        ayh.Z2(new o83() { // from class: o.g4c
            @Override // p001o.o83
            public final void run() {
                rg6Var.m46701c(str, context);
            }
        }).q1(new Consumer() { // from class: o.h4c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                NotificationServiceExtension.lambda$notifyListeners$7(rg6Var, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onNotificationReceived$0(JSONObject jSONObject) {
        return jSONObject.optString("notificationType");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onNotificationReceived$1(JSONObject jSONObject) {
        return jSONObject.optString("notificationStyle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onNotificationReceived$2(JSONObject jSONObject) {
        return jSONObject.optString(ModelWithMetadataAdapter.TYPE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onNotificationReceived$3(o2c.C15694f c15694f, String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(Opcodes.V_PREVIEW), 0, str.length(), 0);
        c15694f.m41418m(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onNotificationReceived$4(o2c.C15694f c15694f, String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(-16776961), 0, str.length(), 0);
        c15694f.m41417l(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o2c.C15694f lambda$onNotificationReceived$5(String str, JSONObject jSONObject, IDisplayableMutableNotification iDisplayableMutableNotification, INotificationReceivedEvent iNotificationReceivedEvent, Integer num, String str2, String str3, Long l, final o2c.C15694f c15694f) {
        JSONObject jSONObjectOptJSONObject;
        String str4;
        String str5;
        Class cls;
        if ((str.equals("INCOMING-CHAT") || str.equals("INTERNAL-CHAT")) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("channelId", "");
            String title = iDisplayableMutableNotification.getTitle();
            String strOptString2 = jSONObjectOptJSONObject.optString("contactId", "");
            String strOptString3 = jSONObjectOptJSONObject.optString("text", "New Message");
            StringBuilder sb = new StringBuilder();
            sb.append("Chat Bubble Notification - chatId: ");
            sb.append(strOptString);
            sb.append(", sender: ");
            sb.append(title);
            sb.append(", message: ");
            sb.append(strOptString3);
            Context context = iNotificationReceivedEvent.getContext();
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.setFlags(536870912);
            intent.setAction("ai.salesmax.OPEN_CHAT");
            intent.putExtra("channelId", strOptString);
            intent.putExtra("contactId", strOptString2);
            PendingIntent activity = PendingIntent.getActivity(context, strOptString.hashCode(), intent, 167772160);
            int i = Build.VERSION.SDK_INT;
            ShortcutInfo shortcutInfoBuild = null;
            k6d k6dVarM35051a = i >= 28 ? new k6d.C14721b().m35056f(title).m35054d(true).m35051a() : null;
            str4 = "";
            str5 = "contactId";
            o2c.C15697i c15697iM41439h = new o2c.C15697i(k6dVarM35051a).m41442k(title).m41439h(strOptString3, System.currentTimeMillis(), k6dVarM35051a);
            String str6 = "chat_" + strOptString;
            ShortcutManager shortcutManagerM33175a = i >= 25 ? j3c.m33175a(context.getSystemService(i3c.m31468a())) : null;
            if (i < 26 || shortcutManagerM33175a == null || !shortcutManagerM33175a.isRequestPinShortcutSupported()) {
                cls = MainActivity.class;
            } else {
                if (i < 29 || title == null) {
                    cls = MainActivity.class;
                } else {
                    cls = MainActivity.class;
                    shortcutInfoBuild = r3c.m46194a(context, str6).setCategories(Collections.singleton("com.example.category.IMG_SHARE_TARGET")).setIntent(new Intent("android.intent.action.VIEW")).setLongLived(true).setShortLabel(title).build();
                }
                shortcutManagerM33175a.setDynamicShortcuts(Collections.singletonList(shortcutInfoBuild));
            }
            if (i >= 30) {
                new o2c.C15693e.c().m41395f(activity).m41394e(generateLetterIcon(title, strOptString2, context)).m41392c(MediaError.DetailedErrorCode.TEXT_UNKNOWN).m41391b(true).m41390a();
            }
            gie gieVarM28814a = new gie.C13743d("key_text_reply").m28815b("Type Your Reply...").m28814a();
            Intent intent2 = new Intent(context, (Class<?>) ReplyBroadcastReceiver.class);
            intent2.setAction("ai.salesmax.REPLY_ACTION");
            intent2.setPackage(context.getPackageName());
            intent2.putExtra("chatId", strOptString);
            intent2.putExtra("sender", title);
            intent2.putExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, jSONObjectOptJSONObject.toString());
            intent2.putExtra(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, num);
            c15694f.m41399C(w7e.icon_transparent).m41401E(c15697iM41439h).m41418m(title).m41417l(strOptString3).m41397A(str6).m41408b(new o2c.C15690b.a(w7e.ic_message_text, "Reply", PendingIntent.getBroadcast(context, strOptString.hashCode(), intent2, 167772160)).m41364a(gieVarM28814a).m41365b()).m41412g(true);
        } else {
            cls = MainActivity.class;
            str4 = "";
            str5 = "contactId";
        }
        if (str2.equals("ALERT")) {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            Intent intent3 = new Intent(iNotificationReceivedEvent.getContext(), (Class<?>) cls);
            intent3.addFlags(872415232);
            intent3.setAction("ai.salesmax.SHOW_ALERT");
            intent3.setPackage(iNotificationReceivedEvent.getContext().getPackageName());
            intent3.putExtra("notificationId", str3);
            intent3.putExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, iDisplayableMutableNotification.getTitle());
            intent3.putExtra(FirebaseAnalytics.Param.CONTENT, iDisplayableMutableNotification.getBody());
            intent3.putExtra("notificationType", jSONObject.optString("notificationType"));
            String str7 = str5;
            intent3.putExtra(str7, jSONObject.optString(str7));
            intent3.putExtra("linkedContactId", jSONObject.optString("linkedContactId"));
            intent3.putExtra("linkedEngagementId", jSONObject.optString("linkedEngagementId"));
            intent3.putExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : str4);
            iNotificationReceivedEvent.getContext().startActivity(intent3);
        }
        c15694f.m41414i(new BigInteger("FF00FF00", 16).intValue());
        Optional.of(iDisplayableMutableNotification).map(new Function() { // from class: o.z3c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((IDisplayableMutableNotification) obj).getTitle();
            }
        }).map(new u3c()).filter(new Predicate() { // from class: o.v3c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return StringUtils.isBlank((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.w3c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                NotificationServiceExtension.lambda$onNotificationReceived$3(c15694f, (String) obj);
            }
        });
        Optional.of(iDisplayableMutableNotification).map(new Function() { // from class: o.x3c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((IDisplayableMutableNotification) obj).getBody();
            }
        }).map(new u3c()).filter(new Predicate() { // from class: o.v3c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return StringUtils.isBlank((String) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.y3c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                NotificationServiceExtension.lambda$onNotificationReceived$4(c15694f, (String) obj);
            }
        });
        if (l != null) {
            c15694f.m41403G(l.longValue());
        }
        return c15694f;
    }

    private void notifyListeners(final String str, final Context context) {
        listeners.forEach(new Consumer() { // from class: o.a4c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                NotificationServiceExtension.lambda$notifyListeners$8(str, context, (rg6) obj);
            }
        });
    }

    @Override // com.onesignal.notifications.INotificationServiceExtension
    public void onNotificationReceived(final INotificationReceivedEvent iNotificationReceivedEvent) {
        String.format("notification received %s", iNotificationReceivedEvent);
        final IDisplayableMutableNotification notification = iNotificationReceivedEvent.getNotification();
        final Integer numValueOf = Integer.valueOf(notification.getAndroidNotificationId());
        StringBuilder sb = new StringBuilder();
        sb.append("androidNotificationId is ");
        sb.append(numValueOf);
        final JSONObject additionalData = notification.getAdditionalData();
        final String notificationId = notification.getNotificationId();
        final String str = (String) Optional.ofNullable(additionalData).map(new Function() { // from class: o.b4c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return NotificationServiceExtension.lambda$onNotificationReceived$0((JSONObject) obj);
            }
        }).orElse("");
        final String str2 = (String) Optional.ofNullable(additionalData).map(new Function() { // from class: o.c4c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return NotificationServiceExtension.lambda$onNotificationReceived$1((JSONObject) obj);
            }
        }).orElse("");
        String str3 = (String) Optional.ofNullable(additionalData).map(new Function() { // from class: o.d4c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return NotificationServiceExtension.lambda$onNotificationReceived$2((JSONObject) obj);
            }
        }).orElse("");
        Long l = null;
        notifyListeners((String) Optional.ofNullable(additionalData).map(new Function() { // from class: o.e4c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((JSONObject) obj).toString();
            }
        }).orElse(null), iNotificationReceivedEvent.getContext());
        if (AccountMemberActivity.class.getSimpleName().equalsIgnoreCase(str3) && "PLACE_CALL".equalsIgnoreCase(((AccountMemberActivity) ja8.f30035c.fromJson(additionalData.toString(), AccountMemberActivity.class)).getInCall())) {
            l = 10000L;
        }
        final Long l2 = l;
        notification.setExtender(new o2c.InterfaceC15695g() { // from class: o.f4c
            @Override // p001o.o2c.InterfaceC15695g
            /* renamed from: a */
            public final o2c.C15694f mo26055a(o2c.C15694f c15694f) {
                return this.f22654a.lambda$onNotificationReceived$5(str, additionalData, notification, iNotificationReceivedEvent, numValueOf, str2, notificationId, l2, c15694f);
            }
        });
    }
}
