package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AddDeviceResponse {

    @InterfaceC4485b("subscriptions")
    private final AllSubscriptions allSubscriptions;

    @InterfaceC4485b("employeeDetails")
    private final EmployeeDetails employeeDetails;

    public AddDeviceResponse(AllSubscriptions allSubscriptions, EmployeeDetails employeeDetails) {
        AbstractC4154l.m8923f(allSubscriptions, "allSubscriptions");
        AbstractC4154l.m8923f(employeeDetails, "employeeDetails");
        this.allSubscriptions = allSubscriptions;
        this.employeeDetails = employeeDetails;
    }

    /* renamed from: a */
    public final AllSubscriptions m4713a() {
        return this.allSubscriptions;
    }

    /* renamed from: b */
    public final EmployeeDetails m4714b() {
        return this.employeeDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddDeviceResponse)) {
            return false;
        }
        AddDeviceResponse addDeviceResponse = (AddDeviceResponse) obj;
        return AbstractC4154l.m8918a(this.allSubscriptions, addDeviceResponse.allSubscriptions) && AbstractC4154l.m8918a(this.employeeDetails, addDeviceResponse.employeeDetails);
    }

    public final int hashCode() {
        return this.employeeDetails.hashCode() + (this.allSubscriptions.hashCode() * 31);
    }

    public final String toString() {
        return "AddDeviceResponse(allSubscriptions=" + this.allSubscriptions + ", employeeDetails=" + this.employeeDetails + ")";
    }
}
