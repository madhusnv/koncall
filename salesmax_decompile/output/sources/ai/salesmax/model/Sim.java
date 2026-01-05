package ai.salesmax.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class Sim {
    public static final int $stable = 8;
    private String carrierName;
    private String countryIso;
    private String displayName;
    private String iccId;
    private boolean isAllowedForTrackingAllCalls;
    private Boolean isDefault;
    private String number;
    private Integer simSlotIndex;
    private String subscriptionId;

    public Sim() {
        this(null, null, null, null, null, null, false, null, null, 511, null);
    }

    public final Integer component1() {
        return this.simSlotIndex;
    }

    public final String component2() {
        return this.number;
    }

    public final String component3() {
        return this.countryIso;
    }

    public final String component4() {
        return this.carrierName;
    }

    public final String component5() {
        return this.displayName;
    }

    public final Boolean component6() {
        return this.isDefault;
    }

    public final boolean component7() {
        return this.isAllowedForTrackingAllCalls;
    }

    public final String component8() {
        return this.subscriptionId;
    }

    public final String component9() {
        return this.iccId;
    }

    public final Sim copy(Integer num, String str, String str2, String str3, String str4, Boolean bool, boolean z, String str5, String str6) {
        return new Sim(num, str, str2, str3, str4, bool, z, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sim)) {
            return false;
        }
        Sim sim = (Sim) obj;
        return sq8.m48644c(this.simSlotIndex, sim.simSlotIndex) && sq8.m48644c(this.number, sim.number) && sq8.m48644c(this.countryIso, sim.countryIso) && sq8.m48644c(this.carrierName, sim.carrierName) && sq8.m48644c(this.displayName, sim.displayName) && sq8.m48644c(this.isDefault, sim.isDefault) && this.isAllowedForTrackingAllCalls == sim.isAllowedForTrackingAllCalls && sq8.m48644c(this.subscriptionId, sim.subscriptionId) && sq8.m48644c(this.iccId, sim.iccId);
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final String getCountryIso() {
        return this.countryIso;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getIccId() {
        return this.iccId;
    }

    public final String getNumber() {
        return this.number;
    }

    public final Integer getSimSlotIndex() {
        return this.simSlotIndex;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.simSlotIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.number;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryIso;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.carrierName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isDefault;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.isAllowedForTrackingAllCalls;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode6 + i) * 31;
        String str5 = this.subscriptionId;
        int iHashCode7 = (i2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iccId;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isAllowedForTrackingAllCalls() {
        return this.isAllowedForTrackingAllCalls;
    }

    public final Boolean isDefault() {
        return this.isDefault;
    }

    public final void setAllowedForTrackingAllCalls(boolean z) {
        this.isAllowedForTrackingAllCalls = z;
    }

    public final void setCarrierName(String str) {
        this.carrierName = str;
    }

    public final void setCountryIso(String str) {
        this.countryIso = str;
    }

    public final void setDefault(Boolean bool) {
        this.isDefault = bool;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setIccId(String str) {
        this.iccId = str;
    }

    public final void setNumber(String str) {
        this.number = str;
    }

    public final void setSimSlotIndex(Integer num) {
        this.simSlotIndex = num;
    }

    public final void setSubscriptionId(String str) {
        this.subscriptionId = str;
    }

    public String toString() {
        return "Sim(simSlotIndex=" + this.simSlotIndex + ", number=" + this.number + ", countryIso=" + this.countryIso + ", carrierName=" + this.carrierName + ", displayName=" + this.displayName + ", isDefault=" + this.isDefault + ", isAllowedForTrackingAllCalls=" + this.isAllowedForTrackingAllCalls + ", subscriptionId=" + this.subscriptionId + ", iccId=" + this.iccId + ")";
    }

    public Sim(Integer num, String str, String str2, String str3, String str4, Boolean bool, boolean z, String str5, String str6) {
        this.simSlotIndex = num;
        this.number = str;
        this.countryIso = str2;
        this.carrierName = str3;
        this.displayName = str4;
        this.isDefault = bool;
        this.isAllowedForTrackingAllCalls = z;
        this.subscriptionId = str5;
        this.iccId = str6;
    }

    public /* synthetic */ Sim(Integer num, String str, String str2, String str3, String str4, Boolean bool, boolean z, String str5, String str6, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? Boolean.FALSE : bool, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : null);
    }
}
