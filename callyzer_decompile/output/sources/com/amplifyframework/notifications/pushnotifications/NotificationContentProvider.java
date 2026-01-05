package com.amplifyframework.notifications.pushnotifications;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class NotificationContentProvider implements Parcelable {
    public static final Parcelable.Creator<NotificationContentProvider> CREATOR = new Creator();
    private final Map<String, String> content;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Creator implements Parcelable.Creator<NotificationContentProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationContentProvider createFromParcel(Parcel parcel) {
            AbstractC4154l.m8923f(parcel, "parcel");
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new NotificationContentProvider(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationContentProvider[] newArray(int i10) {
            return new NotificationContentProvider[i10];
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class FCM extends NotificationContentProvider {
        public static final Parcelable.Creator<FCM> CREATOR = new Creator();
        private final Map<String, String> content;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Creator implements Parcelable.Creator<FCM> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FCM createFromParcel(Parcel parcel) {
                AbstractC4154l.m8923f(parcel, "parcel");
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new FCM(linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FCM[] newArray(int i10) {
                return new FCM[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FCM(Map<String, String> content) {
            super(content);
            AbstractC4154l.m8923f(content, "content");
            this.content = content;
        }

        @Override // com.amplifyframework.notifications.pushnotifications.NotificationContentProvider, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.amplifyframework.notifications.pushnotifications.NotificationContentProvider
        public Map<String, String> getContent() {
            return this.content;
        }

        @Override // com.amplifyframework.notifications.pushnotifications.NotificationContentProvider, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC4154l.m8923f(dest, "dest");
            Map<String, String> map = this.content;
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
    }

    public NotificationContentProvider(Map<String, String> content) {
        AbstractC4154l.m8923f(content, "content");
        this.content = content;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> getContent() {
        return this.content;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC4154l.m8923f(dest, "dest");
        Map<String, String> map = this.content;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }
}
