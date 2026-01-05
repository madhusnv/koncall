package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import p001o.id5;
import p001o.sq8;
import type.AuthorizationLevel;

/* loaded from: classes.dex */
public final class UserContactDetail implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserContactDetail> CREATOR = new Creator();
    private AuthorizationLevel authorizationLevel;
    private ArrayList<String> emailId;
    private String id;
    private boolean isAlreadyImported;
    private boolean isSelected;
    private String name;
    private ArrayList<String> phoneNumber;
    private String photoUri;

    public static final class Creator implements Parcelable.Creator<UserContactDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserContactDetail createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new UserContactDetail(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), AuthorizationLevel.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserContactDetail[] newArray(int i) {
            return new UserContactDetail[i];
        }
    }

    public UserContactDetail() {
        this(null, null, null, null, false, false, null, null, Constants.MAX_HOST_LENGTH, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AuthorizationLevel getAuthorizationLevel() {
        return this.authorizationLevel;
    }

    public final ArrayList<String> getEmailId() {
        return this.emailId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final ArrayList<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPhotoUri() {
        return this.photoUri;
    }

    public final boolean isAlreadyImported() {
        return this.isAlreadyImported;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setAlreadyImported(boolean z) {
        this.isAlreadyImported = z;
    }

    public final void setAuthorizationLevel(AuthorizationLevel authorizationLevel) {
        sq8.m48649h(authorizationLevel, "<set-?>");
        this.authorizationLevel = authorizationLevel;
    }

    public final void setEmailId(ArrayList<String> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.emailId = arrayList;
    }

    public final void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }

    public final void setName(String str) {
        sq8.m48649h(str, "<set-?>");
        this.name = str;
    }

    public final void setPhoneNumber(ArrayList<String> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.phoneNumber = arrayList;
    }

    public final void setPhotoUri(String str) {
        sq8.m48649h(str, "<set-?>");
        this.photoUri = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        parcel.writeStringList(this.emailId);
        parcel.writeStringList(this.phoneNumber);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.isAlreadyImported ? 1 : 0);
        parcel.writeString(this.photoUri);
        parcel.writeString(this.authorizationLevel.name());
    }

    public UserContactDetail(String str, String str2, ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, boolean z2, String str3, AuthorizationLevel authorizationLevel) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(arrayList, "emailId");
        sq8.m48649h(arrayList2, "phoneNumber");
        sq8.m48649h(str3, "photoUri");
        sq8.m48649h(authorizationLevel, "authorizationLevel");
        this.name = str;
        this.id = str2;
        this.emailId = arrayList;
        this.phoneNumber = arrayList2;
        this.isSelected = z;
        this.isAlreadyImported = z2;
        this.photoUri = str3;
        this.authorizationLevel = authorizationLevel;
    }

    public /* synthetic */ UserContactDetail(String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, String str3, AuthorizationLevel authorizationLevel, int i, id5 id5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : arrayList, (i & 8) != 0 ? new ArrayList() : arrayList2, (i & 16) != 0 ? false : z, (i & 32) == 0 ? z2 : false, (i & 64) == 0 ? str3 : "", (i & 128) != 0 ? AuthorizationLevel.MEMBER : authorizationLevel);
    }
}
