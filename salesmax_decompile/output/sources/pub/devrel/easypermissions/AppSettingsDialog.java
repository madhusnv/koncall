package pub.devrel.easypermissions;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC1782a;
import androidx.fragment.app.Fragment;
import p001o.x9e;

/* loaded from: classes6.dex */
public class AppSettingsDialog implements Parcelable {
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new C18782a();

    /* renamed from: a */
    public final int f57956a;

    /* renamed from: b */
    public final String f57957b;

    /* renamed from: c */
    public final String f57958c;

    /* renamed from: d */
    public final String f57959d;

    /* renamed from: e */
    public final String f57960e;

    /* renamed from: f */
    public final int f57961f;

    /* renamed from: g */
    public final int f57962g;

    /* renamed from: h */
    public Object f57963h;

    /* renamed from: q */
    public Context f57964q;

    /* renamed from: pub.devrel.easypermissions.AppSettingsDialog$a */
    public static class C18782a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppSettingsDialog createFromParcel(Parcel parcel) {
            return new AppSettingsDialog(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppSettingsDialog[] newArray(int i) {
            return new AppSettingsDialog[i];
        }
    }

    /* renamed from: pub.devrel.easypermissions.AppSettingsDialog$b */
    public static class C18783b {

        /* renamed from: a */
        public final Object f57965a;

        /* renamed from: b */
        public final Context f57966b;

        /* renamed from: d */
        public String f57968d;

        /* renamed from: e */
        public String f57969e;

        /* renamed from: f */
        public String f57970f;

        /* renamed from: g */
        public String f57971g;

        /* renamed from: c */
        public int f57967c = -1;

        /* renamed from: h */
        public int f57972h = -1;

        /* renamed from: i */
        public boolean f57973i = false;

        public C18783b(Activity activity) {
            this.f57965a = activity;
            this.f57966b = activity;
        }

        /* renamed from: a */
        public AppSettingsDialog m60201a() {
            this.f57968d = TextUtils.isEmpty(this.f57968d) ? this.f57966b.getString(x9e.rationale_ask_again) : this.f57968d;
            this.f57969e = TextUtils.isEmpty(this.f57969e) ? this.f57966b.getString(x9e.title_settings_dialog) : this.f57969e;
            this.f57970f = TextUtils.isEmpty(this.f57970f) ? this.f57966b.getString(R.string.ok) : this.f57970f;
            this.f57971g = TextUtils.isEmpty(this.f57971g) ? this.f57966b.getString(R.string.cancel) : this.f57971g;
            int i = this.f57972h;
            if (i <= 0) {
                i = 16061;
            }
            this.f57972h = i;
            return new AppSettingsDialog(this.f57965a, this.f57967c, this.f57968d, this.f57969e, this.f57970f, this.f57971g, this.f57972h, this.f57973i ? 268435456 : 0, null);
        }

        /* renamed from: b */
        public C18783b m60202b(String str) {
            this.f57971g = str;
            return this;
        }

        /* renamed from: c */
        public C18783b m60203c(String str) {
            this.f57970f = str;
            return this;
        }

        /* renamed from: d */
        public C18783b m60204d(String str) {
            this.f57968d = str;
            return this;
        }

        /* renamed from: e */
        public C18783b m60205e(String str) {
            this.f57969e = str;
            return this;
        }
    }

    public /* synthetic */ AppSettingsDialog(Parcel parcel, C18782a c18782a) {
        this(parcel);
    }

    /* renamed from: a */
    public static AppSettingsDialog m60193a(Intent intent, Activity activity) {
        AppSettingsDialog appSettingsDialogM60201a = (AppSettingsDialog) intent.getParcelableExtra("extra_app_settings");
        if (appSettingsDialogM60201a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Intent contains null value for EXTRA_APP_SETTINGS: intent=");
            sb.append(intent);
            sb.append(", extras=");
            sb.append(intent.getExtras());
            appSettingsDialogM60201a = new C18783b(activity).m60201a();
        }
        appSettingsDialogM60201a.m60195c(activity);
        return appSettingsDialogM60201a;
    }

    /* renamed from: b */
    public int m60194b() {
        return this.f57962g;
    }

    /* renamed from: c */
    public final void m60195c(Object obj) {
        this.f57963h = obj;
        if (obj instanceof Activity) {
            this.f57964q = (Activity) obj;
        } else {
            if (obj instanceof Fragment) {
                this.f57964q = ((Fragment) obj).getContext();
                return;
            }
            throw new IllegalStateException("Unknown object: " + obj);
        }
    }

    /* renamed from: d */
    public void m60196d() {
        m60198f(AppSettingsDialogHolderActivity.L0(this.f57964q, this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public DialogInterfaceC1782a m60197e(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        int i = this.f57956a;
        return (i != -1 ? new DialogInterfaceC1782a.a(this.f57964q, i) : new DialogInterfaceC1782a.a(this.f57964q)).mo3869b(false).setTitle(this.f57958c).mo3873f(this.f57957b).mo3878k(this.f57959d, onClickListener).mo3874g(this.f57960e, onClickListener2).m3880m();
    }

    /* renamed from: f */
    public final void m60198f(Intent intent) {
        Object obj = this.f57963h;
        if (obj instanceof Activity) {
            ((Activity) obj).startActivityForResult(intent, this.f57961f);
        } else if (obj instanceof Fragment) {
            ((Fragment) obj).startActivityForResult(intent, this.f57961f);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f57956a);
        parcel.writeString(this.f57957b);
        parcel.writeString(this.f57958c);
        parcel.writeString(this.f57959d);
        parcel.writeString(this.f57960e);
        parcel.writeInt(this.f57961f);
        parcel.writeInt(this.f57962g);
    }

    public /* synthetic */ AppSettingsDialog(Object obj, int i, String str, String str2, String str3, String str4, int i2, int i3, C18782a c18782a) {
        this(obj, i, str, str2, str3, str4, i2, i3);
    }

    public AppSettingsDialog(Parcel parcel) {
        this.f57956a = parcel.readInt();
        this.f57957b = parcel.readString();
        this.f57958c = parcel.readString();
        this.f57959d = parcel.readString();
        this.f57960e = parcel.readString();
        this.f57961f = parcel.readInt();
        this.f57962g = parcel.readInt();
    }

    public AppSettingsDialog(Object obj, int i, String str, String str2, String str3, String str4, int i2, int i3) {
        m60195c(obj);
        this.f57956a = i;
        this.f57957b = str;
        this.f57958c = str2;
        this.f57959d = str3;
        this.f57960e = str4;
        this.f57961f = i2;
        this.f57962g = i3;
    }
}
