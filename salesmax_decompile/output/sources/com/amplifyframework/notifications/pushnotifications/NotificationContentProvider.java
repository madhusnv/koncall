package com.amplifyframework.notifications.pushnotifications;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.sq8;

/* loaded from: classes5.dex */
public class NotificationContentProvider implements Parcelable {
    public static final Parcelable.Creator<NotificationContentProvider> CREATOR = new Creator();
    private final Map<String, String> content;

    public static final class Creator implements Parcelable.Creator<NotificationContentProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationContentProvider createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new NotificationContentProvider(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationContentProvider[] newArray(int i) {
            return new NotificationContentProvider[i];
        }
    }

    public static final class FCM extends NotificationContentProvider {
        public static final Parcelable.Creator<FCM> CREATOR = new Creator();
        private final Map<String, String> content;

        public static final class Creator implements Parcelable.Creator<FCM> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FCM createFromParcel(Parcel parcel) {
                sq8.m48649h(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new FCM(linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FCM[] newArray(int i) {
                return new FCM[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FCM(Map<String, String> map) {
            super(map);
            sq8.m48649h(map, FirebaseAnalytics.Param.CONTENT);
            this.content = map;
        }

        @Override // com.amplifyframework.notifications.pushnotifications.NotificationContentProvider
        public Map<String, String> getContent() {
            return this.content;
        }

        @Override // com.amplifyframework.notifications.pushnotifications.NotificationContentProvider, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            sq8.m48649h(parcel, "out");
            Map<String, String> map = this.content;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    public NotificationContentProvider(Map<String, String> map) {
        sq8.m48649h(map, FirebaseAnalytics.Param.CONTENT);
        this.content = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> getContent() {
        return this.content;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        Map<String, String> map = this.content;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }
}
