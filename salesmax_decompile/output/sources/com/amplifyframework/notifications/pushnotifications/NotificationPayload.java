package com.amplifyframework.notifications.pushnotifications;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.notifications.pushnotifications.NotificationContentProvider;
import java.util.Map;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public class NotificationPayload implements Parcelable {
    private final String channelId;
    private final NotificationContentProvider contentProvider;
    private final Map<String, String> rawData;
    private final Class<?> targetClass;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NotificationPayload> CREATOR = new Creator();

    public static final class Builder {
        private String channelId;
        private final NotificationContentProvider contentProvider;
        private Class<?> targetClass;

        public Builder(NotificationContentProvider notificationContentProvider) {
            sq8.m48649h(notificationContentProvider, "contentProvider");
            this.contentProvider = notificationContentProvider;
        }

        public final NotificationPayload build() {
            return new NotificationPayload(this);
        }

        public final String getChannelId() {
            return this.channelId;
        }

        public final NotificationContentProvider getContentProvider() {
            return this.contentProvider;
        }

        public final Class<?> getTargetClass() {
            return this.targetClass;
        }

        public final Builder notificationChannelId(String str) {
            this.channelId = str;
            return this;
        }

        public final Builder targetClass(Class<?> cls) {
            this.targetClass = cls;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Builder builder(NotificationContentProvider notificationContentProvider) {
            sq8.m48649h(notificationContentProvider, "contentProvider");
            return new Builder(notificationContentProvider);
        }

        public final NotificationPayload fromIntent(Intent intent) {
            if (intent != null) {
                return (NotificationPayload) intent.getParcelableExtra("amplifyNotificationPayload");
            }
            return null;
        }

        public final NotificationPayload invoke(NotificationContentProvider notificationContentProvider, xk7 xk7Var) {
            sq8.m48649h(notificationContentProvider, "contentProvider");
            sq8.m48649h(xk7Var, "block");
            Builder builder = new Builder(notificationContentProvider);
            xk7Var.invoke(builder);
            return builder.build();
        }
    }

    public static final class Creator implements Parcelable.Creator<NotificationPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationPayload createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new NotificationPayload((NotificationContentProvider) parcel.readParcelable(NotificationPayload.class.getClassLoader()), parcel.readString(), (Class) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationPayload[] newArray(int i) {
            return new NotificationPayload[i];
        }
    }

    public NotificationPayload(NotificationContentProvider notificationContentProvider, String str, Class<?> cls) {
        sq8.m48649h(notificationContentProvider, "contentProvider");
        this.contentProvider = notificationContentProvider;
        this.channelId = str;
        this.targetClass = cls;
        this.rawData = extractRawData();
    }

    public static final Builder builder(NotificationContentProvider notificationContentProvider) {
        return Companion.builder(notificationContentProvider);
    }

    private final Map<String, String> extractRawData() {
        NotificationContentProvider notificationContentProvider = this.contentProvider;
        return notificationContentProvider instanceof NotificationContentProvider.FCM ? notificationContentProvider.getContent() : isa.m32681h();
    }

    public static final NotificationPayload fromIntent(Intent intent) {
        return Companion.fromIntent(intent);
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final NotificationContentProvider getContentProvider() {
        return this.contentProvider;
    }

    public final Map<String, String> getRawData() {
        return this.rawData;
    }

    public final Class<?> getTargetClass() {
        return this.targetClass;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeParcelable(this.contentProvider, i);
        parcel.writeString(this.channelId);
        parcel.writeSerializable(this.targetClass);
    }

    public /* synthetic */ NotificationPayload(NotificationContentProvider notificationContentProvider, String str, Class cls, int i, id5 id5Var) {
        this(notificationContentProvider, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : cls);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationPayload(Builder builder) {
        this(builder.getContentProvider(), builder.getChannelId(), builder.getTargetClass());
        sq8.m48649h(builder, "builder");
    }
}
