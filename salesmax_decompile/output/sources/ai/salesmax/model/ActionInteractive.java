package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ActionInteractive implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ActionInteractive> CREATOR = new Creator();
    private String actionName;
    private String addressCountry;
    private String button;
    private List<ReplyButton> buttons;
    private String catalog_id;
    private String ctaUrl;
    private String display_text;
    private String flow_action;
    private FlowActionPayload flow_action_payload;
    private String flow_cta;
    private String flow_id;
    private String flow_message_version;
    private String flow_mode;
    private String flow_token;
    private String product_retailer_id;
    private List<String> savedAddresses;
    private List<SectionInteractive> sections;

    public static final class Creator implements Parcelable.Creator<ActionInteractive> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionInteractive createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ReplyButton.CREATOR.createFromParcel(parcel));
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(SectionInteractive.CREATOR.createFromParcel(parcel));
            }
            return new ActionInteractive(string, string2, string3, string4, arrayListCreateStringArrayList, string5, arrayList, string6, string7, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FlowActionPayload.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionInteractive[] newArray(int i) {
            return new ActionInteractive[i];
        }
    }

    public ActionInteractive() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public final String component1() {
        return this.actionName;
    }

    public final List<SectionInteractive> component10() {
        return this.sections;
    }

    public final String component11() {
        return this.flow_mode;
    }

    public final String component12() {
        return this.flow_message_version;
    }

    public final String component13() {
        return this.flow_token;
    }

    public final String component14() {
        return this.flow_id;
    }

    public final String component15() {
        return this.flow_cta;
    }

    public final String component16() {
        return this.flow_action;
    }

    public final FlowActionPayload component17() {
        return this.flow_action_payload;
    }

    public final String component2() {
        return this.display_text;
    }

    public final String component3() {
        return this.ctaUrl;
    }

    public final String component4() {
        return this.addressCountry;
    }

    public final List<String> component5() {
        return this.savedAddresses;
    }

    public final String component6() {
        return this.button;
    }

    public final List<ReplyButton> component7() {
        return this.buttons;
    }

    public final String component8() {
        return this.catalog_id;
    }

    public final String component9() {
        return this.product_retailer_id;
    }

    public final ActionInteractive copy(String str, String str2, String str3, String str4, List<String> list, String str5, List<ReplyButton> list2, String str6, String str7, List<SectionInteractive> list3, String str8, String str9, String str10, String str11, String str12, String str13, FlowActionPayload flowActionPayload) {
        sq8.m48649h(list, "savedAddresses");
        sq8.m48649h(list2, "buttons");
        sq8.m48649h(list3, "sections");
        return new ActionInteractive(str, str2, str3, str4, list, str5, list2, str6, str7, list3, str8, str9, str10, str11, str12, str13, flowActionPayload);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionInteractive)) {
            return false;
        }
        ActionInteractive actionInteractive = (ActionInteractive) obj;
        return sq8.m48644c(this.actionName, actionInteractive.actionName) && sq8.m48644c(this.display_text, actionInteractive.display_text) && sq8.m48644c(this.ctaUrl, actionInteractive.ctaUrl) && sq8.m48644c(this.addressCountry, actionInteractive.addressCountry) && sq8.m48644c(this.savedAddresses, actionInteractive.savedAddresses) && sq8.m48644c(this.button, actionInteractive.button) && sq8.m48644c(this.buttons, actionInteractive.buttons) && sq8.m48644c(this.catalog_id, actionInteractive.catalog_id) && sq8.m48644c(this.product_retailer_id, actionInteractive.product_retailer_id) && sq8.m48644c(this.sections, actionInteractive.sections) && sq8.m48644c(this.flow_mode, actionInteractive.flow_mode) && sq8.m48644c(this.flow_message_version, actionInteractive.flow_message_version) && sq8.m48644c(this.flow_token, actionInteractive.flow_token) && sq8.m48644c(this.flow_id, actionInteractive.flow_id) && sq8.m48644c(this.flow_cta, actionInteractive.flow_cta) && sq8.m48644c(this.flow_action, actionInteractive.flow_action) && sq8.m48644c(this.flow_action_payload, actionInteractive.flow_action_payload);
    }

    public final String getActionName() {
        return this.actionName;
    }

    public final String getAddressCountry() {
        return this.addressCountry;
    }

    public final String getButton() {
        return this.button;
    }

    public final List<ReplyButton> getButtons() {
        return this.buttons;
    }

    public final String getCatalog_id() {
        return this.catalog_id;
    }

    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    public final String getDisplay_text() {
        return this.display_text;
    }

    public final String getFlow_action() {
        return this.flow_action;
    }

    public final FlowActionPayload getFlow_action_payload() {
        return this.flow_action_payload;
    }

    public final String getFlow_cta() {
        return this.flow_cta;
    }

    public final String getFlow_id() {
        return this.flow_id;
    }

    public final String getFlow_message_version() {
        return this.flow_message_version;
    }

    public final String getFlow_mode() {
        return this.flow_mode;
    }

    public final String getFlow_token() {
        return this.flow_token;
    }

    public final String getProduct_retailer_id() {
        return this.product_retailer_id;
    }

    public final List<String> getSavedAddresses() {
        return this.savedAddresses;
    }

    public final List<SectionInteractive> getSections() {
        return this.sections;
    }

    public int hashCode() {
        String str = this.actionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.display_text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressCountry;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.savedAddresses.hashCode()) * 31;
        String str5 = this.button;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.buttons.hashCode()) * 31;
        String str6 = this.catalog_id;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.product_retailer_id;
        int iHashCode7 = (((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.sections.hashCode()) * 31;
        String str8 = this.flow_mode;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.flow_message_version;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.flow_token;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.flow_id;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.flow_cta;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.flow_action;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        FlowActionPayload flowActionPayload = this.flow_action_payload;
        return iHashCode13 + (flowActionPayload != null ? flowActionPayload.hashCode() : 0);
    }

    public final void setActionName(String str) {
        this.actionName = str;
    }

    public final void setAddressCountry(String str) {
        this.addressCountry = str;
    }

    public final void setButton(String str) {
        this.button = str;
    }

    public final void setButtons(List<ReplyButton> list) {
        sq8.m48649h(list, "<set-?>");
        this.buttons = list;
    }

    public final void setCatalog_id(String str) {
        this.catalog_id = str;
    }

    public final void setCtaUrl(String str) {
        this.ctaUrl = str;
    }

    public final void setDisplay_text(String str) {
        this.display_text = str;
    }

    public final void setFlow_action(String str) {
        this.flow_action = str;
    }

    public final void setFlow_action_payload(FlowActionPayload flowActionPayload) {
        this.flow_action_payload = flowActionPayload;
    }

    public final void setFlow_cta(String str) {
        this.flow_cta = str;
    }

    public final void setFlow_id(String str) {
        this.flow_id = str;
    }

    public final void setFlow_message_version(String str) {
        this.flow_message_version = str;
    }

    public final void setFlow_mode(String str) {
        this.flow_mode = str;
    }

    public final void setFlow_token(String str) {
        this.flow_token = str;
    }

    public final void setProduct_retailer_id(String str) {
        this.product_retailer_id = str;
    }

    public final void setSavedAddresses(List<String> list) {
        sq8.m48649h(list, "<set-?>");
        this.savedAddresses = list;
    }

    public final void setSections(List<SectionInteractive> list) {
        sq8.m48649h(list, "<set-?>");
        this.sections = list;
    }

    public String toString() {
        return "ActionInteractive(actionName=" + this.actionName + ", display_text=" + this.display_text + ", ctaUrl=" + this.ctaUrl + ", addressCountry=" + this.addressCountry + ", savedAddresses=" + this.savedAddresses + ", button=" + this.button + ", buttons=" + this.buttons + ", catalog_id=" + this.catalog_id + ", product_retailer_id=" + this.product_retailer_id + ", sections=" + this.sections + ", flow_mode=" + this.flow_mode + ", flow_message_version=" + this.flow_message_version + ", flow_token=" + this.flow_token + ", flow_id=" + this.flow_id + ", flow_cta=" + this.flow_cta + ", flow_action=" + this.flow_action + ", flow_action_payload=" + this.flow_action_payload + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeString(this.actionName);
        parcel.writeString(this.display_text);
        parcel.writeString(this.ctaUrl);
        parcel.writeString(this.addressCountry);
        parcel.writeStringList(this.savedAddresses);
        parcel.writeString(this.button);
        List<ReplyButton> list = this.buttons;
        parcel.writeInt(list.size());
        Iterator<ReplyButton> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.catalog_id);
        parcel.writeString(this.product_retailer_id);
        List<SectionInteractive> list2 = this.sections;
        parcel.writeInt(list2.size());
        Iterator<SectionInteractive> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.flow_mode);
        parcel.writeString(this.flow_message_version);
        parcel.writeString(this.flow_token);
        parcel.writeString(this.flow_id);
        parcel.writeString(this.flow_cta);
        parcel.writeString(this.flow_action);
        FlowActionPayload flowActionPayload = this.flow_action_payload;
        if (flowActionPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flowActionPayload.writeToParcel(parcel, i);
        }
    }

    public ActionInteractive(String str, String str2, String str3, String str4, List<String> list, String str5, List<ReplyButton> list2, String str6, String str7, List<SectionInteractive> list3, String str8, String str9, String str10, String str11, String str12, String str13, FlowActionPayload flowActionPayload) {
        sq8.m48649h(list, "savedAddresses");
        sq8.m48649h(list2, "buttons");
        sq8.m48649h(list3, "sections");
        this.actionName = str;
        this.display_text = str2;
        this.ctaUrl = str3;
        this.addressCountry = str4;
        this.savedAddresses = list;
        this.button = str5;
        this.buttons = list2;
        this.catalog_id = str6;
        this.product_retailer_id = str7;
        this.sections = list3;
        this.flow_mode = str8;
        this.flow_message_version = str9;
        this.flow_token = str10;
        this.flow_id = str11;
        this.flow_cta = str12;
        this.flow_action = str13;
        this.flow_action_payload = flowActionPayload;
    }

    public /* synthetic */ ActionInteractive(String str, String str2, String str3, String str4, List list, String str5, List list2, String str6, String str7, List list3, String str8, String str9, String str10, String str11, String str12, String str13, FlowActionPayload flowActionPayload, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? new ArrayList() : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? new ArrayList() : list2, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? new ArrayList() : list3, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & Opcodes.ACC_ENUM) != 0 ? null : str12, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : flowActionPayload);
    }
}
