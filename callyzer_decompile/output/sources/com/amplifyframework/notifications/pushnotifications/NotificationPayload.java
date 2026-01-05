package com.amplifyframework.notifications.pushnotifications;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.notifications.pushnotifications.NotificationContentProvider;
import ex.InterfaceC2139c;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class NotificationPayload implements Parcelable {
    private final String channelId;
    private final NotificationContentProvider contentProvider;
    private final Map<String, String> rawData;
    private final Class<?> targetClass;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NotificationPayload> CREATOR = new Creator();

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private String channelId;
        private final NotificationContentProvider contentProvider;
        private Class<?> targetClass;

        public Builder(NotificationContentProvider contentProvider) {
            AbstractC4154l.m8923f(contentProvider, "contentProvider");
            this.contentProvider = contentProvider;
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final Builder builder(NotificationContentProvider contentProvider) {
            AbstractC4154l.m8923f(contentProvider, "contentProvider");
            return new Builder(contentProvider);
        }

        public final NotificationPayload fromIntent(Intent intent) {
            if (intent != null) {
                return (NotificationPayload) intent.getParcelableExtra("amplifyNotificationPayload");
            }
            return null;
        }

        public final NotificationPayload invoke(NotificationContentProvider contentProvider, InterfaceC2139c block) {
            AbstractC4154l.m8923f(contentProvider, "contentProvider");
            AbstractC4154l.m8923f(block, "block");
            Builder builder = new Builder(contentProvider);
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Creator implements Parcelable.Creator<NotificationPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationPayload createFromParcel(Parcel parcel) {
            AbstractC4154l.m8923f(parcel, "parcel");
            return new NotificationPayload((NotificationContentProvider) parcel.readParcelable(NotificationPayload.class.getClassLoader()), parcel.readString(), (Class) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationPayload[] newArray(int i10) {
            return new NotificationPayload[i10];
        }
    }

    public NotificationPayload(NotificationContentProvider contentProvider, String str, Class<?> cls) {
        AbstractC4154l.m8923f(contentProvider, "contentProvider");
        this.contentProvider = contentProvider;
        this.channelId = str;
        this.targetClass = cls;
        this.rawData = extractRawData();
    }

    public static final Builder builder(NotificationContentProvider notificationContentProvider) {
        return Companion.builder(notificationContentProvider);
    }

    private final Map<String, String> extractRawData() {
        NotificationContentProvider notificationContentProvider = this.contentProvider;
        return notificationContentProvider instanceof NotificationContentProvider.FCM ? ((NotificationContentProvider.FCM) notificationContentProvider).getContent() : C6669s.f31944a;
    }

    public static final NotificationPayload fromIntent(Intent intent) {
        return Companion.fromIntent(intent);
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
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        dest.writeParcelable(this.contentProvider, i10);
        dest.writeString(this.channelId);
        dest.writeSerializable(this.targetClass);
    }

    public /* synthetic */ NotificationPayload(NotificationContentProvider notificationContentProvider, String str, Class cls, int i10, AbstractC4148f abstractC4148f) {
        this(notificationContentProvider, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : cls);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationPayload(Builder builder) {
        this(builder.getContentProvider(), builder.getChannelId(), builder.getTargetClass());
        AbstractC4154l.m8923f(builder, "builder");
    }

    public static /* synthetic */ void getRawData$annotations() {
    }
}
