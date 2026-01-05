package ai.salesmax.custom;

import ai.salesmax.custom.CustomFormDataObservable;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.util.StringUtils;
import p001o.ge1;
import p001o.gu3;
import p001o.jm;

/* loaded from: classes.dex */
public class CustomFormDataObservable extends ge1 implements Parcelable {
    public static final Parcelable.Creator<CustomFormDataObservable> CREATOR = new C0072a();

    /* renamed from: b */
    public String f286b;

    /* renamed from: c */
    public String f287c;

    /* renamed from: ai.salesmax.custom.CustomFormDataObservable$a */
    public class C0072a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomFormDataObservable createFromParcel(Parcel parcel) {
            return new CustomFormDataObservable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomFormDataObservable[] newArray(int i) {
            return new CustomFormDataObservable[i];
        }
    }

    public CustomFormDataObservable(String str) {
        this.f286b = "";
        this.f287c = str;
        m167o(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m164l(String str, Throwable th) {
        String.format("Couldn't resolve custom form data contents %s", str);
        m168p(str);
    }

    /* renamed from: m */
    public static /* synthetic */ void m165m() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: k */
    public String m166k() {
        return this.f286b;
    }

    /* renamed from: o */
    public final void m167o(final String str) {
        if (!StringUtils.isBlank(this.f286b) || StringUtils.isBlank(str)) {
            return;
        }
        PropertyDefinitionRepository.o0().p1(str).w0(new gu3() { // from class: o.de4
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f19632a.m168p((String) obj);
            }
        }, new gu3() { // from class: o.ee4
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f21478a.m164l(str, (Throwable) obj);
            }
        }, new jm() { // from class: o.fe4
            @Override // p001o.jm
            public final void run() {
                CustomFormDataObservable.m165m();
            }
        });
    }

    /* renamed from: p */
    public void m168p(String str) {
        this.f286b = str;
        m28509h(76);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f286b);
        parcel.writeString(this.f287c);
    }

    public CustomFormDataObservable(Parcel parcel) {
        this.f286b = "";
        this.f287c = "";
        this.f286b = parcel.readString();
        String string = parcel.readString();
        this.f287c = string;
        m167o(string);
    }
}
