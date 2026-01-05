package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.sq8;
import p001o.yfe;

/* loaded from: classes.dex */
public final class TemplateComponent extends yfe implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TemplateComponent> CREATOR = new Creator();
    private WaBody waBody;
    private List<WaButton> waButton;
    private WaFooter waFooter;
    private WaHeader waHeader;

    public static final class Creator implements Parcelable.Creator<TemplateComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateComponent createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            ArrayList arrayList = null;
            WaHeader waHeaderCreateFromParcel = parcel.readInt() == 0 ? null : WaHeader.CREATOR.createFromParcel(parcel);
            WaBody waBodyCreateFromParcel = parcel.readInt() == 0 ? null : WaBody.CREATOR.createFromParcel(parcel);
            WaFooter waFooterCreateFromParcel = parcel.readInt() == 0 ? null : WaFooter.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(WaButton.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new TemplateComponent(waHeaderCreateFromParcel, waBodyCreateFromParcel, waFooterCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TemplateComponent[] newArray(int i) {
            return new TemplateComponent[i];
        }
    }

    public TemplateComponent() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemplateComponent copy$default(TemplateComponent templateComponent, WaHeader waHeader, WaBody waBody, WaFooter waFooter, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            waHeader = templateComponent.waHeader;
        }
        if ((i & 2) != 0) {
            waBody = templateComponent.waBody;
        }
        if ((i & 4) != 0) {
            waFooter = templateComponent.waFooter;
        }
        if ((i & 8) != 0) {
            list = templateComponent.waButton;
        }
        return templateComponent.copy(waHeader, waBody, waFooter, list);
    }

    public final WaHeader component1() {
        return this.waHeader;
    }

    public final WaBody component2() {
        return this.waBody;
    }

    public final WaFooter component3() {
        return this.waFooter;
    }

    public final List<WaButton> component4() {
        return this.waButton;
    }

    public final TemplateComponent copy(WaHeader waHeader, WaBody waBody, WaFooter waFooter, List<WaButton> list) {
        return new TemplateComponent(waHeader, waBody, waFooter, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateComponent)) {
            return false;
        }
        TemplateComponent templateComponent = (TemplateComponent) obj;
        return sq8.m48644c(this.waHeader, templateComponent.waHeader) && sq8.m48644c(this.waBody, templateComponent.waBody) && sq8.m48644c(this.waFooter, templateComponent.waFooter) && sq8.m48644c(this.waButton, templateComponent.waButton);
    }

    public final WaBody getWaBody() {
        return this.waBody;
    }

    public final List<WaButton> getWaButton() {
        return this.waButton;
    }

    public final WaFooter getWaFooter() {
        return this.waFooter;
    }

    public final WaHeader getWaHeader() {
        return this.waHeader;
    }

    public int hashCode() {
        WaHeader waHeader = this.waHeader;
        int iHashCode = (waHeader == null ? 0 : waHeader.hashCode()) * 31;
        WaBody waBody = this.waBody;
        int iHashCode2 = (iHashCode + (waBody == null ? 0 : waBody.hashCode())) * 31;
        WaFooter waFooter = this.waFooter;
        int iHashCode3 = (iHashCode2 + (waFooter == null ? 0 : waFooter.hashCode())) * 31;
        List<WaButton> list = this.waButton;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setWaBody(WaBody waBody) {
        this.waBody = waBody;
    }

    public final void setWaButton(List<WaButton> list) {
        this.waButton = list;
    }

    public final void setWaFooter(WaFooter waFooter) {
        this.waFooter = waFooter;
    }

    public final void setWaHeader(WaHeader waHeader) {
        this.waHeader = waHeader;
    }

    public String toString() {
        return "TemplateComponent(waHeader=" + this.waHeader + ", waBody=" + this.waBody + ", waFooter=" + this.waFooter + ", waButton=" + this.waButton + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        WaHeader waHeader = this.waHeader;
        if (waHeader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            waHeader.writeToParcel(parcel, i);
        }
        WaBody waBody = this.waBody;
        if (waBody == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            waBody.writeToParcel(parcel, i);
        }
        WaFooter waFooter = this.waFooter;
        if (waFooter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            waFooter.writeToParcel(parcel, i);
        }
        List<WaButton> list = this.waButton;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<WaButton> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TemplateComponent(WaHeader waHeader, WaBody waBody, WaFooter waFooter, List list, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : waHeader, (i & 2) != 0 ? null : waBody, (i & 4) != 0 ? null : waFooter, (i & 8) != 0 ? null : list);
    }

    public TemplateComponent(WaHeader waHeader, WaBody waBody, WaFooter waFooter, List<WaButton> list) {
        this.waHeader = waHeader;
        this.waBody = waBody;
        this.waFooter = waFooter;
        this.waButton = list;
    }
}
